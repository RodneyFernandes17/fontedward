package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import java.time.LocalDateTime;

/*----#end-code----*/
		
public class Tema_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tema_semanal model = new Tema_semanal();
		model.load();
		Tema_semanalView view = new Tema_semanalView();
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSubmeter() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tema_semanal model = new Tema_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Tema_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(submeter)----*/
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		Integer id_avaliado = Core.getParamInt("p_id_avaliado");
		try {
			if (model.validate()) {
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				if (!transaction.isActive())
					transaction.begin();
				TemaTbl temaltbl = new TemaTbl();
				temaltbl.setTema(model.getTema_semanal());
				temaltbl.setData(LocalDateTime.now());
				temaltbl.setNrSemana(model.getNr_semana());
				temaltbl.setNomeUtilizador(Core.getCurrentUser().getName());
				temaltbl.setIdUtilizador(Core.getCurrentUser().getId());
				temaltbl.setEstadoAtual(true);
				AvaliadoTbl avaliadotbl = session.find(AvaliadoTbl.class, id_avaliado);
				temaltbl.setIdAvaliadoFk(avaliadotbl);
				session.persist(temaltbl);

				avaliadotbl.setAreaEstagio(model.getArea());
				avaliadotbl.setMentor(model.getMentor());
				session.update(avaliadotbl);
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
			return this.forward("sistema_de_avaliacao_igrpweb", "Tema_semanal", "index", this.queryString());
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Tema_semanal","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
