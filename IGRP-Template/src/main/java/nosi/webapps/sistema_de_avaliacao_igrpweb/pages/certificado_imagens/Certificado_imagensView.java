package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.certificado_imagens;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Certificado_imagensView extends View {

	public Field fundo;
	public Field logo;
	public Field fundo_view;
	public Field logo_view;
	public IGRPForm form_1;
	public IGRPForm form_2;
	public IGRPForm form_3;

	public IGRPButton btn_salvar_fundo;
	public IGRPButton btn_salvar_logo;

	public Certificado_imagensView(){

		this.setPageTitle("Certificado Imagens");
			
		form_1 = new IGRPForm("form_1","Inserir Imagem de Fundo");

		form_2 = new IGRPForm("form_2","Inserir Logo");

		form_3 = new IGRPForm("form_3","");

		fundo = new FileField(model,"fundo");
		fundo.setLabel(gt("Fundo"));
		fundo.propertie().add("name","p_fundo").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary");
		
		logo = new FileField(model,"logo");
		logo.setLabel(gt("Logo"));
		logo.propertie().add("name","p_logo").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary");
		
		fundo_view = new TextField(model,"fundo_view");
		fundo_view.setLabel(gt("Fundo_view"));
		fundo_view.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		fundo_view.propertie().add("name","p_fundo_view").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		logo_view = new TextField(model,"logo_view");
		logo_view.setLabel(gt("Logo_view"));
		logo_view.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		logo_view.propertie().add("name","p_logo_view").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		


		btn_salvar_fundo = new IGRPButton("Salvar Fundo","sistema_de_avaliacao_igrpweb","Certificado_imagens","salvar_fundo","submit_form","primary|fa-save","","");
		btn_salvar_fundo.propertie.add("id","button_f71f_c1ca").add("type","form").add("class","primary").add("rel","salvar_fundo").add("refresh_components","");

		btn_salvar_logo = new IGRPButton("Salvar Logo","sistema_de_avaliacao_igrpweb","Certificado_imagens","salvar_logo","submit_form","primary|fa-save","","");
		btn_salvar_logo.propertie.add("id","button_4568_70be").add("type","form").add("class","primary").add("rel","salvar_logo").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(fundo);

		form_2.addField(logo);

		form_3.addField(fundo_view);
		form_3.addField(logo_view);

		form_1.addButton(btn_salvar_fundo);
		form_2.addButton(btn_salvar_logo);
		this.addToPage(form_1);
		this.addToPage(form_2);
		this.addToPage(form_3);
	}
		
	@Override
	public void setModel(Model model) {
		
		fundo.setValue(model);
		logo.setValue(model);	

		}
}
