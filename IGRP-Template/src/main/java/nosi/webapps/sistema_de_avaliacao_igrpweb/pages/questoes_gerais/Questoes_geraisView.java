package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.questoes_gerais;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Questoes_geraisView extends View {

	public Field sectionheader_1_text;
	public Field conceitos_de_igrp_studio;
	public Field pergunta_1_sep;
	public Field pergunta1;
	public Field resposta1;
	public Field pergunta_2_sep;
	public Field pergunta2;
	public Field resposta2;
	public Field pergunta_3_sep;
	public Field pergunta_3;
	public Field resposta3;
	public Field pergunta_4_sep;
	public Field pergunta_4;
	public Field resposta4;
	public Field pergunta_5_sep;
	public Field pergunta_5;
	public Field resposta5;
	public Field conceitos_bpmn__e_report_designer;
	public Field pergunta_6_sep;
	public Field pergunta_6;
	public Field resposta6;
	public Field pergunta_7_sep;
	public Field pergunta_7;
	public Field resposta7;
	public Field pergunta_8_sep;
	public Field pergunta8;
	public Field resposta8;
	public Field pergunta_9_sep;
	public Field pergunta9;
	public Field resposta9;
	public Field pergunta_10_sep;
	public Field pergunta10;
	public Field resposta10;
	public Field conceitos_page_designer;
	public Field pergunta_11_sep;
	public Field pergunta11;
	public Field resposta11;
	public Field pergunta_12_sep;
	public Field pergunta12;
	public Field resposta12;
	public Field pergunta_13_sep;
	public Field pergunta13;
	public Field resposta13;
	public Field pergunta_14_sep;
	public Field pergunta14;
	public Field resposta14;
	public Field pergunta_15_sep;
	public Field pergunta15;
	public Field resposta15;
	public Field conceitos_gerador_de_codigo_e_blockly;
	public Field pergunta_16_sep;
	public Field pergunta16;
	public Field resposta16;
	public Field pergunta_17_sep;
	public Field pergunta17;
	public Field resposta17;
	public Field pergunta_18_sep;
	public Field pergunta18;
	public Field resposta18;
	public Field pergunta_19_sep;
	public Field pergunta19;
	public Field resposta19;
	public Field pergunta_20sep;
	public Field pergunta20;
	public Field resposta20;
	public Field conceitos_de_eclipse_e_git;
	public Field pergunta_21_sep;
	public Field pergunta21;
	public Field resposta21;
	public Field pergunta_22_sep;
	public Field pergunta22;
	public Field resposta22;
	public Field pergunta_23_sep;
	public Field pergunta23;
	public Field resposta23;
	public Field pergunta_24_sep;
	public Field pergunta24;
	public Field resposta24;
	public Field pergunta_25_sep;
	public Field pergunta25;
	public Field resposta25;
	public Field conceitos_de_base_de_dados_e_dao;
	public Field pergunta_26_sep;
	public Field pergunta26;
	public Field resposta26;
	public Field pergunta_27_sep;
	public Field pergunta27;
	public Field resposta27;
	public Field pergunta_28_sep;
	public Field pergunta28;
	public Field resposta28;
	public Field pergunta_29_sep;
	public Field pergunta29;
	public Field resposta29;
	public Field pergunta_30_sep;
	public Field pergunta30;
	public Field resposta30;
	public Field conceitos_de_java;
	public Field pergunta_31_sep;
	public Field pergunta31;
	public Field resposta31;
	public Field pergunta_32_sep;
	public Field pergunta32;
	public Field resposta32;
	public Field pergunta_33_sep;
	public Field pergunta33;
	public Field resposta33;
	public Field perungta_34_sep;
	public Field pergunta34;
	public Field resposta34;
	public Field perungta_35_sep;
	public Field pergunta35;
	public Field resposta35;
	public Field conceitos_de_gestao_de_acessos;
	public Field pergunta_36_sep;
	public Field pergunta_36;
	public Field resposta36;
	public Field pergunta_37_sep;
	public Field pergunta_37;
	public Field resposta37;
	public Field pergunta_38_sep;
	public Field pergunta_38;
	public Field resposta38;
	public Field pergunta_39_sep;
	public Field pergunta_39;
	public Field resposta39;
	public Field pergunta_40_sep;
	public Field pergunta_40;
	public Field resposta40;
	public Field id_avaliado;
	public Field nivel;
	public Field formacao;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPButton btn_finalizar;

	public Questoes_geraisView(){

		this.setPageTitle("Teste de Avaliação");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Teste&nbsp;de Avalia&ccedil;&atilde;o</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		conceitos_de_igrp_studio = new SeparatorField(model,"conceitos_de_igrp_studio");
		conceitos_de_igrp_studio.setLabel(gt("CONCEITOS DE IGRP STUDIO"));
		conceitos_de_igrp_studio.propertie().add("name","p_conceitos_de_igrp_studio").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_1_sep = new SeparatorField(model,"pergunta_1_sep");
		pergunta_1_sep.setLabel(gt("Pergunta 1"));
		pergunta_1_sep.propertie().add("name","p_pergunta_1_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta1 = new PlainTextField(model,"pergunta1");
		pergunta1.setLabel(gt("Pergunta1"));
		pergunta1.propertie().add("name","p_pergunta1").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta1 = new RadioListField(model,"resposta1");
		resposta1.setLabel(gt(""));
		resposta1.propertie().add("name","p_resposta1").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_2_sep = new SeparatorField(model,"pergunta_2_sep");
		pergunta_2_sep.setLabel(gt("Pergunta 2"));
		pergunta_2_sep.propertie().add("name","p_pergunta_2_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta2 = new PlainTextField(model,"pergunta2");
		pergunta2.setLabel(gt("Pergunta2"));
		pergunta2.propertie().add("name","p_pergunta2").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta2 = new RadioListField(model,"resposta2");
		resposta2.setLabel(gt(""));
		resposta2.propertie().add("name","p_resposta2").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_3_sep = new SeparatorField(model,"pergunta_3_sep");
		pergunta_3_sep.setLabel(gt("Pergunta 3"));
		pergunta_3_sep.propertie().add("name","p_pergunta_3_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_3 = new PlainTextField(model,"pergunta_3");
		pergunta_3.setLabel(gt("Pergunta 3"));
		pergunta_3.propertie().add("name","p_pergunta_3").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta3 = new RadioListField(model,"resposta3");
		resposta3.setLabel(gt(""));
		resposta3.propertie().add("name","p_resposta3").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_4_sep = new SeparatorField(model,"pergunta_4_sep");
		pergunta_4_sep.setLabel(gt("Pergunta 4"));
		pergunta_4_sep.propertie().add("name","p_pergunta_4_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_4 = new PlainTextField(model,"pergunta_4");
		pergunta_4.setLabel(gt("Pergunta 4"));
		pergunta_4.propertie().add("name","p_pergunta_4").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta4 = new RadioListField(model,"resposta4");
		resposta4.setLabel(gt(""));
		resposta4.propertie().add("name","p_resposta4").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_5_sep = new SeparatorField(model,"pergunta_5_sep");
		pergunta_5_sep.setLabel(gt("Pergunta 5"));
		pergunta_5_sep.propertie().add("name","p_pergunta_5_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_5 = new PlainTextField(model,"pergunta_5");
		pergunta_5.setLabel(gt("Pergunta 5"));
		pergunta_5.propertie().add("name","p_pergunta_5").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta5 = new RadioListField(model,"resposta5");
		resposta5.setLabel(gt(""));
		resposta5.propertie().add("name","p_resposta5").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_bpmn__e_report_designer = new SeparatorField(model,"conceitos_bpmn__e_report_designer");
		conceitos_bpmn__e_report_designer.setLabel(gt("CONCEITOS BPMN  E REPORT DESIGNER"));
		conceitos_bpmn__e_report_designer.propertie().add("name","p_conceitos_bpmn__e_report_designer").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_6_sep = new SeparatorField(model,"pergunta_6_sep");
		pergunta_6_sep.setLabel(gt("Pergunta 6"));
		pergunta_6_sep.propertie().add("name","p_pergunta_6_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_6 = new PlainTextField(model,"pergunta_6");
		pergunta_6.setLabel(gt("Pergunta 6"));
		pergunta_6.propertie().add("name","p_pergunta_6").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta6 = new RadioListField(model,"resposta6");
		resposta6.setLabel(gt(""));
		resposta6.propertie().add("name","p_resposta6").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_7_sep = new SeparatorField(model,"pergunta_7_sep");
		pergunta_7_sep.setLabel(gt("Pergunta 7"));
		pergunta_7_sep.propertie().add("name","p_pergunta_7_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_7 = new PlainTextField(model,"pergunta_7");
		pergunta_7.setLabel(gt("Pergunta 7"));
		pergunta_7.propertie().add("name","p_pergunta_7").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta7 = new RadioListField(model,"resposta7");
		resposta7.setLabel(gt(""));
		resposta7.propertie().add("name","p_resposta7").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_8_sep = new SeparatorField(model,"pergunta_8_sep");
		pergunta_8_sep.setLabel(gt("Pergunta 8"));
		pergunta_8_sep.propertie().add("name","p_pergunta_8_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta8 = new PlainTextField(model,"pergunta8");
		pergunta8.setLabel(gt("Pergunta8"));
		pergunta8.propertie().add("name","p_pergunta8").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta8 = new RadioListField(model,"resposta8");
		resposta8.setLabel(gt(""));
		resposta8.propertie().add("name","p_resposta8").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_9_sep = new SeparatorField(model,"pergunta_9_sep");
		pergunta_9_sep.setLabel(gt("Pergunta 9"));
		pergunta_9_sep.propertie().add("name","p_pergunta_9_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta9 = new PlainTextField(model,"pergunta9");
		pergunta9.setLabel(gt("Pergunta9"));
		pergunta9.propertie().add("name","p_pergunta9").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta9 = new RadioListField(model,"resposta9");
		resposta9.setLabel(gt(""));
		resposta9.propertie().add("name","p_resposta9").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_10_sep = new SeparatorField(model,"pergunta_10_sep");
		pergunta_10_sep.setLabel(gt("Pergunta 10"));
		pergunta_10_sep.propertie().add("name","p_pergunta_10_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta10 = new PlainTextField(model,"pergunta10");
		pergunta10.setLabel(gt("Pergunta10"));
		pergunta10.propertie().add("name","p_pergunta10").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta10 = new RadioListField(model,"resposta10");
		resposta10.setLabel(gt(""));
		resposta10.propertie().add("name","p_resposta10").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_page_designer = new SeparatorField(model,"conceitos_page_designer");
		conceitos_page_designer.setLabel(gt("CONCEITOS PAGE DESIGNER"));
		conceitos_page_designer.propertie().add("name","p_conceitos_page_designer").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_11_sep = new SeparatorField(model,"pergunta_11_sep");
		pergunta_11_sep.setLabel(gt("Pergunta 11"));
		pergunta_11_sep.propertie().add("name","p_pergunta_11_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta11 = new PlainTextField(model,"pergunta11");
		pergunta11.setLabel(gt("Pergunta11"));
		pergunta11.propertie().add("name","p_pergunta11").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta11 = new RadioListField(model,"resposta11");
		resposta11.setLabel(gt(""));
		resposta11.propertie().add("name","p_resposta11").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_12_sep = new SeparatorField(model,"pergunta_12_sep");
		pergunta_12_sep.setLabel(gt("Pergunta 12"));
		pergunta_12_sep.propertie().add("name","p_pergunta_12_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta12 = new PlainTextField(model,"pergunta12");
		pergunta12.setLabel(gt("Pergunta12"));
		pergunta12.propertie().add("name","p_pergunta12").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta12 = new RadioListField(model,"resposta12");
		resposta12.setLabel(gt(""));
		resposta12.propertie().add("name","p_resposta12").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_13_sep = new SeparatorField(model,"pergunta_13_sep");
		pergunta_13_sep.setLabel(gt("Pergunta 13"));
		pergunta_13_sep.propertie().add("name","p_pergunta_13_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta13 = new PlainTextField(model,"pergunta13");
		pergunta13.setLabel(gt("Pergunta13"));
		pergunta13.propertie().add("name","p_pergunta13").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta13 = new RadioListField(model,"resposta13");
		resposta13.setLabel(gt(""));
		resposta13.propertie().add("name","p_resposta13").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_14_sep = new SeparatorField(model,"pergunta_14_sep");
		pergunta_14_sep.setLabel(gt("Pergunta 14"));
		pergunta_14_sep.propertie().add("name","p_pergunta_14_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta14 = new PlainTextField(model,"pergunta14");
		pergunta14.setLabel(gt("Pergunta14"));
		pergunta14.propertie().add("name","p_pergunta14").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta14 = new RadioListField(model,"resposta14");
		resposta14.setLabel(gt(""));
		resposta14.propertie().add("name","p_resposta14").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_15_sep = new SeparatorField(model,"pergunta_15_sep");
		pergunta_15_sep.setLabel(gt("Pergunta 15"));
		pergunta_15_sep.propertie().add("name","p_pergunta_15_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta15 = new PlainTextField(model,"pergunta15");
		pergunta15.setLabel(gt("Pergunta15"));
		pergunta15.propertie().add("name","p_pergunta15").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta15 = new RadioListField(model,"resposta15");
		resposta15.setLabel(gt(""));
		resposta15.propertie().add("name","p_resposta15").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_gerador_de_codigo_e_blockly = new SeparatorField(model,"conceitos_gerador_de_codigo_e_blockly");
		conceitos_gerador_de_codigo_e_blockly.setLabel(gt("CONCEITOS GERADOR DE CÓDIGO E BLOCKLY"));
		conceitos_gerador_de_codigo_e_blockly.propertie().add("name","p_conceitos_gerador_de_codigo_e_blockly").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_16_sep = new SeparatorField(model,"pergunta_16_sep");
		pergunta_16_sep.setLabel(gt("Pergunta 16"));
		pergunta_16_sep.propertie().add("name","p_pergunta_16_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta16 = new PlainTextField(model,"pergunta16");
		pergunta16.setLabel(gt("Pergunta16"));
		pergunta16.propertie().add("name","p_pergunta16").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta16 = new RadioListField(model,"resposta16");
		resposta16.setLabel(gt(""));
		resposta16.propertie().add("name","p_resposta16").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_17_sep = new SeparatorField(model,"pergunta_17_sep");
		pergunta_17_sep.setLabel(gt("Pergunta 17"));
		pergunta_17_sep.propertie().add("name","p_pergunta_17_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta17 = new PlainTextField(model,"pergunta17");
		pergunta17.setLabel(gt("Pergunta17"));
		pergunta17.propertie().add("name","p_pergunta17").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta17 = new RadioListField(model,"resposta17");
		resposta17.setLabel(gt(""));
		resposta17.propertie().add("name","p_resposta17").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_18_sep = new SeparatorField(model,"pergunta_18_sep");
		pergunta_18_sep.setLabel(gt("Pergunta 18"));
		pergunta_18_sep.propertie().add("name","p_pergunta_18_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta18 = new PlainTextField(model,"pergunta18");
		pergunta18.setLabel(gt("Pergunta18"));
		pergunta18.propertie().add("name","p_pergunta18").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta18 = new RadioListField(model,"resposta18");
		resposta18.setLabel(gt(""));
		resposta18.propertie().add("name","p_resposta18").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_19_sep = new SeparatorField(model,"pergunta_19_sep");
		pergunta_19_sep.setLabel(gt("Pergunta 19"));
		pergunta_19_sep.propertie().add("name","p_pergunta_19_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta19 = new PlainTextField(model,"pergunta19");
		pergunta19.setLabel(gt("Pergunta19"));
		pergunta19.propertie().add("name","p_pergunta19").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta19 = new RadioListField(model,"resposta19");
		resposta19.setLabel(gt(""));
		resposta19.propertie().add("name","p_resposta19").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_20sep = new SeparatorField(model,"pergunta_20sep");
		pergunta_20sep.setLabel(gt("Pergunta 20"));
		pergunta_20sep.propertie().add("name","p_pergunta_20sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta20 = new PlainTextField(model,"pergunta20");
		pergunta20.setLabel(gt("Pergunta20"));
		pergunta20.propertie().add("name","p_pergunta20").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta20 = new RadioListField(model,"resposta20");
		resposta20.setLabel(gt(""));
		resposta20.propertie().add("name","p_resposta20").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_de_eclipse_e_git = new SeparatorField(model,"conceitos_de_eclipse_e_git");
		conceitos_de_eclipse_e_git.setLabel(gt("CONCEITOS DE ECLIPSE E GIT"));
		conceitos_de_eclipse_e_git.propertie().add("name","p_conceitos_de_eclipse_e_git").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_21_sep = new SeparatorField(model,"pergunta_21_sep");
		pergunta_21_sep.setLabel(gt("Pergunta 21"));
		pergunta_21_sep.propertie().add("name","p_pergunta_21_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta21 = new PlainTextField(model,"pergunta21");
		pergunta21.setLabel(gt("Pergunta21"));
		pergunta21.propertie().add("name","p_pergunta21").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta21 = new RadioListField(model,"resposta21");
		resposta21.setLabel(gt(""));
		resposta21.propertie().add("name","p_resposta21").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_22_sep = new SeparatorField(model,"pergunta_22_sep");
		pergunta_22_sep.setLabel(gt("Pergunta 22"));
		pergunta_22_sep.propertie().add("name","p_pergunta_22_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta22 = new PlainTextField(model,"pergunta22");
		pergunta22.setLabel(gt("Pergunta22"));
		pergunta22.propertie().add("name","p_pergunta22").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta22 = new RadioListField(model,"resposta22");
		resposta22.setLabel(gt(""));
		resposta22.propertie().add("name","p_resposta22").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_23_sep = new SeparatorField(model,"pergunta_23_sep");
		pergunta_23_sep.setLabel(gt("Pergunta 23"));
		pergunta_23_sep.propertie().add("name","p_pergunta_23_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta23 = new PlainTextField(model,"pergunta23");
		pergunta23.setLabel(gt("Pergunta23"));
		pergunta23.propertie().add("name","p_pergunta23").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta23 = new RadioListField(model,"resposta23");
		resposta23.setLabel(gt(""));
		resposta23.propertie().add("name","p_resposta23").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_24_sep = new SeparatorField(model,"pergunta_24_sep");
		pergunta_24_sep.setLabel(gt("Pergunta 24"));
		pergunta_24_sep.propertie().add("name","p_pergunta_24_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta24 = new PlainTextField(model,"pergunta24");
		pergunta24.setLabel(gt("Pergunta24"));
		pergunta24.propertie().add("name","p_pergunta24").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta24 = new RadioListField(model,"resposta24");
		resposta24.setLabel(gt(""));
		resposta24.propertie().add("name","p_resposta24").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_25_sep = new SeparatorField(model,"pergunta_25_sep");
		pergunta_25_sep.setLabel(gt("Pergunta 25"));
		pergunta_25_sep.propertie().add("name","p_pergunta_25_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta25 = new PlainTextField(model,"pergunta25");
		pergunta25.setLabel(gt("Pergunta25"));
		pergunta25.propertie().add("name","p_pergunta25").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta25 = new RadioListField(model,"resposta25");
		resposta25.setLabel(gt(""));
		resposta25.propertie().add("name","p_resposta25").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_de_base_de_dados_e_dao = new SeparatorField(model,"conceitos_de_base_de_dados_e_dao");
		conceitos_de_base_de_dados_e_dao.setLabel(gt("CONCEITOS DE BASE DE DADOS E DAO"));
		conceitos_de_base_de_dados_e_dao.propertie().add("name","p_conceitos_de_base_de_dados_e_dao").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_26_sep = new SeparatorField(model,"pergunta_26_sep");
		pergunta_26_sep.setLabel(gt("Pergunta 26"));
		pergunta_26_sep.propertie().add("name","p_pergunta_26_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta26 = new PlainTextField(model,"pergunta26");
		pergunta26.setLabel(gt("Pergunta26"));
		pergunta26.propertie().add("name","p_pergunta26").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta26 = new RadioListField(model,"resposta26");
		resposta26.setLabel(gt(""));
		resposta26.propertie().add("name","p_resposta26").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_27_sep = new SeparatorField(model,"pergunta_27_sep");
		pergunta_27_sep.setLabel(gt("Pergunta 27"));
		pergunta_27_sep.propertie().add("name","p_pergunta_27_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta27 = new PlainTextField(model,"pergunta27");
		pergunta27.setLabel(gt("Pergunta27"));
		pergunta27.propertie().add("name","p_pergunta27").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta27 = new RadioListField(model,"resposta27");
		resposta27.setLabel(gt(""));
		resposta27.propertie().add("name","p_resposta27").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_28_sep = new SeparatorField(model,"pergunta_28_sep");
		pergunta_28_sep.setLabel(gt("Pergunta 28"));
		pergunta_28_sep.propertie().add("name","p_pergunta_28_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta28 = new PlainTextField(model,"pergunta28");
		pergunta28.setLabel(gt("Pergunta28"));
		pergunta28.propertie().add("name","p_pergunta28").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta28 = new RadioListField(model,"resposta28");
		resposta28.setLabel(gt(""));
		resposta28.propertie().add("name","p_resposta28").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_29_sep = new SeparatorField(model,"pergunta_29_sep");
		pergunta_29_sep.setLabel(gt("Pergunta 29"));
		pergunta_29_sep.propertie().add("name","p_pergunta_29_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta29 = new PlainTextField(model,"pergunta29");
		pergunta29.setLabel(gt("Pergunta29"));
		pergunta29.propertie().add("name","p_pergunta29").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta29 = new RadioListField(model,"resposta29");
		resposta29.setLabel(gt(""));
		resposta29.propertie().add("name","p_resposta29").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_30_sep = new SeparatorField(model,"pergunta_30_sep");
		pergunta_30_sep.setLabel(gt("Pergunta 30"));
		pergunta_30_sep.propertie().add("name","p_pergunta_30_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta30 = new PlainTextField(model,"pergunta30");
		pergunta30.setLabel(gt("Pergunta30"));
		pergunta30.propertie().add("name","p_pergunta30").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta30 = new RadioListField(model,"resposta30");
		resposta30.setLabel(gt(""));
		resposta30.propertie().add("name","p_resposta30").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_de_java = new SeparatorField(model,"conceitos_de_java");
		conceitos_de_java.setLabel(gt("CONCEITOS DE JAVA"));
		conceitos_de_java.propertie().add("name","p_conceitos_de_java").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_31_sep = new SeparatorField(model,"pergunta_31_sep");
		pergunta_31_sep.setLabel(gt("Pergunta 31"));
		pergunta_31_sep.propertie().add("name","p_pergunta_31_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta31 = new PlainTextField(model,"pergunta31");
		pergunta31.setLabel(gt("Pergunta31"));
		pergunta31.propertie().add("name","p_pergunta31").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta31 = new RadioListField(model,"resposta31");
		resposta31.setLabel(gt(""));
		resposta31.propertie().add("name","p_resposta31").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_32_sep = new SeparatorField(model,"pergunta_32_sep");
		pergunta_32_sep.setLabel(gt("Pergunta 32"));
		pergunta_32_sep.propertie().add("name","p_pergunta_32_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta32 = new PlainTextField(model,"pergunta32");
		pergunta32.setLabel(gt("Pergunta32"));
		pergunta32.propertie().add("name","p_pergunta32").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta32 = new RadioListField(model,"resposta32");
		resposta32.setLabel(gt(""));
		resposta32.propertie().add("name","p_resposta32").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_33_sep = new SeparatorField(model,"pergunta_33_sep");
		pergunta_33_sep.setLabel(gt("Pergunta 33"));
		pergunta_33_sep.propertie().add("name","p_pergunta_33_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta33 = new PlainTextField(model,"pergunta33");
		pergunta33.setLabel(gt("Pergunta33"));
		pergunta33.propertie().add("name","p_pergunta33").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta33 = new RadioListField(model,"resposta33");
		resposta33.setLabel(gt(""));
		resposta33.propertie().add("name","p_resposta33").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		perungta_34_sep = new SeparatorField(model,"perungta_34_sep");
		perungta_34_sep.setLabel(gt("Perungta 34"));
		perungta_34_sep.propertie().add("name","p_perungta_34_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta34 = new PlainTextField(model,"pergunta34");
		pergunta34.setLabel(gt("Pergunta34"));
		pergunta34.propertie().add("name","p_pergunta34").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta34 = new RadioListField(model,"resposta34");
		resposta34.setLabel(gt(""));
		resposta34.propertie().add("name","p_resposta34").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		perungta_35_sep = new SeparatorField(model,"perungta_35_sep");
		perungta_35_sep.setLabel(gt("Perungta 35"));
		perungta_35_sep.propertie().add("name","p_perungta_35_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta35 = new PlainTextField(model,"pergunta35");
		pergunta35.setLabel(gt("Pergunta35"));
		pergunta35.propertie().add("name","p_pergunta35").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta35 = new RadioListField(model,"resposta35");
		resposta35.setLabel(gt(""));
		resposta35.propertie().add("name","p_resposta35").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		conceitos_de_gestao_de_acessos = new SeparatorField(model,"conceitos_de_gestao_de_acessos");
		conceitos_de_gestao_de_acessos.setLabel(gt("CONCEITOS DE GESTÃO DE ACESSOS"));
		conceitos_de_gestao_de_acessos.propertie().add("name","p_conceitos_de_gestao_de_acessos").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_36_sep = new SeparatorField(model,"pergunta_36_sep");
		pergunta_36_sep.setLabel(gt("Pergunta 36"));
		pergunta_36_sep.propertie().add("name","p_pergunta_36_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_36 = new PlainTextField(model,"pergunta_36");
		pergunta_36.setLabel(gt("Pergunta 36"));
		pergunta_36.propertie().add("name","p_pergunta_36").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta36 = new RadioListField(model,"resposta36");
		resposta36.setLabel(gt(""));
		resposta36.propertie().add("name","p_resposta36").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_37_sep = new SeparatorField(model,"pergunta_37_sep");
		pergunta_37_sep.setLabel(gt("Pergunta 37"));
		pergunta_37_sep.propertie().add("name","p_pergunta_37_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_37 = new PlainTextField(model,"pergunta_37");
		pergunta_37.setLabel(gt("Pergunta 37"));
		pergunta_37.propertie().add("name","p_pergunta_37").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta37 = new RadioListField(model,"resposta37");
		resposta37.setLabel(gt(""));
		resposta37.propertie().add("name","p_resposta37").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_38_sep = new SeparatorField(model,"pergunta_38_sep");
		pergunta_38_sep.setLabel(gt("Pergunta 38"));
		pergunta_38_sep.propertie().add("name","p_pergunta_38_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_38 = new PlainTextField(model,"pergunta_38");
		pergunta_38.setLabel(gt("Pergunta 38"));
		pergunta_38.propertie().add("name","p_pergunta_38").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta38 = new RadioListField(model,"resposta38");
		resposta38.setLabel(gt(""));
		resposta38.propertie().add("name","p_resposta38").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_39_sep = new SeparatorField(model,"pergunta_39_sep");
		pergunta_39_sep.setLabel(gt("Pergunta 39"));
		pergunta_39_sep.propertie().add("name","p_pergunta_39_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_39 = new PlainTextField(model,"pergunta_39");
		pergunta_39.setLabel(gt("Pergunta 39"));
		pergunta_39.propertie().add("name","p_pergunta_39").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta39 = new RadioListField(model,"resposta39");
		resposta39.setLabel(gt(""));
		resposta39.propertie().add("name","p_resposta39").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		pergunta_40_sep = new SeparatorField(model,"pergunta_40_sep");
		pergunta_40_sep.setLabel(gt("Pergunta 40"));
		pergunta_40_sep.propertie().add("name","p_pergunta_40_sep").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		pergunta_40 = new PlainTextField(model,"pergunta_40");
		pergunta_40.setLabel(gt("Pergunta 40"));
		pergunta_40.propertie().add("name","p_pergunta_40").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		resposta40 = new RadioListField(model,"resposta40");
		resposta40.setLabel(gt(""));
		resposta40.propertie().add("name","p_resposta40").add("type","radiolist").add("domain","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("child_size","12").add("java-type","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		
		nivel = new HiddenField(model,"nivel");
		nivel.setLabel(gt(""));
		nivel.propertie().add("name","p_nivel").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","nivel");
		
		formacao = new HiddenField(model,"formacao");
		formacao.setLabel(gt(""));
		formacao.propertie().add("name","p_formacao").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","formacao");
		


		btn_finalizar = new IGRPButton("Finalizar","sistema_de_avaliacao_igrpweb","Questoes_gerais","finalizar","submit","primary|fa-power-off","","");
		btn_finalizar.propertie.add("id","button_ed7a_da39").add("type","form").add("class","primary").add("rel","finalizar").add("refresh_components","form_1");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(conceitos_de_igrp_studio);
		form_1.addField(pergunta_1_sep);
		form_1.addField(pergunta1);
		form_1.addField(resposta1);
		form_1.addField(pergunta_2_sep);
		form_1.addField(pergunta2);
		form_1.addField(resposta2);
		form_1.addField(pergunta_3_sep);
		form_1.addField(pergunta_3);
		form_1.addField(resposta3);
		form_1.addField(pergunta_4_sep);
		form_1.addField(pergunta_4);
		form_1.addField(resposta4);
		form_1.addField(pergunta_5_sep);
		form_1.addField(pergunta_5);
		form_1.addField(resposta5);
		form_1.addField(conceitos_bpmn__e_report_designer);
		form_1.addField(pergunta_6_sep);
		form_1.addField(pergunta_6);
		form_1.addField(resposta6);
		form_1.addField(pergunta_7_sep);
		form_1.addField(pergunta_7);
		form_1.addField(resposta7);
		form_1.addField(pergunta_8_sep);
		form_1.addField(pergunta8);
		form_1.addField(resposta8);
		form_1.addField(pergunta_9_sep);
		form_1.addField(pergunta9);
		form_1.addField(resposta9);
		form_1.addField(pergunta_10_sep);
		form_1.addField(pergunta10);
		form_1.addField(resposta10);
		form_1.addField(conceitos_page_designer);
		form_1.addField(pergunta_11_sep);
		form_1.addField(pergunta11);
		form_1.addField(resposta11);
		form_1.addField(pergunta_12_sep);
		form_1.addField(pergunta12);
		form_1.addField(resposta12);
		form_1.addField(pergunta_13_sep);
		form_1.addField(pergunta13);
		form_1.addField(resposta13);
		form_1.addField(pergunta_14_sep);
		form_1.addField(pergunta14);
		form_1.addField(resposta14);
		form_1.addField(pergunta_15_sep);
		form_1.addField(pergunta15);
		form_1.addField(resposta15);
		form_1.addField(conceitos_gerador_de_codigo_e_blockly);
		form_1.addField(pergunta_16_sep);
		form_1.addField(pergunta16);
		form_1.addField(resposta16);
		form_1.addField(pergunta_17_sep);
		form_1.addField(pergunta17);
		form_1.addField(resposta17);
		form_1.addField(pergunta_18_sep);
		form_1.addField(pergunta18);
		form_1.addField(resposta18);
		form_1.addField(pergunta_19_sep);
		form_1.addField(pergunta19);
		form_1.addField(resposta19);
		form_1.addField(pergunta_20sep);
		form_1.addField(pergunta20);
		form_1.addField(resposta20);
		form_1.addField(conceitos_de_eclipse_e_git);
		form_1.addField(pergunta_21_sep);
		form_1.addField(pergunta21);
		form_1.addField(resposta21);
		form_1.addField(pergunta_22_sep);
		form_1.addField(pergunta22);
		form_1.addField(resposta22);
		form_1.addField(pergunta_23_sep);
		form_1.addField(pergunta23);
		form_1.addField(resposta23);
		form_1.addField(pergunta_24_sep);
		form_1.addField(pergunta24);
		form_1.addField(resposta24);
		form_1.addField(pergunta_25_sep);
		form_1.addField(pergunta25);
		form_1.addField(resposta25);
		form_1.addField(conceitos_de_base_de_dados_e_dao);
		form_1.addField(pergunta_26_sep);
		form_1.addField(pergunta26);
		form_1.addField(resposta26);
		form_1.addField(pergunta_27_sep);
		form_1.addField(pergunta27);
		form_1.addField(resposta27);
		form_1.addField(pergunta_28_sep);
		form_1.addField(pergunta28);
		form_1.addField(resposta28);
		form_1.addField(pergunta_29_sep);
		form_1.addField(pergunta29);
		form_1.addField(resposta29);
		form_1.addField(pergunta_30_sep);
		form_1.addField(pergunta30);
		form_1.addField(resposta30);
		form_1.addField(conceitos_de_java);
		form_1.addField(pergunta_31_sep);
		form_1.addField(pergunta31);
		form_1.addField(resposta31);
		form_1.addField(pergunta_32_sep);
		form_1.addField(pergunta32);
		form_1.addField(resposta32);
		form_1.addField(pergunta_33_sep);
		form_1.addField(pergunta33);
		form_1.addField(resposta33);
		form_1.addField(perungta_34_sep);
		form_1.addField(pergunta34);
		form_1.addField(resposta34);
		form_1.addField(perungta_35_sep);
		form_1.addField(pergunta35);
		form_1.addField(resposta35);
		form_1.addField(conceitos_de_gestao_de_acessos);
		form_1.addField(pergunta_36_sep);
		form_1.addField(pergunta_36);
		form_1.addField(resposta36);
		form_1.addField(pergunta_37_sep);
		form_1.addField(pergunta_37);
		form_1.addField(resposta37);
		form_1.addField(pergunta_38_sep);
		form_1.addField(pergunta_38);
		form_1.addField(resposta38);
		form_1.addField(pergunta_39_sep);
		form_1.addField(pergunta_39);
		form_1.addField(resposta39);
		form_1.addField(pergunta_40_sep);
		form_1.addField(pergunta_40);
		form_1.addField(resposta40);
		form_1.addField(id_avaliado);
		form_1.addField(nivel);
		form_1.addField(formacao);

		form_1.addButton(btn_finalizar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		conceitos_de_igrp_studio.setValue(model);
		pergunta_1_sep.setValue(model);
		pergunta1.setValue(model);
		resposta1.setValue(model);
		pergunta_2_sep.setValue(model);
		pergunta2.setValue(model);
		resposta2.setValue(model);
		pergunta_3_sep.setValue(model);
		pergunta_3.setValue(model);
		resposta3.setValue(model);
		pergunta_4_sep.setValue(model);
		pergunta_4.setValue(model);
		resposta4.setValue(model);
		pergunta_5_sep.setValue(model);
		pergunta_5.setValue(model);
		resposta5.setValue(model);
		conceitos_bpmn__e_report_designer.setValue(model);
		pergunta_6_sep.setValue(model);
		pergunta_6.setValue(model);
		resposta6.setValue(model);
		pergunta_7_sep.setValue(model);
		pergunta_7.setValue(model);
		resposta7.setValue(model);
		pergunta_8_sep.setValue(model);
		pergunta8.setValue(model);
		resposta8.setValue(model);
		pergunta_9_sep.setValue(model);
		pergunta9.setValue(model);
		resposta9.setValue(model);
		pergunta_10_sep.setValue(model);
		pergunta10.setValue(model);
		resposta10.setValue(model);
		conceitos_page_designer.setValue(model);
		pergunta_11_sep.setValue(model);
		pergunta11.setValue(model);
		resposta11.setValue(model);
		pergunta_12_sep.setValue(model);
		pergunta12.setValue(model);
		resposta12.setValue(model);
		pergunta_13_sep.setValue(model);
		pergunta13.setValue(model);
		resposta13.setValue(model);
		pergunta_14_sep.setValue(model);
		pergunta14.setValue(model);
		resposta14.setValue(model);
		pergunta_15_sep.setValue(model);
		pergunta15.setValue(model);
		resposta15.setValue(model);
		conceitos_gerador_de_codigo_e_blockly.setValue(model);
		pergunta_16_sep.setValue(model);
		pergunta16.setValue(model);
		resposta16.setValue(model);
		pergunta_17_sep.setValue(model);
		pergunta17.setValue(model);
		resposta17.setValue(model);
		pergunta_18_sep.setValue(model);
		pergunta18.setValue(model);
		resposta18.setValue(model);
		pergunta_19_sep.setValue(model);
		pergunta19.setValue(model);
		resposta19.setValue(model);
		pergunta_20sep.setValue(model);
		pergunta20.setValue(model);
		resposta20.setValue(model);
		conceitos_de_eclipse_e_git.setValue(model);
		pergunta_21_sep.setValue(model);
		pergunta21.setValue(model);
		resposta21.setValue(model);
		pergunta_22_sep.setValue(model);
		pergunta22.setValue(model);
		resposta22.setValue(model);
		pergunta_23_sep.setValue(model);
		pergunta23.setValue(model);
		resposta23.setValue(model);
		pergunta_24_sep.setValue(model);
		pergunta24.setValue(model);
		resposta24.setValue(model);
		pergunta_25_sep.setValue(model);
		pergunta25.setValue(model);
		resposta25.setValue(model);
		conceitos_de_base_de_dados_e_dao.setValue(model);
		pergunta_26_sep.setValue(model);
		pergunta26.setValue(model);
		resposta26.setValue(model);
		pergunta_27_sep.setValue(model);
		pergunta27.setValue(model);
		resposta27.setValue(model);
		pergunta_28_sep.setValue(model);
		pergunta28.setValue(model);
		resposta28.setValue(model);
		pergunta_29_sep.setValue(model);
		pergunta29.setValue(model);
		resposta29.setValue(model);
		pergunta_30_sep.setValue(model);
		pergunta30.setValue(model);
		resposta30.setValue(model);
		conceitos_de_java.setValue(model);
		pergunta_31_sep.setValue(model);
		pergunta31.setValue(model);
		resposta31.setValue(model);
		pergunta_32_sep.setValue(model);
		pergunta32.setValue(model);
		resposta32.setValue(model);
		pergunta_33_sep.setValue(model);
		pergunta33.setValue(model);
		resposta33.setValue(model);
		perungta_34_sep.setValue(model);
		pergunta34.setValue(model);
		resposta34.setValue(model);
		perungta_35_sep.setValue(model);
		pergunta35.setValue(model);
		resposta35.setValue(model);
		conceitos_de_gestao_de_acessos.setValue(model);
		pergunta_36_sep.setValue(model);
		pergunta_36.setValue(model);
		resposta36.setValue(model);
		pergunta_37_sep.setValue(model);
		pergunta_37.setValue(model);
		resposta37.setValue(model);
		pergunta_38_sep.setValue(model);
		pergunta_38.setValue(model);
		resposta38.setValue(model);
		pergunta_39_sep.setValue(model);
		pergunta_39.setValue(model);
		resposta39.setValue(model);
		pergunta_40_sep.setValue(model);
		pergunta_40.setValue(model);
		resposta40.setValue(model);
		id_avaliado.setValue(model);
		nivel.setValue(model);
		formacao.setValue(model);	

		}
}
