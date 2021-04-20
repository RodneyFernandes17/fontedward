package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class Criacao_formacao extends Model{		

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_formadores")
	private String[] formadores;

	@NotNull()
	@RParam(rParamName = "p_horas_de_formacao")
	private Integer horas_de_formacao;

	@NotNull()
	@RParam(rParamName = "p_data_inicio")
	private String data_inicio;

	@NotNull()
	@RParam(rParamName = "p_data_fim")
	private String data_fim;

	@NotNull()
	@RParam(rParamName = "p_local")
	private String local;

	@NotNull()
	@RParam(rParamName = "p_topicos")
	private String topicos;

	@NotNull()
	@RParam(rParamName = "p_instituicao")
	private String instituicao;

	@RParam(rParamName = "p_teste_de_avaliacao")
	private String teste_de_avaliacao;

	@RParam(rParamName = "p_codigo_do_teste")
	private String codigo_do_teste;

	@RParam(rParamName = "p_id_formacao")
	private String id_formacao;
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setFormadores(String[] formadores){
		this.formadores = formadores;
	}
	public String[] getFormadores(){
		return this.formadores;
	}
	
	public void setHoras_de_formacao(Integer horas_de_formacao){
		this.horas_de_formacao = horas_de_formacao;
	}
	public Integer getHoras_de_formacao(){
		return this.horas_de_formacao;
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
	
	public void setLocal(String local){
		this.local = local;
	}
	public String getLocal(){
		return this.local;
	}
	
	public void setTopicos(String topicos){
		this.topicos = topicos;
	}
	public String getTopicos(){
		return this.topicos;
	}
	
	public void setInstituicao(String instituicao){
		this.instituicao = instituicao;
	}
	public String getInstituicao(){
		return this.instituicao;
	}
	
	public void setTeste_de_avaliacao(String teste_de_avaliacao){
		this.teste_de_avaliacao = teste_de_avaliacao;
	}
	public String getTeste_de_avaliacao(){
		return this.teste_de_avaliacao;
	}
	
	public void setCodigo_do_teste(String codigo_do_teste){
		this.codigo_do_teste = codigo_do_teste;
	}
	public String getCodigo_do_teste(){
		return this.codigo_do_teste;
	}
	
	public void setId_formacao(String id_formacao){
		this.id_formacao = id_formacao;
	}
	public String getId_formacao(){
		return this.id_formacao;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair procurar_avaliado;
private Pair nome_avaliado;
private Pair id_avaliado;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setProcurar_avaliado(Pair procurar_avaliado){
			this.procurar_avaliado = procurar_avaliado;
		}
		public Pair getProcurar_avaliado(){
			return this.procurar_avaliado;
		}

		public void setNome_avaliado(Pair nome_avaliado){
			this.nome_avaliado = nome_avaliado;
		}
		public Pair getNome_avaliado(){
			return this.nome_avaliado;
		}

		public void setId_avaliado(Pair id_avaliado){
			this.id_avaliado = id_avaliado;
		}
		public Pair getId_avaliado(){
			return this.id_avaliado;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

}
