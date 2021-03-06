package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.historico_de_avaliacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import java.util.Map;
import java.util.LinkedHashMap;

public class Historico_de_avaliacaoView extends View {

	public Field nome;
	public Field area;
	public Field mentor;
	public Field view_1_img;
	public Field media_tbl;
	public Field semana;
	public Field data;
	public Field tema;
	public Field media_semanal;
	public Field conteudo;
	public Field pontualidade;
	public Field dominio;
	public Field clareza;
	public Field proatividade;
	public Field nivel;
	public Field tarefas;
	public Field id_avaliado;
	public Field paragraph_1_text;
	public IGRPView view_1;
	public IGRPTable table_1;
	public IGRPChart chart_1;
	public IGRPParagraph paragraph_1;

	public IGRPButton btn_classificacao_por_mentores;

	public Historico_de_avaliacaoView(){

		this.setPageTitle("Histórico de Avaliação");
			
		view_1 = new IGRPView("view_1","Avaliação Semanal");

		table_1 = new IGRPTable("table_1","");

		chart_1 = new IGRPChart("chart_1","Gráfico de Evolução Semanal");

		paragraph_1 = new IGRPParagraph("paragraph_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		area = new TextField(model,"area");
		area.setLabel(gt("Área ou Projeto"));
		area.propertie().add("name","p_area").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		mentor = new TextField(model,"mentor");
		mentor.setLabel(gt("Mentor(a)"));
		mentor.propertie().add("name","p_mentor").add("type","text").add("maxlength","250").add("class","default").add("img","").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		media_tbl = new ColorField(model,"media_tbl");
		media_tbl.setLabel(gt(""));
		media_tbl.propertie().add("name","p_media_tbl").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		semana = new NumberField(model,"semana");
		semana.setLabel(gt("Semana"));
		semana.propertie().add("name","p_semana").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		data = new DateField(model,"data");
		data.setLabel(gt("Data"));
		data.propertie().add("name","p_data").add("type","date").add("range","false").add("maxlength","30").add("showLabel","true").add("group_in","").add("disableWeekends","false").add("daysoff","false");
		
		tema = new TextField(model,"tema");
		tema.setLabel(gt("Tema Semanal"));
		tema.propertie().add("name","p_tema").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		media_semanal = new TextField(model,"media_semanal");
		media_semanal.setLabel(gt("Média Semanal"));
		media_semanal.propertie().add("name","p_media_semanal").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		conteudo = new TextField(model,"conteudo");
		conteudo.setLabel(gt("Conteúdo"));
		conteudo.propertie().add("name","p_conteudo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		pontualidade = new TextField(model,"pontualidade");
		pontualidade.setLabel(gt("Pontualidade"));
		pontualidade.propertie().add("name","p_pontualidade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		dominio = new TextField(model,"dominio");
		dominio.setLabel(gt("Língua"));
		dominio.propertie().add("name","p_dominio").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		clareza = new TextField(model,"clareza");
		clareza.setLabel(gt("Clareza"));
		clareza.propertie().add("name","p_clareza").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		proatividade = new TextField(model,"proatividade");
		proatividade.setLabel(gt("Proatividade"));
		proatividade.propertie().add("name","p_proatividade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nivel = new TextField(model,"nivel");
		nivel.setLabel(gt("Nível"));
		nivel.propertie().add("name","p_nivel").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tarefas = new TextField(model,"tarefas");
		tarefas.setLabel(gt("Tarefas"));
		tarefas.propertie().add("name","p_tarefas").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_avaliado = new HiddenField(model,"id_avaliado");
		id_avaliado.setLabel(gt(""));
		id_avaliado.propertie().add("name","p_id_avaliado").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_avaliado");
		
		paragraph_1_text = new TextField(model,"paragraph_1_text");
		paragraph_1_text.setLabel(gt(""));
		paragraph_1_text.setValue(gt("<p><b>Conteudo do Powerpoint</b> &ndash; avaliar a qualidade da apresenta&ccedil;&atilde;o em termos de quantidades de imagens, textos e&nbsp;estruturas.</p> <p><b>Pontualidade</b> &ndash; respeito ao tempo estipulado para a apresenta&ccedil;&atilde;o, a sua dura&ccedil;&atilde;o (n&atilde;o pode ser nem muito longo, nem muito curto).</p> <p><b>Dom&iacute;nio da l&iacute;ngua</b> &ndash; dom&iacute;nio para com a l&iacute;ngua que foi solicitada para a realiza&ccedil;&atilde;o da apresenta&ccedil;&atilde;o, ingl&ecirc;s e/ou&nbsp;portugu&ecirc;s.</p> <p><b>Clareza no discurso</b> &ndash; forma de apresenta&ccedil;&atilde;o clara com dom&iacute;nio de&nbsp;conte&uacute;dos&nbsp;e&nbsp;conceitos abrangidos.</p> <p><b>Proactividade</b> &ndash; n&iacute;vel de proactividade nas tarefas, ou seja, aquilo que fez mais do que&nbsp;aquilo que lhe foi pedido pelo mentor do est&aacute;gio.</p> <p><b>Nivel de aprendizagem</b> &ndash; qual a margem de aprendizagem que alcan&ccedil;ou durante a semana nas tarefas realizadas.</p> <p><b>Tarefas futuras</b> &ndash; planos que tem para realiza&ccedil;&atilde;o de tarefas futuras e quais os impedimentos para a sua realiza&ccedil;&atilde;o.</p> <p>&nbsp;</p> <p>*Avalia&ccedil;&atilde;o M&aacute;xima por Categoria 10, M&iacute;nima 0.</p>"));
		paragraph_1_text.propertie().add("type","text").add("name","p_paragraph_1_text").add("maxlength","4000");
		


		btn_classificacao_por_mentores = new IGRPButton("Classificação por Mentores","sistema_de_avaliacao_igrpweb","Historico_de_avaliacao","classificacao_por_mentores","mpsubmit","info|fa-group","","");
		btn_classificacao_por_mentores.propertie.add("id","button_c424_58e3").add("type","specific").add("class","info").add("rel","classificacao_por_mentores").add("refresh_components","");

		
		chart_1.setCaption("");
		chart_1.setChart_type("line");
		chart_1.setXaxys("Eixo de X");
		chart_1.setYaxys("Eixo de Y");
		chart_1.setUrl("#");
		//ex: chart_1.addColor("#874749").addColor("#7b3532").addColor("#cff22a").addColor("#19429f");

	}
		
	@Override
	public void render(){
		
		view_1.addField(nome);
		view_1.addField(area);
		view_1.addField(mentor);
		view_1.addField(view_1_img);

		table_1.addField(media_tbl);
		table_1.addField(semana);
		table_1.addField(data);
		table_1.addField(tema);
		table_1.addField(media_semanal);
		table_1.addField(conteudo);
		table_1.addField(pontualidade);
		table_1.addField(dominio);
		table_1.addField(clareza);
		table_1.addField(proatividade);
		table_1.addField(nivel);
		table_1.addField(tarefas);
		table_1.addField(id_avaliado);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_dc2b2b_table_1 = new LinkedHashMap<>();
		color_dc2b2b_table_1.put("#dc2b2b","Fraco");
		table_1_colors.put("fraco",color_dc2b2b_table_1);
		Map<String, String> color_e6ea26_table_1 = new LinkedHashMap<>();
		color_e6ea26_table_1.put("#e6ea26","Razoável");
		table_1_colors.put("razoavel",color_e6ea26_table_1);
		Map<String, String> color_1f7dc1_table_1 = new LinkedHashMap<>();
		color_1f7dc1_table_1.put("#1f7dc1","Bom");
		table_1_colors.put("bom",color_1f7dc1_table_1);
		Map<String, String> color_49e600_table_1 = new LinkedHashMap<>();
		color_49e600_table_1.put("#49e600","Muito Bom");
		table_1_colors.put("mto_bom",color_49e600_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/

		paragraph_1.addField(paragraph_1_text);

		table_1.addButton(btn_classificacao_por_mentores);
		this.addToPage(view_1);
		this.addToPage(table_1);
		this.addToPage(chart_1);
		this.addToPage(paragraph_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		area.setValue(model);
		mentor.setValue(model);
		view_1_img.setValue(model);
		media_tbl.setValue(model);
		semana.setValue(model);
		data.setValue(model);
		tema.setValue(model);
		media_semanal.setValue(model);
		conteudo.setValue(model);
		pontualidade.setValue(model);
		dominio.setValue(model);
		clareza.setValue(model);
		proatividade.setValue(model);
		nivel.setValue(model);
		tarefas.setValue(model);
		id_avaliado.setValue(model);	

		table_1.loadModel(((Historico_de_avaliacao) model).getTable_1());
		chart_1.loadModel(((Historico_de_avaliacao) model).getChart_1());
		}
}
