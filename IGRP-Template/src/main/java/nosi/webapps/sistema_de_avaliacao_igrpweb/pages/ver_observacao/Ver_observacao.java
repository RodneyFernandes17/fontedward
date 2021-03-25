package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.ver_observacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ver_observacao extends Model{		

	@RParam(rParamName = "p_avaliador")
	private String avaliador;

	@RParam(rParamName = "p_observacao")
	private String observacao;
	
	public void setAvaliador(String avaliador){
		this.avaliador = avaliador;
	}
	public String getAvaliador(){
		return this.avaliador;
	}
	
	public void setObservacao(String observacao){
		this.observacao = observacao;
	}
	public String getObservacao(){
		return this.observacao;
	}



}
