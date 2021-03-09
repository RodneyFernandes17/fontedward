package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;

/*----#end-code----*/
		
public class Historico_de_avaliacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Historico_de_avaliacao model = new Historico_de_avaliacao();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		Historico_de_avaliacaoView view = new Historico_de_avaliacaoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'fraco' as media_tbl,'12' as semana,'05-06-2013' as data,'Omnis rem unde amet perspiciat' as tema,'Sit magna stract voluptatem to' as media_semanal,'Aperiam doloremque sed sit tot' as conteudo,'Aperiam voluptatem perspiciati' as pontualidade,'Officia laudantium consectetur' as dominio,'Amet sit rem doloremque sed' as clareza,'Voluptatem rem sed lorem persp' as proatividade,'Officia sed perspiciatis offic' as nivel,'Doloremque consectetur sed dol' as tarefas "));
		  ----#gen-example */
		/*----#start-code(index)----*/

		try {

			AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				model.setNome(avaliadotbl.getNome());
				model.setArea(avaliadotbl.getAreaEstagio());
				model.setView_1_img(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		Integer id_avaliado = Core.getParamInt("p_id_avaliado");

		try {
			int semana_fim = 1;
			List<Historico_de_avaliacao.Table_1> semanaltblTable = new ArrayList<>();

			for (int semana_in = 1; semana_in <= semana_fim; semana_in++) {
				Historico_de_avaliacao.Table_1 row = new Historico_de_avaliacao.Table_1();
				row.setSemana(semana_in);
				SemanalTbl data = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).one();
				row.setData(data.getData() + "");
				row.setTema(data.getTemaSemanal());
				Double dadosconteudo = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getConteudo()));
				Long conteudo = Math.round(dadosconteudo);
				row.setConteudo(conteudo+"");
				
				Double dadospontual = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getPontualidade()));
				Long pontual = Math.round(dadospontual);
				row.setPontualidade(pontual+"");
				
				Double dadosdominio = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getDominio()));
				Long dominio = Math.round(dadosdominio);
				row.setDominio(dominio+"");
				
				Double dadosclareza = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getClareza()));
				Long clareza = Math.round(dadosclareza);
				row.setClareza(clareza+"");
				
				Double dadosproat = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getProactividade()));
				Long proativadade = Math.round(dadosproat);
				row.setProatividade(proativadade+"");
				
				Double dadosnivel = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getNivel()));
				Long nivel = Math.round(dadosnivel);
				row.setNivel(nivel+"");
				
				Double dadostarefas = new SemanalTbl().find().andWhere("nrSemana", "=", semana_in)
						.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
						.collect(Collectors.averagingInt(e -> e.getTarefas()));
				Long tarefas = Math.round(dadostarefas);
				row.setTarefas(tarefas+"");
				
				semanaltblTable.add(row);
				
				Double Media = (double)(conteudo+pontual+dominio+clareza+proativadade+nivel+tarefas)/7;
				Long media_round = Math.round(Media);
				
				row.setMedia_semanal(media_round+"");
				
				if(media_round<5) {
					row.setMedia_tbl("fraco");	
				}else if(media_round>=5 && media_round<7) {
					row.setMedia_tbl("razoavel");
				}else if(media_round>=7 && media_round<9) {
					row.setMedia_tbl("bom");
				}else if(media_round>=9) {
					row.setMedia_tbl("mto_bom");
				}
				
			}
			model.setTable_1(semanaltblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
