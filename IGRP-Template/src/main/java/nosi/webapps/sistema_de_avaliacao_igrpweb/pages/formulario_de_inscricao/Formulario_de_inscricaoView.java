package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_de_inscricao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Formulario_de_inscricaoView extends View {

	public Field sectionheader_1_text;
	public Field foto;
	public Field nome;
	public Field ilha_natural;
	public Field edicao_de_nosiakademia;
	public Field formacao;
	public Field outra_formacao;
	public Field universidade;
	public Field outra_universidade;
	public Field formador;
	public Field contacto;
	public Field email;
	public Field nivel;
	public Field horas;
	public Field paragraph_1_text;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPParagraph paragraph_1;

	public IGRPButton btn_seguinte;

	public Formulario_de_inscricaoView(){

		this.setPageTitle("Formulário de Inscrição");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Dados Pessoais</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","true").add("rounded","false").add("autoupload","true").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		ilha_natural = new ListField(model,"ilha_natural");
		ilha_natural.setLabel(gt("Ilha Natural"));
		ilha_natural.propertie().add("name","p_ilha_natural").add("type","select").add("multiple","false").add("tags","false").add("domain","ilha « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		edicao_de_nosiakademia = new ListField(model,"edicao_de_nosiakademia");
		edicao_de_nosiakademia.setLabel(gt("Edição de NosiAkademia"));
		edicao_de_nosiakademia.propertie().add("name","p_edicao_de_nosiakademia").add("type","select").add("multiple","false").add("tags","false").add("domain","edicao « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		formacao = new ListField(model,"formacao");
		formacao.setLabel(gt("Formação"));
		formacao.propertie().add("name","p_formacao").add("type","select").add("multiple","false").add("tags","false").add("domain","formacao « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		outra_formacao = new TextField(model,"outra_formacao");
		outra_formacao.setLabel(gt("Outra Formação"));
		outra_formacao.propertie().add("name","p_outra_formacao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		universidade = new ListField(model,"universidade");
		universidade.setLabel(gt("Universidade"));
		universidade.propertie().add("name","p_universidade").add("type","select").add("multiple","false").add("tags","false").add("domain","universidade « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		outra_universidade = new TextField(model,"outra_universidade");
		outra_universidade.setLabel(gt("Outra Universidade"));
		outra_universidade.propertie().add("name","p_outra_universidade").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		formador = new ListField(model,"formador");
		formador.setLabel(gt("Formador"));
		formador.propertie().add("name","p_formador").add("type","select").add("multiple","false").add("tags","false").add("domain","avaliadores « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		contacto = new NumberField(model,"contacto");
		contacto.setLabel(gt("Contacto"));
		contacto.propertie().add("name","p_contacto").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","7").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		email = new EmailField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","email").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nivel = new ListField(model,"nivel");
		nivel.setLabel(gt("Teste Nivel"));
		nivel.propertie().add("name","p_nivel").add("type","select").add("multiple","false").add("tags","false").add("domain","nivel « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		horas = new NumberField(model,"horas");
		horas.setLabel(gt("Horas de Formação"));
		horas.propertie().add("name","p_horas").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p>* N&iacute;vel 1 - Amador / N&iacute;vel 2 - Interm&eacute;dio / N&iacute;vel 3 - Profissional.</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		


		btn_seguinte = new IGRPButton("Seguinte","sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","seguinte","alert_submit","primary|fa-arrow-circle-right","","");
		btn_seguinte.propertie.add("id","button_813b_afd5").add("type","form").add("class","primary").add("rel","seguinte").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(foto);
		form_1.addField(nome);
		form_1.addField(ilha_natural);
		form_1.addField(edicao_de_nosiakademia);
		form_1.addField(formacao);
		form_1.addField(outra_formacao);
		form_1.addField(universidade);
		form_1.addField(outra_universidade);
		form_1.addField(formador);
		form_1.addField(contacto);
		form_1.addField(email);
		form_1.addField(nivel);
		form_1.addField(horas);

		paragraph_1.addField(paragraph_1_text);

		form_1.addButton(btn_seguinte);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(paragraph_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		ilha_natural.setValue(model);
		edicao_de_nosiakademia.setValue(model);
		formacao.setValue(model);
		outra_formacao.setValue(model);
		universidade.setValue(model);
		outra_universidade.setValue(model);
		formador.setValue(model);
		contacto.setValue(model);
		email.setValue(model);
		nivel.setValue(model);
		horas.setValue(model);	

		}
}
