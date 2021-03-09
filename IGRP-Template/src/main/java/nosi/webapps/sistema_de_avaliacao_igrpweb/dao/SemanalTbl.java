package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste 02-03-2021
*/

@Entity
@Table(name = "semanal_tbl", schema = "")
@NamedQuery(name = "SemanalTbl.findAll", query = "SELECT t FROM SemanalTbl t")
public class SemanalTbl extends BaseActiveRecord<SemanalTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_semanal", updatable = false, nullable = false)
 	private Integer idSemanal;
	@ManyToOne
	@JoinColumn(name = "id_avaliado_fk", foreignKey = @ForeignKey(name = "avaliado_fkey"), nullable = false)
	private AvaliadoTbl idAvaliadoFk;
	@Column(name = "nr_semana", nullable = false)
	private Integer nrSemana;
	@Column(name = "conteudo", nullable = false)
	private Integer conteudo;
	@Column(name = "pontualidade", nullable = false)
	private Integer pontualidade;
	@Column(name = "dominio", nullable = false)
	private Integer dominio;
	@Column(name = "clareza", nullable = false)
	private Integer clareza;
	@Column(name = "proactividade", nullable = false)
	private Integer proactividade;
	@Column(name = "nivel", nullable = false)
	private Integer nivel;
	@Column(name = "tarefas", nullable = false)
	private Integer tarefas;
	@Column(name = "data", nullable = false)
	private LocalDate data;
	@Column(name = "id_avaliador", nullable = false)
	private Integer idAvaliador;
	@Column(name = "nome_avaliador", nullable = false)
	private String nomeAvaliador;
	@Column(name = "tema_semanal", nullable = false, length = 2147483647)
	private String temaSemanal;

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

	public Integer getNrSemana() { 
		return this.nrSemana;
	}

	public void setNrSemana(Integer nrSemana) {
		 this.nrSemana = nrSemana;
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

	public String getTemaSemanal() { 
		return this.temaSemanal;
	}

	public void setTemaSemanal(String temaSemanal) {
		 this.temaSemanal = temaSemanal;
	}

}