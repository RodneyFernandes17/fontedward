package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.estatistica_mentores_e_areas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Estatistica_mentores_e_areasView extends View {

	public Field areas_ou_projetos;
	public Field mentores;
	public IGRPForm form_2;
	public IGRPChart chart_1;
	public IGRPForm form_1;
	public IGRPChart chart_2;

	public IGRPButton btn_filtrar_area;
	public IGRPButton btn_filtrar;

	public Estatistica_mentores_e_areasView(){

		this.setPageTitle("Estatística Mentores e Áreas");
			
		form_2 = new IGRPForm("form_2","");

		chart_1 = new IGRPChart("chart_1","Nº de Estagiários por Áreas ou Projetos");

		form_1 = new IGRPForm("form_1","");

		chart_2 = new IGRPChart("chart_2","Nº de Estagiários por Mentores");

		areas_ou_projetos = new ListField(model,"areas_ou_projetos");
		areas_ou_projetos.setLabel(gt("Áreas ou Projetos"));
		areas_ou_projetos.propertie().add("name","p_areas_ou_projetos").add("type","select").add("multiple","true").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		mentores = new ListField(model,"mentores");
		mentores.setLabel(gt("Mentores"));
		mentores.propertie().add("name","p_mentores").add("type","select").add("multiple","true").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		


		btn_filtrar_area = new IGRPButton("Filtrar","sistema_de_avaliacao_igrpweb","Estatistica_mentores_e_areas","filtrar_area","submit_ajax","primary|fa-filter","","");
		btn_filtrar_area.propertie.add("id","button_b76e_68f5").add("type","form").add("class","primary").add("rel","filtrar_area").add("refresh_components","chart_1");

		btn_filtrar = new IGRPButton("Filtrar","sistema_de_avaliacao_igrpweb","Estatistica_mentores_e_areas","filtrar","submit_ajax","primary|fa-filter","","");
		btn_filtrar.propertie.add("id","button_9c9c_12fd").add("type","form").add("class","primary").add("rel","filtrar").add("refresh_components","chart_2");

		
		chart_1.setCaption("");
		chart_1.setChart_type("column");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#67de08").addColor("#946b0c").addColor("#b0eca2").addColor("#448b7a");

		chart_2.setCaption("");
		chart_2.setChart_type("column");
		chart_2.setXaxys("Eixo de X");
		chart_2.setYaxys("Eixo de Y");
		chart_2.setUrl("#");
		//ex: chart_2.addColor("#37ecd0").addColor("#8d56ab").addColor("#2f6a11").addColor("#a83076");

	}
		
	@Override
	public void render(){
		
		form_2.addField(areas_ou_projetos);


		form_1.addField(mentores);


		form_2.addButton(btn_filtrar_area);
		form_1.addButton(btn_filtrar);
		this.addToPage(form_2);
		this.addToPage(chart_1);
		this.addToPage(form_1);
		this.addToPage(chart_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		areas_ou_projetos.setValue(model);
		mentores.setValue(model);	

		chart_1.loadModel(((Estatistica_mentores_e_areas) model).getChart_1());
		chart_2.loadModel(((Estatistica_mentores_e_areas) model).getChart_2());
		}
}
