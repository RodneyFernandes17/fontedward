package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_avaliacao_semanal;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import java.time.LocalDate;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
/*----#end-code----*/
		
public class Formulario_avaliacao_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Formulario_avaliacao_semanal model = new Formulario_avaliacao_semanal();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Formulario_avaliacao_semanalView view = new Formulario_avaliacao_semanalView();
		/*----#start-code(index)----*/

		Integer id_avaliado = Core.getParamInt("p_id_avaliado");

		TemaTbl tema = new TemaTbl().find().andWhere("idAvaliadoFk", "=", id_avaliado)
				.andWhere("estadoAtual", "=", true).one();
		if (tema != null && !tema.hasError()) {
			model.setNome(tema.getIdAvaliadoFk().getNome());
			model.setArea(tema.getIdAvaliadoFk().getAreaEstagio());
			model.setView_1_img(
					tema.getIdAvaliadoFk() != null ? Core.getLinkFileByUuid(tema.getIdAvaliadoFk().getIdFoto()) : null);
			model.setSemana(tema.getNrSemana());
			model.setTema_semanal(tema.getTema());
			model.setId_avaliado(tema.getIdAvaliadoFk().getIdAvaliado() + "");
		} else
			Core.setMessageError("O Estagiário não enviou o Tema Semanal!");

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSubmeter_avaliacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Formulario_avaliacao_semanal model = new Formulario_avaliacao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(submeter_avaliacao)----*/

			Session session = null;
			Transaction transaction = null;
			String isEdit = Core.getParam("isEdit");
			try {
				if (model.validate()) {
					session = Core.getSession(Core.defaultConnection());
					transaction = session.getTransaction();
					if (!transaction.isActive())
						transaction.begin();

					SemanalTbl semanaltbl = new SemanalTbl();
					if (Core.isNotNull(isEdit)) {
						semanaltbl = session.find(SemanalTbl.class, Core.getParamInt("p_id_semanal"));
					}
					if (semanaltbl != null) {
						AvaliadoTbl avaliadotbl_foreign = session.find(AvaliadoTbl.class,
								Core.toInt(model.getId_avaliado()));
						semanaltbl.setIdAvaliadoFk(avaliadotbl_foreign);
						semanaltbl.setNrSemana(model.getSemana());
						semanaltbl.setConteudo(model.getConteudo());
						semanaltbl.setPontualidade(model.getPontualidade());
						semanaltbl.setDominio(model.getDominio());
						semanaltbl.setClareza(model.getClareza());
						semanaltbl.setProactividade(model.getProactividade());
						semanaltbl.setNivel(model.getAprendizagem());
						semanaltbl.setTarefas(model.getTarefas());
						semanaltbl.setData(LocalDate.now());
						semanaltbl.setIdAvaliador(Core.getCurrentUser().getId());
						semanaltbl.setNomeAvaliador(Core.getCurrentUser().getName());
						semanaltbl.setTemaSemanal(model.getTema_semanal());
					}
					session.persist(semanaltbl);
					transaction.commit();

					TemaTbl tema = new TemaTbl().find().andWhere("idAvaliadoFk", "=", Core.toInt(model.getId_avaliado()))
							.andWhere("estadoAtual", "=", true).one();

					if (Core.isNotNull(tema)) {
						tema.setEstadoAtual(false);
						tema.update();
					}

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
				return this.forward("sistema_de_avaliacao_igrpweb", "Formulario_avaliacao_semanal", "index",
						this.queryString());
			}	

		return this.redirect("sistema_de_avaliacao_igrpweb", "Formulario_avaliacao_semanal", "index",
				this.queryString());
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
