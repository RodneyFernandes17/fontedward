package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "mentor_tbl", schema = "")
@NamedQuery(name = "MentorTbl.findAll", query = "SELECT t FROM MentorTbl t")
public class MentorTbl extends BaseActiveRecord<MentorTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
 	private Integer id;
	@Column(name = "nome", nullable = false, length = 2147483647)
	private String nome;
	@ManyToOne
	@JoinColumn(name = "id_area_fk", foreignKey = @ForeignKey(name = "area_fk"), nullable = false)
	private AreaTbl idAreaFk;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public AreaTbl getIdAreaFk() { 
		return this.idAreaFk;
	}

	public void setIdAreaFk(AreaTbl idAreaFk) {
		 this.idAreaFk = idAreaFk;
	}

}