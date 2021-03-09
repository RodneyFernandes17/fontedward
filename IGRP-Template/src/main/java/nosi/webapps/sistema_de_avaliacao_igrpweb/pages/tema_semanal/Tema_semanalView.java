package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tema_semanalView extends View {

	public Field area;
	public Field mentor;
	public Field tema_semanal;
	public Field nr_semana;
	public Field id_avaliado;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_submeter;

	public Tema_semanalView(){

		this.setPageTitle("Inserção do Tema Semanal");
			
		form_1 = new IGRPForm("form_1","Inserção do Tema Semanal");

		area = new TextField(model,"area");
		area.setLabel(gt("Área ou Projeto Estágio"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor(a) Principal"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tema_semanal = new TextField(model,"tema_semanal");
		tema_semanal.setLabel(gt("Tema Semanal"));
		tema_semanal.propertie().add("name","p_tema_semanal").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nr_semana = new NumberField(model,"nr_semana");
		nr_semana.setLabel(gt("Nr de Semana"));
		nr_semana.propertie().add("name","p_nr_semana").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_submeter = new IGRPButton("Submeter","sistema_de_avaliacao_igrpweb","Tema_semanal","submeter","submit","purple|fa-save","","");
		btn_submeter.propertie.add("type","specific").add("rel","submeter").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(area);
		form_1.addField(mentor);
		form_1.addField(tema_semanal);
		form_1.addField(nr_semana);
		form_1.addField(id_avaliado);


		toolsbar_1.addButton(btn_submeter);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		area.setValue(model);
		mentor.setValue(model);
		tema_semanal.setValue(model);
		nr_semana.setValue(model);
		id_avaliado.setValue(model);	

		}
}
