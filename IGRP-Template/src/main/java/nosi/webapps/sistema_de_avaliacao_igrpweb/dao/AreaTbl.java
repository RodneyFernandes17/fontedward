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
@Table(name = "area_tbl", schema = "")
@NamedQuery(name = "AreaTbl.findAll", query = "SELECT t FROM AreaTbl t")
public class AreaTbl extends BaseActiveRecord<AreaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
 	private Integer id;
	@Column(name = "area_desc", nullable = false, length = 2147483647)
	private String areaDesc;

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public String getAreaDesc() { 
		return this.areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		 this.areaDesc = areaDesc;
	}

}