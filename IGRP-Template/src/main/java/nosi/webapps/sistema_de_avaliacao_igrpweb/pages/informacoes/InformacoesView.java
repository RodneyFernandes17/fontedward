package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.informacoes;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class InformacoesView extends View {

	public Field sectionheader_1_text;
	public Field nome;
	public Field teste_nivel;
	public Field igrp_studio;
	public Field page_designer;
	public Field bpmn_e_report_designer;
	public Field gerador_de_codigo_e_blockly;
	public Field eclipse_e_git;
	public Field base_de_dados_e_dao;
	public Field java;
	public Field gestao_de_acessos;
	public Field classificacao;
	public Field id_teste;
	public Field id_avaliado;
	public Field view_1_img;
	public Field paragraph_1_text;
	public IGRPSectionHeader sectionheader_1;
	public IGRPView view_1;
	public IGRPParagraph paragraph_1;


	public InformacoesView(){

		this.setPageTitle("Resultados Finais");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		view_1 = new IGRPView("view_1","Informações do Avaliado");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Classifica&ccedil;&atilde;o Final Avalia&ccedil;&atilde;o igrpweb&nbsp;</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		teste_nivel = new TextField(model,"teste_nivel");
		teste_nivel.setLabel(gt("Teste Nível"));
		teste_nivel.propertie().add("name","p_teste_nivel").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		igrp_studio = new PlainTextField(model,"igrp_studio");
		igrp_studio.setLabel(gt("Pontuação em IGRP Studio (máximo 5)"));
		igrp_studio.propertie().add("name","p_igrp_studio").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		page_designer = new PlainTextField(model,"page_designer");
		page_designer.setLabel(gt("Pontuação em Page Designer (máximo 5)"));
		page_designer.propertie().add("name","p_page_designer").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		bpmn_e_report_designer = new PlainTextField(model,"bpmn_e_report_designer");
		bpmn_e_report_designer.setLabel(gt("Pontuação em BPMN e Report Designer (máximo 5)"));
		bpmn_e_report_designer.propertie().add("name","p_bpmn_e_report_designer").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		gerador_de_codigo_e_blockly = new PlainTextField(model,"gerador_de_codigo_e_blockly");
		gerador_de_codigo_e_blockly.setLabel(gt("Pontuação em Gerador de Código e Blockly (máximo 5)"));
		gerador_de_codigo_e_blockly.propertie().add("name","p_gerador_de_codigo_e_blockly").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		eclipse_e_git = new PlainTextField(model,"eclipse_e_git");
		eclipse_e_git.setLabel(gt("Pontuação em Eclipse e Git (máximo 5)"));
		eclipse_e_git.propertie().add("name","p_eclipse_e_git").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		base_de_dados_e_dao = new PlainTextField(model,"base_de_dados_e_dao");
		base_de_dados_e_dao.setLabel(gt("Pontução em Base de Dados e DAO (máximo 5)"));
		base_de_dados_e_dao.propertie().add("name","p_base_de_dados_e_dao").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		java = new PlainTextField(model,"java");
		java.setLabel(gt("Pontução em Java (máximo 5)"));
		java.propertie().add("name","p_java").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		gestao_de_acessos = new PlainTextField(model,"gestao_de_acessos");
		gestao_de_acessos.setLabel(gt("Pontuação em Gestão de Acessos (máximo 5)"));
		gestao_de_acessos.propertie().add("name","p_gestao_de_acessos").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		classificacao = new TextField(model,"classificacao");
		classificacao.setLabel(gt("Classificação Final (máximo  40 pontos)"));
		classificacao.propertie().add("name","p_classificacao").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		id_teste = new HiddenField(model,"id_teste");
		id_teste.setLabel(gt(""));
		id_teste.propertie().add("name","p_id_teste").add("type","hidden").add("maxlength","250").add("class","default").add("img","").add("showlabel","true").add("tag","id_teste");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("class","default").add("img","").add("showlabel","true").add("tag","id_avaliado");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p>* N&iacute;vel 1 -&nbsp;Amador / N&iacute;vel 2&nbsp;- Interm&eacute;dio / N&iacute;vel 3&nbsp;- Profissional&nbsp;</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		


		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		view_1.addField(nome);
		view_1.addField(teste_nivel);
		view_1.addField(igrp_studio);
		view_1.addField(page_designer);
		view_1.addField(bpmn_e_report_designer);
		view_1.addField(gerador_de_codigo_e_blockly);
		view_1.addField(eclipse_e_git);
		view_1.addField(base_de_dados_e_dao);
		view_1.addField(java);
		view_1.addField(gestao_de_acessos);
		view_1.addField(classificacao);
		view_1.addField(id_teste);
		view_1.addField(id_avaliado);
		view_1.addField(view_1_img);

		paragraph_1.addField(paragraph_1_text);

		this.addToPage(sectionheader_1);
		this.addToPage(view_1);
		this.addToPage(paragraph_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		teste_nivel.setValue(model);
		igrp_studio.setValue(model);
		page_designer.setValue(model);
		bpmn_e_report_designer.setValue(model);
		gerador_de_codigo_e_blockly.setValue(model);
		eclipse_e_git.setValue(model);
		base_de_dados_e_dao.setValue(model);
		java.setValue(model);
		gestao_de_acessos.setValue(model);
		classificacao.setValue(model);
		id_teste.setValue(model);
		id_avaliado.setValue(model);
		view_1_img.setValue(model);	

		}
}
