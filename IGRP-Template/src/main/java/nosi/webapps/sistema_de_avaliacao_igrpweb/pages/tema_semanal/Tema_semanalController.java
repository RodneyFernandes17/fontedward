package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */



/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import java.time.LocalDateTime;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
/*----#end-code----*/
		
public class Tema_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Tema_semanal model = new Tema_semanal();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Tema_semanalView view = new Tema_semanalView();
	try{
		
		SemanaTbl semana_atual = new SemanaTbl().find().andWhere("atual","=",true).one();
		model.setId_semana(semana_atual.getNrSemana());
	
		AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
		if (avaliadotbl!=null && !avaliadotbl.hasError()) {
			model.setNome(avaliadotbl.getNome());
			model.setArea(""+avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc());
			model.setMentor(avaliadotbl.getIdMentorFk().getNome());
			model.setView_1_img(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
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
		try {
			if (model.validate()) {
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				if (!transaction.isActive())
					transaction.begin();
				TemaTbl temaltbl = new TemaTbl();
				AvaliadoTbl avaliadotbl_foreign = session.find(AvaliadoTbl.class, Core.toInt(model.getId_avaliado()));
				temaltbl.setIdAvaliadoFk(avaliadotbl_foreign);
				temaltbl.setTema(model.getTema_semanal());
				temaltbl.setData(LocalDateTime.now());
				SemanaTbl semana = new SemanaTbl().findOne(model.getId_semana());
				temaltbl.setNrSemana(semana);
				
//				List<TemaTbl> semanaList = new TemaTbl().orderByAsc("nrSemana").findAll();		
//				int nr_semana = semanaList.get(0).getNrSemana() +1;
				
				session.persist(temaltbl);
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
