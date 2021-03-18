package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.ver_observacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ver_observacao extends Model{		

	@RParam(rParamName = "p_oservacao")
	private String oservacao;

	@RParam(rParamName = "p_avaliador")
	private String avaliador;
	
	public void setOservacao(String oservacao){
		this.oservacao = oservacao;
	}
	public String getOservacao(){
		return this.oservacao;
	}
	
	public void setAvaliador(String avaliador){
		this.avaliador = avaliador;
	}
	public String getAvaliador(){
		return this.avaliador;
	}



}
