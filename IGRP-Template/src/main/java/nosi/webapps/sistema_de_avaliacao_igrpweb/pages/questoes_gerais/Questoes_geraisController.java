package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.questoes_gerais;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.PerguntaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.RespostaTbl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormacaoTbl;
import java.time.LocalDateTime;
/*----#end-code----*/
		
public class Questoes_geraisController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Questoes_gerais model = new Questoes_gerais();
		model.load();
		Questoes_geraisView view = new Questoes_geraisView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.resposta1.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta2.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta3.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta4.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta5.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta6.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta7.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta8.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta9.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta10.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta11.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta12.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta13.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta14.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta15.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta16.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta17.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta18.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta19.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta20.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta21.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta22.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta23.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta24.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta25.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta26.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta27.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta28.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta29.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta30.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta31.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta32.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta33.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta34.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta35.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta36.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta37.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta38.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta39.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.resposta40.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/

		AvaliadoTbl avaliado = new AvaliadoTbl().find().andWhere("idUtilizador","=", Core.getCurrentUser().getId()).one();		
		model.setId_avaliado(avaliado.getIdAvaliado()+"");
		
		FormacaoTbl teste = new FormacaoTbl().findOne(Core.getParamInt("p_id_formacao"));
		if(Core.isNotNull(teste.getEnunciadoId())) {
			model.setNivel(teste.getEnunciadoId().getId()+"");
			model.setFormacao(teste.getId()+"");
		}else
			Core.setMessageError("Esta forma????o N??o tem um teste associado!");
		

		try {

			/******** PERGUNTAS IGRP STUDIO *******************/

			List<PerguntaTbl> perguntalistconceito = new PerguntaTbl().find().where(CONCEITO, "=", "igrp_studio")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistconceito != null) {

				Collections.shuffle(perguntalistconceito);

				if (perguntalistconceito.size() >= 5) {
					model.setPergunta1(perguntalistconceito.get(0).getPergunta());
					List<RespostaTbl> respostatblList1 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistconceito.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList1);
					view.resposta1.setValue(Core.toMap(respostatblList1, "idResposta", "resposta"));

					model.setPergunta2(perguntalistconceito.get(1).getPergunta());
					List<RespostaTbl> respostatblList2 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistconceito.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList2);
					view.resposta2.setValue(Core.toMap(respostatblList2, "idResposta", "resposta"));

					model.setPergunta_3(perguntalistconceito.get(2).getPergunta());
					List<RespostaTbl> respostatblList3 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistconceito.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList3);
					view.resposta3.setValue(Core.toMap(respostatblList3, "idResposta", "resposta"));

					model.setPergunta_4(perguntalistconceito.get(3).getPergunta());
					List<RespostaTbl> respostatblList4 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistconceito.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList4);
					view.resposta4.setValue(Core.toMap(respostatblList4, "idResposta", "resposta"));

					model.setPergunta_5(perguntalistconceito.get(4).getPergunta());
					List<RespostaTbl> respostatblList5 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistconceito.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList5);
					view.resposta5.setValue(Core.toMap(respostatblList5, "idResposta", "resposta"));

				}

			}

			/******* PERGUNTAS BPMN REPORT ************************************/

			List<PerguntaTbl> perguntalistbpmn = new PerguntaTbl().find().where(CONCEITO, "=", "bpmn_report")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistbpmn != null) {

				Collections.shuffle(perguntalistbpmn);

				if (perguntalistbpmn.size() >= 5) {
					model.setPergunta_6(perguntalistbpmn.get(0).getPergunta());
					List<RespostaTbl> respostatblList6 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistbpmn.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList6);
					view.resposta6.setValue(Core.toMap(respostatblList6, "idResposta", "resposta"));

					model.setPergunta_7(perguntalistbpmn.get(1).getPergunta());
					List<RespostaTbl> respostatblList7 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistbpmn.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList7);
					view.resposta7.setValue(Core.toMap(respostatblList7, "idResposta", "resposta"));

					model.setPergunta8(perguntalistbpmn.get(2).getPergunta());
					List<RespostaTbl> respostatblList8 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistbpmn.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList8);
					view.resposta8.setValue(Core.toMap(respostatblList8, "idResposta", "resposta"));

					model.setPergunta9(perguntalistbpmn.get(3).getPergunta());
					List<RespostaTbl> respostatblList9 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistbpmn.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList9);
					view.resposta9.setValue(Core.toMap(respostatblList9, "idResposta", "resposta"));

					model.setPergunta10(perguntalistbpmn.get(4).getPergunta());
					List<RespostaTbl> respostatblList10 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistbpmn.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList10);
					view.resposta10.setValue(Core.toMap(respostatblList10, "idResposta", "resposta"));

				}

			}

			/********** PERGUNTAS PAGE DESIGNER ******************************/

			List<PerguntaTbl> perguntalistpage = new PerguntaTbl().find().where(CONCEITO, "=", "page_designer")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistpage != null) {

				Collections.shuffle(perguntalistpage);

				if (perguntalistpage.size() >= 5) {
					model.setPergunta11(perguntalistpage.get(0).getPergunta());
					List<RespostaTbl> respostatblList11 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistpage.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList11);
					view.resposta11.setValue(Core.toMap(respostatblList11, "idResposta", "resposta"));

					model.setPergunta12(perguntalistpage.get(1).getPergunta());
					List<RespostaTbl> respostatblList12 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistpage.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList12);
					view.resposta12.setValue(Core.toMap(respostatblList12, "idResposta", "resposta"));

					model.setPergunta13(perguntalistpage.get(2).getPergunta());
					List<RespostaTbl> respostatblList13 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistpage.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList13);
					view.resposta13.setValue(Core.toMap(respostatblList13, "idResposta", "resposta"));

					model.setPergunta14(perguntalistpage.get(3).getPergunta());
					List<RespostaTbl> respostatblList14 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistpage.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList14);
					view.resposta14.setValue(Core.toMap(respostatblList14, "idResposta", "resposta"));

					model.setPergunta15(perguntalistpage.get(4).getPergunta());
					List<RespostaTbl> respostatblList15 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistpage.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList15);
					view.resposta15.setValue(Core.toMap(respostatblList15, "idResposta", "resposta"));

				}

			}

			/********* PERGUNTAS GERADOR BLOCKLY ***********************************/

			List<PerguntaTbl> perguntatblistgerador = new PerguntaTbl().find().where(CONCEITO, "=", "gerador_blockly")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntatblistgerador != null) {

				Collections.shuffle(perguntatblistgerador);

				if (perguntatblistgerador.size() >= 5) {
					model.setPergunta16(perguntatblistgerador.get(0).getPergunta());
					List<RespostaTbl> respostatblList16 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatblistgerador.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList16);
					view.resposta16.setValue(Core.toMap(respostatblList16, "idResposta", "resposta"));

					model.setPergunta17(perguntatblistgerador.get(1).getPergunta());
					List<RespostaTbl> respostatblList17 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatblistgerador.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList17);
					view.resposta17.setValue(Core.toMap(respostatblList17, "idResposta", "resposta"));

					model.setPergunta18(perguntatblistgerador.get(2).getPergunta());
					List<RespostaTbl> respostatblList18 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatblistgerador.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList18);
					view.resposta18.setValue(Core.toMap(respostatblList18, "idResposta", "resposta"));

					model.setPergunta19(perguntatblistgerador.get(3).getPergunta());
					List<RespostaTbl> respostatblList19 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatblistgerador.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList19);
					view.resposta19.setValue(Core.toMap(respostatblList19, "idResposta", "resposta"));

					model.setPergunta20(perguntatblistgerador.get(4).getPergunta());
					List<RespostaTbl> respostatblList20 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatblistgerador.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList20);
					view.resposta20.setValue(Core.toMap(respostatblList20, "idResposta", "resposta"));

				}

			}

			/*********** PERGUNTAS ECLIPSE GIT **********************************/

			List<PerguntaTbl> perguntatbleclipse = new PerguntaTbl().find().where(CONCEITO, "=", "eclipse_git")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntatbleclipse != null) {

				Collections.shuffle(perguntatbleclipse);

				if (perguntatbleclipse.size() >= 5) {
					model.setPergunta21(perguntatbleclipse.get(0).getPergunta());
					List<RespostaTbl> respostatblList21 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatbleclipse.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList21);
					view.resposta21.setValue(Core.toMap(respostatblList21, "idResposta", "resposta"));

					model.setPergunta22(perguntatbleclipse.get(1).getPergunta());
					List<RespostaTbl> respostatblList22 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatbleclipse.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList22);
					view.resposta22.setValue(Core.toMap(respostatblList22, "idResposta", "resposta"));

					model.setPergunta23(perguntatbleclipse.get(2).getPergunta());
					List<RespostaTbl> respostatblList23 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatbleclipse.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList23);
					view.resposta23.setValue(Core.toMap(respostatblList23, "idResposta", "resposta"));

					model.setPergunta24(perguntatbleclipse.get(3).getPergunta());
					List<RespostaTbl> respostatblList24 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatbleclipse.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList24);
					view.resposta24.setValue(Core.toMap(respostatblList24, "idResposta", "resposta"));

					model.setPergunta25(perguntatbleclipse.get(4).getPergunta());
					List<RespostaTbl> respostatblList25 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntatbleclipse.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList25);
					view.resposta25.setValue(Core.toMap(respostatblList25, "idResposta", "resposta"));

				}

			}

			/********* PERGUNTAS BASE DADOS DAO *******************************/

			List<PerguntaTbl> perguntalistadao = new PerguntaTbl().find().where(CONCEITO, "=", "base_dados_dao")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistadao != null) {

				Collections.shuffle(perguntalistadao);

				if (perguntalistadao.size() >= 5) {
					model.setPergunta26(perguntalistadao.get(0).getPergunta());
					List<RespostaTbl> respostatblList26 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistadao.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList26);
					view.resposta26.setValue(Core.toMap(respostatblList26, "idResposta", "resposta"));

					model.setPergunta27(perguntalistadao.get(1).getPergunta());
					List<RespostaTbl> respostatblList27 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistadao.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList27);
					view.resposta27.setValue(Core.toMap(respostatblList27, "idResposta", "resposta"));

					model.setPergunta28(perguntalistadao.get(2).getPergunta());
					List<RespostaTbl> respostatblList28 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistadao.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList28);
					view.resposta28.setValue(Core.toMap(respostatblList28, "idResposta", "resposta"));

					model.setPergunta29(perguntalistadao.get(3).getPergunta());
					List<RespostaTbl> respostatblList29 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistadao.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList29);
					view.resposta29.setValue(Core.toMap(respostatblList29, "idResposta", "resposta"));

					model.setPergunta30(perguntalistadao.get(4).getPergunta());
					List<RespostaTbl> respostatblList30 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistadao.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList30);
					view.resposta30.setValue(Core.toMap(respostatblList30, "idResposta", "resposta"));

				}

			}

			/********** PERGUNTAS JAVA ***************************************/

			List<PerguntaTbl> perguntalistjava = new PerguntaTbl().find().where(CONCEITO, "=", "java")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistjava != null) {

				Collections.shuffle(perguntalistjava);

				if (perguntalistjava.size() >= 5) {
					model.setPergunta31(perguntalistjava.get(0).getPergunta());
					List<RespostaTbl> respostatblList31 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistjava.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList31);
					view.resposta31.setValue(Core.toMap(respostatblList31, "idResposta", "resposta"));

					model.setPergunta32(perguntalistjava.get(1).getPergunta());
					List<RespostaTbl> respostatblList32 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistjava.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList32);
					view.resposta32.setValue(Core.toMap(respostatblList32, "idResposta", "resposta"));

					model.setPergunta33(perguntalistjava.get(2).getPergunta());
					List<RespostaTbl> respostatblList33 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistjava.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList33);
					view.resposta33.setValue(Core.toMap(respostatblList33, "idResposta", "resposta"));

					model.setPergunta34(perguntalistjava.get(3).getPergunta());
					List<RespostaTbl> respostatblList34 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistjava.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList34);
					view.resposta34.setValue(Core.toMap(respostatblList34, "idResposta", "resposta"));

					model.setPergunta35(perguntalistjava.get(4).getPergunta());
					List<RespostaTbl> respostatblList35 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistjava.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList35);
					view.resposta35.setValue(Core.toMap(respostatblList35, "idResposta", "resposta"));

				}

			}

			/********* PERGUNTAS GEST??O DE ACESSO ***********************************/

			List<PerguntaTbl> perguntalistgestao = new PerguntaTbl().find().where(CONCEITO, "=", "gestao_acesso")
					.andWhere(NIVEL, "=", Core.toInt(model.getNivel())).all();

			if (perguntalistgestao != null) {

				Collections.shuffle(perguntalistgestao);

				if (perguntalistgestao.size() >= 5) {
					model.setPergunta_36(perguntalistgestao.get(0).getPergunta());
					List<RespostaTbl> respostatblList36 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistgestao.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList36);
					view.resposta36.setValue(Core.toMap(respostatblList36, "idResposta", "resposta"));

					model.setPergunta_37(perguntalistgestao.get(1).getPergunta());
					List<RespostaTbl> respostatblList37 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistgestao.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList37);
					view.resposta37.setValue(Core.toMap(respostatblList37, "idResposta", "resposta"));

					model.setPergunta_38(perguntalistgestao.get(2).getPergunta());
					List<RespostaTbl> respostatblList38 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistgestao.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList38);
					view.resposta38.setValue(Core.toMap(respostatblList38, "idResposta", "resposta"));

					model.setPergunta_39(perguntalistgestao.get(3).getPergunta());
					List<RespostaTbl> respostatblList39 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistgestao.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList39);
					view.resposta39.setValue(Core.toMap(respostatblList39, "idResposta", "resposta"));

					model.setPergunta_40(perguntalistgestao.get(4).getPergunta());
					List<RespostaTbl> respostatblList40 = new RespostaTbl().find()
							.where(IDPERGUNTAFK, "=", perguntalistgestao.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList40);
					view.resposta40.setValue(Core.toMap(respostatblList40, "idResposta", "resposta"));

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		view.btn_finalizar.addParameter("p_id_avaliado", model.getId_avaliado());
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionFinalizar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Questoes_gerais model = new Questoes_gerais();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Informacoes","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(finalizar)----*/

		Session session = null;
		Transaction transaction = null;
		try {

			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
			if (!transaction.isActive())
				transaction.begin();
			TesteTbl testetbl = new TesteTbl();

			/******** C??LCULO IGRP STUDIO *******************************/
			int valor_igrpstudio = 0;
			List<Integer> valores = new ArrayList<>();
			final RespostaTbl resposta_valor1 = session.find(RespostaTbl.class, model.getResposta1());
			if (resposta_valor1.getRespostaCerta() != null) {
				valores.add(resposta_valor1.getRespostaCerta());
				valor_igrpstudio += resposta_valor1.getRespostaCerta();
			}
			final RespostaTbl resposta_valor2 = session.find(RespostaTbl.class, model.getResposta2());
			if (resposta_valor2.getRespostaCerta() != null) {
				valores.add(resposta_valor2.getRespostaCerta());
				valor_igrpstudio += resposta_valor2.getRespostaCerta();
			}
			final RespostaTbl resposta_valor3 = session.find(RespostaTbl.class, model.getResposta3());
			if (resposta_valor3.getRespostaCerta() != null) {
				valores.add(resposta_valor3.getRespostaCerta());
				valor_igrpstudio += resposta_valor3.getRespostaCerta();
			}
			final RespostaTbl resposta_valor4 = session.find(RespostaTbl.class, model.getResposta4());
			if (resposta_valor4.getRespostaCerta() != null) {
				valores.add(resposta_valor4.getRespostaCerta());
				valor_igrpstudio += resposta_valor4.getRespostaCerta();
			}
			final RespostaTbl resposta_valor5 = session.find(RespostaTbl.class, model.getResposta5());
			if (resposta_valor5.getRespostaCerta() != null) {
				valores.add(resposta_valor5.getRespostaCerta());
				valor_igrpstudio += resposta_valor5.getRespostaCerta();
			}
			testetbl.setValorIgrpStudio(valor_igrpstudio);

			/******** C??LCULO BPMN REPORT **********************************/
			int valor_bpmn_report = 0;
			final RespostaTbl resposta_valor6 = session.find(RespostaTbl.class, model.getResposta6());
			if (resposta_valor6.getRespostaCerta() != null) {
				valores.add(resposta_valor6.getRespostaCerta());
				valor_bpmn_report += resposta_valor6.getRespostaCerta();
			}
			final RespostaTbl resposta_valor7 = session.find(RespostaTbl.class, model.getResposta7());
			if (resposta_valor7.getRespostaCerta() != null) {
				valores.add(resposta_valor7.getRespostaCerta());
				valor_bpmn_report += resposta_valor7.getRespostaCerta();
			}
			final RespostaTbl resposta_valor8 = session.find(RespostaTbl.class, model.getResposta8());
			if (resposta_valor8.getRespostaCerta() != null) {
				valores.add(resposta_valor8.getRespostaCerta());
				valor_bpmn_report += resposta_valor8.getRespostaCerta();
			}
			final RespostaTbl resposta_valor9 = session.find(RespostaTbl.class, model.getResposta9());
			if (resposta_valor9.getRespostaCerta() != null) {
				valores.add(resposta_valor9.getRespostaCerta());
				valor_bpmn_report += resposta_valor9.getRespostaCerta();
			}
			final RespostaTbl resposta_valor10 = session.find(RespostaTbl.class, model.getResposta10());
			if (resposta_valor10.getRespostaCerta() != null) {
				valores.add(resposta_valor10.getRespostaCerta());
				valor_bpmn_report += resposta_valor10.getRespostaCerta();
			}

			testetbl.setValorBpmnReport(valor_bpmn_report);

			/********* C??LCULO PAGE DESIGNER ***********************************/
			int valor_page_designer = 0;
			RespostaTbl resposta_valor11 = session.find(RespostaTbl.class, model.getResposta11());
			if (resposta_valor11.getRespostaCerta() != null) {
				valores.add(resposta_valor11.getRespostaCerta());
				valor_page_designer += resposta_valor11.getRespostaCerta();
			}
			RespostaTbl resposta_valor12 = session.find(RespostaTbl.class, model.getResposta12());
			if (resposta_valor12.getRespostaCerta() != null) {
				valores.add(resposta_valor12.getRespostaCerta());
				valor_page_designer += resposta_valor12.getRespostaCerta();
			}
			RespostaTbl resposta_valor13 = session.find(RespostaTbl.class, model.getResposta13());
			if (resposta_valor13.getRespostaCerta() != null) {
				valores.add(resposta_valor13.getRespostaCerta());
				valor_page_designer += resposta_valor13.getRespostaCerta();
			}
			RespostaTbl resposta_valor14 = session.find(RespostaTbl.class, model.getResposta14());
			if (resposta_valor14.getRespostaCerta() != null) {
				valores.add(resposta_valor14.getRespostaCerta());
				valor_page_designer += resposta_valor14.getRespostaCerta();
			}
			RespostaTbl resposta_valor15 = session.find(RespostaTbl.class, model.getResposta15());
			if (resposta_valor15.getRespostaCerta() != null) {
				valores.add(resposta_valor15.getRespostaCerta());
				valor_page_designer += resposta_valor15.getRespostaCerta();
			}
			testetbl.setValorPageDesigner(valor_page_designer);

			/******* C??LCULO GERADOR BLOCKLY *********************************/
			int valor_gerador_blockly = 0;
			RespostaTbl resposta_valor16 = session.find(RespostaTbl.class, model.getResposta16());
			if (resposta_valor16.getRespostaCerta() != null) {
				valores.add(resposta_valor16.getRespostaCerta());
				valor_gerador_blockly += resposta_valor16.getRespostaCerta();
			}
			RespostaTbl resposta_valor17 = session.find(RespostaTbl.class, model.getResposta17());
			if (resposta_valor17.getRespostaCerta() != null) {
				valores.add(resposta_valor17.getRespostaCerta());
				valor_gerador_blockly += resposta_valor17.getRespostaCerta();
			}
			RespostaTbl resposta_valor18 = session.find(RespostaTbl.class, model.getResposta18());
			if (resposta_valor18.getRespostaCerta() != null) {
				valores.add(resposta_valor18.getRespostaCerta());
				valor_gerador_blockly += resposta_valor18.getRespostaCerta();
			}
			RespostaTbl resposta_valor19 = session.find(RespostaTbl.class, model.getResposta19());
			if (resposta_valor19.getRespostaCerta() != null) {
				valores.add(resposta_valor19.getRespostaCerta());
				valor_gerador_blockly += resposta_valor19.getRespostaCerta();
			}
			RespostaTbl resposta_valor20 = session.find(RespostaTbl.class, model.getResposta20());
			if (resposta_valor20.getRespostaCerta() != null) {
				valores.add(resposta_valor20.getRespostaCerta());
				valor_gerador_blockly += resposta_valor20.getRespostaCerta();
			}
			testetbl.setValorGeradorBlockly(valor_gerador_blockly);

			/******* C??LCULO ECLISE GIT *********************************/
			int valor_eclipse_git = 0;
			RespostaTbl resposta_valor21 = session.find(RespostaTbl.class, model.getResposta21());
			if (resposta_valor21.getRespostaCerta() != null) {
				valores.add(resposta_valor21.getRespostaCerta());
				valor_eclipse_git += resposta_valor21.getRespostaCerta();
			}
			RespostaTbl resposta_valor22 = session.find(RespostaTbl.class, model.getResposta22());
			if (resposta_valor22.getRespostaCerta() != null) {
				valores.add(resposta_valor22.getRespostaCerta());
				valor_eclipse_git += resposta_valor22.getRespostaCerta();
			}
			RespostaTbl resposta_valor23 = session.find(RespostaTbl.class, model.getResposta23());
			if (resposta_valor23.getRespostaCerta() != null) {
				valores.add(resposta_valor23.getRespostaCerta());
				valor_eclipse_git += resposta_valor23.getRespostaCerta();
			}
			RespostaTbl resposta_valor24 = session.find(RespostaTbl.class, model.getResposta24());
			if (resposta_valor24.getRespostaCerta() != null) {
				valores.add(resposta_valor24.getRespostaCerta());
				valor_eclipse_git += resposta_valor24.getRespostaCerta();
			}
			RespostaTbl resposta_valor25 = session.find(RespostaTbl.class, model.getResposta25());
			if (resposta_valor25.getRespostaCerta() != null) {
				valores.add(resposta_valor25.getRespostaCerta());
				valor_eclipse_git += resposta_valor25.getRespostaCerta();
			}
			testetbl.setValorEclipseGit(valor_eclipse_git);

			/******* C??LCULO BASE DADOS DAO ************************************/
			int valor_base_dados_dao = 0;
			RespostaTbl resposta_valor26 = session.find(RespostaTbl.class, model.getResposta26());
			if (resposta_valor26.getRespostaCerta() != null) {
				valores.add(resposta_valor26.getRespostaCerta());
				valor_base_dados_dao += resposta_valor26.getRespostaCerta();
			}
			RespostaTbl resposta_valor27 = session.find(RespostaTbl.class, model.getResposta27());
			if (resposta_valor27.getRespostaCerta() != null) {
				valores.add(resposta_valor27.getRespostaCerta());
				valor_base_dados_dao += resposta_valor27.getRespostaCerta();
			}
			RespostaTbl resposta_valor28 = session.find(RespostaTbl.class, model.getResposta28());
			if (resposta_valor28.getRespostaCerta() != null) {
				valores.add(resposta_valor28.getRespostaCerta());
				valor_base_dados_dao += resposta_valor28.getRespostaCerta();
			}
			RespostaTbl resposta_valor29 = session.find(RespostaTbl.class, model.getResposta29());
			if (resposta_valor29.getRespostaCerta() != null) {
				valores.add(resposta_valor29.getRespostaCerta());
				valor_base_dados_dao += resposta_valor29.getRespostaCerta();
			}
			RespostaTbl resposta_valor30 = session.find(RespostaTbl.class, model.getResposta30());
			if (resposta_valor30.getRespostaCerta() != null) {
				valores.add(resposta_valor30.getRespostaCerta());
				valor_base_dados_dao += resposta_valor30.getRespostaCerta();
			}
			testetbl.setValorBaseDadosDao(valor_base_dados_dao);

			/******* C??LCULO JAVA ****************************************/
			int valor_java = 0;
			RespostaTbl resposta_valor31 = session.find(RespostaTbl.class, model.getResposta31());
			if (resposta_valor31.getRespostaCerta() != null) {
				valores.add(resposta_valor31.getRespostaCerta());
				valor_java += resposta_valor31.getRespostaCerta();
			}
			RespostaTbl resposta_valor32 = session.find(RespostaTbl.class, model.getResposta32());
			if (resposta_valor32.getRespostaCerta() != null) {
				valores.add(resposta_valor32.getRespostaCerta());
				valor_java += resposta_valor32.getRespostaCerta();
			}
			RespostaTbl resposta_valor33 = session.find(RespostaTbl.class, model.getResposta33());
			if (resposta_valor33.getRespostaCerta() != null) {
				valores.add(resposta_valor33.getRespostaCerta());
				valor_java += resposta_valor33.getRespostaCerta();
			}
			RespostaTbl resposta_valor34 = session.find(RespostaTbl.class, model.getResposta34());
			if (resposta_valor34.getRespostaCerta() != null) {
				valores.add(resposta_valor34.getRespostaCerta());
				valor_java += resposta_valor34.getRespostaCerta();
			}
			RespostaTbl resposta_valor35 = session.find(RespostaTbl.class, model.getResposta35());
			if (resposta_valor35.getRespostaCerta() != null) {
				valores.add(resposta_valor35.getRespostaCerta());
				valor_java += resposta_valor35.getRespostaCerta();
			}

			testetbl.setValorJava(valor_java);

			/********* C??LCULO GESTAO ACESSO *********************************/
			int valor_gestao_acesso = 0;
			RespostaTbl resposta_valor36 = session.find(RespostaTbl.class, model.getResposta36());
			if (resposta_valor36.getRespostaCerta() != null) {
				valores.add(resposta_valor36.getRespostaCerta());
				valor_gestao_acesso += resposta_valor36.getRespostaCerta();
			}
			RespostaTbl resposta_valor37 = session.find(RespostaTbl.class, model.getResposta37());
			if (resposta_valor37.getRespostaCerta() != null) {
				valores.add(resposta_valor37.getRespostaCerta());
				valor_gestao_acesso += resposta_valor37.getRespostaCerta();
			}
			RespostaTbl resposta_valor38 = session.find(RespostaTbl.class, model.getResposta38());
			if (resposta_valor38.getRespostaCerta() != null) {
				valores.add(resposta_valor38.getRespostaCerta());
				valor_gestao_acesso += resposta_valor38.getRespostaCerta();
			}
			RespostaTbl resposta_valor39 = session.find(RespostaTbl.class, model.getResposta39());
			if (resposta_valor39.getRespostaCerta() != null) {
				valores.add(resposta_valor39.getRespostaCerta());
				valor_gestao_acesso += resposta_valor39.getRespostaCerta();
			}
			RespostaTbl resposta_valor40 = session.find(RespostaTbl.class, model.getResposta40());
			if (resposta_valor40.getRespostaCerta() != null) {
				valores.add(resposta_valor40.getRespostaCerta());
				valor_gestao_acesso += resposta_valor40.getRespostaCerta();
			}
			testetbl.setValorGestaoAcesso(valor_gestao_acesso);

			testetbl.setDataRealizacao(LocalDateTime.now());
			
			AvaliadoTbl avaliadotbl_foreign = session.find(AvaliadoTbl.class, Core.getParamInt("p_id_avaliado"));
			testetbl.setIdAvaliadoFk(avaliadotbl_foreign);
			
			FormacaoTbl formacao = new FormacaoTbl().find().andWhere("id","=",Core.toInt(model.getFormacao())).keepConnection().one();
			testetbl.setFormacaoId(formacao);
			
			int valor_final = 0;

			if (valores != null)
				valor_final = valores.stream().filter(a -> a != 0).mapToInt(a -> a).sum();

			testetbl.setValorFinal(valor_final);

			if (valor_final >= 30) {
				testetbl.setAprovacao(4);
			} else if (valor_final >= 20 && valor_final < 30) {
				testetbl.setAprovacao(3);
			} else if (valor_final >= 10 && valor_final < 20) {
				testetbl.setAprovacao(2);
			} else if (valor_final < 10) {
				testetbl.setAprovacao(1);
			}
			session.persist(testetbl);
			transaction.commit();
			Core.setMessageSuccess();

			this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));

			this.addQueryString("valor_igrpstudio", valor_igrpstudio);
			this.addQueryString("valor_bpmn_report", valor_bpmn_report);
			this.addQueryString("valor_page_designer", valor_page_designer);
			this.addQueryString("valor_gerador_blockly", valor_gerador_blockly);
			this.addQueryString("valor_eclipse_git", valor_eclipse_git);
			this.addQueryString("valor_base_dados_dao", valor_base_dados_dao);
			this.addQueryString("valor_java", valor_java);
			this.addQueryString("valor_gestao_acesso", valor_gestao_acesso);
			this.addQueryString("valor_final", valor_final);
			this.addQueryString("p_id_teste", testetbl.getIdTeste());

		} catch (

		Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		this.addQueryString("resposta_1", model.getResposta1());
		this.addQueryString("resposta_2", model.getResposta2());
		this.addQueryString("resposta_3", model.getResposta3());
		this.addQueryString("resposta_4", model.getResposta4());
		this.addQueryString("resposta_5", model.getResposta5());
		this.addQueryString("resposta_6", model.getResposta6());
		this.addQueryString("resposta_7", model.getResposta7());
		this.addQueryString("resposta_8", model.getResposta8());
		this.addQueryString("resposta_9", model.getResposta9());
		this.addQueryString("resposta_10", model.getResposta10());
		this.addQueryString("resposta_11", model.getResposta11());
		this.addQueryString("resposta_12", model.getResposta12());
		this.addQueryString("resposta_13", model.getResposta13());
		this.addQueryString("resposta_14", model.getResposta14());
		this.addQueryString("resposta_15", model.getResposta15());
		this.addQueryString("resposta_16", model.getResposta16());
		this.addQueryString("resposta_17", model.getResposta17());
		this.addQueryString("resposta_18", model.getResposta18());
		this.addQueryString("resposta_19", model.getResposta19());
		this.addQueryString("resposta_20", model.getResposta20());
		this.addQueryString("resposta_21", model.getResposta21());
		this.addQueryString("resposta_22", model.getResposta22());
		this.addQueryString("resposta_23", model.getResposta23());
		this.addQueryString("resposta_24", model.getResposta24());
		this.addQueryString("resposta_25", model.getResposta25());
		this.addQueryString("resposta_26", model.getResposta26());
		this.addQueryString("resposta_27", model.getResposta27());
		this.addQueryString("resposta_28", model.getResposta28());
		this.addQueryString("resposta_29", model.getResposta29());
		this.addQueryString("resposta_30", model.getResposta30());
		this.addQueryString("resposta_31", model.getResposta31());
		this.addQueryString("resposta_32", model.getResposta32());
		this.addQueryString("resposta_33", model.getResposta33());
		this.addQueryString("resposta_34", model.getResposta34());
		this.addQueryString("resposta_35", model.getResposta35());
		this.addQueryString("resposta_36", model.getResposta36());
		this.addQueryString("resposta_37", model.getResposta37());
		this.addQueryString("resposta_38", model.getResposta38());
		this.addQueryString("resposta_39", model.getResposta39());
		this.addQueryString("resposta_40", model.getResposta40());

		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Informacoes","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	private static final String CONCEITO = "conceito";
	private static final String NIVEL = "enunciadoId";
	private static final String IDPERGUNTAFK = "idPerguntaFk";

	/*----#end-code----*/
}
