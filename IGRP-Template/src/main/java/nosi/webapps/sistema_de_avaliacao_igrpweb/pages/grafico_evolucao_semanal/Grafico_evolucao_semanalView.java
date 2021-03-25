package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.grafico_evolucao_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Grafico_evolucao_semanalView extends View {

	public Field estagiarios;
	public IGRPForm form_1;
	public IGRPChart chart_1;

	public IGRPButton btn_filtrar;

	public Grafico_evolucao_semanalView(){

		this.setPageTitle("Gráfico Evolução Semanal");
			
		form_1 = new IGRPForm("form_1","Selecionar Estagiários");

		chart_1 = new IGRPChart("chart_1","Gráfico de Evolução");

		estagiarios = new ListField(model,"estagiarios");
		estagiarios.setLabel(gt("Estagiários"));
		estagiarios.propertie().add("name","p_estagiarios").add("type","select").add("multiple","true").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		


		btn_filtrar = new IGRPButton("Filtrar","sistema_de_avaliacao_igrpweb","Grafico_evolucao_semanal","filtrar","submit_ajax","success|fa-search","","");
		btn_filtrar.propertie.add("id","button_4a0b_a46c").add("type","form").add("class","success").add("rel","filtrar").add("refresh_components","chart_1");

		
		chart_1.setCaption("");
		chart_1.setChart_type("line");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#af0526").addColor("#f4b792").addColor("#5182fa").addColor("#ded488");

	}
		
	@Override
	public void render(){
		
		form_1.addField(estagiarios);


		form_1.addButton(btn_filtrar);
		this.addToPage(form_1);
		this.addToPage(chart_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		estagiarios.setValue(model);	

		chart_1.loadModel(((Grafico_evolucao_semanal) model).getChart_1());
		}
}
