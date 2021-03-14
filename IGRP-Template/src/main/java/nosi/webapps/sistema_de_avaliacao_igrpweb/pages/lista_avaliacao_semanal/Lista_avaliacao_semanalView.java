package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_avaliacao_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Lista_avaliacao_semanalView extends View {

	public Field foto;
	public Field nome;
	public Field edicao;
	public Field area;
	public Field mentor;
	public Field id_teste;
	public Field id_avaliado;
	public Field id_utilizador;
	public IGRPTable table_1;

	public IGRPButton btn_ver;
	public IGRPButton btn_avaliacao_semanal;
	public IGRPButton btn_inserir_tema;
	public IGRPButton btn_historico_de_avaliacoes;

	public Lista_avaliacao_semanalView(){

		this.setPageTitle("Lista Avaliação Semanal");
			
		table_1 = new IGRPTable("table_1","Lista de Estagiários");

		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt(""));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome = new PlainTextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		edicao = new PlainTextField(model,"edicao");
		edicao.setLabel(gt("Edição Nosi Akademia"));
		edicao.propertie().add("name","p_edicao").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		area = new TextField(model,"area");
		area.setLabel(gt("Área ou Projeto"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor Principal"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_teste = new HiddenField(model,"id_teste");
		id_teste.setLabel(gt(""));
		id_teste.propertie().add("name","p_id_teste").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_teste");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_avaliado");
		
		id_utilizador = new HiddenField(model,"id_utilizador");
		id_utilizador.setLabel(gt(""));
		id_utilizador.propertie().add("name","p_id_utilizador").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_utilizador");
		


		btn_ver = new IGRPButton("Ver","sistema_de_avaliacao_igrpweb","Lista_avaliacao_semanal","ver","_blank","warning|fa-eye","","");
		btn_ver.propertie.add("id","button_3ef4_b061").add("type","specific").add("flg_transaction","true").add("class","warning").add("rel","ver").add("refresh_components","");

		btn_avaliacao_semanal = new IGRPButton("Avaliação Semanal","sistema_de_avaliacao_igrpweb","Lista_avaliacao_semanal","avaliacao_semanal","mpsubmit|refresh","purple|fa-drivers-license","","");
		btn_avaliacao_semanal.propertie.add("id","button_49d2_25ad").add("type","specific").add("flg_transaction","true").add("class","purple").add("rel","avaliacao_semanal").add("refresh_components","");

		btn_inserir_tema = new IGRPButton("Inserir Tema","sistema_de_avaliacao_igrpweb","Lista_avaliacao_semanal","inserir_tema","mpsubmit|refresh","danger|fa-legal","","");
		btn_inserir_tema.propertie.add("id","button_4fff_67f5").add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","inserir_tema").add("refresh_components","");

		btn_historico_de_avaliacoes = new IGRPButton("Histórico de Avaliações","sistema_de_avaliacao_igrpweb","Lista_avaliacao_semanal","historico_de_avaliacoes","mpsubmit","grey|fa-line-chart","","");
		btn_historico_de_avaliacoes.propertie.add("id","button_5a98_fd99").add("type","specific").add("class","grey").add("rel","historico_de_avaliacoes").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		table_1.addField(foto);
		table_1.addField(nome);
		table_1.addField(edicao);
		table_1.addField(area);
		table_1.addField(mentor);
		table_1.addField(id_teste);
		table_1.addField(id_avaliado);
		table_1.addField(id_utilizador);

		table_1.addButton(btn_ver);
		table_1.addButton(btn_avaliacao_semanal);
		table_1.addButton(btn_inserir_tema);
		table_1.addButton(btn_historico_de_avaliacoes);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		edicao.setValue(model);
		area.setValue(model);
		mentor.setValue(model);
		id_teste.setValue(model);
		id_avaliado.setValue(model);
		id_utilizador.setValue(model);	

		table_1.loadModel(((Lista_avaliacao_semanal) model).getTable_1());
		}
}
