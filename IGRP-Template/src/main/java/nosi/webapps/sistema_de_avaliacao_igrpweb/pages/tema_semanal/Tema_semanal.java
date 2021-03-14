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



}
