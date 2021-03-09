package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.tema_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Tema_semanal extends Model{		

	@NotNull()
	@RParam(rParamName = "p_area")
	private String area;

	@NotNull()
	@RParam(rParamName = "p_mentor")
	private String mentor;

	@NotNull()
	@RParam(rParamName = "p_tema_semanal")
	private String tema_semanal;

	@NotNull()
	@RParam(rParamName = "p_nr_semana")
	private Integer nr_semana;

	@RParam(rParamName = "p_id_avaliado")
	private String id_avaliado;
	
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
	
	public void setTema_semanal(String tema_semanal){
		this.tema_semanal = tema_semanal;
	}
	public String getTema_semanal(){
		return this.tema_semanal;
	}
	
	public void setNr_semana(Integer nr_semana){
		this.nr_semana = nr_semana;
	}
	public Integer getNr_semana(){
		return this.nr_semana;
	}
	
	public void setId_avaliado(String id_avaliado){
		this.id_avaliado = id_avaliado;
	}
	public String getId_avaliado(){
		return this.id_avaliado;
	}



}
