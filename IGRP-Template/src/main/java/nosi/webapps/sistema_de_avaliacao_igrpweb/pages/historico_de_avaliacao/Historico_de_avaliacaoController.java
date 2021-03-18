package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao.Historico_de_avaliacao.Chart_1;
import java.util.Map;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao.Historico_de_avaliacao.Chart_1;
import java.util.Map;
/*----#end-code----*/
		
public class Historico_de_avaliacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Historico_de_avaliacao model = new Historico_de_avaliacao();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Historico_de_avaliacaoView view = new Historico_de_avaliacaoView();
		view.semana.setParam(true);
		view.id_avaliado.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'bom' as media_tbl,'6' as semana,'01-02-2017' as data,'Anim omnis sit perspiciatis re' as tema,'Consectetur sed lorem ipsum ap' as media_semanal,'Deserunt iste deserunt unde st' as conteudo,'Iste perspiciatis sit iste ape' as pontualidade,'Natus ipsum deserunt magna off' as dominio,'Ipsum doloremque dolor aliqua' as clareza,'Ut amet consectetur ipsum ut' as proatividade,'Ut unde labore ut dolor' as nivel,'Ipsum iste doloremque sed rem' as tarefas,'hidden-af50_1d67' as id_avaliado "));
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		  ----#gen-example */
		/*----#start-code(index)----*/
		Long max_semana = new SemanaTbl().find().getCount();
		Integer id_avaliado = Core.getParamInt("p_id_avaliado");
		LinkedHashMap<Integer, Long> medias = new LinkedHashMap<>();

		try {
			AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				model.setNome(avaliadotbl.getNome());
				model.setArea(
						avaliadotbl.getIdMentorFk() != null ? avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc()
								: "");
				model.setView_1_img(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
				model.setMentor(avaliadotbl.getIdMentorFk() != null ? avaliadotbl.getIdMentorFk().getNome() : "");
			}
			List<Historico_de_avaliacao.Table_1> semanaltblTable = new ArrayList<>();
			for (int semana_in = 1; semana_in <= max_semana; semana_in++) {
				Historico_de_avaliacao.Table_1 row = new Historico_de_avaliacao.Table_1();
				SemanalTbl semana_nulo = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).one();
				if (Core.isNull(semana_nulo)) {
					row.setSemana(semana_in);
					row.setData("");
					row.setTema("Ainda sem Classificação");
					row.setConteudo("");
					row.setPontualidade("");
					row.setDominio("");
					row.setClareza("");
					row.setProatividade("");
					row.setNivel("");
					row.setTarefas("");
					row.setMedia_semanal("");
					row.setId_avaliado("");
					medias.put(semana_in, (long) 0);
				} else {
					row.setSemana(semana_in);
					SemanalTbl data = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).one();
					row.setData(data.getData() + "");
					row.setTema(data.getIdTemaFk().getTema());
					row.setId_avaliado(data.getIdAvaliadoFk().getIdAvaliado() + "");

					Double dadosconteudo = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getConteudo()));
					Long conteudo = Math.round(dadosconteudo);
					row.setConteudo(conteudo + "");
					Double dadospontual = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getPontualidade()));
					Long pontual = Math.round(dadospontual);
					row.setPontualidade(pontual + "");
					Double dadosdominio = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getDominio()));
					Long dominio = Math.round(dadosdominio);
					row.setDominio(dominio + "");
					Double dadosclareza = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getClareza()));
					Long clareza = Math.round(dadosclareza);
					row.setClareza(clareza + "");
					Double dadosproat = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getProactividade()));
					Long proativadade = Math.round(dadosproat);
					row.setProatividade(proativadade + "");
					Double dadosnivel = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getNivel()));
					Long nivel = Math.round(dadosnivel);
					row.setNivel(nivel + "");
					Double dadostarefas = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
							.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
							.collect(Collectors.averagingInt(e -> e.getTarefas()));
					Long tarefas = Math.round(dadostarefas);
					row.setTarefas(tarefas + "");
					Double Media = (double) (conteudo + pontual + dominio + clareza + proativadade + nivel + tarefas)
							/ 7;
					Long media_round = Math.round(Media);
					row.setMedia_semanal(media_round + "");

					if (media_round < 5) {
						row.setMedia_tbl("fraco");
					} else if (media_round >= 5 && media_round < 7) {
						row.setMedia_tbl("razoavel");
					} else if (media_round >= 7 && media_round < 9) {
						row.setMedia_tbl("bom");
					} else if (media_round >= 9) {
						row.setMedia_tbl("mto_bom");
					}
					medias.put(semana_in, media_round);
				}
				semanaltblTable.add(row);
			}
			model.setTable_1(semanaltblTable);

			model.setChart_1(new ArrayList<>());
			for (int semana_in = 1; semana_in <= max_semana; semana_in++) {
				Chart_1 c = new Chart_1();
				c.setEixoX("" + semana_in);
				c.setEixoY("Nº Semana");
				c.setEixoZ(medias.get(semana_in));
				model.getChart_1().add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionClassificacao_por_mentores() throws IOException, IllegalArgumentException, IllegalAccessException{
		Historico_de_avaliacao model = new Historico_de_avaliacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_semana",Core.getParam("p_semana"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Classificacao_por_mentores","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(classificacao_por_mentores)----*/
		this.addQueryString("p_semana", Core.getParam("p_semana"));
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Classificacao_por_mentores","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
