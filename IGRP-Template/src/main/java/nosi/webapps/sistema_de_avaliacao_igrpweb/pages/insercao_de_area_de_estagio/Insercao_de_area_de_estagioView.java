package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.insercao_de_area_de_estagio;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Insercao_de_area_de_estagioView extends View {

	public Field estagiario;
	public Field mentor;
	public Field id_avaliado_pk;
	public Field nome;
	public Field area_tbl;
	public Field mentor_tbl;
	public Field id_avaliado;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_salvar;
	public IGRPButton btn_editar;

	public Insercao_de_area_de_estagioView(){

		this.setPageTitle("Inserção de Área de Estágio");
			
		form_1 = new IGRPForm("form_1","Inserção de Área e Mentor");

		table_1 = new IGRPTable("table_1","");

		estagiario = new ListField(model,"estagiario");
		estagiario.setLabel(gt("Estagiário"));
		estagiario.propertie().add("name","p_estagiario").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		mentor = new ListField(model,"mentor");
		mentor.setLabel(gt("Mentor"));
		mentor.propertie().add("name","p_mentor").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		id_avaliado_pk = new HiddenField(model,"id_avaliado_pk");
		id_avaliado_pk.setLabel(gt(""));
		id_avaliado_pk.propertie().add("name","p_id_avaliado_pk").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_avaliado_pk");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		area_tbl = new TextField(model,"area_tbl");
		area_tbl.setLabel(gt("Área"));
		area_tbl.propertie().add("name","p_area_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		mentor_tbl = new TextField(model,"mentor_tbl");
		mentor_tbl.setLabel(gt("Mentor"));
		mentor_tbl.propertie().add("name","p_mentor_tbl").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_avaliado");
		


		btn_salvar = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","salvar","submit_form","primary|fa-save","","");
		btn_salvar.propertie.add("id","button_1b50_16d4").add("type","form").add("class","primary").add("rel","salvar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","sistema_de_avaliacao_igrpweb","Insercao_de_area_de_estagio","editar","submit","warning|fa-pencil","","");
		btn_editar.propertie.add("id","button_f991_e05e").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(estagiario);
		form_1.addField(mentor);
		form_1.addField(id_avaliado_pk);

		table_1.addField(nome);
		table_1.addField(area_tbl);
		table_1.addField(mentor_tbl);
		table_1.addField(id_avaliado);

		form_1.addButton(btn_salvar);
		table_1.addButton(btn_editar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		estagiario.setValue(model);
		mentor.setValue(model);
		id_avaliado_pk.setValue(model);
		nome.setValue(model);
		area_tbl.setValue(model);
		mentor_tbl.setValue(model);
		id_avaliado.setValue(model);	

		table_1.loadModel(((Insercao_de_area_de_estagio) model).getTable_1());
		}
}
