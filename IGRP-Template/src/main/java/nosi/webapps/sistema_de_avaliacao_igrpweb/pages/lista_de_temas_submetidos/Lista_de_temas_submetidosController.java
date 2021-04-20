package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_temas_submetidos;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/*----#end-code----*/

public class Lista_de_temas_submetidosController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_temas_submetidos model = new Lista_de_temas_submetidos();
		model.load();
		Lista_de_temas_submetidosView view = new Lista_de_temas_submetidosView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Rem mollit perspiciatis unde t' as nome,'Labore natus aliqua dolor omni' as tema_semanal,'08-04-2015' as data_de_envio "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			TemaTbl tema = new TemaTbl().find()
					.andWhere("idAvaliadoFk.idUtilizador", "=", Core.getCurrentUser().getId())
					.andWhere("nrSemana.atual", "=", true).one();
			if (Core.isNotNull(tema)) {
				view.btn_novo_tema.setVisible(false);
			}

			AvaliadoTbl estagiario = new AvaliadoTbl().find().andWhereNotNull("edicao")
					.andWhere("idUtilizador", "=", Core.getCurrentUser().getId()).one();

			if (Core.isNull(estagiario)) {
				view.btn_novo_tema.setVisible(false);
			}

			TemaTbl tematblfilter = new TemaTbl().find();
			if (Core.getCurrentProfileCode().equals("avaliado.sistema_de_avaliacao_igrpweb")) {
				tematblfilter.andWhere("idAvaliadoFk.idUtilizador", "=", Core.getCurrentUser().getId());
			}
			List<TemaTbl> tematblList = tematblfilter.orderByAsc("idAvaliadoFk.nome").all();
			List<Lista_de_temas_submetidos.Table_1> tematblTable = new ArrayList<>();
			if (tematblList != null) {
				for (TemaTbl tematbl : tematblList) {
					model.setId_avaliado(tematbl.getIdAvaliadoFk().getIdAvaliado() + "");
					Lista_de_temas_submetidos.Table_1 row = new Lista_de_temas_submetidos.Table_1();
					row.setNome(tematbl.getIdAvaliadoFk() != null ? tematbl.getIdAvaliadoFk().getNome() : null);
					row.setTema_semanal(tematbl.getTema());
					row.setData_de_envio(
							Core.convertLocalDateTimeToString(tematbl.getData(), "dd-MM-yyyy - HH:mm") + "");
					tematblTable.add(row);
				}
			}
			model.setTable_1(tematblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);
	}

	public Response actionNovo_tema() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_temas_submetidos model = new Lista_de_temas_submetidos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Tema_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_tema)----*/

		this.addQueryString("p_id_avaliado", model.getId_avaliado());
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Tema_semanal", "index", this.queryString());
	}

	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
