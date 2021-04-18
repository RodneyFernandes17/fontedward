package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste 17-04-2021
*/

@Entity
@Table(name = "formando", schema = "public")
@NamedQuery(name = "Formando.findAll", query = "SELECT t FROM Formando t")
public class Formando extends BaseActiveRecord<Formando> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "formacao", foreignKey = @ForeignKey(name = "formacao_fk"))
	private FormacaoTbl formacao;
	@ManyToOne
	@JoinColumn(name = "formando", foreignKey = @ForeignKey(name = "avaliado_fkke"))
	private AvaliadoTbl formando;
	@Size(max = 2147483647)
	@Column(name = "chave_aut")
	private String chaveAut;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public FormacaoTbl getFormacao() { 
		return this.formacao;
	}

	public void setFormacao(FormacaoTbl formacao) {
		 this.formacao = formacao;
	}

	public AvaliadoTbl getFormando() { 
		return this.formando;
	}

	public void setFormando(AvaliadoTbl formando) {
		 this.formando = formando;
	}

	public String getChaveAut() { 
		return this.chaveAut;
	}

	public void setChaveAut(String chaveAut) {
		 this.chaveAut = chaveAut;
	}

}