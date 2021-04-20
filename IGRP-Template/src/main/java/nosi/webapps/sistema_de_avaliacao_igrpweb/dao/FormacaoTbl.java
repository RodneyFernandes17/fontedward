package nosi.webapps.sistema_de_avaliacao_igrpweb.dao;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.persistence.ForeignKey;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import nosi.base.ActiveRecord.BaseActiveRecord;

/**
 * @author: Nositeste 19-04-2021
*/

@Entity
@Table(name = "formacao_tbl", schema = "public")
@NamedQuery(name = "FormacaoTbl.findAll", query = "SELECT t FROM FormacaoTbl t")
public class FormacaoTbl extends BaseActiveRecord<FormacaoTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "nome")
	private String nome;
	@NotNull
	@Column(name = "hora")
	private Integer hora;
	@NotNull
	@Column(name = "data_in")
	private LocalDate dataIn;
	@NotNull
	@Column(name = "data_fim")
	private LocalDate dataFim;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "local")
	private String local;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "gformadores")
	private String gformadores;
	@NotBlank
	@Size(min = 1, max = 2147483647)
	@Column(name = "topicos")
	private String topicos;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "enunciado_id", foreignKey = @ForeignKey(name = "enun_key"))
	private EnunciadoTbl enunciadoId;
	@Size(max = 2147483647)
	@Column(name = "codigo_enun")
	private String codigoEnun;
	@Size(max = 2147483647)
	@Column(name = "instituicao")
	private String instituicao;

	public String getNome() { 
		return this.nome;
	}

	public void setNome(String nome) {
		 this.nome = nome;
	}

	public Integer getHora() { 
		return this.hora;
	}

	public void setHora(Integer hora) {
		 this.hora = hora;
	}

	public LocalDate getDataIn() { 
		return this.dataIn;
	}

	public void setDataIn(LocalDate dataIn) {
		 this.dataIn = dataIn;
	}

	public LocalDate getDataFim() { 
		return this.dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		 this.dataFim = dataFim;
	}

	public String getLocal() { 
		return this.local;
	}

	public void setLocal(String local) {
		 this.local = local;
	}

	public String getGformadores() { 
		return this.gformadores;
	}

	public void setGformadores(String gformadores) {
		 this.gformadores = gformadores;
	}

	public String getTopicos() { 
		return this.topicos;
	}

	public void setTopicos(String topicos) {
		 this.topicos = topicos;
	}

	public Integer getId() { 
		return this.id;
	}

	public void setId(Integer id) {
		 this.id = id;
	}

	public EnunciadoTbl getEnunciadoId() { 
		return this.enunciadoId;
	}

	public void setEnunciadoId(EnunciadoTbl enunciadoId) {
		 this.enunciadoId = enunciadoId;
	}

	public String getCodigoEnun() { 
		return this.codigoEnun;
	}

	public void setCodigoEnun(String codigoEnun) {
		 this.codigoEnun = codigoEnun;
	}

	public String getInstituicao() { 
		return this.instituicao;
	}

	public void setInstituicao(String instituicao) {
		 this.instituicao = instituicao;
	}

}