package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_de_certificado;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Criacao_de_certificadoView extends View {

	public Field sectionheader_1_text;
	public Field foto;
	public Field nome;
	public Field titulo;
	public Field data;
	public Field chave_de_validacao;
	public Field callback_url;
	public Field texto_1;
	public Field texto_2;
	public Field texto_3;
	public Field id_avaliado;
	public Field fundo;
	public Field logo;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPForm form_2;


	public Criacao_de_certificadoView(){

		this.setPageTitle("Criação de Certificado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		form_2 = new IGRPForm("form_2","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Emitir Certificado</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		titulo = new TextField(model,"titulo");
		titulo.setLabel(gt("Título"));
		titulo.propertie().add("name","p_titulo").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data = new DateField(model,"data");
		data.setLabel(gt("Data"));
		data.propertie().add("name","p_data").add("type","date").add("range","false").add("disableWeekends","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		chave_de_validacao = new TextField(model,"chave_de_validacao");
		chave_de_validacao.setLabel(gt("Chave de Validacao"));
		chave_de_validacao.propertie().add("name","p_chave_de_validacao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		callback_url = new TextField(model,"callback_url");
		callback_url.setLabel(gt("Callback_url"));
		callback_url.propertie().add("name","p_callback_url").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		texto_1 = new TextField(model,"texto_1");
		texto_1.setLabel(gt("Texto 1"));
		texto_1.propertie().add("name","p_texto_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		texto_2 = new TextField(model,"texto_2");
		texto_2.setLabel(gt("Texto 2"));
		texto_2.propertie().add("name","p_texto_2").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		texto_3 = new TextField(model,"texto_3");
		texto_3.setLabel(gt("Texto 3"));
		texto_3.propertie().add("name","p_texto_3").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		
		fundo = new TextField(model,"fundo");
		fundo.setLabel(gt("Fundo"));
		fundo.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		fundo.propertie().add("name","p_fundo").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		logo = new TextField(model,"logo");
		logo.setLabel(gt("Logo"));
		logo.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		logo.propertie().add("name","p_logo").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(foto);
		form_1.addField(nome);
		form_1.addField(titulo);
		form_1.addField(data);
		form_1.addField(chave_de_validacao);
		form_1.addField(callback_url);
		form_1.addField(texto_1);
		form_1.addField(texto_2);
		form_1.addField(texto_3);
		form_1.addField(id_avaliado);

		form_2.addField(fundo);
		form_2.addField(logo);

		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(form_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		titulo.setValue(model);
		data.setValue(model);
		chave_de_validacao.setValue(model);
		callback_url.setValue(model);
		texto_1.setValue(model);
		texto_2.setValue(model);
		texto_3.setValue(model);
		id_avaliado.setValue(model);	

		}
}
