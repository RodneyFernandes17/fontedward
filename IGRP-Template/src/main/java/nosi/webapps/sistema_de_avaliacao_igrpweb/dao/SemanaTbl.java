package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

/**
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "semana_tbl", schema = "")
@NamedQuery(name = "SemanaTbl.findAll", query = "SELECT t FROM SemanaTbl t")
public class SemanaTbl extends BaseActiveRecord<SemanaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
 	private Integer id;
	@Column(name = "nr_semana", nullable = false)
	private Integer nrSemana;
	@Column(name = "atual", nullable = false)
	private Boolean atual;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getNrSemana() { 
		return this.nrSemana;
	}

	public void setNrSemana(Integer nrSemana) {
		 this.nrSemana = nrSemana;
	}

	public Boolean getAtual() { 
		return this.atual;
	}

	public void setAtual(Boolean atual) {
		 this.atual = atual;
	}

}