package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_de_perguntasView extends View {

	public Field conceito_form;
	public Field nivel_form;
	public Field conceito;
	public Field pergunta;
	public Field nivel;
	public Field id_pergunta;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_filtrar;
	public IGRPButton btn_editar;

	public Lista_de_perguntasView(){

		this.setPageTitle("Lista de Perguntas");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		conceito_form = new ListField(model,"conceito_form");
		conceito_form.setLabel(gt("Conceito"));
		conceito_form.propertie().add("name","p_conceito_form").add("type","select").add("multiple","false").add("tags","false").add("domain","conceitos « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		nivel_form = new ListField(model,"nivel_form");
		nivel_form.setLabel(gt("Nivel"));
		nivel_form.propertie().add("name","p_nivel_form").add("type","select").add("multiple","false").add("tags","false").add("domain","nivel « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		conceito = new TextField(model,"conceito");
		conceito.setLabel(gt("Conceito"));
		conceito.propertie().add("name","p_conceito").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		pergunta = new TextAreaField(model,"pergunta");
		pergunta.setLabel(gt("Pergunta"));
		pergunta.propertie().add("name","p_pergunta").add("type","textarea").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nivel = new TextField(model,"nivel");
		nivel.setLabel(gt("Nivel"));
		nivel.propertie().add("name","p_nivel").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_pergunta = new HiddenField(model,"id_pergunta");
		id_pergunta.setLabel(gt(""));
		id_pergunta.propertie().add("name","p_id_pergunta").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_pergunta");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","sistema_de_avaliacao_igrpweb","Lista_de_perguntas","novo","modal|refresh","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_filtrar = new IGRPButton("Filtrar","sistema_de_avaliacao_igrpweb","Lista_de_perguntas","filtrar","submit_ajax","primary|fa-filter","","");
		btn_filtrar.propertie.add("id","button_4aa4_0a63").add("type","form").add("class","primary").add("rel","filtrar").add("refresh_components","table_1");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Lista_de_perguntas","editar","mpsubmit|refresh","warning|fa-pencil-square-o","","");
		btn_editar.propertie.add("id","button_4996_428b").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		form_1.addField(conceito_form);
		form_1.addField(nivel_form);

		table_1.addField(conceito);
		table_1.addField(pergunta);
		table_1.addField(nivel);
		table_1.addField(id_pergunta);

		toolsbar_1.addButton(btn_novo);
		form_1.addButton(btn_filtrar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		conceito_form.setValue(model);
		nivel_form.setValue(model);
		conceito.setValue(model);
		pergunta.setValue(model);
		nivel.setValue(model);
		id_pergunta.setValue(model);	

		table_1.loadModel(((Lista_de_perguntas) model).getTable_1());
		}
}
