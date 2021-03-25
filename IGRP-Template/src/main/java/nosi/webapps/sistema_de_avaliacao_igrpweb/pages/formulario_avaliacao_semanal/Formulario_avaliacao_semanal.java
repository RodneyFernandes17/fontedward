package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_avaliacao_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Formulario_avaliacao_semanal extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_mentor")
	private String mentor;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@NotNull()
	@RParam(rParamName = "p_semana")
	private Integer semana;

	@NotNull()
	@RParam(rParamName = "p_tema_semanal")
	private String tema_semanal;

	@RParam(rParamName = "p_form_1_separator_1")
	private String form_1_separator_1;

	@RParam(rParamName = "p_conteudo")
	private Integer conteudo;

	@RParam(rParamName = "p_pontualidade")
	private Integer pontualidade;

	@RParam(rParamName = "p_dominio")
	private Integer dominio;

	@RParam(rParamName = "p_clareza")
	private Integer clareza;

	@RParam(rParamName = "p_proactividade")
	private Integer proactividade;

	@RParam(rParamName = "p_aprendizagem")
	private Integer aprendizagem;

	@RParam(rParamName = "p_tarefas")
	private Integer tarefas;

	@RParam(rParamName = "p_observacoes")
	private String observacoes;

	@NotNull()
	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;

	@RParam(rParamName = "p_id_semanal")
	private String id_semanal;

	@NotNull()
	@RParam(rParamName = "p_id_tema")
	private int id_tema;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	
	public void setMentor(String mentor){
		this.mentor = mentor;
	}
	public String getMentor(){
		return this.mentor;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}
	
	public void setSemana(Integer semana){
		this.semana = semana;
	}
	public Integer getSemana(){
		return this.semana;
	}
	
	public void setTema_semanal(String tema_semanal){
		this.tema_semanal = tema_semanal;
	}
	public String getTema_semanal(){
		return this.tema_semanal;
	}
	
	public void setForm_1_separator_1(String form_1_separator_1){
		this.form_1_separator_1 = form_1_separator_1;
	}
	public String getForm_1_separator_1(){
		return this.form_1_separator_1;
	}
	
	public void setConteudo(Integer conteudo){
		this.conteudo = conteudo;
	}
	public Integer getConteudo(){
		return this.conteudo;
	}
	
	public void setPontualidade(Integer pontualidade){
		this.pontualidade = pontualidade;
	}
	public Integer getPontualidade(){
		return this.pontualidade;
	}
	
	public void setDominio(Integer dominio){
		this.dominio = dominio;
	}
	public Integer getDominio(){
		return this.dominio;
	}
	
	public void setClareza(Integer clareza){
		this.clareza = clareza;
	}
	public Integer getClareza(){
		return this.clareza;
	}
	
	public void setProactividade(Integer proactividade){
		this.proactividade = proactividade;
	}
	public Integer getProactividade(){
		return this.proactividade;
	}
	
	public void setAprendizagem(Integer aprendizagem){
		this.aprendizagem = aprendizagem;
	}
	public Integer getAprendizagem(){
		return this.aprendizagem;
	}
	
	public void setTarefas(Integer tarefas){
		this.tarefas = tarefas;
	}
	public Integer getTarefas(){
		return this.tarefas;
	}
	
	public void setObservacoes(String observacoes){
		this.observacoes = observacoes;
	}
	public String getObservacoes(){
		return this.observacoes;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}
	
	public void setId_semanal(String id_semanal){
		this.id_semanal = id_semanal;
	}
	public String getId_semanal(){
		return this.id_semanal;
	}
	
	public void setId_tema(int id_tema){
		this.id_tema = id_tema;
	}
	public int getId_tema(){
		return this.id_tema;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}



}
