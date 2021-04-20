package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_formandos;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormandoTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.core.webapp.Report;

/*----#end-code----*/

public class Lista_de_formandosController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_formandos model = new Lista_de_formandos();
		model.load();
		Lista_de_formandosView view = new Lista_de_formandosView();
		view.chave_autenticacao.setParam(true);
		view.id_formando.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as foto,'Unde doloremque elit ut unde m' as nome,'Ut sed perspiciatis aperiam ip' as formacao,'Officia rem ipsum deserunt str' as edicao,'Sit consectetur labore amet vo' as chave_autenticacao,'hidden-2c14_f419' as id_formando "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			FormandoTbl formandofilter = new FormandoTbl().find();
			List<FormandoTbl> formandoList = formandofilter.all();
			List<Lista_de_formandos.Table_1> formandoTable = new ArrayList<>();
			if (formandoList != null) {
				for (FormandoTbl formando : formandoList) {
					Lista_de_formandos.Table_1 row = new Lista_de_formandos.Table_1();
					row.setFoto(Core.getLinkFileByUuid(formando.getAvaliadoId().getIdFoto()));
					row.setNome(formando.getAvaliadoId() != null ? formando.getAvaliadoId().getNome() : null);
					row.setFormacao(formando.getAvaliadoId() != null ? formando.getAvaliadoId().getFormacao() : null);
					row.setEdicao(formando.getAvaliadoId() != null ? formando.getAvaliadoId().getEdicao() : null);
					row.setId_formando(formando.getId().toString());
					row.setChave_autenticacao(formando.getChaveAut());
					formandoTable.add(row);
				}
			}
			model.setTable_1(formandoTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);
	}

	public Response actionVer() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_formandos model = new Lista_de_formandos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_chave_autenticacao",Core.getParam("p_chave_autenticacao"));
		  this.addQueryString("p_id_formando",Core.getParam("p_id_formando"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(ver)----*/
		this.addQueryString("isEdit", "true");
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_formando"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb", "Formulario_de_inscricao", "index", this.queryString());
	}

	public Response actionEmitir_certificado() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_formandos model = new Lista_de_formandos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_chave_autenticacao",Core.getParam("p_chave_autenticacao"));
		  this.addQueryString("p_id_formando",Core.getParam("p_id_formando"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Criacao_de_certificado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(emitir_certificado)----*/

		return Core.getLinkReport("certificado_igrpweb",
				new Report().addParam("value_array", Core.getParam("p_id_formando"))
						.setContraProva("IGRPWEB_" + Core.getParam("p_chave_autenticacao")));

		/*----#end-code----*/

	}

	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
