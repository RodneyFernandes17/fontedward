package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

/**
 * @author: Rodney Fernandes
 * 2021-01-06
*/

@Entity
@Table(name="resposta_tbl",schema="public")
@NamedQuery(name="RespostaTbl.findAll", query="SELECT b FROM RespostaTbl b")
public class RespostaTbl extends BaseActiveRecord<RespostaTbl> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_resposta", nullable=false)
	private Integer idResposta;
	@Column(name="resposta",nullable=false)
	private String resposta;
	@Column(name="resposta_certa",nullable=false)
	private String respostaCerta;
	@ManyToOne
	@JoinColumn(name="id_pergunta_fk", foreignKey=@ForeignKey(name="pergunta_fk"), nullable=false)
	private PerguntaTbl idPerguntaFk;

	public Integer getIdResposta() {
		return idResposta;
	}
	public void setIdResposta(Integer idResposta) {
		this.idResposta = idResposta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getRespostaCerta() {
		return respostaCerta;
	}
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	public PerguntaTbl getIdPerguntaFk() {
		return idPerguntaFk;
	}
	public void setIdPerguntaFk(PerguntaTbl idPerguntaFk) {
		this.idPerguntaFk = idPerguntaFk;
	}
}