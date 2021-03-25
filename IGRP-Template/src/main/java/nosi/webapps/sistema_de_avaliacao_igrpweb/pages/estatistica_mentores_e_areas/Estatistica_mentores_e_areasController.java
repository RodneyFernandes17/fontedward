package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas;

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
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas.Estatistica_mentores_e_areas.Chart_1;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas.Estatistica_mentores_e_areas.Chart_2;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas.Estatistica_mentores_e_areas.Chart_1;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas.Estatistica_mentores_e_areas.Chart_2;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.MentorTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AreaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;

/*----#end-code----*/
		
public class Estatistica_mentores_e_areasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Estatistica_mentores_e_areas model = new Estatistica_mentores_e_areas();
		model.load();
		Estatistica_mentores_e_areasView view = new Estatistica_mentores_e_areasView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.chart_2.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.areas_ou_projetos.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.mentores.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			/***** COMBO_BOX *****/
			MentorTbl mentortblfilter = new MentorTbl().find();
			List<MentorTbl> mentortblList = mentortblfilter.all();
			view.mentores.setValue(Core.toMap(mentortblList, "id", "nome", "-- Selecionar --"));
			AreaTbl areatblfilter = new AreaTbl().find();
			List<AreaTbl> areatblList = areatblfilter.all();
			view.areas_ou_projetos.setValue(Core.toMap(areatblList, "id", "areaDesc"));	
			
			model.setChart_1(new ArrayList<>());
			model.setChart_2(new ArrayList<>());
			
			/***** GRÁFICO ÁREAS *****/
			if (Core.isNotNull(model.getAreas_ou_projetos())) {
				for (String area : model.getAreas_ou_projetos()) {
					List<AvaliadoTbl> avaliadotb = new AvaliadoTbl().find().andWhere("idMentorFk.idAreaFk", "=", Core.toInt(area)).all();
					Map<String, Long> area_value = avaliadotb.stream().filter(m -> m.getIdMentorFk() != null).collect(
							Collectors.groupingBy(a -> a.getIdMentorFk().getIdAreaFk().getAreaDesc(), Collectors.counting()));
					if (!avaliadotb.isEmpty()) {
						avaliadotb.stream().forEach(avaliadotbl -> {
								Chart_1 c = new Chart_1();
								c.setEixoX("" + avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc());
								c.setEixoY("" + avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc());
								c.setEixoZ(area_value.get(avaliadotbl.getIdMentorFk().getIdAreaFk().getAreaDesc()));
								model.getChart_1().add(c);
								
						});
					}				
				}
				
			}
			
			/***** GRÁFICO MENTORES *****/
			if (Core.isNotNull(model.getMentores())) {
				for (String mentor : model.getMentores()) {
					List<AvaliadoTbl> avaliadotb = new AvaliadoTbl().find().where("idMentorFk", "=", Core.toInt(mentor)).all();
					Map<String, Long> mentor_value = avaliadotb.stream().filter(m -> m.getIdMentorFk() != null)
							.collect(Collectors.groupingBy(a -> a.getIdMentorFk().getNome(), Collectors.counting()));
					if (!avaliadotb.isEmpty()) {
						avaliadotb.stream().forEach(avaliadotbl -> {
								Chart_2 c2 = new Chart_2();
								c2.setEixoX("" + avaliadotbl.getIdMentorFk().getNome());
								c2.setEixoY("" + avaliadotbl.getIdMentorFk().getNome());
								c2.setEixoZ(mentor_value.get(avaliadotbl.getIdMentorFk().getNome()));
								model.getChart_2().add(c2);
						});
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
	
	public Response actionFiltrar_area() throws IOException, IllegalArgumentException, IllegalAccessException{
		Estatistica_mentores_e_areas model = new Estatistica_mentores_e_areas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Estatistica_mentores_e_areas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar_area)----*/
		
		return this.forward("sistema_de_avaliacao_igrpweb", "Estatistica_mentores_e_areas", "index",
				this.queryString());
		/*----#end-code----*/
			
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Estatistica_mentores_e_areas model = new Estatistica_mentores_e_areas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Estatistica_mentores_e_areas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar)----*/

		return this.forward("sistema_de_avaliacao_igrpweb", "Estatistica_mentores_e_areas", "index",
				this.queryString());
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/
	/*----#end-code----*/
}
