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
 * @author: Nositeste 09-03-2021
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
	@Column(name = "nr_semana", nullable = false)
	private Integer nrSemana;
	@Column(name = "id_utilizador", nullable = false)
	private Integer idUtilizador;
	@Column(name = "nome_utilizador", nullable = false, length = 2147483647)
	private String nomeUtilizador;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
 	private Integer id;
	@Column(name = "estado_atual")
	private Boolean estadoAtual;
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

	public Integer getNrSemana() { 
		return this.nrSemana;
	}

	public void setNrSemana(Integer nrSemana) {
		 this.nrSemana = nrSemana;
	}

	public Integer getIdUtilizador() { 
		return this.idUtilizador;
	}

	public void setIdUtilizador(Integer idUtilizador) {
		 this.idUtilizador = idUtilizador;
	}

	public String getNomeUtilizador() { 
		return this.nomeUtilizador;
	}

	public void setNomeUtilizador(String nomeUtilizador) {
		 this.nomeUtilizador = nomeUtilizador;
	}

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public Boolean getEstadoAtual() { 
		return this.estadoAtual;
	}

	public void setEstadoAtual(Boolean estadoAtual) {
		 this.estadoAtual = estadoAtual;
	}

	public AvaliadoTbl getIdAvaliadoFk() { 
		return this.idAvaliadoFk;
	}

	public void setIdAvaliadoFk(AvaliadoTbl idAvaliadoFk) {
		 this.idAvaliadoFk = idAvaliadoFk;
	}

}