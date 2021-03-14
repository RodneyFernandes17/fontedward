package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_mentores;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Parametrizacao_mentoresView extends View {

	public Field area;
	public Field mentor;
	public Field id_mentor;
	public Field area_tbl;
	public Field mentor_tbl;
	public Field id_mentor_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_salvar;
	public IGRPButton btn_editar;

	public Parametrizacao_mentoresView(){

		this.setPageTitle("Parametrização Mentores");
			
		form_1 = new IGRPForm("form_1","Inserção de Mentores");

		table_1 = new IGRPTable("table_1","");

		area = new ListField(model,"area");
		area.setLabel(gt("Nome da Área"));
		area.propertie().add("name","p_area").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_mentor = new HiddenField(model,"id_mentor");
		id_mentor.setLabel(gt(""));
		id_mentor.propertie().add("name","p_id_mentor").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_mentor");
		
		area_tbl = new TextField(model,"area_tbl");
		area_tbl.setLabel(gt("Área"));
		area_tbl.propertie().add("name","p_area_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		mentor_tbl = new TextField(model,"mentor_tbl");
		mentor_tbl.setLabel(gt("Mentor"));
		mentor_tbl.propertie().add("name","p_mentor_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_mentor_tbl = new HiddenField(model,"id_mentor_tbl");
		id_mentor_tbl.setLabel(gt(""));
		id_mentor_tbl.propertie().add("name","p_id_mentor_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","int").add("tag","id_mentor_tbl");
		


		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","salvar","submit_form","primary|fa-save","","");
		btn_salvar.propertie.add("id","button_1b50_16d4").add("type","form").add("class","primary").add("rel","salvar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Parametrizacao_mentores","editar","submit","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_f991_e05e").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(area);
		form_1.addField(mentor);
		form_1.addField(id_mentor);

		table_1.addField(area_tbl);
		table_1.addField(mentor_tbl);
		table_1.addField(id_mentor_tbl);

		form_1.addButton(btn_salvar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		area.setValue(model);
		mentor.setValue(model);
		id_mentor.setValue(model);
		area_tbl.setValue(model);
		mentor_tbl.setValue(model);
		id_mentor_tbl.setValue(model);	

		table_1.loadModel(((Parametrizacao_mentores) model).getTable_1());
		}
}
