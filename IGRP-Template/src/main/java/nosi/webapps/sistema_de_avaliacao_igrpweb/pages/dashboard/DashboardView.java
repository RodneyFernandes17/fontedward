package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;

public class DashboardView extends View {

	public IGRPChart chart_2;
	public IGRPChart chart_1;


	public DashboardView(){

		this.setPageTitle("Estatísticas");
			
		chart_2 = new IGRPChart("chart_2","Teste igrpweb Realizado por Universidade");

		chart_1 = new IGRPChart("chart_1","Teste igrpweb por Área de Formação");



		
		chart_2.setCaption("");
		chart_2.setChart_type("column");
		chart_2.setXaxys("Eixo de X");
		chart_2.setYaxys("Eixo de Y");
		chart_2.setUrl("#");
		//ex: chart_2.addColor("#69f82c").addColor("#bed286").addColor("#2ac2fc").addColor("#38b065");

		chart_1.setCaption("");
		chart_1.setChart_type("column");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#840c8f").addColor("#62e78b").addColor("#883ca6").addColor("#fae56f");

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
