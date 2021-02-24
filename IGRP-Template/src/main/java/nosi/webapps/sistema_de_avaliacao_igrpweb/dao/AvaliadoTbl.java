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
 * @author: Nositeste 24-02-2021
*/

@Entity
@Table(name = "avaliado_tbl", schema = "")
@NamedQuery(name = "AvaliadoTbl.findAll", query = "SELECT t FROM AvaliadoTbl t")
public class AvaliadoTbl extends BaseActiveRecord<AvaliadoTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_avaliado", updatable = false, nullable = false)
 	private Integer idAvaliado;
	@Column(name = "contacto", nullable = false)
	private Integer contacto;
	@Column(name = "edicao", nullable = false, length = 255)
	private String edicao;
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	@Column(name = "formacao", nullable = false, length = 255)
	private String formacao;
	@Column(name = "id_foto", nullable = false, length = 255)
	private String idFoto;
	@Column(name = "ilha", nullable = false, length = 255)
	private String ilha;
	@Column(name = "nivel", nullable = false)
	private Integer nivel;
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	@Column(name = "outra_form", length = 255)
	private String outraForm;
	@Column(name = "outra_univ", length = 255)
	private String outraUniv;
	@Column(name = "universidade", nullable = false, length = 255)
	private String universidade;
	@Column(name = "formador", length = 2147483647)
	private String formador;
	@Column(name = "horas")
	private Integer horas;
	@Column(name = "chave_aut", length = 2147483647)
	private String chaveAut;

	public Integer getIdAvaliado() { 
		return this.idAvaliado;
	}

	public void setIdAvaliado(Integer idAvaliado) {
		 this.idAvaliado = idAvaliado;
	}

	public Integer getContacto() { 
		return this.contacto;
	}

	public void setContacto(Integer contacto) {
		 this.contacto = contacto;
	}

	public String getEdicao() { 
		return this.edicao;
	}

	public void setEdicao(String edicao) {
		 this.edicao = edicao;
	}

	public String getEmail() { 
		return this.email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public String getFormacao() { 
		return this.formacao;
	}

	public void setFormacao(String formacao) {
		 this.formacao = formacao;
	}

	public String getIdFoto() { 
		return this.idFoto;
	}

	public void setIdFoto(String idFoto) {
		 this.idFoto = idFoto;
	}

	public String getIlha() { 
		return this.ilha;
	}

	public void setIlha(String ilha) {
		 this.ilha = ilha;
	}

	public Integer getNivel() { 
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		 this.nivel = nivel;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getOutraForm() { 
		return this.outraForm;
	}

	public void setOutraForm(String outraForm) {
		 this.outraForm = outraForm;
	}

	public String getOutraUniv() { 
		return this.outraUniv;
	}

	public void setOutraUniv(String outraUniv) {
		 this.outraUniv = outraUniv;
	}

	public String getUniversidade() { 
		return this.universidade;
	}

	public void setUniversidade(String universidade) {
		 this.universidade = universidade;
	}

	public String getFormador() { 
		return this.formador;
	}

	public void setFormador(String formador) {
		 this.formador = formador;
	}

	public Integer getHoras() { 
		return this.horas;
	}

	public void setHoras(Integer horas) {
		 this.horas = horas;
	}

	public String getChaveAut() { 
		return this.chaveAut;
	}

	public void setChaveAut(String chaveAut) {
		 this.chaveAut = chaveAut;
	}

}