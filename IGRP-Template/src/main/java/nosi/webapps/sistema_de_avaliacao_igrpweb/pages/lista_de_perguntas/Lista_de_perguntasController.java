package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.EnunciadoTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.PerguntaTbl; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.PerguntaTbl;

/*----#end-code----*/
		
public class Lista_de_perguntasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_perguntas model = new Lista_de_perguntas();
		model.load();
		Lista_de_perguntasView view = new Lista_de_perguntasView();
		view.id_pergunta.setParam(true);
		view.conceito_form.loadDomain("conceitos","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Iste ut totam rem mollit' as conceito,'Ut iste laudantium iste anim u' as pergunta,'Elit adipiscing natus elit rem' as nivel,'hidden-1a73_c94c' as id_pergunta "));
		view.nivel_form.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
	try{
	EnunciadoTbl enunciadotblfilter = new EnunciadoTbl().find();
	
	List<EnunciadoTbl> enunciadotblList = enunciadotblfilter.all();
	view.nivel_form.setValue(Core.toMap(enunciadotblList, "id","descricao","-- Selecionar --"));
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#start-code(index)----*/
			  
	try{
	
	PerguntaTbl perguntatblfilter = new PerguntaTbl().find();
	if(Core.isNotNull(model.getConceito_form())){
		perguntatblfilter.andWhere("conceito","=",model.getConceito_form());
	}
	if(Core.isNotNull(model.getNivel_form())){
		perguntatblfilter.andWhere("enunciadoId","=",Core.toInt(model.getNivel_form()));
	}
	List<PerguntaTbl> perguntatblList = perguntatblfilter.all();
	List<Lista_de_perguntas.Table_1> perguntatblTable = new ArrayList<>();
	if(perguntatblList != null){
		for(PerguntaTbl perguntatbl : perguntatblList){
			Lista_de_perguntas.Table_1 row = new Lista_de_perguntas.Table_1();
			row.setConceito(Core.findDomainDescByKey("conceitos", perguntatbl.getConceito()));
			row.setPergunta(perguntatbl.getPergunta());
			row.setId_pergunta(""+perguntatbl.getIdPergunta());
			row.setNivel(perguntatbl.getEnunciadoId().getDescricao());
			perguntatblTable.add(row);
		}
	}
	model.setTable_1(perguntatblTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_perguntas model = new Lista_de_perguntas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_pergunta",Core.getParam("p_id_pergunta"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index", this.queryString());	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_perguntas model = new Lista_de_perguntas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_pergunta",Core.getParam("p_id_pergunta"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Lista_de_perguntas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar)----*/
		  return this.forward("sistema_de_avaliacao_igrpweb","Lista_de_perguntas","index",this.queryString());
		
		/*----#end-code----*/
			
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_perguntas model = new Lista_de_perguntas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_pergunta",Core.getParam("p_id_pergunta"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		this.addQueryString("p_id_pergunta", Core.getParam("p_id_pergunta"));
	
	this.addQueryString("isEdit", "true");
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
