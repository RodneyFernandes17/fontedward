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
@Table(name = "resposta_tbl", schema = "")
@NamedQuery(name = "RespostaTbl.findAll", query = "SELECT t FROM RespostaTbl t")
public class RespostaTbl extends BaseActiveRecord<RespostaTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_resposta", updatable = false, nullable = false)
 	private Integer idResposta;
	@Column(name = "resposta", nullable = false, length = 2147483647)
	private String resposta;
	@Column(name = "resposta_certa", nullable = false, length = 2147483647)
	private String respostaCerta;
	@ManyToOne
	@JoinColumn(name = "id_pergunta_fk", foreignKey = @ForeignKey(name = "pergunta_fk"), nullable = false)
	private PerguntaTbl idPerguntaFk;

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

	public String getRespostaCerta() { 
		return this.respostaCerta;
	}

	public void setRespostaCerta(String respostaCerta) {
		 this.respostaCerta = respostaCerta;
	}

	public PerguntaTbl getIdPerguntaFk() { 
		return this.idPerguntaFk;
	}

	public void setIdPerguntaFk(PerguntaTbl idPerguntaFk) {
		 this.idPerguntaFk = idPerguntaFk;
	}

}