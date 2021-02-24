package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_perguntas_e_respostas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Parametrizacao_perguntas_e_respostasView extends View {

	public Field conceito;
	public Field nivel;
	public Field pergunta;
	public Field id_pergunta;
	public Field resposta;
	public Field resposta_certa;
	public Field resposta_certa_check;
	public IGRPForm form_1;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_salvar;

	public Parametrizacao_perguntas_e_respostasView(){

		this.setPageTitle("Parametrização Perguntas e Respostas");
			
		form_1 = new IGRPForm("form_1","Pergunta");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","Respostas");

		conceito = new ListField(model,"conceito");
		conceito.setLabel(gt("Conceito"));
		conceito.propertie().add("name","p_conceito").add("type","select").add("multiple","false").add("tags","false").add("domain","conceitos « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		nivel = new ListField(model,"nivel");
		nivel.setLabel(gt("Nivel"));
		nivel.propertie().add("name","p_nivel").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		pergunta = new TextAreaField(model,"pergunta");
		pergunta.setLabel(gt("Pergunta"));
		pergunta.propertie().add("name","p_pergunta").add("type","textarea").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_pergunta = new HiddenField(model,"id_pergunta");
		id_pergunta.setLabel(gt(""));
		id_pergunta.propertie().add("name","p_id_pergunta").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_pergunta");
		
		resposta = new TextAreaField(model,"resposta");
		resposta.setLabel(gt("Resposta"));
		resposta.propertie().add("name","p_resposta").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		resposta_certa = new CheckBoxField(model,"resposta_certa");
		resposta_certa.setLabel(gt("Resposta certa"));
		resposta_certa.propertie().add("name","p_resposta_certa").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		resposta_certa_check = new CheckBoxField(model,"resposta_certa_check");
		resposta_certa_check.propertie().add("name","p_resposta_certa").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","salvar","submit","primary|fa-save","","");
		btn_salvar.propertie.add("type","specific").add("rel","salvar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(conceito);
		form_1.addField(nivel);
		form_1.addField(pergunta);
		form_1.addField(id_pergunta);

		separatorlist_1.addField(resposta);
		separatorlist_1.addField(resposta_certa);
		separatorlist_1.addField(resposta_certa_check);


		toolsbar_1.addButton(btn_salvar);
		this.addToPage(form_1);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		conceito.setValue(model);
		nivel.setValue(model);
		pergunta.setValue(model);
		id_pergunta.setValue(model);
		resposta.setValue(model);
		resposta_certa.setValue(model);	

		separatorlist_1.loadModel(((Parametrizacao_perguntas_e_respostas) model).getSeparatorlist_1());
		}
}
