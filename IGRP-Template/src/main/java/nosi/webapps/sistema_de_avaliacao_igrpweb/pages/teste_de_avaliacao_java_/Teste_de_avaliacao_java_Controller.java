package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.teste_de_avaliacao_java_;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.PerguntaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.RespostaTbl;
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import java.util.Collections;
import java.util.List;

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

/*----#end-code----*/
		
public class Teste_de_avaliacao_java_Controller extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Teste_de_avaliacao_java_ model = new Teste_de_avaliacao_java_();
		model.load();
		Teste_de_avaliacao_java_View view = new Teste_de_avaliacao_java_View();
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
		model.setId_avaliado(Core.getParam("p_id_avaliado"));
		model.setNivel(Core.getParam("p_nivel"));

		try {

			/******** PERGUNTAS IGRP STUDIO *******************/

			List<PerguntaTbl> perguntalistconceito = new PerguntaTbl().find().where(CONCEITO, "=", "igrp_studio")
					.andWhere(NIVEL, "=", 0).all();

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
					.andWhere(NIVEL, "=", 0).all();

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
					.andWhere(NIVEL, "=", 0).all();

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
					.andWhere(NIVEL, "=",0).all();

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
					.andWhere(NIVEL, "=", 0).all();

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
					.andWhere(NIVEL, "=", 0).all();

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
					.andWhere(NIVEL, "=", 0).all();

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

			/********* PERGUNTAS GESTÃO DE ACESSO ***********************************/

			List<PerguntaTbl> perguntalistgestao = new PerguntaTbl().find().where(CONCEITO, "=", "gestao_acesso")
					.andWhere(NIVEL, "=", 0).all();

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


		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	private static final String CONCEITO = "conceito";
	private static final String NIVEL = "nivel";
	private static final String IDPERGUNTAFK = "idPerguntaFk";
/*----#end-code----*/
}
