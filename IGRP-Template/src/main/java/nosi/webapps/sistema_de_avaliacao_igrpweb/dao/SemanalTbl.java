package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.GeneratedValue;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.validation.constraints.Size;
import javax.persistence.ForeignKey;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author: Nositeste 19-03-2021
*/

@Entity
@Table(name = "semanal_tbl", schema = "public")
@NamedQuery(name = "SemanalTbl.findAll", query = "SELECT t FROM SemanalTbl t")
public class SemanalTbl extends BaseActiveRecord<SemanalTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_semanal", nullable = false, updatable = false)
 	private Integer idSemanal;
	@ManyToOne
	@JoinColumn(name = "id_avaliado_fk", foreignKey = @ForeignKey(name = "avaliado_fkey"))
	private AvaliadoTbl idAvaliadoFk;
	@NotNull
	@Column(name = "conteudo")
	private Integer conteudo;
	@NotNull
	@Column(name = "pontualidade")
	private Integer pontualidade;
	@NotNull
	@Column(name = "dominio")
	private Integer dominio;
	@NotNull
	@Column(name = "clareza")
	private Integer clareza;
	@NotNull
	@Column(name = "proactividade")
	private Integer proactividade;
	@NotNull
	@Column(name = "nivel")
	private Integer nivel;
	@NotNull
	@Column(name = "tarefas")
	private Integer tarefas;
	@NotNull
	@Column(name = "data")
	private LocalDate data;
	@NotNull
	@Column(name = "id_avaliador")
	private Integer idAvaliador;
	@Size(max = 2147483647)
	@Column(name = "nome_avaliador")
	private String nomeAvaliador;
	@ManyToOne
	@JoinColumn(name = "id_tema_fk", foreignKey = @ForeignKey(name = "tema_fk"))
	private TemaTbl idTemaFk;
	@Size(max = 2147483647)
	@Column(name = "observacao")
	private String observacao;

	public Integer getIdSemanal() { 
		return this.idSemanal;
	}

	public void setIdSemanal(Integer idSemanal) {
		 this.idSemanal = idSemanal;
	}

	public AvaliadoTbl getIdAvaliadoFk() { 
		return this.idAvaliadoFk;
	}

	public void setIdAvaliadoFk(AvaliadoTbl idAvaliadoFk) {
		 this.idAvaliadoFk = idAvaliadoFk;
	}

	public Integer getConteudo() { 
		return this.conteudo;
	}

	public void setConteudo(Integer conteudo) {
		 this.conteudo = conteudo;
	}

	public Integer getPontualidade() { 
		return this.pontualidade;
	}

	public void setPontualidade(Integer pontualidade) {
		 this.pontualidade = pontualidade;
	}

	public Integer getDominio() { 
		return this.dominio;
	}

	public void setDominio(Integer dominio) {
		 this.dominio = dominio;
	}

	public Integer getClareza() { 
		return this.clareza;
	}

	public void setClareza(Integer clareza) {
		 this.clareza = clareza;
	}

	public Integer getProactividade() { 
		return this.proactividade;
	}

	public void setProactividade(Integer proactividade) {
		 this.proactividade = proactividade;
	}

	public Integer getNivel() { 
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		 this.nivel = nivel;
	}

	public Integer getTarefas() { 
		return this.tarefas;
	}

	public void setTarefas(Integer tarefas) {
		 this.tarefas = tarefas;
	}

	public LocalDate getData() { 
		return this.data;
	}

	public void setData(LocalDate data) {
		 this.data = data;
	}

	public Integer getIdAvaliador() { 
		return this.idAvaliador;
	}

	public void setIdAvaliador(Integer idAvaliador) {
		 this.idAvaliador = idAvaliador;
	}

	public String getNomeAvaliador() { 
		return this.nomeAvaliador;
	}

	public void setNomeAvaliador(String nomeAvaliador) {
		 this.nomeAvaliador = nomeAvaliador;
	}

	public TemaTbl getIdTemaFk() { 
		return this.idTemaFk;
	}

	public void setIdTemaFk(TemaTbl idTemaFk) {
		 this.idTemaFk = idTemaFk;
	}

	public String getObservacao() { 
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		 this.observacao = observacao;
	}

}