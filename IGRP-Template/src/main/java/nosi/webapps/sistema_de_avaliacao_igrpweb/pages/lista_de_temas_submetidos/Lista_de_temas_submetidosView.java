package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_temas_submetidos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_de_temas_submetidosView extends View {

	public Field nome;
	public Field tema_semanal;
	public Field data_de_envio;
	public Field id_avaliado;
	public IGRPTable table_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo_tema;

	public Lista_de_temas_submetidosView(){

		this.setPageTitle("Lista de Temas Submetidos");
			
		table_1 = new IGRPTable("table_1","");

		form_1 = new IGRPForm("form_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tema_semanal = new TextField(model,"tema_semanal");
		tema_semanal.setLabel(gt("Tema Semanal"));
		tema_semanal.propertie().add("name","p_tema_semanal").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_de_envio = new DateField(model,"data_de_envio");
		data_de_envio.setLabel(gt("Data de Envio"));
		data_de_envio.propertie().add("name","p_data_de_envio").add("type","date").add("range","false").add("disableWeekends","false").add("daysoff","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo_tema = new IGRPButton("Novo Tema","sistema_de_avaliacao_igrpweb","Lista_de_temas_submetidos","novo_tema","mpsubmit|refresh","purple|fa-plus-square","","");
		btn_novo_tema.propertie.add("type","specific").add("rel","novo_tema").add("flg_transaction","true").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(nome);
		table_1.addField(tema_semanal);
		table_1.addField(data_de_envio);

		form_1.addField(id_avaliado);

		toolsbar_1.addButton(btn_novo_tema);
		this.addToPage(table_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		tema_semanal.setValue(model);
		data_de_envio.setValue(model);
		id_avaliado.setValue(model);	

		table_1.loadModel(((Lista_de_temas_submetidos) model).getTable_1());
		}
}
