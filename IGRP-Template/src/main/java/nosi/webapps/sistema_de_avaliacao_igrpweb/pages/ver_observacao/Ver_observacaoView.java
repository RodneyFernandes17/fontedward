package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.ver_observacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ver_observacaoView extends View {

	public Field oservacao;
	public Field avaliador;
	public IGRPForm form_1;
	public IGRPView view_1;


	public Ver_observacaoView(){

		this.setPageTitle("Ver Observação");
			
		form_1 = new IGRPForm("form_1","");

		view_1 = new IGRPView("view_1","");

		oservacao = new TextAreaField(model,"oservacao");
		oservacao.setLabel(gt("Oservação"));
		oservacao.propertie().add("name","p_oservacao").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		avaliador = new TextField(model,"avaliador");
		avaliador.setLabel(gt("Avaliador"));
		avaliador.propertie().add("name","p_avaliador").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(oservacao);

		view_1.addField(avaliador);

		this.addToPage(form_1);
		this.addToPage(view_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		oservacao.setValue(model);
		avaliador.setValue(model);	

		}
}
