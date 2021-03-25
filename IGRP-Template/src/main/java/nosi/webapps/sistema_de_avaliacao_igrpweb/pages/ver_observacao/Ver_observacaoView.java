package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.ver_observacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ver_observacaoView extends View {

	public Field avaliador;
	public Field observacao;
	public IGRPView view_1;
	public IGRPForm form_1;


	public Ver_observacaoView(){

		this.setPageTitle("Ver Observação");
			
		view_1 = new IGRPView("view_1","");

		form_1 = new IGRPForm("form_1","");

		avaliador = new TextField(model,"avaliador");
		avaliador.setLabel(gt("Avaliador"));
		avaliador.propertie().add("name","p_avaliador").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		observacao = new TextAreaField(model,"observacao");
		observacao.setLabel(gt("Observação"));
		observacao.propertie().add("name","p_observacao").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		view_1.addField(avaliador);

		form_1.addField(observacao);

		this.addToPage(view_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		avaliador.setValue(model);
		observacao.setValue(model);	

		}
}
