package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.gestao_de_formacoes;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Gestao_de_formacoesView extends View {

	public Field nome;
	public Field data_inicio;
	public Field data_fim;
	public Field id_formacao;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_realizar_avaliacao;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;
	public IGRPButton btn_resultado_teste;

	public Gestao_de_formacoesView(){

		this.setPageTitle("Gestão de Formações");
			
		table_1 = new IGRPTable("table_1","Lista de Formações");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_inicio = new TextField(model,"data_inicio");
		data_inicio.setLabel(gt("Data início"));
		data_inicio.propertie().add("name","p_data_inicio").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_fim = new TextField(model,"data_fim");
		data_fim.setLabel(gt("Data fim"));
		data_fim.propertie().add("name","p_data_fim").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_formacao = new HiddenField(model,"id_formacao");
		id_formacao.setLabel(gt(""));
		id_formacao.propertie().add("name","p_id_formacao").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_formacao");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo = new IGRPButton("Novo","sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","novo","modal|refresh","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("flg_transaction","true").add("refresh_components","");

		btn_realizar_avaliacao = new IGRPButton("Realizar Avaliação","sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","realizar_avaliacao","submit","grey|fa-file-text","","");
		btn_realizar_avaliacao.propertie.add("id","button_d1a3_e373").add("type","specific").add("class","grey").add("rel","realizar_avaliacao").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","editar","modal|refresh","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_abcf_05cc").add("type","specific").add("flg_transaction","true").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","eliminar","alert_submit","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_8031_262e").add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","eliminar").add("refresh_components","");

		btn_resultado_teste = new IGRPButton("Resultado Teste","sistema_de_avaliacao_igrpweb","Gestao_de_formacoes","resultado_teste","modal","purple|fa-check-circle","","");
		btn_resultado_teste.propertie.add("id","button_266d_a9ce").add("type","specific").add("class","purple").add("rel","resultado_teste").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(nome);
		table_1.addField(data_inicio);
		table_1.addField(data_fim);
		table_1.addField(id_formacao);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_realizar_avaliacao);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		table_1.addButton(btn_resultado_teste);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		data_inicio.setValue(model);
		data_fim.setValue(model);
		id_formacao.setValue(model);	

		table_1.loadModel(((Gestao_de_formacoes) model).getTable_1());
		}
}
