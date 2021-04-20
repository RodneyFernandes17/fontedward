package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.ManyToOne;

/**
 * @author: Nositeste 18-04-2021
*/

@Entity
@Table(name = "formando_tbl", schema = "public")
@NamedQuery(name = "FormandoTbl.findAll", query = "SELECT t FROM FormandoTbl t")
public class FormandoTbl extends BaseActiveRecord<FormandoTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "formacao_id", foreignKey = @ForeignKey(name = "formacao_fk"))
	private FormacaoTbl formacaoId;
	@ManyToOne
	@JoinColumn(name = "avaliado_id", foreignKey = @ForeignKey(name = "avaliado_fk"))
	private AvaliadoTbl avaliadoId;
	@Size(max = 2147483647)
	@Column(name = "chave_aut")
	private String chaveAut;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public FormacaoTbl getFormacaoId() { 
		return this.formacaoId;
	}

	public void setFormacaoId(FormacaoTbl formacaoId) {
		 this.formacaoId = formacaoId;
	}

	public AvaliadoTbl getAvaliadoId() { 
		return this.avaliadoId;
	}

	public void setAvaliadoId(AvaliadoTbl avaliadoId) {
		 this.avaliadoId = avaliadoId;
	}

	public String getChaveAut() { 
		return this.chaveAut;
	}

	public void setChaveAut(String chaveAut) {
		 this.chaveAut = chaveAut;
	}

}