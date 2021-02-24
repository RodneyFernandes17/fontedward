package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
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
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Aperiam deserunt natus sit und' as conceito,'Sed elit adipiscing elit persp' as pergunta,'hidden-4288_d59a' as id_pergunta "));
		  ----#gen-example */
		/*----#start-code(index)----*/
			  
	try{
	
	PerguntaTbl perguntatblfilter = new PerguntaTbl().find();
	List<PerguntaTbl> perguntatblList = perguntatblfilter.all();
	List<Lista_de_perguntas.Table_1> perguntatblTable = new ArrayList<>();
	if(perguntatblList != null){
		for(PerguntaTbl perguntatbl : perguntatblList){
			Lista_de_perguntas.Table_1 row = new Lista_de_perguntas.Table_1();
			row.setConceito(perguntatbl.getConceito());
			row.setPergunta(perguntatbl.getPergunta());
			row.setId_pergunta(""+perguntatbl.getIdPergunta());
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
