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
	public Field positivo_title;
	public Field positivo_val;
	public Field positivo_txt;
	public Field positivo_url;
	public Field positivo_bg;
	public Field positivo_icn;
	public Field negativo_title;
	public Field negativo_val;
	public Field negativo_txt;
	public Field negativo_url;
	public Field negativo_bg;
	public Field negativo_icn;
	public IGRPView view_1;
	public IGRPForm form_1;
	public IGRPStatBox positivo;
	public IGRPStatBox negativo;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_submeter;

	public Tema_semanalView(){

		this.setPageTitle("Inserção do Tema Semanal");
			
		view_1 = new IGRPView("view_1","Informações");

		form_1 = new IGRPForm("form_1","Inserção do Tema Semanal");

		positivo = new IGRPStatBox("positivo","");

		negativo = new IGRPStatBox("negativo","");

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
		
		positivo_title = new TextField(model,"positivo_title");
		positivo_title.setLabel(gt("Box Title"));
		positivo_title.propertie().add("name","p_positivo_title").add("type","text").add("maxlength","4000");
		
		positivo_val = new TextField(model,"positivo_val");
		positivo_val.setLabel(gt("Value"));
		positivo_val.propertie().add("name","p_positivo_val").add("type","text").add("maxlength","4000");
		
		positivo_txt = new TextField(model,"positivo_txt");
		positivo_txt.setLabel(gt("Url Text"));
		positivo_txt.propertie().add("name","p_positivo_txt").add("type","text").add("maxlength","4000");
		
		positivo_url = new TextField(model,"positivo_url");
		positivo_url.setLabel(gt("Url"));
		positivo_url.propertie().add("name","p_positivo_url").add("type","text").add("maxlength","4000");
		
		positivo_bg = new TextField(model,"positivo_bg");
		positivo_bg.setLabel(gt("Background"));
		positivo_bg.propertie().add("name","p_positivo_bg").add("type","text").add("maxlength","4000");
		
		positivo_icn = new TextField(model,"positivo_icn");
		positivo_icn.setLabel(gt("Icon"));
		positivo_icn.setValue(gt("fa-thumbs-up"));
		positivo_icn.propertie().add("name","p_positivo_icn").add("type","text").add("maxlength","4000");
		
		negativo_title = new TextField(model,"negativo_title");
		negativo_title.setLabel(gt("Box Title"));
		negativo_title.propertie().add("name","p_negativo_title").add("type","text").add("maxlength","4000");
		
		negativo_val = new TextField(model,"negativo_val");
		negativo_val.setLabel(gt("Value"));
		negativo_val.propertie().add("name","p_negativo_val").add("type","text").add("maxlength","4000");
		
		negativo_txt = new TextField(model,"negativo_txt");
		negativo_txt.setLabel(gt("Url Text"));
		negativo_txt.propertie().add("name","p_negativo_txt").add("type","text").add("maxlength","4000");
		
		negativo_url = new TextField(model,"negativo_url");
		negativo_url.setLabel(gt("Url"));
		negativo_url.propertie().add("name","p_negativo_url").add("type","text").add("maxlength","4000");
		
		negativo_bg = new TextField(model,"negativo_bg");
		negativo_bg.setLabel(gt("Background"));
		negativo_bg.propertie().add("name","p_negativo_bg").add("type","text").add("maxlength","4000");
		
		negativo_icn = new TextField(model,"negativo_icn");
		negativo_icn.setLabel(gt("Icon"));
		negativo_icn.setValue(gt("fa-thumbs-down"));
		negativo_icn.propertie().add("name","p_negativo_icn").add("type","text").add("maxlength","4000");
		

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


		positivo.addField(positivo_title);
		positivo.addField(positivo_val);
		positivo.addField(positivo_txt);
		positivo.addField(positivo_url);
		positivo.addField(positivo_bg);
		positivo.addField(positivo_icn);

		negativo.addField(negativo_title);
		negativo.addField(negativo_val);
		negativo.addField(negativo_txt);
		negativo.addField(negativo_url);
		negativo.addField(negativo_bg);
		negativo.addField(negativo_icn);

		toolsbar_1.addButton(btn_submeter);
		this.addToPage(view_1);
		this.addToPage(form_1);
		this.addToPage(positivo);
		this.addToPage(negativo);
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
		positivo_title.setValue(model);
		positivo_val.setValue(model);
		positivo_txt.setValue(model);
		positivo_url.setValue(model);
		positivo_bg.setValue(model);
		negativo_title.setValue(model);
		negativo_val.setValue(model);
		negativo_txt.setValue(model);
		negativo_url.setValue(model);
		negativo_bg.setValue(model);	

		}
}
