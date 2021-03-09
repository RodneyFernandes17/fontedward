package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.certificado_imagens;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.uploadfile.UploadFile;

public class Certificado_imagens extends Model{		

	@RParam(rParamName = "p_fundo")
	private UploadFile fundo;

	@RParam(rParamName = "p_logo")
	private UploadFile logo;

	@RParam(rParamName = "p_fundo_view")
	private String fundo_view;
	@RParam(rParamName = "p_fundo_view_uuid")
	private String fundo_view_uuid;

	@RParam(rParamName = "p_logo_view")
	private String logo_view;
	@RParam(rParamName = "p_logo_view_uuid")
	private String logo_view_uuid;
	
	public void setFundo(UploadFile fundo){
		this.fundo = fundo;
	}
	public UploadFile getFundo(){
		return this.fundo;
	}
	
	public void setLogo(UploadFile logo){
		this.logo = logo;
	}
	public UploadFile getLogo(){
		return this.logo;
	}
	
	public void setFundo_view(String fundo_view){
		this.fundo_view = fundo_view;
	}
	public String getFundo_view(){
		return this.fundo_view;
	}
	public void setFundo_view_uuid(String fundo_view_uuid){
		this.fundo_view_uuid = fundo_view_uuid;
	}
	public String getFundo_view_uuid(){
		return this.fundo_view_uuid;
	}
	
	public void setLogo_view(String logo_view){
		this.logo_view = logo_view;
	}
	public String getLogo_view(){
		return this.logo_view;
	}
	public void setLogo_view_uuid(String logo_view_uuid){
		this.logo_view_uuid = logo_view_uuid;
	}
	public String getLogo_view_uuid(){
		return this.logo_view_uuid;
	}



}
