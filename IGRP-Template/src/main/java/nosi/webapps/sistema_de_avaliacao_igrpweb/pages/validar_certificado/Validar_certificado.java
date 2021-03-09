package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.validar_certificado;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Validar_certificado extends Model{		

	@RParam(rParamName = "p_contra_prova")
	private String contra_prova;

	@RParam(rParamName = "p_iframe_1_src")
	private String iframe_1_src;
	
	public void setContra_prova(String contra_prova){
		this.contra_prova = contra_prova;
	}
	public String getContra_prova(){
		return this.contra_prova;
	}
	
	public void setIframe_1_src(String iframe_1_src){
		this.iframe_1_src = iframe_1_src;
	}
	public String getIframe_1_src(){
		return this.iframe_1_src;
	}



}
