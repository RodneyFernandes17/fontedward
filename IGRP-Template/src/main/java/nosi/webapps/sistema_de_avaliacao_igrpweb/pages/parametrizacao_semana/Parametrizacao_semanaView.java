package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_semana;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Parametrizacao_semanaView extends View {

	public Field semana;
	public Field atual;
	public Field atual_check;
	public Field semana_tbl;
	public Field atual_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_salvar;
	public IGRPButton btn_editar;

	public Parametrizacao_semanaView(){

		this.setPageTitle("Parametrização Semana");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		semana = new NumberField(model,"semana");
		semana.setLabel(gt("Semana"));
		semana.propertie().add("name","p_semana").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		atual = new CheckBoxField(model,"atual");
		atual.setLabel(gt("Atual"));
		atual.propertie().add("name","p_atual").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("switch","false").add("check","true");
		
		semana_tbl = new NumberField(model,"semana_tbl");
		semana_tbl.setLabel(gt("Semana"));
		semana_tbl.propertie().add("name","p_semana_tbl").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","int");
		
		atual_tbl = new TextField(model,"atual_tbl");
		atual_tbl.setLabel(gt("Atual"));
		atual_tbl.propertie().add("name","p_atual_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		


		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Parametrizacao_semana","salvar","submit","primary|fa-save","","");
		btn_salvar.propertie.add("id","button_b7b2_a4a0").add("type","form").add("class","primary").add("rel","salvar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Parametrizacao_semana","editar","submit","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_f30d_e817").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(semana);
		form_1.addField(atual);

		table_1.addField(semana_tbl);
		table_1.addField(atual_tbl);

		form_1.addButton(btn_salvar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		semana.setValue(model);
		atual.setValue(model);
		semana_tbl.setValue(model);
		atual_tbl.setValue(model);	

		table_1.loadModel(((Parametrizacao_semana) model).getTable_1());
		}
}
