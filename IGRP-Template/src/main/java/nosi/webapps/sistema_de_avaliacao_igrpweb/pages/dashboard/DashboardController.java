package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard;

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
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard.Dashboard.Chart_1;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard.Dashboard.Chart_2;
import java.util.Map;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class DashboardController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Dashboard model = new Dashboard();
		model.load();
		DashboardView view = new DashboardView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_2.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		  ----#gen-example */
	try{
	TesteTbl testetblfilter = new TesteTbl().find();
	List<TesteTbl> p  = testetblfilter.all();
	Map<String, Long> z_value = p.stream().collect(Collectors.groupingBy(e -> e.getIdAvaliadoFk().getFormacao(),Collectors.counting()));
	if(p != null && !p.isEmpty()){
		model.setChart_1(new ArrayList<Chart_1>());
		p.stream().forEach(testetbl->{
			Chart_1 c = new Chart_1();
			c.setEixoX(Core.findDomainDescByKey("formacao", testetbl.getIdAvaliadoFk().getFormacao()) );
	
			c.setEixoY(Core.findDomainDescByKey("formacao", testetbl.getIdAvaliadoFk().getFormacao()) );
	
			c.setEixoZ(z_value.get(testetbl.getIdAvaliadoFk().getFormacao()));
			model.getChart_1().add(c);
		});
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	
	try{
	TesteTbl testetblfilter = new TesteTbl().find();
	List<TesteTbl> p  = testetblfilter.all();
	Map<String, Long> z_value = p.stream().collect(Collectors.groupingBy(e -> e.getIdAvaliadoFk().getUniversidade(),Collectors.counting()));
	if(p != null && !p.isEmpty()){
		model.setChart_2(new ArrayList<Chart_2>());
		p.stream().forEach(testetbl->{
			Chart_2 c = new Chart_2();
			c.setEixoX(Core.findDomainDescByKey("universidade", testetbl.getIdAvaliadoFk().getUniversidade()) );
	
			c.setEixoY(Core.findDomainDescByKey("universidade", testetbl.getIdAvaliadoFk().getUniversidade()) );
	
			c.setEixoZ(z_value.get(testetbl.getIdAvaliadoFk().getUniversidade()));
			model.getChart_2().add(c);
		});
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
