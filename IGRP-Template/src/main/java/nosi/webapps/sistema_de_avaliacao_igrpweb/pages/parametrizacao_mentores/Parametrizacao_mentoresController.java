package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_mentores;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Parametrizacao_mentoresController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_mentores model = new Parametrizacao_mentores();
		model.load();
		Parametrizacao_mentoresView view = new Parametrizacao_mentoresView();
		view.id_mentor_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Doloremque labore adipiscing m' as area_tbl,'Stract aliqua sit perspiciatis' as mentor_tbl,'hidden-d8de_ece6' as id_mentor_tbl "));
		view.area.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
	try{
	AreaTbl areatblfilter = new AreaTbl().find();
	
	List<AreaTbl> areatblList = areatblfilter.all();
	view.area.setValue(Core.toMap(areatblList, "id","areaDesc","-- Selecionar --"));
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		MentorTbl mentortbl = new MentorTbl().findOne(Core.getParamInt("p_id_mentor_tbl"));
		if (mentortbl!=null && !mentortbl.hasError()) {
			model.setArea(""+mentortbl.getIdAreaFk().getId());
			model.setMentor(mentortbl.getNome());
			model.setId_mentor(mentortbl.getId());
	
	view.btn_salvar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
	MentorTbl mentortblfilter = new MentorTbl().find();
	List<MentorTbl> mentortblList = mentortblfilter.all();
	List<Parametrizacao_mentores.Table_1> mentortblTable = new ArrayList<>();
	if(mentortblList != null){
		for(MentorTbl mentortbl : mentortblList){
			Parametrizacao_mentores.Table_1 row = new Parametrizacao_mentores.Table_1();
			row.setArea_tbl(mentortbl.getIdAreaFk()!=null?mentortbl.getIdAreaFk().getAreaDesc():null);
			row.setMentor_tbl(mentortbl.getNome());
			row.setId_mentor_tbl(mentortbl.getId());
			mentortblTable.add(row);
		}
	}
	model.setTable_1(mentortblTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_mentores model = new Parametrizacao_mentores();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_mentor_tbl",Core.getParam("p_id_mentor_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	Session session = null;
	Transaction transaction = null;
	String isEdit = Core.getParam("isEdit");
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		if(!transaction.isActive())
			transaction.begin();
		MentorTbl mentortbl  = new MentorTbl();
		if(Core.isNotNull(isEdit)) {
			 mentortbl = session.find(MentorTbl.class, model.getId_mentor());
		}
		if (mentortbl != null){
			mentortbl.setNome(model.getMentor());
	AreaTbl areatbl_foreign = session.find(AreaTbl.class, Core.toInt(model.getArea()));
	mentortbl.setIdAreaFk(areatbl_foreign);
		}
		session.persist(mentortbl);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else
		Core.setMessageError();
	}catch ( Exception e ) {
		e.printStackTrace();
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
	if(Core.isNotNull(isEdit)) {
		this.addQueryString("isEdit", "true");
		return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","index",this.queryString());
	}
		/*----#start-code(salvar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_mentores model = new Parametrizacao_mentores();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_mentor_tbl",Core.getParam("p_id_mentor_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	this.addQueryString("p_id_mentor_tbl", Core.getParam("p_id_mentor_tbl"));
	
	this.addQueryString("isEdit", "true");
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
