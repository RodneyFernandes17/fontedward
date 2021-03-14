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
 * @author: Nositeste 13-03-2021
*/

@Entity
@Table(name = "imagens_tbl", schema = "")
@NamedQuery(name = "ImagensTbl.findAll", query = "SELECT t FROM ImagensTbl t")
public class ImagensTbl extends BaseActiveRecord<ImagensTbl> {

	private static final long serialVersionUID = 1L;

	// Change Integer type to BigDecimal if the number is very large!

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_imagem", updatable = false, nullable = false)
 	private Integer idImagem;
	@Column(name = "id_foto", length = 2147483647)
	private String idFoto;
	@Column(name = "descricao", length = 2147483647)
	private String descricao;

	public Integer getIdImagem() { 
		return this.idImagem;
	}

	public void setIdImagem(Integer idImagem) {
		 this.idImagem = idImagem;
	}

	public String getIdFoto() { 
		return this.idFoto;
	}

	public void setIdFoto(String idFoto) {
		 this.idFoto = idFoto;
	}

	public String getDescricao() { 
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		 this.descricao = descricao;
	}

}