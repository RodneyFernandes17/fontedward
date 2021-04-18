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

	@RParam(rParamName = "p_titulo")
	private String titulo;

	@RParam(rParamName = "p_data")
	private String data;

	@RParam(rParamName = "p_chave_de_validacao")
	private String chave_de_validacao;

	@RParam(rParamName = "p_callback_url")
	private String callback_url;

	@RParam(rParamName = "p_texto_1")
	private String texto_1;

	@RParam(rParamName = "p_texto_2")
	private String texto_2;

	@RParam(rParamName = "p_texto_3")
	private String texto_3;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;

	@RParam(rParamName = "p_fundo")
	private String fundo;
	@RParam(rParamName = "p_fundo_uuid")
	private String fundo_uuid;

	@RParam(rParamName = "p_logo")
	private String logo;
	@RParam(rParamName = "p_logo_uuid")
	private String logo_uuid;
	
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
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return this.titulo;
	}
	
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
	
	public void setChave_de_validacao(String chave_de_validacao){
		this.chave_de_validacao = chave_de_validacao;
	}
	public String getChave_de_validacao(){
		return this.chave_de_validacao;
	}
	
	public void setCallback_url(String callback_url){
		this.callback_url = callback_url;
	}
	public String getCallback_url(){
		return this.callback_url;
	}
	
	public void setTexto_1(String texto_1){
		this.texto_1 = texto_1;
	}
	public String getTexto_1(){
		return this.texto_1;
	}
	
	public void setTexto_2(String texto_2){
		this.texto_2 = texto_2;
	}
	public String getTexto_2(){
		return this.texto_2;
	}
	
	public void setTexto_3(String texto_3){
		this.texto_3 = texto_3;
	}
	public String getTexto_3(){
		return this.texto_3;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}
	
	public void setFundo(String fundo){
		this.fundo = fundo;
	}
	public String getFundo(){
		return this.fundo;
	}
	public void setFundo_uuid(String fundo_uuid){
		this.fundo_uuid = fundo_uuid;
	}
	public String getFundo_uuid(){
		return this.fundo_uuid;
	}
	
	public void setLogo(String logo){
		this.logo = logo;
	}
	public String getLogo(){
		return this.logo;
	}
	public void setLogo_uuid(String logo_uuid){
		this.logo_uuid = logo_uuid;
	}
	public String getLogo_uuid(){
		return this.logo_uuid;
	}



}
