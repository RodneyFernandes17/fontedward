package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Tema_semanal extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_mentor")
	private String mentor;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@NotNull()
	@RParam(rParamName = "p_tema_semanal")
	private String tema_semanal;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;

	@RParam(rParamName = "p_id_semana")
	private int id_semana;

	@RParam(rParamName = "p_positivo_title")
	private String positivo_title;

	@RParam(rParamName = "p_positivo_val")
	private String positivo_val;

	@RParam(rParamName = "p_positivo_txt")
	private String positivo_txt;

	@RParam(rParamName = "p_positivo_url")
	private String positivo_url;

	@RParam(rParamName = "p_positivo_bg")
	private String positivo_bg;

	@RParam(rParamName = "p_positivo_icn")
	private String positivo_icn;

	@RParam(rParamName = "p_negativo_title")
	private String negativo_title;

	@RParam(rParamName = "p_negativo_val")
	private String negativo_val;

	@RParam(rParamName = "p_negativo_txt")
	private String negativo_txt;

	@RParam(rParamName = "p_negativo_url")
	private String negativo_url;

	@RParam(rParamName = "p_negativo_bg")
	private String negativo_bg;

	@RParam(rParamName = "p_negativo_icn")
	private String negativo_icn;
	
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
	
	public void setTema_semanal(String tema_semanal){
		this.tema_semanal = tema_semanal;
	}
	public String getTema_semanal(){
		return this.tema_semanal;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}
	
	public void setId_semana(int id_semana){
		this.id_semana = id_semana;
	}
	public int getId_semana(){
		return this.id_semana;
	}
	
	public void setPositivo_title(String positivo_title){
		this.positivo_title = positivo_title;
	}
	public String getPositivo_title(){
		return this.positivo_title;
	}
	
	public void setPositivo_val(String positivo_val){
		this.positivo_val = positivo_val;
	}
	public String getPositivo_val(){
		return this.positivo_val;
	}
	
	public void setPositivo_txt(String positivo_txt){
		this.positivo_txt = positivo_txt;
	}
	public String getPositivo_txt(){
		return this.positivo_txt;
	}
	
	public void setPositivo_url(String positivo_url){
		this.positivo_url = positivo_url;
	}
	public String getPositivo_url(){
		return this.positivo_url;
	}
	
	public void setPositivo_bg(String positivo_bg){
		this.positivo_bg = positivo_bg;
	}
	public String getPositivo_bg(){
		return this.positivo_bg;
	}
	
	public void setPositivo_icn(String positivo_icn){
		this.positivo_icn = positivo_icn;
	}
	public String getPositivo_icn(){
		return this.positivo_icn;
	}
	
	public void setNegativo_title(String negativo_title){
		this.negativo_title = negativo_title;
	}
	public String getNegativo_title(){
		return this.negativo_title;
	}
	
	public void setNegativo_val(String negativo_val){
		this.negativo_val = negativo_val;
	}
	public String getNegativo_val(){
		return this.negativo_val;
	}
	
	public void setNegativo_txt(String negativo_txt){
		this.negativo_txt = negativo_txt;
	}
	public String getNegativo_txt(){
		return this.negativo_txt;
	}
	
	public void setNegativo_url(String negativo_url){
		this.negativo_url = negativo_url;
	}
	public String getNegativo_url(){
		return this.negativo_url;
	}
	
	public void setNegativo_bg(String negativo_bg){
		this.negativo_bg = negativo_bg;
	}
	public String getNegativo_bg(){
		return this.negativo_bg;
	}
	
	public void setNegativo_icn(String negativo_icn){
		this.negativo_icn = negativo_icn;
	}
	public String getNegativo_icn(){
		return this.negativo_icn;
	}



}
