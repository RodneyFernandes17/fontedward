package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Table;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 * @author: Nositeste 15-04-2021
*/

@Entity
@Table(name = "semana_tbl", schema = "public")
@NamedQuery(name = "SemanaTbl.findAll", query = "SELECT t FROM SemanaTbl t")
public class SemanaTbl extends BaseActiveRecord<SemanaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@NotNull
	@Column(name = "nr_semana")
	private Integer nrSemana;
	@NotNull
	@Column(name = "atual")
	private Boolean atual;
	@Column(name = "data_atualiza")
	private LocalDateTime dataAtualiza;
	@Size(max = 2147483647)
	@Column(name = "nome_modificador")
	private String nomeModificador;

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

	public LocalDateTime getDataAtualiza() { 
		return this.dataAtualiza;
	}

	public void setDataAtualiza(LocalDateTime dataAtualiza) {
		 this.dataAtualiza = dataAtualiza;
	}

	public String getNomeModificador() { 
		return this.nomeModificador;
	}

	public void setNomeModificador(String nomeModificador) {
		 this.nomeModificador = nomeModificador;
	}

}