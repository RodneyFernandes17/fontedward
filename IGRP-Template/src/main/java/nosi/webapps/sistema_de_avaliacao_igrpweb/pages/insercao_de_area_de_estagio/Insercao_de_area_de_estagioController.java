package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.insercao_de_area_de_estagio;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;
/*----#end-code----*/
		
public class Insercao_de_area_de_estagioController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Insercao_de_area_de_estagio model = new Insercao_de_area_de_estagio();
		model.load();
		Insercao_de_area_de_estagioView view = new Insercao_de_area_de_estagioView();
		view.id_avaliado.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Labore mollit labore sed magna' as nome,'Adipiscing rem perspiciatis do' as area_tbl,'Adipiscing labore magna sit ip' as mentor_tbl,'hidden-38e1_7c93' as id_avaliado "));
		view.estagiario.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.mentor.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
	try{
	AvaliadoTbl avaliadotblfilter = new AvaliadoTbl().find();
	
	List<AvaliadoTbl> avaliadotblList = avaliadotblfilter.all();
	view.estagiario.setValue(Core.toMap(avaliadotblList, "idAvaliado","nome","-- Selecionar --"));
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	MentorTbl mentortblfilter = new MentorTbl().find();
	
	List<MentorTbl> mentortblList = mentortblfilter.all();
	view.mentor.setValue(Core.toMap(mentortblList, "id","nome","-- Selecionar --"));
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
		if (avaliadotbl!=null && !avaliadotbl.hasError()) {
			model.setEstagiario(""+avaliadotbl.getIdAvaliado());
			model.setMentor(""+avaliadotbl.getIdMentorFk().getId());
			model.setId_avaliado_pk(avaliadotbl.getIdAvaliado());
	
	view.btn_salvar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
	AvaliadoTbl avaliadotblfilter = new AvaliadoTbl().find();
	List<AvaliadoTbl> avaliadotblList = avaliadotblfilter.all();
	List<Insercao_de_area_de_estagio.Table_1> avaliadotblTable = new ArrayList<>();
	if(avaliadotblList != null){
		for(AvaliadoTbl avaliadotbl : avaliadotblList){
			Insercao_de_area_de_estagio.Table_1 row = new Insercao_de_area_de_estagio.Table_1();
			row.setNome(avaliadotbl.getNome());
			row.setArea_tbl(avaliadotbl.getIdMentorFk()!=null?avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc():null);
			row.setMentor_tbl(avaliadotbl.getIdMentorFk()!=null?avaliadotbl.getIdMentorFk().getNome():null);
			row.setId_avaliado(""+avaliadotbl.getIdAvaliado());
			avaliadotblTable.add(row);
		}
	}
	model.setTable_1(avaliadotblTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		/*----#start-code(index)----*/
		
   
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Insercao_de_area_de_estagio model = new Insercao_de_area_de_estagio();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar)----*/
	
		try{
		AvaliadoTbl avaliadotbl  = new AvaliadoTbl().findOne(Core.toInt(model.getEstagiario()));
		if(Core.isNotNull(avaliadotbl)){
	MentorTbl mentortbl_foreign = new MentorTbl().findOne(Core.toInt(model.getMentor()));
	avaliadotbl.setIdMentorFk(mentortbl_foreign);
			avaliadotbl.update();
			Core.setMessageSuccess();
		}
		else
			Core.setMessageError("Não foi possível fazer a edição.");
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
	}	
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Insercao_de_area_de_estagio model = new Insercao_de_area_de_estagio();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));
	
	this.addQueryString("isEdit", "true");
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
