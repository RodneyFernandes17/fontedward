package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
/**
 * @author: Rodney Fernandes
 * 2021-01-06
*/

@Entity
@Table(name="teste_tbl",schema="public")
@NamedQuery(name="TesteTbl.findAll", query="SELECT b FROM TesteTbl b")
public class TesteTbl extends BaseActiveRecord<TesteTbl> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_teste", nullable=false)
	private Integer idTeste;
	@ManyToOne
	@JoinColumn(name="id_avaliado_fk", foreignKey=@ForeignKey(name="avaliado_fk"), nullable=false)
	private AvaliadoTbl idAvaliadoFk;
	@Column(name="valor_igrp_studio",nullable=false,length=11)
	private Integer valorIgrpStudio;
	@Column(name="valor_bpmn_report",nullable=false,length=11)
	private Integer valorBpmnReport;
	@Column(name="valor_page_designer",nullable=false,length=11)
	private Integer valorPageDesigner;
	@Column(name="valor_gerador_blockly",nullable=false,length=11)
	private Integer valorGeradorBlockly;
	@Column(name="valor_eclipse_git",nullable=false,length=11)
	private Integer valorEclipseGit;
	@Column(name="valor_base_dados_dao",nullable=false,length=11)
	private Integer valorBaseDadosDao;
	@Column(name="valor_java",nullable=false,length=11)
	private Integer valorJava;
	@Column(name="valor_final",nullable=false,length=11)
	private Integer valorFinal;
	@Column(name="data_realizacao",nullable=false,length=13)
	@CreationTimestamp
	private LocalDateTime dataRealizacao;
	@Column(name="valor_gestao_acesso",nullable=false,length=11)
	private Integer valorGestaoAcesso;

	public Integer getIdTeste() {
		return idTeste;
	}
	public void setIdTeste(Integer idTeste) {
		this.idTeste = idTeste;
	}
	public AvaliadoTbl getIdAvaliadoFk() {
		return idAvaliadoFk;
	}
	public void setIdAvaliadoFk(AvaliadoTbl idAvaliadoFk) {
		this.idAvaliadoFk = idAvaliadoFk;
	}
	public Integer getValorIgrpStudio() {
		return valorIgrpStudio;
	}
	public void setValorIgrpStudio(Integer valorIgrpStudio) {
		this.valorIgrpStudio = valorIgrpStudio;
	}
	public Integer getValorBpmnReport() {
		return valorBpmnReport;
	}
	public void setValorBpmnReport(Integer valorBpmnReport) {
		this.valorBpmnReport = valorBpmnReport;
	}
	public Integer getValorPageDesigner() {
		return valorPageDesigner;
	}
	public void setValorPageDesigner(Integer valorPageDesigner) {
		this.valorPageDesigner = valorPageDesigner;
	}
	public Integer getValorGeradorBlockly() {
		return valorGeradorBlockly;
	}
	public void setValorGeradorBlockly(Integer valorGeradorBlockly) {
		this.valorGeradorBlockly = valorGeradorBlockly;
	}
	public Integer getValorEclipseGit() {
		return valorEclipseGit;
	}
	public void setValorEclipseGit(Integer valorEclipseGit) {
		this.valorEclipseGit = valorEclipseGit;
	}
	public Integer getValorBaseDadosDao() {
		return valorBaseDadosDao;
	}
	public void setValorBaseDadosDao(Integer valorBaseDadosDao) {
		this.valorBaseDadosDao = valorBaseDadosDao;
	}
	public Integer getValorJava() {
		return valorJava;
	}
	public void setValorJava(Integer valorJava) {
		this.valorJava = valorJava;
	}
	public Integer getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Integer valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Integer getValorGestaoAcesso() {
		return valorGestaoAcesso;
	}
	public void setValorGestaoAcesso(Integer valorGestaoAcesso) {
		this.valorGestaoAcesso = valorGestaoAcesso;
	}
	
	public LocalDateTime getDataRealizacao() {
		return dataRealizacao;
	}

}
