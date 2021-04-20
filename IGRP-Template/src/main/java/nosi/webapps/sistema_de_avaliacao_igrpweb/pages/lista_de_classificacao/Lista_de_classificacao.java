package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_classificacao;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Lista_de_classificacao extends Model{		

	@RParam(rParamName = "p_instituicao_flt")
	private String instituicao_flt;

	@RParam(rParamName = "p_edicao_flt")
	private String edicao_flt;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setInstituicao_flt(String instituicao_flt){
		this.instituicao_flt = instituicao_flt;
	}
	public String getInstituicao_flt(){
		return this.instituicao_flt;
	}
	
	public void setEdicao_flt(String edicao_flt){
		this.edicao_flt = edicao_flt;
	}
	public String getEdicao_flt(){
		return this.edicao_flt;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String aprovacao;
		private String foto="../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg";
		private String foto_uuid;
		private String nome;
		private String formacao;
		private String instituicao;
		private String edicao;
		private String data_de_realizacao;
		private String classificacao;
		private String id_teste;
		private String id_avaliado;
		public void setAprovacao(String aprovacao){
			this.aprovacao = aprovacao;
		}
		public String getAprovacao(){
			return this.aprovacao;
		}

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

		public void setInstituicao(String instituicao){
			this.instituicao = instituicao;
		}
		public String getInstituicao(){
			return this.instituicao;
		}

		public void setEdicao(String edicao){
			this.edicao = edicao;
		}
		public String getEdicao(){
			return this.edicao;
		}

		public void setData_de_realizacao(String data_de_realizacao){
			this.data_de_realizacao = data_de_realizacao;
		}
		public String getData_de_realizacao(){
			return this.data_de_realizacao;
		}

		public void setClassificacao(String classificacao){
			this.classificacao = classificacao;
		}
		public String getClassificacao(){
			return this.classificacao;
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

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
