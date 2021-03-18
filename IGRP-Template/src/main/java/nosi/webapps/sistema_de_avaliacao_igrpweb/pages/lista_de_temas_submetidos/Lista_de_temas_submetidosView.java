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
	public IGRPTable table_1;


	public Lista_de_temas_submetidosView(){

		this.setPageTitle("Lista de Temas Submetidos");
			
		table_1 = new IGRPTable("table_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tema_semanal = new TextField(model,"tema_semanal");
		tema_semanal.setLabel(gt("Tema Semanal"));
		tema_semanal.propertie().add("name","p_tema_semanal").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_de_envio = new DateField(model,"data_de_envio");
		data_de_envio.setLabel(gt("Data de Envio"));
		data_de_envio.propertie().add("name","p_data_de_envio").add("type","date").add("range","false").add("disableWeekends","false").add("daysoff","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		


		
	}
		
	@Override
	public void render(){
		
		table_1.addField(nome);
		table_1.addField(tema_semanal);
		table_1.addField(data_de_envio);

		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		tema_semanal.setValue(model);
		data_de_envio.setValue(model);	

		table_1.loadModel(((Lista_de_temas_submetidos) model).getTable_1());
		}
}
