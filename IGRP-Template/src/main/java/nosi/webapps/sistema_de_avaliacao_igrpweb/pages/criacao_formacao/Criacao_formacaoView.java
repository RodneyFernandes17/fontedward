package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Criacao_formacaoView extends View {

	public Field nome;
	public Field formadores;
	public Field horas_de_formacao;
	public Field data_inicio;
	public Field data_fim;
	public Field local;
	public Field topicos;
	public Field instituicao;
	public Field teste_de_avaliacao;
	public Field codigo_do_teste;
	public Field id_formacao;
	public Field procurar_avaliado;
	public Field nome_avaliado;
	public Field id_avaliado;
	public IGRPForm form_1;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_criar_formacao;

	public Criacao_formacaoView(){

		this.setPageTitle("Criação Formação");
			
		form_1 = new IGRPForm("form_1","Criação de uma Formação");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","Adicionar Formandos");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome da Formação"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		formadores = new ListField(model,"formadores");
		formadores.setLabel(gt("Formadores"));
		formadores.propertie().add("name","p_formadores").add("type","select").add("multiple","true").add("tags","false").add("domain","avaliadores « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		horas_de_formacao = new NumberField(model,"horas_de_formacao");
		horas_de_formacao.setLabel(gt("Horas de Formação"));
		horas_de_formacao.propertie().add("name","p_horas_de_formacao").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		data_inicio = new DateField(model,"data_inicio");
		data_inicio.setLabel(gt("Data Início"));
		data_inicio.propertie().add("name","p_data_inicio").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("disableWeekends","false").add("daysoff","false");
		
		data_fim = new DateField(model,"data_fim");
		data_fim.setLabel(gt("Data Fim"));
		data_fim.propertie().add("name","p_data_fim").add("type","date").add("range","false").add("disableWeekends","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary");
		
		local = new TextField(model,"local");
		local.setLabel(gt("Local"));
		local.propertie().add("name","p_local").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		topicos = new TextEditorField(model,"topicos");
		topicos.setLabel(gt("Tópico Abordados na Formação"));
		topicos.propertie().add("name","p_topicos").add("type","texteditor").add("maxlength","5000").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		instituicao = new ListField(model,"instituicao");
		instituicao.setLabel(gt("Instituição"));
		instituicao.propertie().add("name","p_instituicao").add("type","select").add("multiple","false").add("tags","false").add("domain","intituicoes « sistema_de_avaliacao_igrpweb").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		teste_de_avaliacao = new ListField(model,"teste_de_avaliacao");
		teste_de_avaliacao.setLabel(gt("Teste de Avaliação"));
		teste_de_avaliacao.propertie().add("name","p_teste_de_avaliacao").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		codigo_do_teste = new TextField(model,"codigo_do_teste");
		codigo_do_teste.setLabel(gt("Código do Teste"));
		codigo_do_teste.propertie().add("name","p_codigo_do_teste").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_formacao = new HiddenField(model,"id_formacao");
		id_formacao.setLabel(gt(""));
		id_formacao.propertie().add("name","p_id_formacao").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_formacao");
		
		procurar_avaliado = new LookupField(model,"procurar_avaliado");
		procurar_avaliado.setLabel(gt("Procurar Avaliado"));
		procurar_avaliado.setLookup("sistema_de_avaliacao_igrpweb","Lista_avaliacao_semanal","index");
		procurar_avaliado.addParam("target","_blank");
		procurar_avaliado.addLookupParam("p_id_avaliado","id_avaliado");
		procurar_avaliado.addLookupParam("p_nome_avaliado","nome");
		procurar_avaliado.propertie().add("name","p_procurar_avaliado").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		nome_avaliado = new TextField(model,"nome_avaliado");
		nome_avaliado.setLabel(gt("Nome do Avaliado"));
		nome_avaliado.propertie().add("name","p_nome_avaliado").add("type","text").add("maxlength","250").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_criar_formacao = new IGRPButton("Salvar","sistema_de_avaliacao_igrpweb","Criacao_formacao","criar_formacao","submit","black|fa-save","","");
		btn_criar_formacao.propertie.add("type","specific").add("rel","criar_formacao").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome);
		form_1.addField(formadores);
		form_1.addField(horas_de_formacao);
		form_1.addField(data_inicio);
		form_1.addField(data_fim);
		form_1.addField(local);
		form_1.addField(topicos);
		form_1.addField(instituicao);
		form_1.addField(teste_de_avaliacao);
		form_1.addField(codigo_do_teste);
		form_1.addField(id_formacao);

		separatorlist_1.addField(procurar_avaliado);
		separatorlist_1.addField(nome_avaliado);
		separatorlist_1.addField(id_avaliado);


		toolsbar_1.addButton(btn_criar_formacao);
		this.addToPage(form_1);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		formadores.setValue(model);
		horas_de_formacao.setValue(model);
		data_inicio.setValue(model);
		data_fim.setValue(model);
		local.setValue(model);
		topicos.setValue(model);
		instituicao.setValue(model);
		teste_de_avaliacao.setValue(model);
		codigo_do_teste.setValue(model);
		id_formacao.setValue(model);
		procurar_avaliado.setValue(model);
		nome_avaliado.setValue(model);
		id_avaliado.setValue(model);	

		separatorlist_1.loadModel(((Criacao_formacao) model).getSeparatorlist_1());
		}
}
