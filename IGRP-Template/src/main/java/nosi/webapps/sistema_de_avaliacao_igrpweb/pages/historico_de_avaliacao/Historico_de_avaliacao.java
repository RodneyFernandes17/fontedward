package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Historico_de_avaliacao extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_area")
	private String area;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;

	@RParam(rParamName = "p_paragraph_1_text")
	private String paragraph_1_text;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setArea(String area){
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}
	
	public void setParagraph_1_text(String paragraph_1_text){
		this.paragraph_1_text = paragraph_1_text;
	}
	public String getParagraph_1_text(){
		return this.paragraph_1_text;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String media_tbl;
		private Integer semana;
		private String data;
		private String tema;
		private String media_semanal;
		private String conteudo;
		private String pontualidade;
		private String dominio;
		private String clareza;
		private String proatividade;
		private String nivel;
		private String tarefas;
		public void setMedia_tbl(String media_tbl){
			this.media_tbl = media_tbl;
		}
		public String getMedia_tbl(){
			return this.media_tbl;
		}

		public void setSemana(Integer semana){
			this.semana = semana;
		}
		public Integer getSemana(){
			return this.semana;
		}

		public void setData(String data){
			this.data = data;
		}
		public String getData(){
			return this.data;
		}

		public void setTema(String tema){
			this.tema = tema;
		}
		public String getTema(){
			return this.tema;
		}

		public void setMedia_semanal(String media_semanal){
			this.media_semanal = media_semanal;
		}
		public String getMedia_semanal(){
			return this.media_semanal;
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
