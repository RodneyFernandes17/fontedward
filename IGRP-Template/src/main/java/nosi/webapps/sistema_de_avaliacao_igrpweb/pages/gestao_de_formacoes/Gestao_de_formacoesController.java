package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.gestao_de_formacoes;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormacaoTbl; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormacaoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormandoTbl;
/*----#end-code----*/
		
public class Gestao_de_formacoesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		Gestao_de_formacoesView view = new Gestao_de_formacoesView();
		view.id_formacao.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Perspiciatis dolor mollit lore' as nome,'Elit adipiscing deserunt ipsum' as instituicao,'Consectetur aliqua aperiam vol' as data_inicio,'Iste ipsum voluptatem dolor de' as data_fim,'hidden-2449_e970' as id_formacao "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			FormacaoTbl formacaotblfilter = new FormacaoTbl().find();
			List<FormacaoTbl> formacaotblList = formacaotblfilter.orderByAsc("dataIn").all();
			List<Gestao_de_formacoes.Table_1> formacaotblTable = new ArrayList<>();
			if (formacaotblList != null) {
				for (FormacaoTbl formacaotbl : formacaotblList) {
					Gestao_de_formacoes.Table_1 row = new Gestao_de_formacoes.Table_1();
					row.setNome(formacaotbl.getNome());
					row.setData_inicio(Core.convertLocalDateToString(formacaotbl.getDataIn(), "dd-MM-yyyy"));
					row.setData_fim(Core.convertLocalDateToString(formacaotbl.getDataFim(), "dd-MM-yyyy"));
					row.setId_formacao(formacaotbl.getId().toString());
					row.setInstituicao(Core.findDomainDescByKey("intituicoes", formacaotbl.getInstituicao()) );
					AvaliadoTbl esta_inscrito = new AvaliadoTbl().find()
							.andWhere("idUtilizador", "=", Core.getCurrentUser().getId()).one();
					if (Core.isNull(esta_inscrito))
						row.hiddenButton(view.btn_realizar_avaliacao);

					TesteTbl fez_teste = new TesteTbl().find()
							.andWhere("idAvaliadoFk.idUtilizador", "=", Core.getCurrentUser().getId()).one();
					if (Core.isNotNull(fez_teste))
						row.hiddenButton(view.btn_realizar_avaliacao);
					else
						row.hiddenButton(view.btn_resultado_teste);

					FormandoTbl inscrito_formacao = new FormandoTbl().find()
							.andWhere("formacaoId", "=", Core.toInt(row.getId_formacao()))
							.andWhere("avaliadoId.idUtilizador", "=", Core.getCurrentUser().getId()).one();
					if (Core.isNull(inscrito_formacao)) {
						row.hiddenButton(view.btn_realizar_avaliacao);
						row.hiddenButton(view.btn_resultado_teste);
					}
					formacaotblTable.add(row);
				}
			}
			model.setTable_1(formacaotblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_formacao",Core.getParam("p_id_formacao"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Criacao_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Criacao_formacao","index", this.queryString());	
	}
	
	public Response actionRealizar_avaliacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_formacao",Core.getParam("p_id_formacao"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Questoes_gerais","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	this.addQueryString("p_id_formacao", Core.getParam("p_id_formacao"));
		/*----#start-code(realizar_avaliacao)----*/

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Questoes_gerais","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_formacao",Core.getParam("p_id_formacao"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Criacao_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		this.addQueryString("p_id_formacao", Core.getParam("p_id_formacao"));

		this.addQueryString("isEdit", "true");

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Criacao_formacao","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_formacao",Core.getParam("p_id_formacao"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
		FormacaoTbl formacaotbl = new FormacaoTbl().findOne(Core.getParamInt("p_id_formacao"));
		if (formacaotbl != null && !formacaotbl.hasError()) {
			boolean del = formacaotbl.delete(formacaotbl.getId());
			if (del == true)
				Core.setMessageSuccess("Deleted from DB successfully!");
			else
				Core.setMessageError("Error deleting person from DB!");
		} else {
			Core.setMessageError(formacaotbl.getError().toString());
		}

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","index", this.queryString());	
	}
	
	public Response actionResultado_teste() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_formacoes model = new Gestao_de_formacoes();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_formacao",Core.getParam("p_id_formacao"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Informacoes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(resultado_teste)----*/
		this.addQueryString("p_id_formacao", Core.getParam("p_id_formacao"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Informacoes","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
