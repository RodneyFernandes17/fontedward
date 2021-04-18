package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_teste;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Parametrizacao_teste extends Model{		

	@RParam(rParamName = "p_nome_do_teste")
	private String nome_do_teste;

	@RParam(rParamName = "p_id_teste")
	private String id_teste;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setNome_do_teste(String nome_do_teste){
		this.nome_do_teste = nome_do_teste;
	}
	public String getNome_do_teste(){
		return this.nome_do_teste;
	}
	
	public void setId_teste(String id_teste){
		this.id_teste = id_teste;
	}
	public String getId_teste(){
		return this.id_teste;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String teste_tbl;
		private String id_teste_tbl;
		public void setTeste_tbl(String teste_tbl){
			this.teste_tbl = teste_tbl;
		}
		public String getTeste_tbl(){
			return this.teste_tbl;
		}

		public void setId_teste_tbl(String id_teste_tbl){
			this.id_teste_tbl = id_teste_tbl;
		}
		public String getId_teste_tbl(){
			return this.id_teste_tbl;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
