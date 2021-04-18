package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_teste;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.EnunciadoTbl; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Parametrizacao_testeController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_teste model = new Parametrizacao_teste();
		model.load();
		Parametrizacao_testeView view = new Parametrizacao_testeView();
		view.teste_tbl.setParam(true);
		view.id_teste_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Perspiciatis elit accusantium' as teste_tbl,'hidden-5c80_25c7' as id_teste_tbl "));
		  ----#gen-example */
	try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		EnunciadoTbl enunciadotbl = new EnunciadoTbl().findOne(Core.getParamInt("p_id_teste_tbl"));
		if (enunciadotbl!=null && !enunciadotbl.hasError()) {
			model.setNome_do_teste(enunciadotbl.getDescricao());
			model.setId_teste(enunciadotbl.getId().toString());
	
	view.btn_salvar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	try{
	
	EnunciadoTbl enunciadotblfilter = new EnunciadoTbl().find();
	List<EnunciadoTbl> enunciadotblList = enunciadotblfilter.all();
	List<Parametrizacao_teste.Table_1> enunciadotblTable = new ArrayList<>();
	if(enunciadotblList != null){
		for(EnunciadoTbl enunciadotbl : enunciadotblList){
			Parametrizacao_teste.Table_1 row = new Parametrizacao_teste.Table_1();
			row.setTeste_tbl(enunciadotbl.getDescricao());
			row.setId_teste_tbl(enunciadotbl.getId().toString());
			enunciadotblTable.add(row);
		}
	}
	model.setTable_1(enunciadotblTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_teste model = new Parametrizacao_teste();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_teste_tbl",Core.getParam("p_teste_tbl"));
		  this.addQueryString("p_id_teste_tbl",Core.getParam("p_id_teste_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_teste","index",this.queryString()); //if submit, loads the values
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
		EnunciadoTbl enunciadotbl  = new EnunciadoTbl();
		if(Core.isNotNull(isEdit)) {
			 enunciadotbl = session.find(EnunciadoTbl.class, Core.toInt(model.getId_teste()));
		}
		if (enunciadotbl != null){
			enunciadotbl.setDescricao(model.getNome_do_teste());
		}
		session.persist(enunciadotbl);
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
		return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_teste","index",this.queryString());
	}
		/*----#start-code(salvar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_teste","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_teste model = new Parametrizacao_teste();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_teste_tbl",Core.getParam("p_teste_tbl"));
		  this.addQueryString("p_id_teste_tbl",Core.getParam("p_id_teste_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_teste","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
	this.addQueryString("p_id_teste_tbl", Core.getParam("p_id_teste_tbl"));
	
	this.addQueryString("isEdit", "true");
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_teste","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
