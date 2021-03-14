package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_areas_ou_projetos;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Parametrizacao_areas_ou_projetos extends Model{		

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_id_area")
	private int id_area;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	
	public void setId_area(int id_area){
		this.id_area = id_area;
	}
	public int getId_area(){
		return this.id_area;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String area_tbl;
		private int id_area_tbl;
		public void setArea_tbl(String area_tbl){
			this.area_tbl = area_tbl;
		}
		public String getArea_tbl(){
			return this.area_tbl;
		}

		public void setId_area_tbl(int id_area_tbl){
			this.id_area_tbl = id_area_tbl;
		}
		public int getId_area_tbl(){
			return this.id_area_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
