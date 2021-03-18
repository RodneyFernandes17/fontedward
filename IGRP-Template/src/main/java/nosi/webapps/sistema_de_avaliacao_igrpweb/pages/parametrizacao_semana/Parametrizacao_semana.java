package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_semana;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Parametrizacao_semana extends Model{		

	@RParam(rParamName = "p_semana")
	private Integer semana;

	@RParam(rParamName = "p_atual")
	private int atual;
	@RParam(rParamName = "p_atual_check")
	private int atual_check;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setSemana(Integer semana){
		this.semana = semana;
	}
	public Integer getSemana(){
		return this.semana;
	}
	
	public void setAtual(int atual){
		this.atual = atual;
	}
	public int getAtual(){
		return this.atual;
	}
	public void setAtual_check(int atual_check){
		this.atual_check = atual_check;
	}
	public int getAtual_check(){
		return this.atual_check;
	}


	public static class Table_1 extends IGRPTable.Table{
		private int semana_tbl;
		private String atual_tbl;
		public void setSemana_tbl(int semana_tbl){
			this.semana_tbl = semana_tbl;
		}
		public int getSemana_tbl(){
			return this.semana_tbl;
		}

		public void setAtual_tbl(String atual_tbl){
			this.atual_tbl = atual_tbl;
		}
		public String getAtual_tbl(){
			return this.atual_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
