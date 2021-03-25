package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_semana;

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
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;

/*----#end-code----*/
		
public class Parametrizacao_semanaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_semana model = new Parametrizacao_semana();
		model.load();
		Parametrizacao_semanaView view = new Parametrizacao_semanaView();
		view.semana_tbl.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '5' as semana_tbl,'Mollit stract labore consectet' as atual_tbl "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {
			String isEdit = Core.getParam("isEdit");
			if (Core.isNotNull(isEdit)) {
				SemanaTbl semanatbl = new SemanaTbl().findOne(Core.getParamInt("p_semana_tbl"));
				if (semanatbl != null && !semanatbl.hasError()) {
					model.setSemana(semanatbl.getNrSemana());
					if (semanatbl.getAtual().equals(true)) {
						model.setAtual(1);
					} else
						model.setAtual(0);

					view.btn_salvar.addParameter("isEdit", "true");
				}
			}

			SemanaTbl semanatblfilter = new SemanaTbl().find();
			List<SemanaTbl> semanatblList = semanatblfilter.orderByDesc("nrSemana").all();
			List<Parametrizacao_semana.Table_1> semanatblTable = new ArrayList<>();
			if (semanatblList != null) {
				for (SemanaTbl semanatbl : semanatblList) {
					Parametrizacao_semana.Table_1 row = new Parametrizacao_semana.Table_1();
					row.setSemana_tbl(semanatbl.getNrSemana());
					row.setAtual_tbl(semanatbl.getAtual() + "");
					semanatblTable.add(row);
				}
			}
			model.setTable_1(semanatblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_semana model = new Parametrizacao_semana();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_semana_tbl",Core.getParam("p_semana_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_semana","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar)----*/
		
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try {
			if (model.validate()) {
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				if (!transaction.isActive())
					transaction.begin();
				SemanaTbl semanatbl = new SemanaTbl();
				if (Core.isNotNull(isEdit)) {
					semanatbl = session.find(SemanaTbl.class, model.getSemana());
				}
				if (semanatbl != null) {
					semanatbl.setNrSemana(model.getSemana());
					if (model.getAtual()==1) {
						semanatbl.setAtual(true);
					}else
						semanatbl.setAtual(false);
						
				}
				session.persist(semanatbl);
				transaction.commit();
				Core.setMessageSuccess();
			} else
				Core.setMessageError();
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		if (Core.isNotNull(isEdit)) {
			this.addQueryString("isEdit", "true");
			return this.forward("sistema_de_avaliacao_igrpweb", "Parametrizacao_semana", "index", this.queryString());
		}
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_semana","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_semana model = new Parametrizacao_semana();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_semana_tbl",Core.getParam("p_semana_tbl"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_semana","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		this.addQueryString("p_semana_tbl", Core.getParam("p_semana_tbl"));

		this.addQueryString("isEdit", "true");

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_semana","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
