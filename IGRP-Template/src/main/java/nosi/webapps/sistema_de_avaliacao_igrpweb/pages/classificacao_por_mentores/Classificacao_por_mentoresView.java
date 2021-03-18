package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.classificacao_por_mentores;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Classificacao_por_mentoresView extends View {

	public Field avaliador;
	public Field conteudo;
	public Field pontualidade;
	public Field dominio;
	public Field clareza;
	public Field proatividade;
	public Field nivel;
	public Field tarefas;
	public Field id_semanal;
	public Field id_avaliado;
	public IGRPTable table_1;

	public IGRPButton btn_editar;
	public IGRPButton btn_observacoes;

	public Classificacao_por_mentoresView(){

		this.setPageTitle("Classificação por Mentores");
			
		table_1 = new IGRPTable("table_1","");

		avaliador = new TextField(model,"avaliador");
		avaliador.setLabel(gt("Avaliador"));
		avaliador.propertie().add("name","p_avaliador").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		conteudo = new TextField(model,"conteudo");
		conteudo.setLabel(gt("Conteúdo"));
		conteudo.propertie().add("name","p_conteudo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		pontualidade = new TextField(model,"pontualidade");
		pontualidade.setLabel(gt("Pontualidade"));
		pontualidade.propertie().add("name","p_pontualidade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		dominio = new TextField(model,"dominio");
		dominio.setLabel(gt("Língua"));
		dominio.propertie().add("name","p_dominio").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		clareza = new TextField(model,"clareza");
		clareza.setLabel(gt("Clareza"));
		clareza.propertie().add("name","p_clareza").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		proatividade = new TextField(model,"proatividade");
		proatividade.setLabel(gt("Proatividade"));
		proatividade.propertie().add("name","p_proatividade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nivel = new TextField(model,"nivel");
		nivel.setLabel(gt("Nível"));
		nivel.propertie().add("name","p_nivel").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tarefas = new TextField(model,"tarefas");
		tarefas.setLabel(gt("Tarefas"));
		tarefas.propertie().add("name","p_tarefas").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_semanal = new HiddenField(model,"id_semanal");
		id_semanal.setLabel(gt(""));
		id_semanal.propertie().add("name","p_id_semanal").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_semanal");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_avaliado");
		


		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Classificacao_por_mentores","editar","mpsubmit|refresh","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_af44_c7fe").add("type","specific").add("flg_transaction","true").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_observacoes = new IGRPButton("Observações","sistema_de_avaliacao_igrpweb","Classificacao_por_mentores","observacoes","_blank","purple|fa-bullseye","","");
		btn_observacoes.propertie.add("id","button_e360_2862").add("type","specific").add("class","purple").add("rel","observacoes").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		table_1.addField(avaliador);
		table_1.addField(conteudo);
		table_1.addField(pontualidade);
		table_1.addField(dominio);
		table_1.addField(clareza);
		table_1.addField(proatividade);
		table_1.addField(nivel);
		table_1.addField(tarefas);
		table_1.addField(id_semanal);
		table_1.addField(id_avaliado);

		table_1.addButton(btn_editar);
		table_1.addButton(btn_observacoes);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		avaliador.setValue(model);
		conteudo.setValue(model);
		pontualidade.setValue(model);
		dominio.setValue(model);
		clareza.setValue(model);
		proatividade.setValue(model);
		nivel.setValue(model);
		tarefas.setValue(model);
		id_semanal.setValue(model);
		id_avaliado.setValue(model);	

		table_1.loadModel(((Classificacao_por_mentores) model).getTable_1());
		}
}
