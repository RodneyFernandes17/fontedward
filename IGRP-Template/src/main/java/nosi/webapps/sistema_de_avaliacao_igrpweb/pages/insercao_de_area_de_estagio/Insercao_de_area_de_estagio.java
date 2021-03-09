package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.insercao_de_area_de_estagio;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Insercao_de_area_de_estagio extends Model{		

	@RParam(rParamName = "p_estagiario")
	private String estagiario;

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_mentor")
	private String mentor;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setEstagiario(String estagiario){
		this.estagiario = estagiario;
	}
	public String getEstagiario(){
		return this.estagiario;
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


	public static class Table_1 extends IGRPTable.Table{
		private String nome;
		private String area_tbl;
		private String mentor_tbl;
		private String id_avaliado;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

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

		public void setId_avaliado(String id_avaliado){
			this.id_avaliado = id_avaliado;
		}
		public String getId_avaliado(){
			return this.id_avaliado;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
