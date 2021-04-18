package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.time.LocalDate;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.validation.constraints.Size;
import javax.persistence.ForeignKey;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.NamedQuery;

/**
 * @author: Nositeste 17-04-2021
*/

@Entity
@Table(name = "avaliado_tbl", schema = "public")
@NamedQuery(name = "AvaliadoTbl.findAll", query = "SELECT t FROM AvaliadoTbl t")
public class AvaliadoTbl extends BaseActiveRecord<AvaliadoTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_avaliado", nullable = false, updatable = false)
 	private Integer idAvaliado;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "id_foto")
	private String idFoto;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "nome")
	private String nome;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "ilha")
	private String ilha;
	@Size(max = 2147483647)
	@Column(name = "edicao")
	private String edicao;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "formacao")
	private String formacao;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "universidade")
	private String universidade;
	@Size(max = 2147483647)
	@Column(name = "outra_form")
	private String outraForm;
	@Size(max = 2147483647)
	@Column(name = "outra_univ")
	private String outraUniv;
	@NotNull
	@Column(name = "contacto")
	private Integer contacto;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "email")
	private String email;
	@Column(name = "id_utilizador")
	private Integer idUtilizador;
	@ManyToOne
	@JoinColumn(name = "id_mentor_fk", foreignKey = @ForeignKey(name = "mentor_fk"))
	private MentorTbl idMentorFk;
	@Size(max = 2147483647)
	@Column(name = "instituicao")
	private String instituicao;
	@Column(name = "data_registro")
	private LocalDate dataRegistro;

	public Integer getIdAvaliado() { 
		return this.idAvaliado;
	}

	public void setIdAvaliado(Integer idAvaliado) {
		 this.idAvaliado = idAvaliado;
	}

	public String getIdFoto() { 
		return this.idFoto;
	}

	public void setIdFoto(String idFoto) {
		 this.idFoto = idFoto;
	}

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public String getIlha() { 
		return this.ilha;
	}

	public void setIlha(String ilha) {
		 this.ilha = ilha;
	}

	public String getEdicao() { 
		return this.edicao;
	}

	public void setEdicao(String edicao) {
		 this.edicao = edicao;
	}

	public String getFormacao() { 
		return this.formacao;
	}

	public void setFormacao(String formacao) {
		 this.formacao = formacao;
	}

	public String getUniversidade() { 
		return this.universidade;
	}

	public void setUniversidade(String universidade) {
		 this.universidade = universidade;
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

	public Integer getContacto() { 
		return this.contacto;
	}

	public void setContacto(Integer contacto) {
		 this.contacto = contacto;
	}

	public String getEmail() { 
		return this.email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public Integer getIdUtilizador() { 
		return this.idUtilizador;
	}

	public void setIdUtilizador(Integer idUtilizador) {
		 this.idUtilizador = idUtilizador;
	}

	public MentorTbl getIdMentorFk() { 
		return this.idMentorFk;
	}

	public void setIdMentorFk(MentorTbl idMentorFk) {
		 this.idMentorFk = idMentorFk;
	}

	public String getInstituicao() { 
		return this.instituicao;
	}

	public void setInstituicao(String instituicao) {
		 this.instituicao = instituicao;
	}

	public LocalDate getDataRegistro() { 
		return this.dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		 this.dataRegistro = dataRegistro;
	}

}