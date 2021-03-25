package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.grafico_evolucao_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Grafico_evolucao_semanal extends Model{		

	@RParam(rParamName = "p_estagiarios")
	private String[] estagiarios;
	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}

	
	public void setEstagiarios(String[] estagiarios){
		this.estagiarios = estagiarios;
	}
	public String[] getEstagiarios(){
		return this.estagiarios;
	}


	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

}
