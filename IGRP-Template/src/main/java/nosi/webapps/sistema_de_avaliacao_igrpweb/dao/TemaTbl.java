package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "tema_tbl", schema = "")
@NamedQuery(name = "TemaTbl.findAll", query = "SELECT t FROM TemaTbl t")
public class TemaTbl extends BaseActiveRecord<TemaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Column(name = "tema", nullable = false, length = 2147483647)
	private String tema;
	@Column(name = "data", nullable = false)
	private LocalDateTime data;
	@ManyToOne
	@JoinColumn(name = "nr_semana", foreignKey = @ForeignKey(name = "semana_fk"))
	private SemanaTbl nrSemana;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_avaliado_fk", foreignKey = @ForeignKey(name = "avaliado_fkk"))
	private AvaliadoTbl idAvaliadoFk;

	public String getTema() { 
		return this.tema;
	}

	public void setTema(String tema) {
		 this.tema = tema;
	}

	public LocalDateTime getData() { 
		return this.data;
	}

	public void setData(LocalDateTime data) {
		 this.data = data;
	}

	public SemanaTbl getNrSemana() { 
		return this.nrSemana;
	}

	public void setNrSemana(SemanaTbl nrSemana) {
		 this.nrSemana = nrSemana;
	}

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public AvaliadoTbl getIdAvaliadoFk() { 
		return this.idAvaliadoFk;
	}

	public void setIdAvaliadoFk(AvaliadoTbl idAvaliadoFk) {
		 this.idAvaliadoFk = idAvaliadoFk;
	}

}