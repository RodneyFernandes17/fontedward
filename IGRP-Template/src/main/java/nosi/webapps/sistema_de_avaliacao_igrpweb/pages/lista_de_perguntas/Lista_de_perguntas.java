package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_perguntas extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private String conceito;
		private String pergunta;
		private String id_pergunta;
		public void setConceito(String conceito){
			this.conceito = conceito;
		}
		public String getConceito(){
			return this.conceito;
		}

		public void setPergunta(String pergunta){
			this.pergunta = pergunta;
		}
		public String getPergunta(){
			return this.pergunta;
		}

		public void setId_pergunta(String id_pergunta){
			this.id_pergunta = id_pergunta;
		}
		public String getId_pergunta(){
			return this.id_pergunta;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
