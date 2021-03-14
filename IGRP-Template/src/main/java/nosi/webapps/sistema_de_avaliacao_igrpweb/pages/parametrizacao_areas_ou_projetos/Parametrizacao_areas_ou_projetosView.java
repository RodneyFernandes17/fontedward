package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_areas_ou_projetos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Parametrizacao_areas_ou_projetosView extends View {

	public Field area;
	public Field id_area;
	public Field area_tbl;
	public Field id_area_tbl;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_salvar;
	public IGRPButton btn_editar;

	public Parametrizacao_areas_ou_projetosView(){

		this.setPageTitle("Parametrização Áreas ou Projetos");
			
		form_1 = new IGRPForm("form_1","Inserção de Área ou Projeto");

		table_1 = new IGRPTable("table_1","");

		area = new TextField(model,"area");
		area.setLabel(gt("Nome da Área"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_area = new HiddenField(model,"id_area");
		id_area.setLabel(gt(""));
		id_area.propertie().add("name","p_id_area").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_area");
		
		area_tbl = new TextField(model,"area_tbl");
		area_tbl.setLabel(gt("Área"));
		area_tbl.propertie().add("name","p_area_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_area_tbl = new HiddenField(model,"id_area_tbl");
		id_area_tbl.setLabel(gt(""));
		id_area_tbl.propertie().add("name","p_id_area_tbl").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","int").add("tag","id_area_tbl");
		


		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","salvar","submit_form","primary|fa-save","","");
		btn_salvar.propertie.add("id","button_1b50_16d4").add("type","form").add("class","primary").add("rel","salvar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Parametrizacao_areas_ou_projetos","editar","submit","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_f991_e05e").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(area);
		form_1.addField(id_area);

		table_1.addField(area_tbl);
		table_1.addField(id_area_tbl);

		form_1.addButton(btn_salvar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		area.setValue(model);
		id_area.setValue(model);
		area_tbl.setValue(model);
		id_area_tbl.setValue(model);	

		table_1.loadModel(((Parametrizacao_areas_ou_projetos) model).getTable_1());
		}
}
