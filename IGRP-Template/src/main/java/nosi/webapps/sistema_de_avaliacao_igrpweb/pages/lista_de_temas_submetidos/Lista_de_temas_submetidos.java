package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_temas_submetidos;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_temas_submetidos extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private String nome;
		private String tema_semanal;
		private String data_de_envio;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setTema_semanal(String tema_semanal){
			this.tema_semanal = tema_semanal;
		}
		public String getTema_semanal(){
			return this.tema_semanal;
		}

		public void setData_de_envio(String data_de_envio){
			this.data_de_envio = data_de_envio;
		}
		public String getData_de_envio(){
			return this.data_de_envio;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
