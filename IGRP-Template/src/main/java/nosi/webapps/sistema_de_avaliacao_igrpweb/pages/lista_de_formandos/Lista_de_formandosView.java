package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_formandos;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_de_formandosView extends View {

	public Field foto;
	public Field nome;
	public Field formacao;
	public Field edicao;
	public Field chave_autenticacao;
	public Field id_formando;
	public IGRPTable table_1;

	public IGRPButton btn_ver;
	public IGRPButton btn_emitir_certificado;

	public Lista_de_formandosView(){

		this.setPageTitle("Lista de Formandos");
			
		table_1 = new IGRPTable("table_1","Lista de Classificados em formação igrpweb");

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
		
		chave_autenticacao = new TextField(model,"chave_autenticacao");
		chave_autenticacao.setLabel(gt("Chave Autenticação"));
		chave_autenticacao.propertie().add("name","p_chave_autenticacao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_formando = new HiddenField(model,"id_formando");
		id_formando.setLabel(gt(""));
		id_formando.propertie().add("name","p_id_formando").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_formando");
		


		btn_ver = new IGRPButton("Ver","sistema_de_avaliacao_igrpweb","Lista_de_formandos","ver","_blank","warning|fa-eye","","");
		btn_ver.propertie.add("id","button_3ef4_b061").add("type","specific").add("class","warning").add("rel","ver").add("refresh_components","");

		btn_emitir_certificado = new IGRPButton("Emitir Certificado","sistema_de_avaliacao_igrpweb","Lista_de_formandos","emitir_certificado","mpsubmit","danger|fa-graduation-cap","","");
		btn_emitir_certificado.propertie.add("id","button_c93d_97f1").add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","emitir_certificado").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		table_1.addField(foto);
		table_1.addField(nome);
		table_1.addField(formacao);
		table_1.addField(edicao);
		table_1.addField(chave_autenticacao);
		table_1.addField(id_formando);

		table_1.addButton(btn_ver);
		table_1.addButton(btn_emitir_certificado);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		formacao.setValue(model);
		edicao.setValue(model);
		chave_autenticacao.setValue(model);
		id_formando.setValue(model);	

		table_1.loadModel(((Lista_de_formandos) model).getTable_1());
		}
}
