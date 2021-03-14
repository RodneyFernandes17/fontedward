package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_areas_ou_projetos;

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
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Parametrizacao_areas_ou_projetosController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_areas_ou_projetos model = new Parametrizacao_areas_ou_projetos();
		model.load();
		Parametrizacao_areas_ou_projetosView view = new Parametrizacao_areas_ou_projetosView();
		view.id_area_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Officia dolor consectetur ipsu' as area_tbl,'hidden-e2ee_6184' as id_area_tbl "));
		  ----#gen-example */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		AreaTbl areatbl = new AreaTbl().findOne(Core.getParamInt("p_id_area_tbl"));
		if (areatbl!=null && !areatbl.hasError()) {
			model.setArea(areatbl.getAreaDesc());
			model.setId_area(areatbl.getId());
	
	view.btn_salvar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
	AreaTbl areatblfilter = new AreaTbl().find();
	List<AreaTbl> areatblList = areatblfilter.all();
	List<Parametrizacao_areas_ou_projetos.Table_1> areatblTable = new ArrayList<>();
	if(areatblList != null){
		for(AreaTbl areatbl : areatblList){
			Parametrizacao_areas_ou_projetos.Table_1 row = new Parametrizacao_areas_ou_projetos.Table_1();
			row.setArea_tbl(areatbl.getAreaDesc());
			row.setId_area_tbl(areatbl.getId());
			areatblTable.add(row);
		}
	}
	model.setTable_1(areatblTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_areas_ou_projetos model = new Parametrizacao_areas_ou_projetos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_tbl",Core.getParam("p_id_area_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","index",this.queryString()); //if submit, loads the values
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
		AreaTbl areatbl  = new AreaTbl();
		if(Core.isNotNull(isEdit)) {
			 areatbl = session.find(AreaTbl.class, model.getId_area());
		}
		if (areatbl != null){
			areatbl.setAreaDesc(model.getArea());
		}
		session.persist(areatbl);
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
		return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","index",this.queryString());
	}
		/*----#start-code(salvar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_areas_ou_projetos model = new Parametrizacao_areas_ou_projetos();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_tbl",Core.getParam("p_id_area_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	this.addQueryString("p_id_area_tbl", Core.getParam("p_id_area_tbl"));
	
	this.addQueryString("isEdit", "true");
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
