package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
/*----#end-code----*/

public class Tema_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Tema_semanal model = new Tema_semanal();
		model.load();
		model.setPositivo_title("Média");
		model.setPositivo_val("68");
		model.setPositivo_txt("Continua assim no que diz respeito à");
		model.setPositivo_url("http://www.example.com");
		model.setPositivo_bg("cp-electric");
		model.setPositivo_icn("fa-thumbs-up");
		model.setNegativo_title("Média");
		model.setNegativo_val("485");
		model.setNegativo_txt("Necessita de melhoria no que diz respeito à");
		model.setNegativo_url("http://www.example.com");
		model.setNegativo_bg("cp-embers");
		model.setNegativo_icn("fa-thumbs-down");
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Tema_semanalView view = new Tema_semanalView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.setPositivo_url(Core.getIGRPLink("your app","your page","your action"));
		model.setNegativo_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {
			/**************** ENVIAR AVISOS *******************************************/
			
			SemanaTbl semana_atual = new SemanaTbl().find().andWhere("atual", "=", true).one();
			model.setId_semana(semana_atual.getNrSemana());
			
			Integer semana_anterior = semana_atual.getNrSemana()-1;
			
			List<SemanalTbl> semanna = new SemanalTbl().find()
					.andWhere("idTemaFk.nrSemana", "=", semana_anterior)
					.andWhere("idAvaliadoFk", "=", Core.getParamInt("p_id_avaliado"))
					.all();
			
			for (SemanalTbl obs : semanna) {
					if(Core.isNotNull(obs.getObservacao())) {
						Core.setMessageWarning("Observação Semana Anterior: "+ obs.getObservacao()+" ("+obs.getNomeAvaliador()+")");
					}
				
			}	
			/**************** PREENCHER STABOX *******************************************/

			List<SemanalTbl> seman = new SemanalTbl().find()
					.andWhere("idAvaliadoFk", "=", Core.getParamInt("p_id_avaliado")).all();
			LinkedHashMap<String, Double> medias = new LinkedHashMap<>();
			Double conteudo = seman.stream().collect(Collectors.averagingInt(e -> e.getConteudo()));
			medias.put("Conteúdo nas Apresentações", conteudo);
			Double pontual = seman.stream().collect(Collectors.averagingInt(e -> e.getPontualidade()));
			medias.put("Pontualidade nas Apresentações", pontual);
			Double lingua = seman.stream().collect(Collectors.averagingInt(e -> e.getDominio()));
			medias.put("Domínio da Língua", lingua);
			Double clareza = seman.stream().collect(Collectors.averagingInt(e -> e.getClareza()));
			medias.put("Clareza nos Conceitos", clareza);
			Double proat = seman.stream().collect(Collectors.averagingInt(e -> e.getProactividade()));
			medias.put("Proatividade nas Tarefas", proat);
			Double nivel = seman.stream().collect(Collectors.averagingInt(e -> e.getNivel()));
			medias.put("Nivel de Aprendizado", nivel);
			Double tarefas = seman.stream().collect(Collectors.averagingInt(e -> e.getTarefas()));
			medias.put("Tarefas Futuras", tarefas);

			Double max = Collections.max(medias.values());
			Long max_round = Math.round(max);
			Double min = Collections.min(medias.values());
			Long min_round = Math.round(min);

			Set<String> max_keys = medias.entrySet().stream().filter(e -> e.getValue().equals(max))
					.map(Map.Entry::getKey).collect(Collectors.toSet());
			Set<String> min_keys = medias.entrySet().stream().filter(e -> e.getValue().equals(min))
					.map(Map.Entry::getKey).collect(Collectors.toSet());

			model.setPositivo_val(max_round + "");
			model.setPositivo_txt(model.getPositivo_txt() + " " + max_keys);
			model.setPositivo_url(Core.getIGRPLink("sistema_de_avaliacao_igrpweb", "Lista_avaliacao_semanal", "index"));

			model.setNegativo_val(min_round + "");
			model.setNegativo_txt(model.getNegativo_txt() + " " + min_keys);
			model.setNegativo_url(Core.getIGRPLink("sistema_de_avaliacao_igrpweb", "Lista_avaliacao_semanal", "index"));

			AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				model.setNome(avaliadotbl.getNome());
				model.setArea("" + avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc());
				model.setMentor(avaliadotbl.getIdMentorFk().getNome());
				model.setView_1_img(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);
	}

	public Response actionSubmeter() throws IOException, IllegalArgumentException, IllegalAccessException {
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
				SemanaTbl semana = session.find(SemanaTbl.class, model.getId_semana());
				temaltbl.setNrSemana(semana);

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
		return this.redirect("sistema_de_avaliacao_igrpweb", "Tema_semanal", "index", this.queryString());
	}

	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
