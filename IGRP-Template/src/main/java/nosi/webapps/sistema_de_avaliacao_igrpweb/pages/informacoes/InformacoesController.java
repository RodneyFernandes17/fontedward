package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.informacoes;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.informacoes.Informacoes.Chart_1;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.RespostaTbl;
import java.util.ArrayList;

/*----#end-code----*/
		
public class InformacoesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Informacoes model = new Informacoes();
		model.load();
		model.setStatbox_1_title("Resultado Final (máximo 40 Pontos)");
		model.setStatbox_1_val("226");
		model.setStatbox_1_txt("");
		model.setStatbox_1_url("");
		model.setStatbox_1_bg("cp-electric");
		model.setStatbox_1_icn("fa-smile-o");
		model.setStatbox_2_title("Resultado Final (máximo 40 pontos)");
		model.setStatbox_2_val("655");
		model.setStatbox_2_txt("");
		model.setStatbox_2_url("");
		model.setStatbox_2_bg("cp-embers");
		model.setStatbox_2_icn("fa-frown-o");
		InformacoesView view = new InformacoesView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.chart_1.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		model.setStatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setStatbox_2_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/*----#start-code(index)----*/

		Integer resposta1 = Core.getParamInt("resposta_1");
		Integer resposta2 = Core.getParamInt("resposta_2");
		Integer resposta3 = Core.getParamInt("resposta_3");
		Integer resposta4 = Core.getParamInt("resposta_4");
		Integer resposta5 = Core.getParamInt("resposta_5");
		Integer resposta6 = Core.getParamInt("resposta_6");
		Integer resposta7 = Core.getParamInt("resposta_7");
		Integer resposta8 = Core.getParamInt("resposta_8");
		Integer resposta9 = Core.getParamInt("resposta_9");
		Integer resposta10 = Core.getParamInt("resposta_10");
		Integer resposta11 = Core.getParamInt("resposta_11");
		Integer resposta12 = Core.getParamInt("resposta_12");
		Integer resposta13 = Core.getParamInt("resposta_13");
		Integer resposta14 = Core.getParamInt("resposta_14");
		Integer resposta15 = Core.getParamInt("resposta_15");
		Integer resposta16 = Core.getParamInt("resposta_16");
		Integer resposta17 = Core.getParamInt("resposta_17");
		Integer resposta18 = Core.getParamInt("resposta_18");
		Integer resposta19 = Core.getParamInt("resposta_19");
		Integer resposta20 = Core.getParamInt("resposta_20");
		Integer resposta21 = Core.getParamInt("resposta_21");
		Integer resposta22 = Core.getParamInt("resposta_22");
		Integer resposta23 = Core.getParamInt("resposta_23");
		Integer resposta24 = Core.getParamInt("resposta_24");
		Integer resposta25 = Core.getParamInt("resposta_25");
		Integer resposta26 = Core.getParamInt("resposta_26");
		Integer resposta27 = Core.getParamInt("resposta_27");
		Integer resposta28 = Core.getParamInt("resposta_28");
		Integer resposta29 = Core.getParamInt("resposta_29");
		Integer resposta30 = Core.getParamInt("resposta_30");
		Integer resposta31 = Core.getParamInt("resposta_31");
		Integer resposta32 = Core.getParamInt("resposta_32");
		Integer resposta33 = Core.getParamInt("resposta_33");
		Integer resposta34 = Core.getParamInt("resposta_34");
		Integer resposta35 = Core.getParamInt("resposta_35");
		Integer resposta36 = Core.getParamInt("resposta_36");
		Integer resposta37 = Core.getParamInt("resposta_37");
		Integer resposta38 = Core.getParamInt("resposta_38");
		Integer resposta39 = Core.getParamInt("resposta_39");
		Integer resposta40 = Core.getParamInt("resposta_40");

		try {

			Integer valor_igrpstudio = Core.getParamInt("valor_igrpstudio");
			Integer valor_bpmn_report = Core.getParamInt("valor_bpmn_report");
			Integer valor_page_designer = Core.getParamInt("valor_page_designer");
			Integer valor_gerador_blockly = Core.getParamInt("valor_gerador_blockly");
			Integer valor_eclipse_git = Core.getParamInt("valor_eclipse_git");
			Integer valor_base_dados_dao = Core.getParamInt("valor_base_dados_dao");
			Integer valor_java = Core.getParamInt("valor_java");
			Integer valor_gestao_acesso = Core.getParamInt("valor_gestao_acesso");
			Integer valor_final = Core.getParamInt("valor_final");

			if (Core.isNotNull(Core.getParam("p_id_formacao"))) {
				TesteTbl consulta = new TesteTbl().find().andWhere("formacaoId", "=", Core.getParamInt("p_id_formacao"))
						.andWhere("idAvaliadoFk.idUtilizador", "=", Core.getCurrentUser().getId()).one();

				valor_igrpstudio = consulta.getValorIgrpStudio();
				valor_bpmn_report = consulta.getValorBpmnReport();
				valor_page_designer = consulta.getValorPageDesigner();
				valor_gerador_blockly = consulta.getValorGeradorBlockly();
				valor_eclipse_git = consulta.getValorEclipseGit();
				valor_base_dados_dao = consulta.getValorBaseDadosDao();
				valor_java = consulta.getValorJava();
				valor_gestao_acesso = consulta.getValorGestaoAcesso();
				valor_final = consulta.getValorFinal();

			}
			/******* GRÀFICO ********/

			model.setChart_1(new ArrayList<>());
			Chart_1 c1 = new Chart_1();
			c1.setEixoX("IGRP Studio");
			c1.setEixoY("IGRP Studio");
			c1.setEixoZ(valor_igrpstudio);
			model.getChart_1().add(c1);

			Chart_1 c2 = new Chart_1();
			c2.setEixoX("BPMN e Report Designer");
			c2.setEixoY("BPMN e Report Designer");
			c2.setEixoZ(valor_bpmn_report);
			model.getChart_1().add(c2);

			Chart_1 c3 = new Chart_1();
			c3.setEixoX("Page Designer");
			c3.setEixoY("Page Designer");
			c3.setEixoZ(valor_page_designer);
			model.getChart_1().add(c3);

			Chart_1 c4 = new Chart_1();
			c4.setEixoX("Gerador Blockly");
			c4.setEixoY("Gerador Blockly");
			c4.setEixoZ(valor_gerador_blockly);
			model.getChart_1().add(c4);

			Chart_1 c5 = new Chart_1();
			c5.setEixoX("Eclipse e Git");
			c5.setEixoY("Eclipse e Git");
			c5.setEixoZ(valor_eclipse_git);
			model.getChart_1().add(c5);

			Chart_1 c6 = new Chart_1();
			c6.setEixoX("Base de Dados e DAO");
			c6.setEixoY("Base de Dados e DAO");
			c6.setEixoZ(valor_base_dados_dao);
			model.getChart_1().add(c6);

			Chart_1 c7 = new Chart_1();
			c7.setEixoX("Conceitos Java");
			c7.setEixoY("Conceitos Java");
			c7.setEixoZ(valor_java);
			model.getChart_1().add(c7);

			Chart_1 c8 = new Chart_1();
			c8.setEixoX("Gestão de Acessos");
			c8.setEixoY("Gestão de Acessos");
			c8.setEixoZ(valor_gestao_acesso);
			model.getChart_1().add(c8);

			/********* STAT-BOX *********/
			if (valor_final >= 20) {
				view.statbox_2.setVisible(false);
				model.setStatbox_1_val(valor_final + " Pontos");
			} else {
				view.statbox_1.setVisible(false);
				model.setStatbox_2_val(valor_final + " Pontos");
			}

		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
		}

		if (Core.isNull(Core.getParam("p_id_formacao"))) {
			
			/******** REVISÂO ************/
			try {

				final RespostaTbl reposta1d = new RespostaTbl().findOne(resposta1);
				if (Core.isNotNullOrZero(reposta1d.getRespostaCerta())) {
					view.pergunta1.setVisible(false);
					view.resposta1.setVisible(false);
					view.pergunta_1_sep.setVisible(false);
					view.reposta_certa_1.setVisible(false);

				} else {
					final RespostaTbl repostacerta = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta1d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta != null) {
						model.setPergunta1(repostacerta.getIdPerguntaFk().getPergunta());
						model.setResposta1(reposta1d.getResposta());
						model.setReposta_certa_1(repostacerta.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta1d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta2d = new RespostaTbl().findOne(resposta2);
				if (Core.isNotNullOrZero(reposta2d.getRespostaCerta())) {
					view.pergunta2.setVisible(false);
					view.resposta2.setVisible(false);
					view.pergunta_2_sep.setVisible(false);
					view.resposta_certa_2.setVisible(false);
				} else {
					final RespostaTbl repostacerta2 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta2d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta2 != null) {
						model.setPergunta2(repostacerta2.getIdPerguntaFk().getPergunta());
						model.setResposta2(reposta2d.getResposta());
						model.setResposta_certa_2(repostacerta2.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta2d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta3d = new RespostaTbl().findOne(resposta3);
				if (Core.isNotNullOrZero(reposta3d.getRespostaCerta())) {
					view.pergunta_3.setVisible(false);
					view.resposta3.setVisible(false);
					view.pergunta_3_sep.setVisible(false);
					view.resposta_certa_3.setVisible(false);
				} else {
					final RespostaTbl repostacerta3 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta3d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta3 != null) {
						model.setPergunta_3(repostacerta3.getIdPerguntaFk().getPergunta());
						model.setResposta3(reposta3d.getResposta());
						model.setResposta_certa_3(repostacerta3.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta3d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta4d = new RespostaTbl().findOne(resposta4);
				if (Core.isNotNullOrZero(reposta4d.getRespostaCerta())) {
					view.pergunta_4.setVisible(false);
					view.resposta4.setVisible(false);
					view.pergunta_4_sep.setVisible(false);
					view.resposta_certa_4.setVisible(false);

				} else {
					final RespostaTbl repostacerta4 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta4d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta4 != null) {
						model.setPergunta_4(repostacerta4.getIdPerguntaFk().getPergunta());
						model.setResposta4(reposta4d.getResposta());
						model.setResposta_certa_4(repostacerta4.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta4d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta5d = new RespostaTbl().findOne(resposta5);
				if (Core.isNotNullOrZero(reposta5d.getRespostaCerta())) {
					view.pergunta_5.setVisible(false);
					view.resposta5.setVisible(false);
					view.pergunta_5_sep.setVisible(false);
					view.resposta_certa_5.setVisible(false);

				} else {
					final RespostaTbl repostacerta5 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta5d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta5 != null) {
						model.setPergunta_5(repostacerta5.getIdPerguntaFk().getPergunta());
						model.setResposta5(reposta5d.getResposta());
						model.setResposta_certa_5(repostacerta5.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta5d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta6d = new RespostaTbl().findOne(resposta6);

				if (Core.isNotNullOrZero(reposta6d.getRespostaCerta())) {
					view.pergunta_6.setVisible(false);
					view.resposta6.setVisible(false);
					view.pergunta_6_sep.setVisible(false);
					view.resposta_certa_6.setVisible(false);

				} else {
					final RespostaTbl repostacerta6 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta6d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta6 != null) {
						model.setPergunta_6(repostacerta6.getIdPerguntaFk().getPergunta());
						model.setResposta6(reposta6d.getResposta());
						model.setResposta_certa_6(repostacerta6.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta6d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta7d = new RespostaTbl().findOne(resposta7);

				if (Core.isNotNullOrZero(reposta7d.getRespostaCerta())) {
					view.pergunta_7.setVisible(false);
					view.resposta7.setVisible(false);
					view.pergunta_7_sep.setVisible(false);
					view.resposta_certa_7.setVisible(false);

				} else {
					final RespostaTbl repostacerta7 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta7d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta7 != null) {
						model.setPergunta_7(repostacerta7.getIdPerguntaFk().getPergunta());
						model.setResposta7(reposta7d.getResposta());
						model.setResposta_certa_7(repostacerta7.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta7d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta8d = new RespostaTbl().findOne(resposta8);

				if (Core.isNotNullOrZero(reposta8d.getRespostaCerta())) {
					view.pergunta8.setVisible(false);
					view.resposta8.setVisible(false);
					view.pergunta_8_sep.setVisible(false);
					view.resposta_certa_8.setVisible(false);

				} else {
					final RespostaTbl repostacerta8 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta8d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta8 != null) {
						model.setPergunta8(repostacerta8.getIdPerguntaFk().getPergunta());
						model.setResposta8(reposta8d.getResposta());
						model.setResposta_certa_8(repostacerta8.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta8d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta9d = new RespostaTbl().findOne(resposta9);

				if (Core.isNotNullOrZero(reposta9d.getRespostaCerta())) {
					view.pergunta9.setVisible(false);
					view.resposta9.setVisible(false);
					view.pergunta_9_sep.setVisible(false);
					view.resposta_certa_9.setVisible(false);

				} else {
					final RespostaTbl repostacerta9 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta9d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta9 != null) {
						model.setPergunta9(repostacerta9.getIdPerguntaFk().getPergunta());
						model.setResposta9(reposta9d.getResposta());
						model.setResposta_certa_9(repostacerta9.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta9d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta10d = new RespostaTbl().findOne(resposta10);

				if (Core.isNotNullOrZero(reposta10d.getRespostaCerta())) {
					view.pergunta10.setVisible(false);
					view.resposta10.setVisible(false);
					view.pergunta_10_sep.setVisible(false);
					view.resposta_certa_10.setVisible(false);

				} else {
					final RespostaTbl repostacerta10 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta10d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta10 != null) {
						model.setPergunta10(repostacerta10.getIdPerguntaFk().getPergunta());
						model.setResposta10(reposta10d.getResposta());
						model.setResposta_certa_10(repostacerta10.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta10d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta11d = new RespostaTbl().findOne(resposta11);

				if (Core.isNotNullOrZero(reposta11d.getRespostaCerta())) {
					view.pergunta11.setVisible(false);
					view.resposta11.setVisible(false);
					view.pergunta_11_sep.setVisible(false);
					view.resposta_certa_11.setVisible(false);

				} else {
					final RespostaTbl repostacerta11 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta11d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta11 != null) {
						model.setPergunta11(repostacerta11.getIdPerguntaFk().getPergunta());
						model.setResposta11(reposta11d.getResposta());
						model.setResposta_certa_11(repostacerta11.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta11d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta12d = new RespostaTbl().findOne(resposta12);

				if (Core.isNotNullOrZero(reposta12d.getRespostaCerta())) {
					view.pergunta12.setVisible(false);
					view.resposta12.setVisible(false);
					view.pergunta_12_sep.setVisible(false);
					view.resposta_certa_12.setVisible(false);

				} else {
					final RespostaTbl repostacerta12 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta12d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta12 != null) {
						model.setPergunta12(repostacerta12.getIdPerguntaFk().getPergunta());
						model.setResposta12(reposta12d.getResposta());
						model.setResposta_certa_12(repostacerta12.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta12d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta13d = new RespostaTbl().findOne(resposta13);

				if (Core.isNotNullOrZero(reposta13d.getRespostaCerta())) {
					view.pergunta13.setVisible(false);
					view.resposta13.setVisible(false);
					view.pergunta_13_sep.setVisible(false);
					view.resposta_certa_13.setVisible(false);

				} else {
					final RespostaTbl repostacerta13 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta13d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta13 != null) {
						model.setPergunta13(repostacerta13.getIdPerguntaFk().getPergunta());
						model.setResposta13(reposta13d.getResposta());
						model.setResposta_certa_13(repostacerta13.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta13d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta14d = new RespostaTbl().findOne(resposta14);

				if (Core.isNotNullOrZero(reposta14d.getRespostaCerta())) {
					view.pergunta14.setVisible(false);
					view.resposta14.setVisible(false);
					view.pergunta_14_sep.setVisible(false);
					view.resposta_certa_14.setVisible(false);

				} else {
					final RespostaTbl repostacerta14 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta14d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta14 != null) {
						model.setPergunta14(repostacerta14.getIdPerguntaFk().getPergunta());
						model.setResposta14(reposta14d.getResposta());
						model.setResposta_certa_14(repostacerta14.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta14d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta15d = new RespostaTbl().findOne(resposta15);

				if (Core.isNotNullOrZero(reposta15d.getRespostaCerta())) {
					view.pergunta15.setVisible(false);
					view.resposta15.setVisible(false);
					view.pergunta_15_sep.setVisible(false);
					view.resposta_certa_15.setVisible(false);

				} else {
					final RespostaTbl repostacerta15 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta15d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta15 != null) {
						model.setPergunta15(repostacerta15.getIdPerguntaFk().getPergunta());
						model.setResposta15(reposta15d.getResposta());
						model.setResposta_certa_15(repostacerta15.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta15d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta16d = new RespostaTbl().findOne(resposta16);

				if (Core.isNotNullOrZero(reposta16d.getRespostaCerta())) {
					view.pergunta16.setVisible(false);
					view.resposta16.setVisible(false);
					view.pergunta_16_sep.setVisible(false);
					view.resposta_certa_16.setVisible(false);

				} else {
					final RespostaTbl repostacerta16 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta16d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta16 != null) {
						model.setPergunta16(repostacerta16.getIdPerguntaFk().getPergunta());
						model.setResposta16(reposta16d.getResposta());
						model.setResposta_certa_16(repostacerta16.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta16d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta17d = new RespostaTbl().findOne(resposta17);

				if (Core.isNotNullOrZero(reposta17d.getRespostaCerta())) {
					view.pergunta17.setVisible(false);
					view.resposta17.setVisible(false);
					view.pergunta_17_sep.setVisible(false);
					view.resposta_certa_17.setVisible(false);

				} else {
					final RespostaTbl repostacerta17 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta17d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta17 != null) {
						model.setPergunta17(repostacerta17.getIdPerguntaFk().getPergunta());
						model.setResposta17(reposta17d.getResposta());
						model.setResposta_certa_17(repostacerta17.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta17d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta18d = new RespostaTbl().findOne(resposta18);

				if (Core.isNotNullOrZero(reposta18d.getRespostaCerta())) {
					view.pergunta18.setVisible(false);
					view.resposta18.setVisible(false);
					view.pergunta_18_sep.setVisible(false);
					view.resposta_certa_18.setVisible(false);

				} else {
					final RespostaTbl repostacerta18 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta18d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta18 != null) {
						model.setPergunta18(repostacerta18.getIdPerguntaFk().getPergunta());
						model.setResposta18(reposta18d.getResposta());
						model.setResposta_certa_18(repostacerta18.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta18d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta19d = new RespostaTbl().findOne(resposta19);

				if (Core.isNotNullOrZero(reposta19d.getRespostaCerta())) {
					view.pergunta19.setVisible(false);
					view.resposta19.setVisible(false);
					view.pergunta_19_sep.setVisible(false);
					view.resposta_certa_19.setVisible(false);

				} else {
					final RespostaTbl repostacerta19 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta19d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta19 != null) {
						model.setPergunta19(repostacerta19.getIdPerguntaFk().getPergunta());
						model.setResposta19(reposta19d.getResposta());
						model.setResposta_certa_19(repostacerta19.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta19d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta20d = new RespostaTbl().findOne(resposta20);

				if (Core.isNotNullOrZero(reposta20d.getRespostaCerta())) {
					view.pergunta20.setVisible(false);
					view.resposta20.setVisible(false);
					view.pergunta_20sep.setVisible(false);
					view.resposta_certa_20.setVisible(false);

				} else {
					final RespostaTbl repostacerta20 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta20d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta20 != null) {
						model.setPergunta20(repostacerta20.getIdPerguntaFk().getPergunta());
						model.setResposta20(reposta20d.getResposta());
						model.setResposta_certa_20(repostacerta20.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta20d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta21d = new RespostaTbl().findOne(resposta21);

				if (Core.isNotNullOrZero(reposta21d.getRespostaCerta())) {
					view.pergunta21.setVisible(false);
					view.resposta21.setVisible(false);
					view.pergunta_21_sep.setVisible(false);
					view.respsota_certa_21.setVisible(false);

				} else {
					final RespostaTbl repostacerta21 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta21d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta21 != null) {
						model.setPergunta21(repostacerta21.getIdPerguntaFk().getPergunta());
						model.setResposta21(reposta21d.getResposta());
						model.setRespsota_certa_21(repostacerta21.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta21d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta22d = new RespostaTbl().findOne(resposta22);

				if (Core.isNotNullOrZero(reposta22d.getRespostaCerta())) {
					view.pergunta22.setVisible(false);
					view.resposta22.setVisible(false);
					view.pergunta_22_sep.setVisible(false);
					view.respsota_certa_22.setVisible(false);

				} else {
					final RespostaTbl repostacerta22 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta22d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta22 != null) {
						model.setPergunta22(repostacerta22.getIdPerguntaFk().getPergunta());
						model.setResposta22(reposta22d.getResposta());
						model.setRespsota_certa_22(repostacerta22.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta22d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta23d = new RespostaTbl().findOne(resposta23);

				if (Core.isNotNullOrZero(reposta23d.getRespostaCerta())) {
					view.pergunta23.setVisible(false);
					view.resposta23.setVisible(false);
					view.pergunta_23_sep.setVisible(false);
					view.resposta_certa_23.setVisible(false);

				} else {
					final RespostaTbl repostacerta23 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta23d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta23 != null) {
						model.setPergunta23(repostacerta23.getIdPerguntaFk().getPergunta());
						model.setResposta23(reposta23d.getResposta());
						model.setResposta_certa_23(repostacerta23.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta23d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta24d = new RespostaTbl().findOne(resposta24);

				if (Core.isNotNullOrZero(reposta24d.getRespostaCerta())) {
					view.pergunta24.setVisible(false);
					view.resposta24.setVisible(false);
					view.pergunta_24_sep.setVisible(false);
					view.resposta_certa_24.setVisible(false);

				} else {
					final RespostaTbl repostacerta24 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta24d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta24 != null) {
						model.setPergunta24(repostacerta24.getIdPerguntaFk().getPergunta());
						model.setResposta24(reposta24d.getResposta());
						model.setResposta_certa_24(repostacerta24.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta24d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta25d = new RespostaTbl().findOne(resposta25);

				if (Core.isNotNullOrZero(reposta25d.getRespostaCerta())) {
					view.pergunta25.setVisible(false);
					view.resposta25.setVisible(false);
					view.pergunta_25_sep.setVisible(false);
					view.resposta_certa_25.setVisible(false);

				} else {
					final RespostaTbl repostacerta25 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta25d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta25 != null) {
						model.setPergunta25(repostacerta25.getIdPerguntaFk().getPergunta());
						model.setResposta25(reposta25d.getResposta());
						model.setResposta_certa_25(repostacerta25.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta25d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta26d = new RespostaTbl().findOne(resposta26);

				if (Core.isNotNullOrZero(reposta26d.getRespostaCerta())) {
					view.pergunta26.setVisible(false);
					view.resposta26.setVisible(false);
					view.pergunta_26_sep.setVisible(false);
					view.resposta_certa_26.setVisible(false);

				} else {
					final RespostaTbl repostacerta26 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta26d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta26 != null) {
						model.setPergunta26(repostacerta26.getIdPerguntaFk().getPergunta());
						model.setResposta26(reposta26d.getResposta());
						model.setResposta_certa_26(repostacerta26.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta26d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta27d = new RespostaTbl().findOne(resposta27);

				if (Core.isNotNullOrZero(reposta27d.getRespostaCerta())) {
					view.pergunta27.setVisible(false);
					view.resposta27.setVisible(false);
					view.pergunta_27_sep.setVisible(false);
					view.resposta_certa_27.setVisible(false);

				} else {
					final RespostaTbl repostacerta27 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta27d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta27 != null) {
						model.setPergunta27(repostacerta27.getIdPerguntaFk().getPergunta());
						model.setResposta27(reposta27d.getResposta());
						model.setResposta_certa_27(repostacerta27.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta27d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta28d = new RespostaTbl().findOne(resposta28);

				if (Core.isNotNullOrZero(reposta28d.getRespostaCerta())) {
					view.pergunta28.setVisible(false);
					view.resposta28.setVisible(false);
					view.pergunta_28_sep.setVisible(false);
					view.resposta_certa_28.setVisible(false);

				} else {
					final RespostaTbl repostacerta28 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta28d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta28 != null) {
						model.setPergunta28(repostacerta28.getIdPerguntaFk().getPergunta());
						model.setResposta28(reposta28d.getResposta());
						model.setResposta_certa_28(repostacerta28.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta28d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta29d = new RespostaTbl().findOne(resposta29);

				if (Core.isNotNullOrZero(reposta29d.getRespostaCerta())) {
					view.pergunta29.setVisible(false);
					view.resposta29.setVisible(false);
					view.pergunta_29_sep.setVisible(false);
					view.resposta_certa_29.setVisible(false);

				} else {
					final RespostaTbl repostacerta29 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta29d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta29 != null) {
						model.setPergunta29(repostacerta29.getIdPerguntaFk().getPergunta());
						model.setResposta29(reposta29d.getResposta());
						model.setResposta_certa_29(repostacerta29.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta29d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta30d = new RespostaTbl().findOne(resposta30);

				if (Core.isNotNullOrZero(reposta30d.getRespostaCerta())) {
					view.pergunta30.setVisible(false);
					view.resposta30.setVisible(false);
					view.pergunta_30_sep.setVisible(false);
					view.resposta_certa_30.setVisible(false);

				} else {
					final RespostaTbl repostacerta30 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta30d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta30 != null) {
						model.setPergunta30(repostacerta30.getIdPerguntaFk().getPergunta());
						model.setResposta30(reposta30d.getResposta());
						model.setResposta_certa_30(repostacerta30.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta30d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta31d = new RespostaTbl().findOne(resposta31);

				if (Core.isNotNullOrZero(reposta31d.getRespostaCerta())) {
					view.pergunta31.setVisible(false);
					view.resposta31.setVisible(false);
					view.pergunta_31_sep.setVisible(false);
					view.resposta_certa_31.setVisible(false);

				} else {
					final RespostaTbl repostacerta31 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta31d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta31 != null) {
						model.setPergunta31(repostacerta31.getIdPerguntaFk().getPergunta());
						model.setResposta31(reposta31d.getResposta());
						model.setResposta_certa_31(repostacerta31.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta31d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta32d = new RespostaTbl().findOne(resposta32);

				if (Core.isNotNullOrZero(reposta32d.getRespostaCerta())) {
					view.pergunta32.setVisible(false);
					view.resposta32.setVisible(false);
					view.pergunta_32_sep.setVisible(false);
					view.resposta_certa_32.setVisible(false);

				} else {
					final RespostaTbl repostacerta32 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta32d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta32 != null) {
						model.setPergunta32(repostacerta32.getIdPerguntaFk().getPergunta());
						model.setResposta32(reposta32d.getResposta());
						model.setResposta_certa_32(repostacerta32.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta32d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta33d = new RespostaTbl().findOne(resposta33);

				if (Core.isNotNullOrZero(reposta33d.getRespostaCerta())) {
					view.pergunta33.setVisible(false);
					view.resposta33.setVisible(false);
					view.pergunta_33_sep.setVisible(false);
					view.resposta_certa_33.setVisible(false);

				} else {
					final RespostaTbl repostacerta33 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta33d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta33 != null) {
						model.setPergunta33(repostacerta33.getIdPerguntaFk().getPergunta());
						model.setResposta33(reposta33d.getResposta());
						model.setResposta_certa_33(repostacerta33.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta33d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta34d = new RespostaTbl().findOne(resposta34);

				if (Core.isNotNullOrZero(reposta34d.getRespostaCerta())) {
					view.pergunta34.setVisible(false);
					view.resposta34.setVisible(false);
					view.perungta_34_sep.setVisible(false);
					view.resposta_certa_34.setVisible(false);

				} else {
					final RespostaTbl repostacerta34 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta34d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta34 != null) {
						model.setPergunta34(repostacerta34.getIdPerguntaFk().getPergunta());
						model.setResposta34(reposta34d.getResposta());
						model.setResposta_certa_34(repostacerta34.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta34d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta35d = new RespostaTbl().findOne(resposta35);

				if (Core.isNotNullOrZero(reposta35d.getRespostaCerta())) {
					view.pergunta35.setVisible(false);
					view.resposta35.setVisible(false);
					view.perungta_35_sep.setVisible(false);
					view.resposta_certa_35.setVisible(false);

				} else {
					final RespostaTbl repostacerta35 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta35d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta35 != null) {
						model.setPergunta35(repostacerta35.getIdPerguntaFk().getPergunta());
						model.setResposta35(reposta35d.getResposta());
						model.setResposta_certa_35(repostacerta35.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta35d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");
				}

				final RespostaTbl reposta36d = new RespostaTbl().findOne(resposta36);

				if (Core.isNotNullOrZero(reposta36d.getRespostaCerta())) {
					view.pergunta_36.setVisible(false);
					view.resposta36.setVisible(false);
					view.pergunta_36_sep.setVisible(false);
					view.resposta_certa_36.setVisible(false);

				} else {
					final RespostaTbl repostacerta36 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta36d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta36 != null) {
						model.setPergunta_36(repostacerta36.getIdPerguntaFk().getPergunta());
						model.setResposta36(reposta36d.getResposta());
						model.setResposta_certa_36(repostacerta36.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta36d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta37d = new RespostaTbl().findOne(resposta37);

				if (Core.isNotNullOrZero(reposta37d.getRespostaCerta())) {
					view.pergunta_37.setVisible(false);
					view.resposta37.setVisible(false);
					view.pergunta_37_sep.setVisible(false);
					view.resposta_certa_37.setVisible(false);

				} else {
					final RespostaTbl repostacerta37 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta37d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta37 != null) {
						model.setPergunta_37(repostacerta37.getIdPerguntaFk().getPergunta());
						model.setResposta37(reposta37d.getResposta());
						model.setResposta_certa_37(repostacerta37.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta37d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta38d = new RespostaTbl().findOne(resposta38);

				if (Core.isNotNullOrZero(reposta38d.getRespostaCerta())) {
					view.pergunta_38.setVisible(false);
					view.resposta38.setVisible(false);
					view.pergunta_38_sep.setVisible(false);
					view.resposta_certa_38.setVisible(false);

				} else {
					final RespostaTbl repostacerta38 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta38d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta38 != null) {
						model.setPergunta_38(repostacerta38.getIdPerguntaFk().getPergunta());
						model.setResposta38(reposta38d.getResposta());
						model.setResposta_certa_38(repostacerta38.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta38d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta39d = new RespostaTbl().findOne(resposta39);
				if (Core.isNotNullOrZero(reposta39d.getRespostaCerta())) {
					view.pergunta_39.setVisible(false);
					view.resposta39.setVisible(false);
					view.pergunta_39_sep.setVisible(false);
					view.resposta_certa_39.setVisible(false);

				} else {
					final RespostaTbl repostacerta39 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta39d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta39 != null) {
						model.setPergunta_39(repostacerta39.getIdPerguntaFk().getPergunta());
						model.setResposta39(reposta39d.getResposta());
						model.setResposta_certa_39(repostacerta39.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta39d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

				final RespostaTbl reposta40d = new RespostaTbl().findOne(resposta40);
				if (Core.isNotNullOrZero(reposta40d.getRespostaCerta())) {
					view.pergunta_40.setVisible(false);
					view.resposta40.setVisible(false);
					view.pergunta_40_sep.setVisible(false);
					view.resposta_certa_40.setVisible(false);
				} else {
					final RespostaTbl repostacerta40 = new RespostaTbl().find()
							.andWhere("idPerguntaFk.idPergunta", "=", reposta40d.getIdPerguntaFk().getIdPergunta())
							.andWhere("respostaCerta", "=", 1).one();
					if (repostacerta40 != null) {
						model.setPergunta_40(repostacerta40.getIdPerguntaFk().getPergunta());
						model.setResposta40(reposta40d.getResposta());
						model.setResposta_certa_40(repostacerta40.getResposta());
					} else
						Core.setMessageError("A pergunta " + reposta40d.getIdPerguntaFk().getPergunta()
								+ " não tem uma resposta certa!");

				}

			} catch (Exception e) {
				e.printStackTrace();
				Core.setMessageError("Error: " + e.getMessage());
			}
		} else
			view.form_1.setVisible(false);

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
