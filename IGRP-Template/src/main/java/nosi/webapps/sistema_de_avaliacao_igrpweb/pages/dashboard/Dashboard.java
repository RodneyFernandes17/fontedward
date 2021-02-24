package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart3D;

public class Dashboard extends Model{		
	
	private List<Chart_2> chart_2 = new ArrayList<>();	
	public void setChart_2(List<Chart_2> chart_2){
		this.chart_2 = chart_2;
	}
	public List<Chart_2> getChart_2(){
		return this.chart_2;
	}

	
	private List<Chart_1> chart_1 = new ArrayList<>();	
	public void setChart_1(List<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public List<Chart_1> getChart_1(){
		return this.chart_1;
	}



	public static class Chart_2 extends IGRPChart3D{
		public Chart_2(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_2() {
		}
	}
	public static class Chart_1 extends IGRPChart3D{
		public Chart_1(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Chart_1() {
		}
	}

	public void loadChart_2(BaseQueryInterface query) {
		this.setChart_2(this.loadTable(query,Chart_2.class));
	}

	public void loadChart_1(BaseQueryInterface query) {
		this.setChart_1(this.loadTable(query,Chart_1.class));
	}

}
