package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.classificacao_por_mentores;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Classificacao_por_mentores extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private String avaliador;
		private String conteudo;
		private String pontualidade;
		private String dominio;
		private String clareza;
		private String proatividade;
		private String nivel;
		private String tarefas;
		public void setAvaliador(String avaliador){
			this.avaliador = avaliador;
		}
		public String getAvaliador(){
			return this.avaliador;
		}

		public void setConteudo(String conteudo){
			this.conteudo = conteudo;
		}
		public String getConteudo(){
			return this.conteudo;
		}

		public void setPontualidade(String pontualidade){
			this.pontualidade = pontualidade;
		}
		public String getPontualidade(){
			return this.pontualidade;
		}

		public void setDominio(String dominio){
			this.dominio = dominio;
		}
		public String getDominio(){
			return this.dominio;
		}

		public void setClareza(String clareza){
			this.clareza = clareza;
		}
		public String getClareza(){
			return this.clareza;
		}

		public void setProatividade(String proatividade){
			this.proatividade = proatividade;
		}
		public String getProatividade(){
			return this.proatividade;
		}

		public void setNivel(String nivel){
			this.nivel = nivel;
		}
		public String getNivel(){
			return this.nivel;
		}

		public void setTarefas(String tarefas){
			this.tarefas = tarefas;
		}
		public String getTarefas(){
			return this.tarefas;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
