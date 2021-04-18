package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.validation.constraints.Size;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.validation.constraints.NotBlank;

/**
 * @author: Nositeste 17-04-2021
*/

@Entity
@Table(name = "pergunta_tbl", schema = "public")
@NamedQuery(name = "PerguntaTbl.findAll", query = "SELECT t FROM PerguntaTbl t")
public class PerguntaTbl extends BaseActiveRecord<PerguntaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pergunta", nullable = false, updatable = false)
 	private Integer idPergunta;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "pergunta")
	private String pergunta;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "conceito")
	private String conceito;
	@Column(name = "data")
	private LocalDateTime data;
	@ManyToOne
	@JoinColumn(name = "enunciado_id", foreignKey = @ForeignKey(name = "enuncido_fk"))
	private EnunciadoTbl enunciadoId;

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

	public LocalDateTime getData() { 
		return this.data;
	}

	public void setData(LocalDateTime data) {
		 this.data = data;
	}

	public EnunciadoTbl getEnunciadoId() { 
		return this.enunciadoId;
	}

	public void setEnunciadoId(EnunciadoTbl enunciadoId) {
		 this.enunciadoId = enunciadoId;
	}

}