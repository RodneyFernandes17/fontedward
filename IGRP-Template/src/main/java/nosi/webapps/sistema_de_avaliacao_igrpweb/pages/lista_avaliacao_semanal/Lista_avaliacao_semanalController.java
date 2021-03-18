package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_avaliacao_semanal;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.core.webapp.Report;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
/*----#end-code----*/

public class Lista_avaliacao_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_avaliacao_semanal model = new Lista_avaliacao_semanal();
		model.load();
		Lista_avaliacao_semanalView view = new Lista_avaliacao_semanalView();
		view.id_teste.setParam(true);
		view.id_avaliado.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as foto,'Dolor ut labore amet consectet' as nome,'Aperiam stract sit ipsum sit l' as edicao,'Aliqua stract sit unde sit' as area,'Perspiciatis unde deserunt ali' as mentor,'hidden-fbfd_3294' as id_teste,'hidden-1fca_ae7d' as id_avaliado,'hidden-3f4c_8876' as id_utilizador "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			AvaliadoTbl testetblfilter = new AvaliadoTbl().find();
			List<AvaliadoTbl> testetblList = testetblfilter.orderByAsc("nome").all();
			List<Lista_avaliacao_semanal.Table_1> testetblTable = new ArrayList<>();
			if (testetblList != null) {
				for (AvaliadoTbl avaliado : testetblList) {
					Lista_avaliacao_semanal.Table_1 row = new Lista_avaliacao_semanal.Table_1();
					row.setId_avaliado(avaliado.getIdAvaliado() + "");
					row.setFoto(avaliado.getIdFoto() != null ? Core.getLinkFileByUuid(avaliado.getIdFoto()) : null);
					row.setNome(avaliado.getNome());
					row.setArea(avaliado.getIdMentorFk() != null ? avaliado.getIdMentorFk().getIdAreaFk().getAreaDesc()
							: null);
					row.setMentor(avaliado.getIdMentorFk() != null ? avaliado.getIdMentorFk().getNome() : null);
					row.setEdicao(Core.findDomainDescByKey("edicao",
							avaliado.getEdicao() != null ? avaliado.getEdicao() : null));

					SemanalTbl data = new SemanalTbl().find()
							.andWhere("idAvaliador", "=", Core.getCurrentUser().getId())
							.andWhere("idAvaliadoFk", "=", avaliado.getIdAvaliado())
							.andWhere("idTemaFk.nrSemana.atual", "=", true).one();
					if (Core.isNotNull(data)) {
						row.hiddenButton(view.btn_avaliacao_semanal);
					}
					TemaTbl tema = new TemaTbl().find().andWhere("idAvaliadoFk", "=", avaliado.getIdAvaliado())
							.andWhere("nrSemana.atual", "=", true).one();
					if (Core.isNotNull(tema)) {
						row.hiddenButton(view.btn_inserir_tema);
					}

					if (Core.isNull(tema)) {
						row.hiddenButton(view.btn_avaliacao_semanal);
					}

					if (!avaliado.getIdUtilizador().equals(Core.getCurrentUser().getId())
							&& Core.getCurrentProfileCode().equals("avaliado.sistema_de_avaliacao_igrpweb")) {
						row.hiddenButton(view.btn_avaliacao_semanal);
						row.hiddenButton(view.btn_historico_de_avaliacoes);
						row.hiddenButton(view.btn_inserir_tema);
					}

					testetblTable.add(row);
				}
			}
			model.setTable_1(testetblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);
	}

	public Response actionVer() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_avaliacao_semanal model = new Lista_avaliacao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(ver)----*/
		this.addQueryString("isEdit", "true");
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Formulario_de_inscricao", "index", this.queryString());
	}

	public Response actionAvaliacao_semanal() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_avaliacao_semanal model = new Lista_avaliacao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_avaliacao_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(avaliacao_semanal)----*/
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Formulario_avaliacao_semanal", "index",
				this.queryString());
	}

	public Response actionInserir_tema() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_avaliacao_semanal model = new Lista_avaliacao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Tema_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(inserir_tema)----*/
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Tema_semanal", "index", this.queryString());
	}

	public Response actionHistorico_de_avaliacoes()
			throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_avaliacao_semanal model = new Lista_avaliacao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Historico_de_avaliacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(historico_de_avaliacoes)----*/

		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Historico_de_avaliacao", "index", this.queryString());
	}

	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
