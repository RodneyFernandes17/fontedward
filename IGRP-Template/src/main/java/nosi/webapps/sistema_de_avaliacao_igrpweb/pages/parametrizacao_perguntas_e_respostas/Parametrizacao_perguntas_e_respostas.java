package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_perguntas_e_respostas;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class Parametrizacao_perguntas_e_respostas extends Model{		

	@NotNull()
	@RParam(rParamName = "p_nivel")
	private String nivel;

	@RParam(rParamName = "p_conceito")
	private String conceito;

	@RParam(rParamName = "p_pergunta")
	private String pergunta;

	@RParam(rParamName = "p_id_pergunta")
	private String id_pergunta;
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	public String getNivel(){
		return this.nivel;
	}
	
	public void setConceito(String conceito){
		this.conceito = conceito;
	}
	public String getConceito(){
		return this.conceito;
	}
	
	public void setPergunta(String pergunta){
		this.pergunta = pergunta;
	}
	public String getPergunta(){
		return this.pergunta;
	}
	
	public void setId_pergunta(String id_pergunta){
		this.id_pergunta = id_pergunta;
	}
	public String getId_pergunta(){
		return this.id_pergunta;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair resposta;
private Pair resposta_certa;
		private Pair resposta_certa_check;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setResposta(Pair resposta){
			this.resposta = resposta;
		}
		public Pair getResposta(){
			return this.resposta;
		}

		public void setResposta_certa(Pair resposta_certa){
			this.resposta_certa = resposta_certa;
		}
		public Pair getResposta_certa(){
			return this.resposta_certa;
		}
		
		public void setResposta_certa_check(Pair resposta_certa_check){
			this.resposta_certa_check = resposta_certa_check;
		}
		public Pair getResposta_certa_check(){
			return this.resposta_certa_check;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

}
