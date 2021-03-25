package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.grafico_evolucao_semanal;

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
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.grafico_evolucao_semanal.Grafico_evolucao_semanal.Chart_1;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.grafico_evolucao_semanal.Grafico_evolucao_semanal.Chart_1;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/*----#end-code----*/
		
public class Grafico_evolucao_semanalController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Grafico_evolucao_semanal model = new Grafico_evolucao_semanal();
		model.load();
		Grafico_evolucao_semanalView view = new Grafico_evolucao_semanalView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.estagiarios.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {
			AvaliadoTbl avaliadotblfilter = new AvaliadoTbl().find();

			List<AvaliadoTbl> avaliadotblList = avaliadotblfilter.orderByAsc("nome").all();
			view.estagiarios.setValue(Core.toMap(avaliadotblList, "idAvaliado", "nome", "-- Selecionar --"));

			if (Core.isNotNull(model.getEstagiarios())) {
				Long max_semana = new SemanaTbl().find().getCount();
				model.setChart_1(new ArrayList<>());
				for (String id_avaliados_str : model.getEstagiarios()) {
					Integer id_avaliado = Core.toInt(id_avaliados_str);
					LinkedHashMap<Integer, Long> medias = new LinkedHashMap<>();
					
					for (int semana_in = 1; semana_in <= max_semana; semana_in++) {

						SemanalTbl semana_nulo = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
								.andWhere("idAvaliadoFk", "=", id_avaliado).one();
						if (Core.isNull(semana_nulo)) {
							medias.put(semana_in, (long) 0);
						} else {

							Double dadosconteudo = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getConteudo()));
							Long conteudo = Math.round(dadosconteudo);
							Double dadospontual = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getPontualidade()));
							Long pontual = Math.round(dadospontual);
							Double dadosdominio = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getDominio()));
							Long dominio = Math.round(dadosdominio);
							Double dadosclareza = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getClareza()));
							Long clareza = Math.round(dadosclareza);
							Double dadosproat = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getProactividade()));
							Long proativadade = Math.round(dadosproat);
							Double dadosnivel = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getNivel()));
							Long nivel = Math.round(dadosnivel);
							Double dadostarefas = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_in)
									.andWhere("idAvaliadoFk", "=", id_avaliado).all().stream()
									.collect(Collectors.averagingInt(e -> e.getTarefas()));
							Long tarefas = Math.round(dadostarefas);
							Double Media = (double) (conteudo + pontual + dominio + clareza + proativadade + nivel
									+ tarefas) / 7;
							Long media_round = Math.round(Media);

							medias.put(semana_in, media_round);
						}
						
						
					}
					AvaliadoTbl nome = new AvaliadoTbl().findOne(id_avaliado);
					for (int semana_in = 1; semana_in <= max_semana; semana_in++) {
						Chart_1 c = new Chart_1();
						c.setEixoX("Semana " + semana_in);		 
						c.setEixoY(nome.getNome());
						c.setEixoZ(medias.get(semana_in));
						model.getChart_1().add(c);
					}
		
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Grafico_evolucao_semanal model = new Grafico_evolucao_semanal();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Grafico_evolucao_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar)----*/

		return this.forward("sistema_de_avaliacao_igrpweb", "Grafico_evolucao_semanal", "index", this.queryString());
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
