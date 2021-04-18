package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * @author: Nositeste 15-04-2021
*/

@Entity
@Table(name = "enunciado_tbl", schema = "public")
@NamedQuery(name = "EnunciadoTbl.findAll", query = "SELECT t FROM EnunciadoTbl t")
public class EnunciadoTbl extends BaseActiveRecord<EnunciadoTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "descricao")
	private String descricao;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getDescricao() { 
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		 this.descricao = descricao;
	}

}