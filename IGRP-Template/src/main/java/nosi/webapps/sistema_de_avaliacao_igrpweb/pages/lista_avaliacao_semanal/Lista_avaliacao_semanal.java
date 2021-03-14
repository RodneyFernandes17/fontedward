package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_avaliacao_semanal;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_avaliacao_semanal extends Model{		
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}



	public static class Table_1 extends IGRPTable.Table{
		private String foto="../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg";
		private String foto_uuid;
		private String nome;
		private String edicao;
		private String area;
		private String mentor;
		private String id_teste;
		private String id_avaliado;
		private String id_utilizador;
		public void setFoto(String foto){
			this.foto = foto;
		}
		public String getFoto(){
			return this.foto;
		}
		public void setFoto_uuid(String foto_uuid){
			this.foto_uuid = foto_uuid;
		}
		public String getFoto_uuid(){
			return this.foto_uuid;
		}

		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setEdicao(String edicao){
			this.edicao = edicao;
		}
		public String getEdicao(){
			return this.edicao;
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

		public void setId_teste(String id_teste){
			this.id_teste = id_teste;
		}
		public String getId_teste(){
			return this.id_teste;
		}

		public void setId_avaliado(String id_avaliado){
			this.id_avaliado = id_avaliado;
		}
		public String getId_avaliado(){
			return this.id_avaliado;
		}

		public void setId_utilizador(String id_utilizador){
			this.id_utilizador = id_utilizador;
		}
		public String getId_utilizador(){
			return this.id_utilizador;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
