package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_de_inscricao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Formulario_de_inscricao extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_foto")
	private String foto;
	@RParam(rParamName = "p_foto_uuid")
	private String foto_uuid;

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_ilha_natural")
	private String ilha_natural;

	@RParam(rParamName = "p_edicao_de_nosiakademia")
	private String edicao_de_nosiakademia;

	@RParam(rParamName = "p_formacao")
	private String formacao;

	@RParam(rParamName = "p_outra_formacao")
	private String outra_formacao;

	@RParam(rParamName = "p_universidade")
	private String universidade;

	@RParam(rParamName = "p_outra_universidade")
	private String outra_universidade;

	@NotNull()
	@RParam(rParamName = "p_formador")
	private String formador;

	@RParam(rParamName = "p_contacto")
	private Integer contacto;

	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_nivel")
	private String nivel;

	@NotNull()
	@RParam(rParamName = "p_horas")
	private Integer horas;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setFoto(String foto){
		this.foto = foto;
	}
	public String getFoto(){
		return this.foto;
	}
	public void setFoto_uuid(String foto_uuid){
		this.foto_uuid = foto_uuid;
	}
	public String getFoto_uuid(){
		return this.foto_uuid;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setIlha_natural(String ilha_natural){
		this.ilha_natural = ilha_natural;
	}
	public String getIlha_natural(){
		return this.ilha_natural;
	}
	
	public void setEdicao_de_nosiakademia(String edicao_de_nosiakademia){
		this.edicao_de_nosiakademia = edicao_de_nosiakademia;
	}
	public String getEdicao_de_nosiakademia(){
		return this.edicao_de_nosiakademia;
	}
	
	public void setFormacao(String formacao){
		this.formacao = formacao;
	}
	public String getFormacao(){
		return this.formacao;
	}
	
	public void setOutra_formacao(String outra_formacao){
		this.outra_formacao = outra_formacao;
	}
	public String getOutra_formacao(){
		return this.outra_formacao;
	}
	
	public void setUniversidade(String universidade){
		this.universidade = universidade;
	}
	public String getUniversidade(){
		return this.universidade;
	}
	
	public void setOutra_universidade(String outra_universidade){
		this.outra_universidade = outra_universidade;
	}
	public String getOutra_universidade(){
		return this.outra_universidade;
	}
	
	public void setFormador(String formador){
		this.formador = formador;
	}
	public String getFormador(){
		return this.formador;
	}
	
	public void setContacto(Integer contacto){
		this.contacto = contacto;
	}
	public Integer getContacto(){
		return this.contacto;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	public String getNivel(){
		return this.nivel;
	}
	
	public void setHoras(Integer horas){
		this.horas = horas;
	}
	public Integer getHoras(){
		return this.horas;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}



}
