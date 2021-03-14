package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_avaliacao_semanal;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Formulario_avaliacao_semanalView extends View {

	public Field nome;
	public Field area;
	public Field mentor;
	public Field view_1_img;
	public Field semana;
	public Field tema_semanal;
	public Field form_1_separator_1;
	public Field conteudo;
	public Field pontualidade;
	public Field dominio;
	public Field clareza;
	public Field proactividade;
	public Field aprendizagem;
	public Field tarefas;
	public Field id_avaliado;
	public Field id_semanal;
	public Field id_tema;
	public Field paragraph_1_text;
	public IGRPView view_1;
	public IGRPForm form_1;
	public IGRPParagraph paragraph_1;

	public IGRPButton btn_submeter_avaliacao;

	public Formulario_avaliacao_semanalView(){

		this.setPageTitle("Formulário Avaliação Semanal");
			
		view_1 = new IGRPView("view_1","Avaliação Semanal");

		form_1 = new IGRPForm("form_1","");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		area = new TextField(model,"area");
		area.setLabel(gt("Área ou Projeto"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		semana = new NumberField(model,"semana");
		semana.setLabel(gt("Semana"));
		semana.propertie().add("name","p_semana").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		tema_semanal = new TextField(model,"tema_semanal");
		tema_semanal.setLabel(gt("Tema Semanal"));
		tema_semanal.propertie().add("name","p_tema_semanal").add("type","text").add("maxlength","250").add("required","true").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_1_separator_1 = new SeparatorField(model,"form_1_separator_1");
		form_1_separator_1.setLabel(gt("Classificações"));
		form_1_separator_1.propertie().add("name","p_form_1_separator_1").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		conteudo = new TextField(model,"conteudo");
		conteudo.setLabel(gt("Conteúdo"));
		conteudo.propertie().add("name","p_conteudo").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		pontualidade = new TextField(model,"pontualidade");
		pontualidade.setLabel(gt("Pontualidade"));
		pontualidade.propertie().add("name","p_pontualidade").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		dominio = new TextField(model,"dominio");
		dominio.setLabel(gt("Língua"));
		dominio.propertie().add("name","p_dominio").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		clareza = new TextField(model,"clareza");
		clareza.setLabel(gt("Clareza"));
		clareza.propertie().add("name","p_clareza").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		proactividade = new TextField(model,"proactividade");
		proactividade.setLabel(gt("Proactividade"));
		proactividade.propertie().add("name","p_proactividade").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		aprendizagem = new TextField(model,"aprendizagem");
		aprendizagem.setLabel(gt("Aprendizagem"));
		aprendizagem.propertie().add("name","p_aprendizagem").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tarefas = new TextField(model,"tarefas");
		tarefas.setLabel(gt("Tarefas"));
		tarefas.propertie().add("name","p_tarefas").add("type","range").add("rangeMin","0").add("rangeMax","10").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_avaliado");
		
		id_semanal = new HiddenField(model,"id_semanal");
		id_semanal.setLabel(gt(""));
		id_semanal.propertie().add("name","p_id_semanal").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_semanal");
		
		id_tema = new HiddenField(model,"id_tema");
		id_tema.setLabel(gt(""));
		id_tema.propertie().add("name","p_id_tema").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_tema");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p><b>Conteudo do Powerpoint</b> &ndash; avaliar a qualidade da apresenta&ccedil;&atilde;o em termos de quantidades de imagens, textos, estruturas;</p> <p><b>Pontualidade</b> &ndash; respeito ao tempo estipulado como dura&ccedil;&atilde;o da apresenta&ccedil;&atilde;o.</p> <p><b>Dom&iacute;nio da l&iacute;ngua</b> &ndash; dom&iacute;nio para com a l&iacute;ngua escolhida para a realiza&ccedil;&atilde;o da apresenta&ccedil;&atilde;o, ingl&ecirc;s, portugu&ecirc;s, etc.</p> <p><b>Clareza no discurso</b> &ndash; forma de apresenta&ccedil;&atilde;o clara com dom&iacute;nio do conte&uacute;do e de conceitos apresentados;</p> <p><b>Proactividade</b> &ndash; n&iacute;vel de proactividade nas tarefas em que lhes foram submetidas;</p> <p><b>Nivel de aprendizagem</b> &ndash; qual a margem de aprendizagem que alcan&ccedil;ou durante a semana;</p> <p><b>Tarefas futuras</b> &ndash; planos que tem para realiza&ccedil;&atilde;o de tarefas futuras e quais os impedimentos;</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		


		btn_submeter_avaliacao = new IGRPButton("Submeter Avaliação","sistema_de_avaliacao_igrpweb","Formulario_avaliacao_semanal","submeter_avaliacao","submit_form","info|fa-language","","");
		btn_submeter_avaliacao.propertie.add("id","button_4bb5_dd58").add("type","form").add("class","info").add("rel","submeter_avaliacao").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		view_1.addField(nome);
		view_1.addField(area);
		view_1.addField(mentor);
		view_1.addField(view_1_img);

		form_1.addField(semana);
		form_1.addField(tema_semanal);
		form_1.addField(form_1_separator_1);
		form_1.addField(conteudo);
		form_1.addField(pontualidade);
		form_1.addField(dominio);
		form_1.addField(clareza);
		form_1.addField(proactividade);
		form_1.addField(aprendizagem);
		form_1.addField(tarefas);
		form_1.addField(id_avaliado);
		form_1.addField(id_semanal);
		form_1.addField(id_tema);

		paragraph_1.addField(paragraph_1_text);

		form_1.addButton(btn_submeter_avaliacao);
		this.addToPage(view_1);
		this.addToPage(form_1);
		this.addToPage(paragraph_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		area.setValue(model);
		mentor.setValue(model);
		view_1_img.setValue(model);
		semana.setValue(model);
		tema_semanal.setValue(model);
		form_1_separator_1.setValue(model);
		conteudo.setValue(model);
		pontualidade.setValue(model);
		dominio.setValue(model);
		clareza.setValue(model);
		proactividade.setValue(model);
		aprendizagem.setValue(model);
		tarefas.setValue(model);
		id_avaliado.setValue(model);
		id_semanal.setValue(model);
		id_tema.setValue(model);	

		}
}
