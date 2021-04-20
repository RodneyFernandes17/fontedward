package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.gestao_de_formacoes;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Gestao_de_formacoes extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private String nome;
		private String instituicao;
		private String data_inicio;
		private String data_fim;
		private String id_formacao;
		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setInstituicao(String instituicao){
			this.instituicao = instituicao;
		}
		public String getInstituicao(){
			return this.instituicao;
		}

		public void setData_inicio(String data_inicio){
			this.data_inicio = data_inicio;
		}
		public String getData_inicio(){
			return this.data_inicio;
		}

		public void setData_fim(String data_fim){
			this.data_fim = data_fim;
		}
		public String getData_fim(){
			return this.data_fim;
		}

		public void setId_formacao(String id_formacao){
			this.id_formacao = id_formacao;
		}
		public String getId_formacao(){
			return this.id_formacao;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
