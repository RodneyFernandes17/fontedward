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
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "teste_tbl", schema = "")
@NamedQuery(name = "TesteTbl.findAll", query = "SELECT t FROM TesteTbl t")
public class TesteTbl extends BaseActiveRecord<TesteTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_teste", updatable = false, nullable = false)
 	private Integer idTeste;
	@ManyToOne
	@JoinColumn(name = "id_avaliado_fk", foreignKey = @ForeignKey(name = "avaliado_fk"), nullable = false)
	private AvaliadoTbl idAvaliadoFk;
	@Column(name = "valor_igrp_studio", nullable = false)
	private Integer valorIgrpStudio;
	@Column(name = "valor_bpmn_report", nullable = false)
	private Integer valorBpmnReport;
	@Column(name = "valor_page_designer", nullable = false)
	private Integer valorPageDesigner;
	@Column(name = "valor_gerador_blockly", nullable = false)
	private Integer valorGeradorBlockly;
	@Column(name = "valor_eclipse_git", nullable = false)
	private Integer valorEclipseGit;
	@Column(name = "valor_base_dados_dao", nullable = false)
	private Integer valorBaseDadosDao;
	@Column(name = "valor_java", nullable = false)
	private Integer valorJava;
	@Column(name = "valor_final", nullable = false)
	private Integer valorFinal;
	@Column(name = "data_realizacao", nullable = false)
	private LocalDate dataRealizacao;
	@Column(name = "valor_gestao_acesso", nullable = false)
	private Integer valorGestaoAcesso;
	@Column(name = "aprovacao")
	private Integer aprovacao;

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

	public LocalDate getDataRealizacao() { 
		return this.dataRealizacao;
	}

	public void setDataRealizacao(LocalDate dataRealizacao) {
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

}