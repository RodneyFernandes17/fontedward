package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_de_certificado;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Criacao_de_certificado extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_foto")
	private String foto;
	@RParam(rParamName = "p_foto_uuid")
	private String foto_uuid;

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_avaliador")
	private String avaliador;

	@RParam(rParamName = "p_chave_de_validacao")
	private String chave_de_validacao;

	@RParam(rParamName = "p_horas_de_formacao")
	private Integer horas_de_formacao;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;
	
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
	
	public void setAvaliador(String avaliador){
		this.avaliador = avaliador;
	}
	public String getAvaliador(){
		return this.avaliador;
	}
	
	public void setChave_de_validacao(String chave_de_validacao){
		this.chave_de_validacao = chave_de_validacao;
	}
	public String getChave_de_validacao(){
		return this.chave_de_validacao;
	}
	
	public void setHoras_de_formacao(Integer horas_de_formacao){
		this.horas_de_formacao = horas_de_formacao;
	}
	public Integer getHoras_de_formacao(){
		return this.horas_de_formacao;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}



}
