package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tema_semanalView extends View {

	public Field nome;
	public Field area;
	public Field mentor;
	public Field view_1_img;
	public Field tema_semanal;
	public Field id_avaliado;
	public Field id_semana;
	public IGRPView view_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_submeter;

	public Tema_semanalView(){

		this.setPageTitle("Inserção do Tema Semanal");
			
		view_1 = new IGRPView("view_1","Avaliação Semanal");

		form_1 = new IGRPForm("form_1","Inserção do Tema Semanal");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		area = new TextField(model,"area");
		area.setLabel(gt("Área ou Projeto"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		tema_semanal = new TextField(model,"tema_semanal");
		tema_semanal.setLabel(gt("Tema Semanal"));
		tema_semanal.propertie().add("name","p_tema_semanal").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		
		id_semana = new HiddenField(model,"id_semana");
		id_semana.setLabel(gt(""));
		id_semana.propertie().add("name","p_id_semana").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_semana");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_submeter = new IGRPButton("Submeter","sistema_de_avaliacao_igrpweb","Tema_semanal","submeter","submit","purple|fa-save","","");
		btn_submeter.propertie.add("type","specific").add("rel","submeter").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		view_1.addField(nome);
		view_1.addField(area);
		view_1.addField(mentor);
		view_1.addField(view_1_img);

		form_1.addField(tema_semanal);
		form_1.addField(id_avaliado);
		form_1.addField(id_semana);


		toolsbar_1.addButton(btn_submeter);
		this.addToPage(view_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		area.setValue(model);
		mentor.setValue(model);
		view_1_img.setValue(model);
		tema_semanal.setValue(model);
		id_avaliado.setValue(model);
		id_semana.setValue(model);	

		}
}
