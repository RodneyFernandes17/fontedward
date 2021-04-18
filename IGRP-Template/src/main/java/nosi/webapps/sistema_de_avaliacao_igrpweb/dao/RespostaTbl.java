package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ForeignKey;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author: Nositeste 15-04-2021
*/

@Entity
@Table(name = "resposta_tbl", schema = "public")
@NamedQuery(name = "RespostaTbl.findAll", query = "SELECT t FROM RespostaTbl t")
public class RespostaTbl extends BaseActiveRecord<RespostaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resposta", nullable = false, updatable = false)
 	private Integer idResposta;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "resposta")
	private String resposta;
	@ManyToOne
	@JoinColumn(name = "id_pergunta_fk", foreignKey = @ForeignKey(name = "pergunta_fk"))
	private PerguntaTbl idPerguntaFk;
	@Column(name = "resposta_certa")
	private Integer respostaCerta;

	public Integer getIdResposta() { 
		return this.idResposta;
	}

	public void setIdResposta(Integer idResposta) {
		 this.idResposta = idResposta;
	}

	public String getResposta() { 
		return this.resposta;
	}

	public void setResposta(String resposta) {
		 this.resposta = resposta;
	}

	public PerguntaTbl getIdPerguntaFk() { 
		return this.idPerguntaFk;
	}

	public void setIdPerguntaFk(PerguntaTbl idPerguntaFk) {
		 this.idPerguntaFk = idPerguntaFk;
	}

	public Integer getRespostaCerta() { 
		return this.respostaCerta;
	}

	public void setRespostaCerta(Integer respostaCerta) {
		 this.respostaCerta = respostaCerta;
	}

}