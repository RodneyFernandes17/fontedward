package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_formandos;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_formandos extends Model{		
	
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
		private String formacao;
		private String edicao;
		private String chave_autenticacao;
		private String id_formando;
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

		public void setFormacao(String formacao){
			this.formacao = formacao;
		}
		public String getFormacao(){
			return this.formacao;
		}

		public void setEdicao(String edicao){
			this.edicao = edicao;
		}
		public String getEdicao(){
			return this.edicao;
		}

		public void setChave_autenticacao(String chave_autenticacao){
			this.chave_autenticacao = chave_autenticacao;
		}
		public String getChave_autenticacao(){
			return this.chave_autenticacao;
		}

		public void setId_formando(String id_formando){
			this.id_formando = id_formando;
		}
		public String getId_formando(){
			return this.id_formando;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
