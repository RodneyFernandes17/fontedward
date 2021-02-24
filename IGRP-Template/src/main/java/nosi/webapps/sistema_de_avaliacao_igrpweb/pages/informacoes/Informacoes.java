package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.informacoes;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Informacoes extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_teste_nivel")
	private String teste_nivel;

	@RParam(rParamName = "p_igrp_studio")
	private String igrp_studio;

	@RParam(rParamName = "p_page_designer")
	private String page_designer;

	@RParam(rParamName = "p_bpmn_e_report_designer")
	private String bpmn_e_report_designer;

	@RParam(rParamName = "p_gerador_de_codigo_e_blockly")
	private String gerador_de_codigo_e_blockly;

	@RParam(rParamName = "p_eclipse_e_git")
	private String eclipse_e_git;

	@RParam(rParamName = "p_base_de_dados_e_dao")
	private String base_de_dados_e_dao;

	@RParam(rParamName = "p_java")
	private String java;

	@RParam(rParamName = "p_gestao_de_acessos")
	private String gestao_de_acessos;

	@RParam(rParamName = "p_classificacao")
	private String classificacao;

	@RParam(rParamName = "p_id_teste")
	private String id_teste;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setTeste_nivel(String teste_nivel){
		this.teste_nivel = teste_nivel;
	}
	public String getTeste_nivel(){
		return this.teste_nivel;
	}
	
	public void setIgrp_studio(String igrp_studio){
		this.igrp_studio = igrp_studio;
	}
	public String getIgrp_studio(){
		return this.igrp_studio;
	}
	
	public void setPage_designer(String page_designer){
		this.page_designer = page_designer;
	}
	public String getPage_designer(){
		return this.page_designer;
	}
	
	public void setBpmn_e_report_designer(String bpmn_e_report_designer){
		this.bpmn_e_report_designer = bpmn_e_report_designer;
	}
	public String getBpmn_e_report_designer(){
		return this.bpmn_e_report_designer;
	}
	
	public void setGerador_de_codigo_e_blockly(String gerador_de_codigo_e_blockly){
		this.gerador_de_codigo_e_blockly = gerador_de_codigo_e_blockly;
	}
	public String getGerador_de_codigo_e_blockly(){
		return this.gerador_de_codigo_e_blockly;
	}
	
	public void setEclipse_e_git(String eclipse_e_git){
		this.eclipse_e_git = eclipse_e_git;
	}
	public String getEclipse_e_git(){
		return this.eclipse_e_git;
	}
	
	public void setBase_de_dados_e_dao(String base_de_dados_e_dao){
		this.base_de_dados_e_dao = base_de_dados_e_dao;
	}
	public String getBase_de_dados_e_dao(){
		return this.base_de_dados_e_dao;
	}
	
	public void setJava(String java){
		this.java = java;
	}
	public String getJava(){
		return this.java;
	}
	
	public void setGestao_de_acessos(String gestao_de_acessos){
		this.gestao_de_acessos = gestao_de_acessos;
	}
	public String getGestao_de_acessos(){
		return this.gestao_de_acessos;
	}
	
	public void setClassificacao(String classificacao){
		this.classificacao = classificacao;
	}
	public String getClassificacao(){
		return this.classificacao;
	}
	
	public void setId_teste(String id_teste){
		this.id_teste = id_teste;
	}
	public String getId_teste(){
		return this.id_teste;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}



}
