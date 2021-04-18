package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_teste;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Parametrizacao_testeView extends View {

	public Field nome_do_teste;
	public Field id_teste;
	public Field teste_tbl;
	public Field id_teste_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_salvar;
	public IGRPButton btn_editar;

	public Parametrizacao_testeView(){

		this.setPageTitle("Parametrização Teste");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		nome_do_teste = new TextField(model,"nome_do_teste");
		nome_do_teste.setLabel(gt("Nome do Teste"));
		nome_do_teste.propertie().add("name","p_nome_do_teste").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_teste = new HiddenField(model,"id_teste");
		id_teste.setLabel(gt(""));
		id_teste.propertie().add("name","p_id_teste").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_teste");
		
		teste_tbl = new TextField(model,"teste_tbl");
		teste_tbl.setLabel(gt("Teste"));
		teste_tbl.propertie().add("name","p_teste_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_teste_tbl = new HiddenField(model,"id_teste_tbl");
		id_teste_tbl.setLabel(gt(""));
		id_teste_tbl.propertie().add("name","p_id_teste_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_teste_tbl");
		


		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Parametrizacao_teste","salvar","submit","primary|fa-save","","");
		btn_salvar.propertie.add("id","button_b7b2_a4a0").add("type","form").add("class","primary").add("rel","salvar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Parametrizacao_teste","editar","submit","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_f30d_e817").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome_do_teste);
		form_1.addField(id_teste);

		table_1.addField(teste_tbl);
		table_1.addField(id_teste_tbl);

		form_1.addButton(btn_salvar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_do_teste.setValue(model);
		id_teste.setValue(model);
		teste_tbl.setValue(model);
		id_teste_tbl.setValue(model);	

		table_1.loadModel(((Parametrizacao_teste) model).getTable_1());
		}
}
