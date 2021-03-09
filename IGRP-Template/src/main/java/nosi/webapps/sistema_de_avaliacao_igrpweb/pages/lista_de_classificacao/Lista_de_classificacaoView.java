package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_classificacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import java.util.Map;
import java.util.LinkedHashMap;

public class Lista_de_classificacaoView extends View {

	public Field aprovacao;
	public Field foto;
	public Field nome;
	public Field formacao;
	public Field edicao;
	public Field data_de_realizacao;
	public Field classificacao;
	public Field id_teste;
	public Field id_avaliado;
	public IGRPTable table_1;

	public IGRPButton btn_ver;
	public IGRPButton btn_emitir_certificado;

	public Lista_de_classificacaoView(){

		this.setPageTitle("Lista de Classificação");
			
		table_1 = new IGRPTable("table_1","Lista de Classificados em formação igrpweb");

		aprovacao = new ColorField(model,"aprovacao");
		aprovacao.setLabel(gt("Aprovacao"));
		aprovacao.propertie().add("name","p_aprovacao").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt(""));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome = new PlainTextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		formacao = new PlainTextField(model,"formacao");
		formacao.setLabel(gt("Formação"));
		formacao.propertie().add("name","p_formacao").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		edicao = new PlainTextField(model,"edicao");
		edicao.setLabel(gt("Edição"));
		edicao.propertie().add("name","p_edicao").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		data_de_realizacao = new DateField(model,"data_de_realizacao");
		data_de_realizacao.setLabel(gt("Data de Realização"));
		data_de_realizacao.propertie().add("name","p_data_de_realizacao").add("type","date").add("range","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		classificacao = new TextField(model,"classificacao");
		classificacao.setLabel(gt("Classificação (máximo 40 Pontos)"));
		classificacao.propertie().add("name","p_classificacao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_teste = new HiddenField(model,"id_teste");
		id_teste.setLabel(gt(""));
		id_teste.propertie().add("name","p_id_teste").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_teste");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_avaliado");
		


		btn_ver = new IGRPButton("Ver","sistema_de_avaliacao_igrpweb","Lista_de_classificacao","ver","_blank","warning|fa-eye","","");
		btn_ver.propertie.add("id","button_3ef4_b061").add("type","specific").add("class","warning").add("rel","ver").add("refresh_components","");

		btn_emitir_certificado = new IGRPButton("Emitir Certificado","sistema_de_avaliacao_igrpweb","Lista_de_classificacao","emitir_certificado","mpsubmit|refresh","danger|fa-graduation-cap","","");
		btn_emitir_certificado.propertie.add("id","button_c93d_97f1").add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","emitir_certificado").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		table_1.addField(aprovacao);
		table_1.addField(foto);
		table_1.addField(nome);
		table_1.addField(formacao);
		table_1.addField(edicao);
		table_1.addField(data_de_realizacao);
		table_1.addField(classificacao);
		table_1.addField(id_teste);
		table_1.addField(id_avaliado);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_41dc2b_table_1 = new LinkedHashMap<>();
		color_41dc2b_table_1.put("#41dc2b","Mto Bom");
		table_1_colors.put("4",color_41dc2b_table_1);
		Map<String, String> color_e9ea26_table_1 = new LinkedHashMap<>();
		color_e9ea26_table_1.put("#e9ea26","Bom");
		table_1_colors.put("3",color_e9ea26_table_1);
		Map<String, String> color_f3943a_table_1 = new LinkedHashMap<>();
		color_f3943a_table_1.put("#f3943a","Suficiente");
		table_1_colors.put("2",color_f3943a_table_1);
		Map<String, String> color_ea2a15_table_1 = new LinkedHashMap<>();
		color_ea2a15_table_1.put("#ea2a15","Insuficiente");
		table_1_colors.put("1",color_ea2a15_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/
		table_1.addButton(btn_ver);
		table_1.addButton(btn_emitir_certificado);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		aprovacao.setValue(model);
		nome.setValue(model);
		formacao.setValue(model);
		edicao.setValue(model);
		data_de_realizacao.setValue(model);
		classificacao.setValue(model);
		id_teste.setValue(model);
		id_avaliado.setValue(model);	

		table_1.loadModel(((Lista_de_classificacao) model).getTable_1());
		}
}
