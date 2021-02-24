package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_de_perguntasView extends View {

	public Field conceito;
	public Field pergunta;
	public Field id_pergunta;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_editar;

	public Lista_de_perguntasView(){

		this.setPageTitle("Lista de Perguntas");
			
		table_1 = new IGRPTable("table_1","");

		conceito = new TextField(model,"conceito");
		conceito.setLabel(gt("Conceito"));
		conceito.propertie().add("name","p_conceito").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		pergunta = new TextAreaField(model,"pergunta");
		pergunta.setLabel(gt("Pergunta"));
		pergunta.propertie().add("name","p_pergunta").add("type","textarea").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_pergunta = new HiddenField(model,"id_pergunta");
		id_pergunta.setLabel(gt(""));
		id_pergunta.propertie().add("name","p_id_pergunta").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_pergunta");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","sistema_de_avaliacao_igrpweb","Lista_de_perguntas","novo","modal|refresh","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Lista_de_perguntas","editar","mpsubmit|refresh","warning|fa-pencil-square-o","","");
		btn_editar.propertie.add("id","button_4996_428b").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(conceito);
		table_1.addField(pergunta);
		table_1.addField(id_pergunta);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_editar);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		conceito.setValue(model);
		pergunta.setValue(model);
		id_pergunta.setValue(model);	

		table_1.loadModel(((Lista_de_perguntas) model).getTable_1());
		}
}
