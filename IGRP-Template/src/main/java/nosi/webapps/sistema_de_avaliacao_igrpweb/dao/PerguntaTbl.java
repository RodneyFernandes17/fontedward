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

/**
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "pergunta_tbl", schema = "")
@NamedQuery(name = "PerguntaTbl.findAll", query = "SELECT t FROM PerguntaTbl t")
public class PerguntaTbl extends BaseActiveRecord<PerguntaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pergunta", updatable = false, nullable = false)
 	private Integer idPergunta;
	@Column(name = "pergunta", nullable = false, length = 2147483647)
	private String pergunta;
	@Column(name = "conceito", nullable = false, length = 2147483647)
	private String conceito;
	@Column(name = "nivel", nullable = false)
	private Integer nivel;
	@Column(name = "data")
	private LocalDateTime data;

	public Integer getIdPergunta() { 
		return this.idPergunta;
	}

	public void setIdPergunta(Integer idPergunta) {
		 this.idPergunta = idPergunta;
	}

	public String getPergunta() { 
		return this.pergunta;
	}

	public void setPergunta(String pergunta) {
		 this.pergunta = pergunta;
	}

	public String getConceito() { 
		return this.conceito;
	}

	public void setConceito(String conceito) {
		 this.conceito = conceito;
	}

	public Integer getNivel() { 
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		 this.nivel = nivel;
	}

	public LocalDateTime getData() { 
		return this.data;
	}

	public void setData(LocalDateTime data) {
		 this.data = data;
	}

}