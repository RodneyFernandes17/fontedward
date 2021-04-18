package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_perguntas;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_perguntas extends Model{		

	@RParam(rParamName = "p_nivel_form")
	private String nivel_form;

	@RParam(rParamName = "p_conceito_form")
	private String conceito_form;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setNivel_form(String nivel_form){
		this.nivel_form = nivel_form;
	}
	public String getNivel_form(){
		return this.nivel_form;
	}
	
	public void setConceito_form(String conceito_form){
		this.conceito_form = conceito_form;
	}
	public String getConceito_form(){
		return this.conceito_form;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String conceito;
		private String pergunta;
		private String nivel;
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

		public void setNivel(String nivel){
			this.nivel = nivel;
		}
		public String getNivel(){
			return this.nivel;
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
