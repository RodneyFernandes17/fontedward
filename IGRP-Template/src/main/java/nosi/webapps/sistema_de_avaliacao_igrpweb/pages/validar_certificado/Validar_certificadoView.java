package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.validar_certificado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Validar_certificadoView extends View {

	public Field contra_prova;
	public Field iframe_1_src;
	public IGRPForm form_1;
	public IGRPIframe iframe_1;

	public IGRPButton btn_validar;

	public Validar_certificadoView(){

		this.setPageTitle("Validar Certificado");
			
		form_1 = new IGRPForm("form_1","");

		iframe_1 = new IGRPIframe("iframe_1","");

		contra_prova = new TextField(model,"contra_prova");
		contra_prova.setLabel(gt("Insere a Contra-Prova"));
		contra_prova.propertie().add("name","p_contra_prova").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		iframe_1_src = new TextField(model,"iframe_1_src");
		iframe_1_src.setLabel(gt("Iframe Source"));
		iframe_1_src.propertie().add("name","p_iframe_1_src").add("type","text").add("maxlength","4000");
		


		btn_validar = new IGRPButton("Validar","sistema_de_avaliacao_igrpweb","Validar_certificado","validar","submit_ajax","primary|fa-mortar-board","","");
		btn_validar.propertie.add("id","button_ea80_4dcf").add("type","form").add("class","primary").add("rel","validar").add("refresh_components","iframe_1");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(contra_prova);

		iframe_1.addField(iframe_1_src);

		form_1.addButton(btn_validar);
		this.addToPage(form_1);
		this.addToPage(iframe_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		contra_prova.setValue(model);
		iframe_1_src.setValue(model);	

		}
}
