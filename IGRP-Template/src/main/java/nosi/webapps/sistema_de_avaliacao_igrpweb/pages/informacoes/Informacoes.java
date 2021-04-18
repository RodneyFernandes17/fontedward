package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.informacoes;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Informacoes extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_conceitos_de_igrp_studio")
	private String conceitos_de_igrp_studio;

	@RParam(rParamName = "p_pergunta_1_sep")
	private String pergunta_1_sep;

	@RParam(rParamName = "p_pergunta1")
	private String pergunta1;

	@RParam(rParamName = "p_resposta1")
	private String resposta1;

	@RParam(rParamName = "p_reposta_certa_1")
	private String reposta_certa_1;

	@RParam(rParamName = "p_pergunta_2_sep")
	private String pergunta_2_sep;

	@RParam(rParamName = "p_pergunta2")
	private String pergunta2;

	@RParam(rParamName = "p_resposta2")
	private String resposta2;

	@RParam(rParamName = "p_resposta_certa_2")
	private String resposta_certa_2;

	@RParam(rParamName = "p_pergunta_3_sep")
	private String pergunta_3_sep;

	@RParam(rParamName = "p_pergunta_3")
	private String pergunta_3;

	@RParam(rParamName = "p_resposta3")
	private String resposta3;

	@RParam(rParamName = "p_resposta_certa_3")
	private String resposta_certa_3;

	@RParam(rParamName = "p_pergunta_4_sep")
	private String pergunta_4_sep;

	@RParam(rParamName = "p_pergunta_4")
	private String pergunta_4;

	@RParam(rParamName = "p_resposta4")
	private String resposta4;

	@RParam(rParamName = "p_resposta_certa_4")
	private String resposta_certa_4;

	@RParam(rParamName = "p_pergunta_5_sep")
	private String pergunta_5_sep;

	@RParam(rParamName = "p_pergunta_5")
	private String pergunta_5;

	@RParam(rParamName = "p_resposta5")
	private String resposta5;

	@RParam(rParamName = "p_resposta_certa_5")
	private String resposta_certa_5;

	@RParam(rParamName = "p_conceitos_bpmn__e_report_designer")
	private String conceitos_bpmn__e_report_designer;

	@RParam(rParamName = "p_pergunta_6_sep")
	private String pergunta_6_sep;

	@RParam(rParamName = "p_pergunta_6")
	private String pergunta_6;

	@RParam(rParamName = "p_resposta6")
	private String resposta6;

	@RParam(rParamName = "p_resposta_certa_6")
	private String resposta_certa_6;

	@RParam(rParamName = "p_pergunta_7_sep")
	private String pergunta_7_sep;

	@RParam(rParamName = "p_pergunta_7")
	private String pergunta_7;

	@RParam(rParamName = "p_resposta7")
	private String resposta7;

	@RParam(rParamName = "p_resposta_certa_7")
	private String resposta_certa_7;

	@RParam(rParamName = "p_pergunta_8_sep")
	private String pergunta_8_sep;

	@RParam(rParamName = "p_pergunta8")
	private String pergunta8;

	@RParam(rParamName = "p_resposta8")
	private String resposta8;

	@RParam(rParamName = "p_resposta_certa_8")
	private String resposta_certa_8;

	@RParam(rParamName = "p_pergunta_9_sep")
	private String pergunta_9_sep;

	@RParam(rParamName = "p_pergunta9")
	private String pergunta9;

	@RParam(rParamName = "p_resposta9")
	private String resposta9;

	@RParam(rParamName = "p_resposta_certa_9")
	private String resposta_certa_9;

	@RParam(rParamName = "p_pergunta_10_sep")
	private String pergunta_10_sep;

	@RParam(rParamName = "p_pergunta10")
	private String pergunta10;

	@RParam(rParamName = "p_resposta10")
	private String resposta10;

	@RParam(rParamName = "p_resposta_certa_10")
	private String resposta_certa_10;

	@RParam(rParamName = "p_conceitos_page_designer")
	private String conceitos_page_designer;

	@RParam(rParamName = "p_pergunta_11_sep")
	private String pergunta_11_sep;

	@RParam(rParamName = "p_pergunta11")
	private String pergunta11;

	@RParam(rParamName = "p_resposta11")
	private String resposta11;

	@RParam(rParamName = "p_resposta_certa_11")
	private String resposta_certa_11;

	@RParam(rParamName = "p_pergunta_12_sep")
	private String pergunta_12_sep;

	@RParam(rParamName = "p_pergunta12")
	private String pergunta12;

	@RParam(rParamName = "p_resposta12")
	private String resposta12;

	@RParam(rParamName = "p_resposta_certa_12")
	private String resposta_certa_12;

	@RParam(rParamName = "p_pergunta_13_sep")
	private String pergunta_13_sep;

	@RParam(rParamName = "p_pergunta13")
	private String pergunta13;

	@RParam(rParamName = "p_resposta13")
	private String resposta13;

	@RParam(rParamName = "p_resposta_certa_13")
	private String resposta_certa_13;

	@RParam(rParamName = "p_pergunta_14_sep")
	private String pergunta_14_sep;

	@RParam(rParamName = "p_pergunta14")
	private String pergunta14;

	@RParam(rParamName = "p_resposta14")
	private String resposta14;

	@RParam(rParamName = "p_resposta_certa_14")
	private String resposta_certa_14;

	@RParam(rParamName = "p_pergunta_15_sep")
	private String pergunta_15_sep;

	@RParam(rParamName = "p_pergunta15")
	private String pergunta15;

	@RParam(rParamName = "p_resposta15")
	private String resposta15;

	@RParam(rParamName = "p_resposta_certa_15")
	private String resposta_certa_15;

	@RParam(rParamName = "p_conceitos_gerador_de_codigo_e_blockly")
	private String conceitos_gerador_de_codigo_e_blockly;

	@RParam(rParamName = "p_pergunta_16_sep")
	private String pergunta_16_sep;

	@RParam(rParamName = "p_pergunta16")
	private String pergunta16;

	@RParam(rParamName = "p_resposta16")
	private String resposta16;

	@RParam(rParamName = "p_resposta_certa_16")
	private String resposta_certa_16;

	@RParam(rParamName = "p_pergunta_17_sep")
	private String pergunta_17_sep;

	@RParam(rParamName = "p_pergunta17")
	private String pergunta17;

	@RParam(rParamName = "p_resposta17")
	private String resposta17;

	@RParam(rParamName = "p_resposta_certa_17")
	private String resposta_certa_17;

	@RParam(rParamName = "p_pergunta_18_sep")
	private String pergunta_18_sep;

	@RParam(rParamName = "p_pergunta18")
	private String pergunta18;

	@RParam(rParamName = "p_resposta18")
	private String resposta18;

	@RParam(rParamName = "p_resposta_certa_18")
	private String resposta_certa_18;

	@RParam(rParamName = "p_pergunta_19_sep")
	private String pergunta_19_sep;

	@RParam(rParamName = "p_pergunta19")
	private String pergunta19;

	@RParam(rParamName = "p_resposta19")
	private String resposta19;

	@RParam(rParamName = "p_resposta_certa_19")
	private String resposta_certa_19;

	@RParam(rParamName = "p_pergunta_20sep")
	private String pergunta_20sep;

	@RParam(rParamName = "p_pergunta20")
	private String pergunta20;

	@RParam(rParamName = "p_resposta20")
	private String resposta20;

	@RParam(rParamName = "p_resposta_certa_20")
	private String resposta_certa_20;

	@RParam(rParamName = "p_conceitos_de_eclipse_e_git")
	private String conceitos_de_eclipse_e_git;

	@RParam(rParamName = "p_pergunta_21_sep")
	private String pergunta_21_sep;

	@RParam(rParamName = "p_pergunta21")
	private String pergunta21;

	@RParam(rParamName = "p_resposta21")
	private String resposta21;

	@RParam(rParamName = "p_respsota_certa_21")
	private String respsota_certa_21;

	@RParam(rParamName = "p_pergunta_22_sep")
	private String pergunta_22_sep;

	@RParam(rParamName = "p_pergunta22")
	private String pergunta22;

	@RParam(rParamName = "p_resposta22")
	private String resposta22;

	@RParam(rParamName = "p_respsota_certa_22")
	private String respsota_certa_22;

	@RParam(rParamName = "p_pergunta_23_sep")
	private String pergunta_23_sep;

	@RParam(rParamName = "p_pergunta23")
	private String pergunta23;

	@RParam(rParamName = "p_resposta23")
	private String resposta23;

	@RParam(rParamName = "p_resposta_certa_23")
	private String resposta_certa_23;

	@RParam(rParamName = "p_pergunta_24_sep")
	private String pergunta_24_sep;

	@RParam(rParamName = "p_pergunta24")
	private String pergunta24;

	@RParam(rParamName = "p_resposta24")
	private String resposta24;

	@RParam(rParamName = "p_resposta_certa_24")
	private String resposta_certa_24;

	@RParam(rParamName = "p_pergunta_25_sep")
	private String pergunta_25_sep;

	@RParam(rParamName = "p_pergunta25")
	private String pergunta25;

	@RParam(rParamName = "p_resposta25")
	private String resposta25;

	@RParam(rParamName = "p_resposta_certa_25")
	private String resposta_certa_25;

	@RParam(rParamName = "p_conceitos_de_base_de_dados_e_dao")
	private String conceitos_de_base_de_dados_e_dao;

	@RParam(rParamName = "p_pergunta_26_sep")
	private String pergunta_26_sep;

	@RParam(rParamName = "p_pergunta26")
	private String pergunta26;

	@RParam(rParamName = "p_resposta26")
	private String resposta26;

	@RParam(rParamName = "p_resposta_certa_26")
	private String resposta_certa_26;

	@RParam(rParamName = "p_pergunta_27_sep")
	private String pergunta_27_sep;

	@RParam(rParamName = "p_pergunta27")
	private String pergunta27;

	@RParam(rParamName = "p_resposta27")
	private String resposta27;

	@RParam(rParamName = "p_resposta_certa_27")
	private String resposta_certa_27;

	@RParam(rParamName = "p_pergunta_28_sep")
	private String pergunta_28_sep;

	@RParam(rParamName = "p_pergunta28")
	private String pergunta28;

	@RParam(rParamName = "p_resposta28")
	private String resposta28;

	@RParam(rParamName = "p_resposta_certa_28")
	private String resposta_certa_28;

	@RParam(rParamName = "p_pergunta_29_sep")
	private String pergunta_29_sep;

	@RParam(rParamName = "p_pergunta29")
	private String pergunta29;

	@RParam(rParamName = "p_resposta29")
	private String resposta29;

	@RParam(rParamName = "p_resposta_certa_29")
	private String resposta_certa_29;

	@RParam(rParamName = "p_pergunta_30_sep")
	private String pergunta_30_sep;

	@RParam(rParamName = "p_pergunta30")
	private String pergunta30;

	@RParam(rParamName = "p_resposta30")
	private String resposta30;

	@RParam(rParamName = "p_resposta_certa_30")
	private String resposta_certa_30;

	@RParam(rParamName = "p_conceitos_de_java")
	private String conceitos_de_java;

	@RParam(rParamName = "p_pergunta_31_sep")
	private String pergunta_31_sep;

	@RParam(rParamName = "p_pergunta31")
	private String pergunta31;

	@RParam(rParamName = "p_resposta31")
	private String resposta31;

	@RParam(rParamName = "p_resposta_certa_31")
	private String resposta_certa_31;

	@RParam(rParamName = "p_pergunta_32_sep")
	private String pergunta_32_sep;

	@RParam(rParamName = "p_pergunta32")
	private String pergunta32;

	@RParam(rParamName = "p_resposta32")
	private String resposta32;

	@RParam(rParamName = "p_resposta_certa_32")
	private String resposta_certa_32;

	@RParam(rParamName = "p_pergunta_33_sep")
	private String pergunta_33_sep;

	@RParam(rParamName = "p_pergunta33")
	private String pergunta33;

	@RParam(rParamName = "p_resposta33")
	private String resposta33;

	@RParam(rParamName = "p_resposta_certa_33")
	private String resposta_certa_33;

	@RParam(rParamName = "p_perungta_34_sep")
	private String perungta_34_sep;

	@RParam(rParamName = "p_pergunta34")
	private String pergunta34;

	@RParam(rParamName = "p_resposta34")
	private String resposta34;

	@RParam(rParamName = "p_resposta_certa_34")
	private String resposta_certa_34;

	@RParam(rParamName = "p_perungta_35_sep")
	private String perungta_35_sep;

	@RParam(rParamName = "p_pergunta35")
	private String pergunta35;

	@RParam(rParamName = "p_resposta35")
	private String resposta35;

	@RParam(rParamName = "p_resposta_certa_35")
	private String resposta_certa_35;

	@RParam(rParamName = "p_conceitos_de_gestao_de_acessos")
	private String conceitos_de_gestao_de_acessos;

	@RParam(rParamName = "p_pergunta_36_sep")
	private String pergunta_36_sep;

	@RParam(rParamName = "p_pergunta_36")
	private String pergunta_36;

	@RParam(rParamName = "p_resposta36")
	private String resposta36;

	@RParam(rParamName = "p_resposta_certa_36")
	private String resposta_certa_36;

	@RParam(rParamName = "p_pergunta_37_sep")
	private String pergunta_37_sep;

	@RParam(rParamName = "p_pergunta_37")
	private String pergunta_37;

	@RParam(rParamName = "p_resposta37")
	private String resposta37;

	@RParam(rParamName = "p_resposta_certa_37")
	private String resposta_certa_37;

	@RParam(rParamName = "p_pergunta_38_sep")
	private String pergunta_38_sep;

	@RParam(rParamName = "p_pergunta_38")
	private String pergunta_38;

	@RParam(rParamName = "p_resposta38")
	private String resposta38;

	@RParam(rParamName = "p_resposta_certa_38")
	private String resposta_certa_38;

	@RParam(rParamName = "p_pergunta_39_sep")
	private String pergunta_39_sep;

	@RParam(rParamName = "p_pergunta_39")
	private String pergunta_39;

	@RParam(rParamName = "p_resposta39")
	private String resposta39;

	@RParam(rParamName = "p_resposta_certa_39")
	private String resposta_certa_39;

	@RParam(rParamName = "p_pergunta_40_sep")
	private String pergunta_40_sep;

	@RParam(rParamName = "p_pergunta_40")
	private String pergunta_40;

	@RParam(rParamName = "p_resposta40")
	private String resposta40;

	@RParam(rParamName = "p_resposta_certa_40")
	private String resposta_certa_40;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;

	@RParam(rParamName = "p_nivel")
	private String nivel;

	@RParam(rParamName = "p_id_teste")
	private String id_teste;

	@RParam(rParamName = "p_statbox_1_title")
	private String statbox_1_title;

	@RParam(rParamName = "p_statbox_1_val")
	private String statbox_1_val;

	@RParam(rParamName = "p_statbox_1_txt")
	private String statbox_1_txt;

	@RParam(rParamName = "p_statbox_1_url")
	private String statbox_1_url;

	@RParam(rParamName = "p_statbox_1_bg")
	private String statbox_1_bg;

	@RParam(rParamName = "p_statbox_1_icn")
	private String statbox_1_icn;

	@RParam(rParamName = "p_statbox_2_title")
	private String statbox_2_title;

	@RParam(rParamName = "p_statbox_2_val")
	private String statbox_2_val;

	@RParam(rParamName = "p_statbox_2_txt")
	private String statbox_2_txt;

	@RParam(rParamName = "p_statbox_2_url")
	private String statbox_2_url;

	@RParam(rParamName = "p_statbox_2_bg")
	private String statbox_2_bg;

	@RParam(rParamName = "p_statbox_2_icn")
	private String statbox_2_icn;
	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setConceitos_de_igrp_studio(String conceitos_de_igrp_studio){
		this.conceitos_de_igrp_studio = conceitos_de_igrp_studio;
	}
	public String getConceitos_de_igrp_studio(){
		return this.conceitos_de_igrp_studio;
	}
	
	public void setPergunta_1_sep(String pergunta_1_sep){
		this.pergunta_1_sep = pergunta_1_sep;
	}
	public String getPergunta_1_sep(){
		return this.pergunta_1_sep;
	}
	
	public void setPergunta1(String pergunta1){
		this.pergunta1 = pergunta1;
	}
	public String getPergunta1(){
		return this.pergunta1;
	}
	
	public void setResposta1(String resposta1){
		this.resposta1 = resposta1;
	}
	public String getResposta1(){
		return this.resposta1;
	}
	
	public void setReposta_certa_1(String reposta_certa_1){
		this.reposta_certa_1 = reposta_certa_1;
	}
	public String getReposta_certa_1(){
		return this.reposta_certa_1;
	}
	
	public void setPergunta_2_sep(String pergunta_2_sep){
		this.pergunta_2_sep = pergunta_2_sep;
	}
	public String getPergunta_2_sep(){
		return this.pergunta_2_sep;
	}
	
	public void setPergunta2(String pergunta2){
		this.pergunta2 = pergunta2;
	}
	public String getPergunta2(){
		return this.pergunta2;
	}
	
	public void setResposta2(String resposta2){
		this.resposta2 = resposta2;
	}
	public String getResposta2(){
		return this.resposta2;
	}
	
	public void setResposta_certa_2(String resposta_certa_2){
		this.resposta_certa_2 = resposta_certa_2;
	}
	public String getResposta_certa_2(){
		return this.resposta_certa_2;
	}
	
	public void setPergunta_3_sep(String pergunta_3_sep){
		this.pergunta_3_sep = pergunta_3_sep;
	}
	public String getPergunta_3_sep(){
		return this.pergunta_3_sep;
	}
	
	public void setPergunta_3(String pergunta_3){
		this.pergunta_3 = pergunta_3;
	}
	public String getPergunta_3(){
		return this.pergunta_3;
	}
	
	public void setResposta3(String resposta3){
		this.resposta3 = resposta3;
	}
	public String getResposta3(){
		return this.resposta3;
	}
	
	public void setResposta_certa_3(String resposta_certa_3){
		this.resposta_certa_3 = resposta_certa_3;
	}
	public String getResposta_certa_3(){
		return this.resposta_certa_3;
	}
	
	public void setPergunta_4_sep(String pergunta_4_sep){
		this.pergunta_4_sep = pergunta_4_sep;
	}
	public String getPergunta_4_sep(){
		return this.pergunta_4_sep;
	}
	
	public void setPergunta_4(String pergunta_4){
		this.pergunta_4 = pergunta_4;
	}
	public String getPergunta_4(){
		return this.pergunta_4;
	}
	
	public void setResposta4(String resposta4){
		this.resposta4 = resposta4;
	}
	public String getResposta4(){
		return this.resposta4;
	}
	
	public void setResposta_certa_4(String resposta_certa_4){
		this.resposta_certa_4 = resposta_certa_4;
	}
	public String getResposta_certa_4(){
		return this.resposta_certa_4;
	}
	
	public void setPergunta_5_sep(String pergunta_5_sep){
		this.pergunta_5_sep = pergunta_5_sep;
	}
	public String getPergunta_5_sep(){
		return this.pergunta_5_sep;
	}
	
	public void setPergunta_5(String pergunta_5){
		this.pergunta_5 = pergunta_5;
	}
	public String getPergunta_5(){
		return this.pergunta_5;
	}
	
	public void setResposta5(String resposta5){
		this.resposta5 = resposta5;
	}
	public String getResposta5(){
		return this.resposta5;
	}
	
	public void setResposta_certa_5(String resposta_certa_5){
		this.resposta_certa_5 = resposta_certa_5;
	}
	public String getResposta_certa_5(){
		return this.resposta_certa_5;
	}
	
	public void setConceitos_bpmn__e_report_designer(String conceitos_bpmn__e_report_designer){
		this.conceitos_bpmn__e_report_designer = conceitos_bpmn__e_report_designer;
	}
	public String getConceitos_bpmn__e_report_designer(){
		return this.conceitos_bpmn__e_report_designer;
	}
	
	public void setPergunta_6_sep(String pergunta_6_sep){
		this.pergunta_6_sep = pergunta_6_sep;
	}
	public String getPergunta_6_sep(){
		return this.pergunta_6_sep;
	}
	
	public void setPergunta_6(String pergunta_6){
		this.pergunta_6 = pergunta_6;
	}
	public String getPergunta_6(){
		return this.pergunta_6;
	}
	
	public void setResposta6(String resposta6){
		this.resposta6 = resposta6;
	}
	public String getResposta6(){
		return this.resposta6;
	}
	
	public void setResposta_certa_6(String resposta_certa_6){
		this.resposta_certa_6 = resposta_certa_6;
	}
	public String getResposta_certa_6(){
		return this.resposta_certa_6;
	}
	
	public void setPergunta_7_sep(String pergunta_7_sep){
		this.pergunta_7_sep = pergunta_7_sep;
	}
	public String getPergunta_7_sep(){
		return this.pergunta_7_sep;
	}
	
	public void setPergunta_7(String pergunta_7){
		this.pergunta_7 = pergunta_7;
	}
	public String getPergunta_7(){
		return this.pergunta_7;
	}
	
	public void setResposta7(String resposta7){
		this.resposta7 = resposta7;
	}
	public String getResposta7(){
		return this.resposta7;
	}
	
	public void setResposta_certa_7(String resposta_certa_7){
		this.resposta_certa_7 = resposta_certa_7;
	}
	public String getResposta_certa_7(){
		return this.resposta_certa_7;
	}
	
	public void setPergunta_8_sep(String pergunta_8_sep){
		this.pergunta_8_sep = pergunta_8_sep;
	}
	public String getPergunta_8_sep(){
		return this.pergunta_8_sep;
	}
	
	public void setPergunta8(String pergunta8){
		this.pergunta8 = pergunta8;
	}
	public String getPergunta8(){
		return this.pergunta8;
	}
	
	public void setResposta8(String resposta8){
		this.resposta8 = resposta8;
	}
	public String getResposta8(){
		return this.resposta8;
	}
	
	public void setResposta_certa_8(String resposta_certa_8){
		this.resposta_certa_8 = resposta_certa_8;
	}
	public String getResposta_certa_8(){
		return this.resposta_certa_8;
	}
	
	public void setPergunta_9_sep(String pergunta_9_sep){
		this.pergunta_9_sep = pergunta_9_sep;
	}
	public String getPergunta_9_sep(){
		return this.pergunta_9_sep;
	}
	
	public void setPergunta9(String pergunta9){
		this.pergunta9 = pergunta9;
	}
	public String getPergunta9(){
		return this.pergunta9;
	}
	
	public void setResposta9(String resposta9){
		this.resposta9 = resposta9;
	}
	public String getResposta9(){
		return this.resposta9;
	}
	
	public void setResposta_certa_9(String resposta_certa_9){
		this.resposta_certa_9 = resposta_certa_9;
	}
	public String getResposta_certa_9(){
		return this.resposta_certa_9;
	}
	
	public void setPergunta_10_sep(String pergunta_10_sep){
		this.pergunta_10_sep = pergunta_10_sep;
	}
	public String getPergunta_10_sep(){
		return this.pergunta_10_sep;
	}
	
	public void setPergunta10(String pergunta10){
		this.pergunta10 = pergunta10;
	}
	public String getPergunta10(){
		return this.pergunta10;
	}
	
	public void setResposta10(String resposta10){
		this.resposta10 = resposta10;
	}
	public String getResposta10(){
		return this.resposta10;
	}
	
	public void setResposta_certa_10(String resposta_certa_10){
		this.resposta_certa_10 = resposta_certa_10;
	}
	public String getResposta_certa_10(){
		return this.resposta_certa_10;
	}
	
	public void setConceitos_page_designer(String conceitos_page_designer){
		this.conceitos_page_designer = conceitos_page_designer;
	}
	public String getConceitos_page_designer(){
		return this.conceitos_page_designer;
	}
	
	public void setPergunta_11_sep(String pergunta_11_sep){
		this.pergunta_11_sep = pergunta_11_sep;
	}
	public String getPergunta_11_sep(){
		return this.pergunta_11_sep;
	}
	
	public void setPergunta11(String pergunta11){
		this.pergunta11 = pergunta11;
	}
	public String getPergunta11(){
		return this.pergunta11;
	}
	
	public void setResposta11(String resposta11){
		this.resposta11 = resposta11;
	}
	public String getResposta11(){
		return this.resposta11;
	}
	
	public void setResposta_certa_11(String resposta_certa_11){
		this.resposta_certa_11 = resposta_certa_11;
	}
	public String getResposta_certa_11(){
		return this.resposta_certa_11;
	}
	
	public void setPergunta_12_sep(String pergunta_12_sep){
		this.pergunta_12_sep = pergunta_12_sep;
	}
	public String getPergunta_12_sep(){
		return this.pergunta_12_sep;
	}
	
	public void setPergunta12(String pergunta12){
		this.pergunta12 = pergunta12;
	}
	public String getPergunta12(){
		return this.pergunta12;
	}
	
	public void setResposta12(String resposta12){
		this.resposta12 = resposta12;
	}
	public String getResposta12(){
		return this.resposta12;
	}
	
	public void setResposta_certa_12(String resposta_certa_12){
		this.resposta_certa_12 = resposta_certa_12;
	}
	public String getResposta_certa_12(){
		return this.resposta_certa_12;
	}
	
	public void setPergunta_13_sep(String pergunta_13_sep){
		this.pergunta_13_sep = pergunta_13_sep;
	}
	public String getPergunta_13_sep(){
		return this.pergunta_13_sep;
	}
	
	public void setPergunta13(String pergunta13){
		this.pergunta13 = pergunta13;
	}
	public String getPergunta13(){
		return this.pergunta13;
	}
	
	public void setResposta13(String resposta13){
		this.resposta13 = resposta13;
	}
	public String getResposta13(){
		return this.resposta13;
	}
	
	public void setResposta_certa_13(String resposta_certa_13){
		this.resposta_certa_13 = resposta_certa_13;
	}
	public String getResposta_certa_13(){
		return this.resposta_certa_13;
	}
	
	public void setPergunta_14_sep(String pergunta_14_sep){
		this.pergunta_14_sep = pergunta_14_sep;
	}
	public String getPergunta_14_sep(){
		return this.pergunta_14_sep;
	}
	
	public void setPergunta14(String pergunta14){
		this.pergunta14 = pergunta14;
	}
	public String getPergunta14(){
		return this.pergunta14;
	}
	
	public void setResposta14(String resposta14){
		this.resposta14 = resposta14;
	}
	public String getResposta14(){
		return this.resposta14;
	}
	
	public void setResposta_certa_14(String resposta_certa_14){
		this.resposta_certa_14 = resposta_certa_14;
	}
	public String getResposta_certa_14(){
		return this.resposta_certa_14;
	}
	
	public void setPergunta_15_sep(String pergunta_15_sep){
		this.pergunta_15_sep = pergunta_15_sep;
	}
	public String getPergunta_15_sep(){
		return this.pergunta_15_sep;
	}
	
	public void setPergunta15(String pergunta15){
		this.pergunta15 = pergunta15;
	}
	public String getPergunta15(){
		return this.pergunta15;
	}
	
	public void setResposta15(String resposta15){
		this.resposta15 = resposta15;
	}
	public String getResposta15(){
		return this.resposta15;
	}
	
	public void setResposta_certa_15(String resposta_certa_15){
		this.resposta_certa_15 = resposta_certa_15;
	}
	public String getResposta_certa_15(){
		return this.resposta_certa_15;
	}
	
	public void setConceitos_gerador_de_codigo_e_blockly(String conceitos_gerador_de_codigo_e_blockly){
		this.conceitos_gerador_de_codigo_e_blockly = conceitos_gerador_de_codigo_e_blockly;
	}
	public String getConceitos_gerador_de_codigo_e_blockly(){
		return this.conceitos_gerador_de_codigo_e_blockly;
	}
	
	public void setPergunta_16_sep(String pergunta_16_sep){
		this.pergunta_16_sep = pergunta_16_sep;
	}
	public String getPergunta_16_sep(){
		return this.pergunta_16_sep;
	}
	
	public void setPergunta16(String pergunta16){
		this.pergunta16 = pergunta16;
	}
	public String getPergunta16(){
		return this.pergunta16;
	}
	
	public void setResposta16(String resposta16){
		this.resposta16 = resposta16;
	}
	public String getResposta16(){
		return this.resposta16;
	}
	
	public void setResposta_certa_16(String resposta_certa_16){
		this.resposta_certa_16 = resposta_certa_16;
	}
	public String getResposta_certa_16(){
		return this.resposta_certa_16;
	}
	
	public void setPergunta_17_sep(String pergunta_17_sep){
		this.pergunta_17_sep = pergunta_17_sep;
	}
	public String getPergunta_17_sep(){
		return this.pergunta_17_sep;
	}
	
	public void setPergunta17(String pergunta17){
		this.pergunta17 = pergunta17;
	}
	public String getPergunta17(){
		return this.pergunta17;
	}
	
	public void setResposta17(String resposta17){
		this.resposta17 = resposta17;
	}
	public String getResposta17(){
		return this.resposta17;
	}
	
	public void setResposta_certa_17(String resposta_certa_17){
		this.resposta_certa_17 = resposta_certa_17;
	}
	public String getResposta_certa_17(){
		return this.resposta_certa_17;
	}
	
	public void setPergunta_18_sep(String pergunta_18_sep){
		this.pergunta_18_sep = pergunta_18_sep;
	}
	public String getPergunta_18_sep(){
		return this.pergunta_18_sep;
	}
	
	public void setPergunta18(String pergunta18){
		this.pergunta18 = pergunta18;
	}
	public String getPergunta18(){
		return this.pergunta18;
	}
	
	public void setResposta18(String resposta18){
		this.resposta18 = resposta18;
	}
	public String getResposta18(){
		return this.resposta18;
	}
	
	public void setResposta_certa_18(String resposta_certa_18){
		this.resposta_certa_18 = resposta_certa_18;
	}
	public String getResposta_certa_18(){
		return this.resposta_certa_18;
	}
	
	public void setPergunta_19_sep(String pergunta_19_sep){
		this.pergunta_19_sep = pergunta_19_sep;
	}
	public String getPergunta_19_sep(){
		return this.pergunta_19_sep;
	}
	
	public void setPergunta19(String pergunta19){
		this.pergunta19 = pergunta19;
	}
	public String getPergunta19(){
		return this.pergunta19;
	}
	
	public void setResposta19(String resposta19){
		this.resposta19 = resposta19;
	}
	public String getResposta19(){
		return this.resposta19;
	}
	
	public void setResposta_certa_19(String resposta_certa_19){
		this.resposta_certa_19 = resposta_certa_19;
	}
	public String getResposta_certa_19(){
		return this.resposta_certa_19;
	}
	
	public void setPergunta_20sep(String pergunta_20sep){
		this.pergunta_20sep = pergunta_20sep;
	}
	public String getPergunta_20sep(){
		return this.pergunta_20sep;
	}
	
	public void setPergunta20(String pergunta20){
		this.pergunta20 = pergunta20;
	}
	public String getPergunta20(){
		return this.pergunta20;
	}
	
	public void setResposta20(String resposta20){
		this.resposta20 = resposta20;
	}
	public String getResposta20(){
		return this.resposta20;
	}
	
	public void setResposta_certa_20(String resposta_certa_20){
		this.resposta_certa_20 = resposta_certa_20;
	}
	public String getResposta_certa_20(){
		return this.resposta_certa_20;
	}
	
	public void setConceitos_de_eclipse_e_git(String conceitos_de_eclipse_e_git){
		this.conceitos_de_eclipse_e_git = conceitos_de_eclipse_e_git;
	}
	public String getConceitos_de_eclipse_e_git(){
		return this.conceitos_de_eclipse_e_git;
	}
	
	public void setPergunta_21_sep(String pergunta_21_sep){
		this.pergunta_21_sep = pergunta_21_sep;
	}
	public String getPergunta_21_sep(){
		return this.pergunta_21_sep;
	}
	
	public void setPergunta21(String pergunta21){
		this.pergunta21 = pergunta21;
	}
	public String getPergunta21(){
		return this.pergunta21;
	}
	
	public void setResposta21(String resposta21){
		this.resposta21 = resposta21;
	}
	public String getResposta21(){
		return this.resposta21;
	}
	
	public void setRespsota_certa_21(String respsota_certa_21){
		this.respsota_certa_21 = respsota_certa_21;
	}
	public String getRespsota_certa_21(){
		return this.respsota_certa_21;
	}
	
	public void setPergunta_22_sep(String pergunta_22_sep){
		this.pergunta_22_sep = pergunta_22_sep;
	}
	public String getPergunta_22_sep(){
		return this.pergunta_22_sep;
	}
	
	public void setPergunta22(String pergunta22){
		this.pergunta22 = pergunta22;
	}
	public String getPergunta22(){
		return this.pergunta22;
	}
	
	public void setResposta22(String resposta22){
		this.resposta22 = resposta22;
	}
	public String getResposta22(){
		return this.resposta22;
	}
	
	public void setRespsota_certa_22(String respsota_certa_22){
		this.respsota_certa_22 = respsota_certa_22;
	}
	public String getRespsota_certa_22(){
		return this.respsota_certa_22;
	}
	
	public void setPergunta_23_sep(String pergunta_23_sep){
		this.pergunta_23_sep = pergunta_23_sep;
	}
	public String getPergunta_23_sep(){
		return this.pergunta_23_sep;
	}
	
	public void setPergunta23(String pergunta23){
		this.pergunta23 = pergunta23;
	}
	public String getPergunta23(){
		return this.pergunta23;
	}
	
	public void setResposta23(String resposta23){
		this.resposta23 = resposta23;
	}
	public String getResposta23(){
		return this.resposta23;
	}
	
	public void setResposta_certa_23(String resposta_certa_23){
		this.resposta_certa_23 = resposta_certa_23;
	}
	public String getResposta_certa_23(){
		return this.resposta_certa_23;
	}
	
	public void setPergunta_24_sep(String pergunta_24_sep){
		this.pergunta_24_sep = pergunta_24_sep;
	}
	public String getPergunta_24_sep(){
		return this.pergunta_24_sep;
	}
	
	public void setPergunta24(String pergunta24){
		this.pergunta24 = pergunta24;
	}
	public String getPergunta24(){
		return this.pergunta24;
	}
	
	public void setResposta24(String resposta24){
		this.resposta24 = resposta24;
	}
	public String getResposta24(){
		return this.resposta24;
	}
	
	public void setResposta_certa_24(String resposta_certa_24){
		this.resposta_certa_24 = resposta_certa_24;
	}
	public String getResposta_certa_24(){
		return this.resposta_certa_24;
	}
	
	public void setPergunta_25_sep(String pergunta_25_sep){
		this.pergunta_25_sep = pergunta_25_sep;
	}
	public String getPergunta_25_sep(){
		return this.pergunta_25_sep;
	}
	
	public void setPergunta25(String pergunta25){
		this.pergunta25 = pergunta25;
	}
	public String getPergunta25(){
		return this.pergunta25;
	}
	
	public void setResposta25(String resposta25){
		this.resposta25 = resposta25;
	}
	public String getResposta25(){
		return this.resposta25;
	}
	
	public void setResposta_certa_25(String resposta_certa_25){
		this.resposta_certa_25 = resposta_certa_25;
	}
	public String getResposta_certa_25(){
		return this.resposta_certa_25;
	}
	
	public void setConceitos_de_base_de_dados_e_dao(String conceitos_de_base_de_dados_e_dao){
		this.conceitos_de_base_de_dados_e_dao = conceitos_de_base_de_dados_e_dao;
	}
	public String getConceitos_de_base_de_dados_e_dao(){
		return this.conceitos_de_base_de_dados_e_dao;
	}
	
	public void setPergunta_26_sep(String pergunta_26_sep){
		this.pergunta_26_sep = pergunta_26_sep;
	}
	public String getPergunta_26_sep(){
		return this.pergunta_26_sep;
	}
	
	public void setPergunta26(String pergunta26){
		this.pergunta26 = pergunta26;
	}
	public String getPergunta26(){
		return this.pergunta26;
	}
	
	public void setResposta26(String resposta26){
		this.resposta26 = resposta26;
	}
	public String getResposta26(){
		return this.resposta26;
	}
	
	public void setResposta_certa_26(String resposta_certa_26){
		this.resposta_certa_26 = resposta_certa_26;
	}
	public String getResposta_certa_26(){
		return this.resposta_certa_26;
	}
	
	public void setPergunta_27_sep(String pergunta_27_sep){
		this.pergunta_27_sep = pergunta_27_sep;
	}
	public String getPergunta_27_sep(){
		return this.pergunta_27_sep;
	}
	
	public void setPergunta27(String pergunta27){
		this.pergunta27 = pergunta27;
	}
	public String getPergunta27(){
		return this.pergunta27;
	}
	
	public void setResposta27(String resposta27){
		this.resposta27 = resposta27;
	}
	public String getResposta27(){
		return this.resposta27;
	}
	
	public void setResposta_certa_27(String resposta_certa_27){
		this.resposta_certa_27 = resposta_certa_27;
	}
	public String getResposta_certa_27(){
		return this.resposta_certa_27;
	}
	
	public void setPergunta_28_sep(String pergunta_28_sep){
		this.pergunta_28_sep = pergunta_28_sep;
	}
	public String getPergunta_28_sep(){
		return this.pergunta_28_sep;
	}
	
	public void setPergunta28(String pergunta28){
		this.pergunta28 = pergunta28;
	}
	public String getPergunta28(){
		return this.pergunta28;
	}
	
	public void setResposta28(String resposta28){
		this.resposta28 = resposta28;
	}
	public String getResposta28(){
		return this.resposta28;
	}
	
	public void setResposta_certa_28(String resposta_certa_28){
		this.resposta_certa_28 = resposta_certa_28;
	}
	public String getResposta_certa_28(){
		return this.resposta_certa_28;
	}
	
	public void setPergunta_29_sep(String pergunta_29_sep){
		this.pergunta_29_sep = pergunta_29_sep;
	}
	public String getPergunta_29_sep(){
		return this.pergunta_29_sep;
	}
	
	public void setPergunta29(String pergunta29){
		this.pergunta29 = pergunta29;
	}
	public String getPergunta29(){
		return this.pergunta29;
	}
	
	public void setResposta29(String resposta29){
		this.resposta29 = resposta29;
	}
	public String getResposta29(){
		return this.resposta29;
	}
	
	public void setResposta_certa_29(String resposta_certa_29){
		this.resposta_certa_29 = resposta_certa_29;
	}
	public String getResposta_certa_29(){
		return this.resposta_certa_29;
	}
	
	public void setPergunta_30_sep(String pergunta_30_sep){
		this.pergunta_30_sep = pergunta_30_sep;
	}
	public String getPergunta_30_sep(){
		return this.pergunta_30_sep;
	}
	
	public void setPergunta30(String pergunta30){
		this.pergunta30 = pergunta30;
	}
	public String getPergunta30(){
		return this.pergunta30;
	}
	
	public void setResposta30(String resposta30){
		this.resposta30 = resposta30;
	}
	public String getResposta30(){
		return this.resposta30;
	}
	
	public void setResposta_certa_30(String resposta_certa_30){
		this.resposta_certa_30 = resposta_certa_30;
	}
	public String getResposta_certa_30(){
		return this.resposta_certa_30;
	}
	
	public void setConceitos_de_java(String conceitos_de_java){
		this.conceitos_de_java = conceitos_de_java;
	}
	public String getConceitos_de_java(){
		return this.conceitos_de_java;
	}
	
	public void setPergunta_31_sep(String pergunta_31_sep){
		this.pergunta_31_sep = pergunta_31_sep;
	}
	public String getPergunta_31_sep(){
		return this.pergunta_31_sep;
	}
	
	public void setPergunta31(String pergunta31){
		this.pergunta31 = pergunta31;
	}
	public String getPergunta31(){
		return this.pergunta31;
	}
	
	public void setResposta31(String resposta31){
		this.resposta31 = resposta31;
	}
	public String getResposta31(){
		return this.resposta31;
	}
	
	public void setResposta_certa_31(String resposta_certa_31){
		this.resposta_certa_31 = resposta_certa_31;
	}
	public String getResposta_certa_31(){
		return this.resposta_certa_31;
	}
	
	public void setPergunta_32_sep(String pergunta_32_sep){
		this.pergunta_32_sep = pergunta_32_sep;
	}
	public String getPergunta_32_sep(){
		return this.pergunta_32_sep;
	}
	
	public void setPergunta32(String pergunta32){
		this.pergunta32 = pergunta32;
	}
	public String getPergunta32(){
		return this.pergunta32;
	}
	
	public void setResposta32(String resposta32){
		this.resposta32 = resposta32;
	}
	public String getResposta32(){
		return this.resposta32;
	}
	
	public void setResposta_certa_32(String resposta_certa_32){
		this.resposta_certa_32 = resposta_certa_32;
	}
	public String getResposta_certa_32(){
		return this.resposta_certa_32;
	}
	
	public void setPergunta_33_sep(String pergunta_33_sep){
		this.pergunta_33_sep = pergunta_33_sep;
	}
	public String getPergunta_33_sep(){
		return this.pergunta_33_sep;
	}
	
	public void setPergunta33(String pergunta33){
		this.pergunta33 = pergunta33;
	}
	public String getPergunta33(){
		return this.pergunta33;
	}
	
	public void setResposta33(String resposta33){
		this.resposta33 = resposta33;
	}
	public String getResposta33(){
		return this.resposta33;
	}
	
	public void setResposta_certa_33(String resposta_certa_33){
		this.resposta_certa_33 = resposta_certa_33;
	}
	public String getResposta_certa_33(){
		return this.resposta_certa_33;
	}
	
	public void setPerungta_34_sep(String perungta_34_sep){
		this.perungta_34_sep = perungta_34_sep;
	}
	public String getPerungta_34_sep(){
		return this.perungta_34_sep;
	}
	
	public void setPergunta34(String pergunta34){
		this.pergunta34 = pergunta34;
	}
	public String getPergunta34(){
		return this.pergunta34;
	}
	
	public void setResposta34(String resposta34){
		this.resposta34 = resposta34;
	}
	public String getResposta34(){
		return this.resposta34;
	}
	
	public void setResposta_certa_34(String resposta_certa_34){
		this.resposta_certa_34 = resposta_certa_34;
	}
	public String getResposta_certa_34(){
		return this.resposta_certa_34;
	}
	
	public void setPerungta_35_sep(String perungta_35_sep){
		this.perungta_35_sep = perungta_35_sep;
	}
	public String getPerungta_35_sep(){
		return this.perungta_35_sep;
	}
	
	public void setPergunta35(String pergunta35){
		this.pergunta35 = pergunta35;
	}
	public String getPergunta35(){
		return this.pergunta35;
	}
	
	public void setResposta35(String resposta35){
		this.resposta35 = resposta35;
	}
	public String getResposta35(){
		return this.resposta35;
	}
	
	public void setResposta_certa_35(String resposta_certa_35){
		this.resposta_certa_35 = resposta_certa_35;
	}
	public String getResposta_certa_35(){
		return this.resposta_certa_35;
	}
	
	public void setConceitos_de_gestao_de_acessos(String conceitos_de_gestao_de_acessos){
		this.conceitos_de_gestao_de_acessos = conceitos_de_gestao_de_acessos;
	}
	public String getConceitos_de_gestao_de_acessos(){
		return this.conceitos_de_gestao_de_acessos;
	}
	
	public void setPergunta_36_sep(String pergunta_36_sep){
		this.pergunta_36_sep = pergunta_36_sep;
	}
	public String getPergunta_36_sep(){
		return this.pergunta_36_sep;
	}
	
	public void setPergunta_36(String pergunta_36){
		this.pergunta_36 = pergunta_36;
	}
	public String getPergunta_36(){
		return this.pergunta_36;
	}
	
	public void setResposta36(String resposta36){
		this.resposta36 = resposta36;
	}
	public String getResposta36(){
		return this.resposta36;
	}
	
	public void setResposta_certa_36(String resposta_certa_36){
		this.resposta_certa_36 = resposta_certa_36;
	}
	public String getResposta_certa_36(){
		return this.resposta_certa_36;
	}
	
	public void setPergunta_37_sep(String pergunta_37_sep){
		this.pergunta_37_sep = pergunta_37_sep;
	}
	public String getPergunta_37_sep(){
		return this.pergunta_37_sep;
	}
	
	public void setPergunta_37(String pergunta_37){
		this.pergunta_37 = pergunta_37;
	}
	public String getPergunta_37(){
		return this.pergunta_37;
	}
	
	public void setResposta37(String resposta37){
		this.resposta37 = resposta37;
	}
	public String getResposta37(){
		return this.resposta37;
	}
	
	public void setResposta_certa_37(String resposta_certa_37){
		this.resposta_certa_37 = resposta_certa_37;
	}
	public String getResposta_certa_37(){
		return this.resposta_certa_37;
	}
	
	public void setPergunta_38_sep(String pergunta_38_sep){
		this.pergunta_38_sep = pergunta_38_sep;
	}
	public String getPergunta_38_sep(){
		return this.pergunta_38_sep;
	}
	
	public void setPergunta_38(String pergunta_38){
		this.pergunta_38 = pergunta_38;
	}
	public String getPergunta_38(){
		return this.pergunta_38;
	}
	
	public void setResposta38(String resposta38){
		this.resposta38 = resposta38;
	}
	public String getResposta38(){
		return this.resposta38;
	}
	
	public void setResposta_certa_38(String resposta_certa_38){
		this.resposta_certa_38 = resposta_certa_38;
	}
	public String getResposta_certa_38(){
		return this.resposta_certa_38;
	}
	
	public void setPergunta_39_sep(String pergunta_39_sep){
		this.pergunta_39_sep = pergunta_39_sep;
	}
	public String getPergunta_39_sep(){
		return this.pergunta_39_sep;
	}
	
	public void setPergunta_39(String pergunta_39){
		this.pergunta_39 = pergunta_39;
	}
	public String getPergunta_39(){
		return this.pergunta_39;
	}
	
	public void setResposta39(String resposta39){
		this.resposta39 = resposta39;
	}
	public String getResposta39(){
		return this.resposta39;
	}
	
	public void setResposta_certa_39(String resposta_certa_39){
		this.resposta_certa_39 = resposta_certa_39;
	}
	public String getResposta_certa_39(){
		return this.resposta_certa_39;
	}
	
	public void setPergunta_40_sep(String pergunta_40_sep){
		this.pergunta_40_sep = pergunta_40_sep;
	}
	public String getPergunta_40_sep(){
		return this.pergunta_40_sep;
	}
	
	public void setPergunta_40(String pergunta_40){
		this.pergunta_40 = pergunta_40;
	}
	public String getPergunta_40(){
		return this.pergunta_40;
	}
	
	public void setResposta40(String resposta40){
		this.resposta40 = resposta40;
	}
	public String getResposta40(){
		return this.resposta40;
	}
	
	public void setResposta_certa_40(String resposta_certa_40){
		this.resposta_certa_40 = resposta_certa_40;
	}
	public String getResposta_certa_40(){
		return this.resposta_certa_40;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	public String getNivel(){
		return this.nivel;
	}
	
	public void setId_teste(String id_teste){
		this.id_teste = id_teste;
	}
	public String getId_teste(){
		return this.id_teste;
	}
	
	public void setStatbox_1_title(String statbox_1_title){
		this.statbox_1_title = statbox_1_title;
	}
	public String getStatbox_1_title(){
		return this.statbox_1_title;
	}
	
	public void setStatbox_1_val(String statbox_1_val){
		this.statbox_1_val = statbox_1_val;
	}
	public String getStatbox_1_val(){
		return this.statbox_1_val;
	}
	
	public void setStatbox_1_txt(String statbox_1_txt){
		this.statbox_1_txt = statbox_1_txt;
	}
	public String getStatbox_1_txt(){
		return this.statbox_1_txt;
	}
	
	public void setStatbox_1_url(String statbox_1_url){
		this.statbox_1_url = statbox_1_url;
	}
	public String getStatbox_1_url(){
		return this.statbox_1_url;
	}
	
	public void setStatbox_1_bg(String statbox_1_bg){
		this.statbox_1_bg = statbox_1_bg;
	}
	public String getStatbox_1_bg(){
		return this.statbox_1_bg;
	}
	
	public void setStatbox_1_icn(String statbox_1_icn){
		this.statbox_1_icn = statbox_1_icn;
	}
	public String getStatbox_1_icn(){
		return this.statbox_1_icn;
	}
	
	public void setStatbox_2_title(String statbox_2_title){
		this.statbox_2_title = statbox_2_title;
	}
	public String getStatbox_2_title(){
		return this.statbox_2_title;
	}
	
	public void setStatbox_2_val(String statbox_2_val){
		this.statbox_2_val = statbox_2_val;
	}
	public String getStatbox_2_val(){
		return this.statbox_2_val;
	}
	
	public void setStatbox_2_txt(String statbox_2_txt){
		this.statbox_2_txt = statbox_2_txt;
	}
	public String getStatbox_2_txt(){
		return this.statbox_2_txt;
	}
	
	public void setStatbox_2_url(String statbox_2_url){
		this.statbox_2_url = statbox_2_url;
	}
	public String getStatbox_2_url(){
		return this.statbox_2_url;
	}
	
	public void setStatbox_2_bg(String statbox_2_bg){
		this.statbox_2_bg = statbox_2_bg;
	}
	public String getStatbox_2_bg(){
		return this.statbox_2_bg;
	}
	
	public void setStatbox_2_icn(String statbox_2_icn){
		this.statbox_2_icn = statbox_2_icn;
	}
	public String getStatbox_2_icn(){
		return this.statbox_2_icn;
	}


	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

}
