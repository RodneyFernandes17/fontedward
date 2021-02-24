package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author: Rodney Fernandes
 * 2021-01-06
*/

@Entity
@Table(name="pergunta_tbl",schema="public")
@NamedQuery(name="PerguntaTbl.findAll", query="SELECT b FROM PerguntaTbl b")
public class PerguntaTbl extends BaseActiveRecord<PerguntaTbl> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pergunta", nullable=false)
	private Integer idPergunta;
	@Column(name="pergunta",nullable=false)
	private String pergunta;
	@Column(name="conceito",nullable=false)
	private String conceito;
	@Column(name="nivel",nullable=false,length=11)
	private Integer nivel;
	@Column(name="data")
	@UpdateTimestamp
	private LocalDateTime data;

	public Integer getIdPergunta() {
		return idPergunta;
	}
	public void setIdPergunta(Integer idPergunta) {
		this.idPergunta = idPergunta;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public LocalDateTime getData() {
		return data;
	}
}