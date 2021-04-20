package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.ForeignKey;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
import javax.persistence.Table;
import javax.persistence.Entity;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Column;

/**
 * @author: Nositeste 18-04-2021
*/

@Entity
@Table(name = "teste_tbl", schema = "public")
@NamedQuery(name = "TesteTbl.findAll", query = "SELECT t FROM TesteTbl t")
public class TesteTbl extends BaseActiveRecord<TesteTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_teste", nullable = false, updatable = false)
 	private Integer idTeste;
	@ManyToOne
	@JoinColumn(name = "id_avaliado_fk", foreignKey = @ForeignKey(name = "avaliado_fk"))
	private AvaliadoTbl idAvaliadoFk;
	@Column(name = "valor_igrp_studio")
	private Integer valorIgrpStudio;
	@Column(name = "valor_bpmn_report")
	private Integer valorBpmnReport;
	@Column(name = "valor_page_designer")
	private Integer valorPageDesigner;
	@Column(name = "valor_gerador_blockly")
	private Integer valorGeradorBlockly;
	@Column(name = "valor_eclipse_git")
	private Integer valorEclipseGit;
	@Column(name = "valor_base_dados_dao")
	private Integer valorBaseDadosDao;
	@Column(name = "valor_java")
	private Integer valorJava;
	@Column(name = "valor_final")
	private Integer valorFinal;
	@NotNull
	@Column(name = "data_realizacao")
	private LocalDateTime dataRealizacao;
	@Column(name = "valor_gestao_acesso")
	private Integer valorGestaoAcesso;
	@Column(name = "aprovacao")
	private Integer aprovacao;
	@ManyToOne
	@JoinColumn(name = "formacao_id", foreignKey = @ForeignKey(name = "formacao_fk"))
	private FormacaoTbl formacaoId;

	public Integer getIdTeste() { 
		return this.idTeste;
	}

	public void setIdTeste(Integer idTeste) {
		 this.idTeste = idTeste;
	}

	public AvaliadoTbl getIdAvaliadoFk() { 
		return this.idAvaliadoFk;
	}

	public void setIdAvaliadoFk(AvaliadoTbl idAvaliadoFk) {
		 this.idAvaliadoFk = idAvaliadoFk;
	}

	public Integer getValorIgrpStudio() { 
		return this.valorIgrpStudio;
	}

	public void setValorIgrpStudio(Integer valorIgrpStudio) {
		 this.valorIgrpStudio = valorIgrpStudio;
	}

	public Integer getValorBpmnReport() { 
		return this.valorBpmnReport;
	}

	public void setValorBpmnReport(Integer valorBpmnReport) {
		 this.valorBpmnReport = valorBpmnReport;
	}

	public Integer getValorPageDesigner() { 
		return this.valorPageDesigner;
	}

	public void setValorPageDesigner(Integer valorPageDesigner) {
		 this.valorPageDesigner = valorPageDesigner;
	}

	public Integer getValorGeradorBlockly() { 
		return this.valorGeradorBlockly;
	}

	public void setValorGeradorBlockly(Integer valorGeradorBlockly) {
		 this.valorGeradorBlockly = valorGeradorBlockly;
	}

	public Integer getValorEclipseGit() { 
		return this.valorEclipseGit;
	}

	public void setValorEclipseGit(Integer valorEclipseGit) {
		 this.valorEclipseGit = valorEclipseGit;
	}

	public Integer getValorBaseDadosDao() { 
		return this.valorBaseDadosDao;
	}

	public void setValorBaseDadosDao(Integer valorBaseDadosDao) {
		 this.valorBaseDadosDao = valorBaseDadosDao;
	}

	public Integer getValorJava() { 
		return this.valorJava;
	}

	public void setValorJava(Integer valorJava) {
		 this.valorJava = valorJava;
	}

	public Integer getValorFinal() { 
		return this.valorFinal;
	}

	public void setValorFinal(Integer valorFinal) {
		 this.valorFinal = valorFinal;
	}

	public LocalDateTime getDataRealizacao() { 
		return this.dataRealizacao;
	}

	public void setDataRealizacao(LocalDateTime dataRealizacao) {
		 this.dataRealizacao = dataRealizacao;
	}

	public Integer getValorGestaoAcesso() { 
		return this.valorGestaoAcesso;
	}

	public void setValorGestaoAcesso(Integer valorGestaoAcesso) {
		 this.valorGestaoAcesso = valorGestaoAcesso;
	}

	public Integer getAprovacao() { 
		return this.aprovacao;
	}

	public void setAprovacao(Integer aprovacao) {
		 this.aprovacao = aprovacao;
	}

	public FormacaoTbl getFormacaoId() { 
		return this.formacaoId;
	}

	public void setFormacaoId(FormacaoTbl formacaoId) {
		 this.formacaoId = formacaoId;
	}

}