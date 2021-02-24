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
	public Field avaliador;
	public Field chave_de_validacao;
	public Field horas_de_formacao;
	public Field id_avaliado;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;


	public Criacao_de_certificadoView(){

		this.setPageTitle("Criação de Certificado");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

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
		
		avaliador = new ListField(model,"avaliador");
		avaliador.setLabel(gt("Avaliador"));
		avaliador.propertie().add("name","p_avaliador").add("type","select").add("multiple","false").add("tags","false").add("domain","avaliadores « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		chave_de_validacao = new TextField(model,"chave_de_validacao");
		chave_de_validacao.setLabel(gt("Chave de Validacao"));
		chave_de_validacao.propertie().add("name","p_chave_de_validacao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		horas_de_formacao = new NumberField(model,"horas_de_formacao");
		horas_de_formacao.setLabel(gt("Horas de Formação"));
		horas_de_formacao.propertie().add("name","p_horas_de_formacao").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		


		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(foto);
		form_1.addField(nome);
		form_1.addField(avaliador);
		form_1.addField(chave_de_validacao);
		form_1.addField(horas_de_formacao);
		form_1.addField(id_avaliado);

		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		avaliador.setValue(model);
		chave_de_validacao.setValue(model);
		horas_de_formacao.setValue(model);
		id_avaliado.setValue(model);	

		}
}
