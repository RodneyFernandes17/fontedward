package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_mentores;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Parametrizacao_mentores extends Model{		

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_mentor")
	private String mentor;

	@RParam(rParamName = "p_id_mentor")
	private int id_mentor;
	
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
	
	public void setMentor(String mentor){
		this.mentor = mentor;
	}
	public String getMentor(){
		return this.mentor;
	}
	
	public void setId_mentor(int id_mentor){
		this.id_mentor = id_mentor;
	}
	public int getId_mentor(){
		return this.id_mentor;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String area_tbl;
		private String mentor_tbl;
		private int id_mentor_tbl;
		public void setArea_tbl(String area_tbl){
			this.area_tbl = area_tbl;
		}
		public String getArea_tbl(){
			return this.area_tbl;
		}

		public void setMentor_tbl(String mentor_tbl){
			this.mentor_tbl = mentor_tbl;
		}
		public String getMentor_tbl(){
			return this.mentor_tbl;
		}

		public void setId_mentor_tbl(int id_mentor_tbl){
			this.id_mentor_tbl = id_mentor_tbl;
		}
		public int getId_mentor_tbl(){
			return this.id_mentor_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
