package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;

public class DashboardView extends View {

	public IGRPChart chart_2;
	public IGRPChart chart_1;


	public DashboardView(){

		this.setPageTitle("Dashboard");
			
		chart_2 = new IGRPChart("chart_2","Teste Realizado por Universidade");

		chart_1 = new IGRPChart("chart_1","Teste por Área de Formação");



		
		chart_2.setCaption("");
		chart_2.setChart_type("column");
		chart_2.setXaxys("Eixo de X");
		chart_2.setYaxys("Eixo de Y");
		chart_2.setUrl("#");
		//ex: chart_2.addColor("#718106").addColor("#542fea").addColor("#a910e6").addColor("#333bef");

		chart_1.setCaption("");
		chart_1.setChart_type("column");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#fb392e").addColor("#e0b260").addColor("#f80dd3").addColor("#45ec71");

	}
		
	@Override
	public void render(){
		


		this.addToPage(chart_2);
		this.addToPage(chart_1);
	}
		
	@Override
	public void setModel(Model model) {
			

		chart_2.loadModel(((Dashboard) model).getChart_2());
		chart_1.loadModel(((Dashboard) model).getChart_1());
		}
}
