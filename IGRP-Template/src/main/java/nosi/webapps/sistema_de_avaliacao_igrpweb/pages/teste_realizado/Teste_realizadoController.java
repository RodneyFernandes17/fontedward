package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.teste_realizado;

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
import java.util.Collections;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;

/*----#end-code----*/
		
public class Teste_realizadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Teste_realizado model = new Teste_realizado();
		model.load();
		Teste_realizadoView view = new Teste_realizadoView();
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
			/********************************************* IGRP STUDIO  ***************************************************/
		
		try{
		
		List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","igrp_studio")
				.andWhere(NIVEL, "=", 1).all();
		
		if(perguntatbl !=null){
			
			Collections.shuffle(perguntatbl);
			
			if(perguntatbl.size()>=5) {
				model.setPergunta1(perguntatbl.get(0).getPergunta());
				List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
				Collections.shuffle(respostatblList1);
				view.resposta1.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
				
				model.setPergunta2(perguntatbl.get(1).getPergunta());
				List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
				Collections.shuffle(respostatblList2);
				view.resposta2.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
				
				model.setPergunta_3(perguntatbl.get(2).getPergunta());
				List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
				Collections.shuffle(respostatblList3);
				view.resposta3.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
				
				model.setPergunta_4(perguntatbl.get(3).getPergunta());
				List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
				Collections.shuffle(respostatblList4);
				view.resposta4.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
				
				model.setPergunta_5(perguntatbl.get(4).getPergunta());
				List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
				Collections.shuffle(respostatblList5);
				view.resposta5.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
				
			}	
			
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
		/********************************************* BPMN REPORT ***************************************************/ 
		
	try{
		
		List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","bpmn_report")
				.andWhere(NIVEL, "=", 1).all();
		
		if(perguntatbl !=null){
			
			Collections.shuffle(perguntatbl);
			
			if(perguntatbl.size()>=5) {
				model.setPergunta_6(perguntatbl.get(0).getPergunta());
				List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
				Collections.shuffle(respostatblList1);
				view.resposta6.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
				
				model.setPergunta_7(perguntatbl.get(1).getPergunta());
				List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
				Collections.shuffle(respostatblList2);
				view.resposta7.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
				
				model.setPergunta8(perguntatbl.get(2).getPergunta());
				List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
				Collections.shuffle(respostatblList3);
				view.resposta8.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
				
				model.setPergunta9(perguntatbl.get(3).getPergunta());
				List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
				Collections.shuffle(respostatblList4);
				view.resposta9.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
				
				model.setPergunta10(perguntatbl.get(4).getPergunta());
				List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
				Collections.shuffle(respostatblList5);
				view.resposta10.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
					
			}	
			
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	/********************************************* PAGE DESIGNER  ***************************************************/
	
	try{
		
		List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","page_designer")
				.andWhere(NIVEL, "=", 1).all();
		
		if(perguntatbl !=null){
			
			Collections.shuffle(perguntatbl);
			
			if(perguntatbl.size()>=5) {
				model.setPergunta11(perguntatbl.get(0).getPergunta());
				List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
				Collections.shuffle(respostatblList1);
				view.resposta11.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
				
				model.setPergunta12(perguntatbl.get(1).getPergunta());
				List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
				Collections.shuffle(respostatblList2);
				view.resposta12.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
				
				model.setPergunta13(perguntatbl.get(2).getPergunta());
				List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
				Collections.shuffle(respostatblList3);
				view.resposta13.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
				
				model.setPergunta14(perguntatbl.get(3).getPergunta());
				List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
				Collections.shuffle(respostatblList4);
				view.resposta14.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
				
				model.setPergunta15(perguntatbl.get(4).getPergunta());
				List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
				Collections.shuffle(respostatblList5);
				view.resposta15.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
					
			}	
			
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	/********************************************* GERADOR BLOCKLY  ***************************************************/
	
	try{
		
		List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","gerador_blockly")
				.andWhere(NIVEL, "=", 1).all();
		
		if(perguntatbl !=null){
			
			Collections.shuffle(perguntatbl);
			
			if(perguntatbl.size()>=5) {
				model.setPergunta16(perguntatbl.get(0).getPergunta());
				List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
				Collections.shuffle(respostatblList1);
				view.resposta16.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
				
				model.setPergunta17(perguntatbl.get(1).getPergunta());
				List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
				Collections.shuffle(respostatblList2);
				view.resposta17.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
				
				model.setPergunta18(perguntatbl.get(2).getPergunta());
				List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
				Collections.shuffle(respostatblList3);
				view.resposta18.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
				
				model.setPergunta19(perguntatbl.get(3).getPergunta());
				List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
				Collections.shuffle(respostatblList4);
				view.resposta19.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
				
				model.setPergunta20(perguntatbl.get(4).getPergunta());
				List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
				Collections.shuffle(respostatblList5);
				view.resposta20.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
					
			}	
			
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	
   /********************************************* ECLIPSE GIT  ***************************************************/
	
	try{
		
		List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","eclipse_git")
				.andWhere(NIVEL, "=", 1).all();
		
		if(perguntatbl !=null){
			
			Collections.shuffle(perguntatbl);
			
			if(perguntatbl.size()>=5) {
				model.setPergunta21(perguntatbl.get(0).getPergunta());
				List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
				Collections.shuffle(respostatblList1);
				view.resposta21.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
				
				model.setPergunta22(perguntatbl.get(1).getPergunta());
				List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
				Collections.shuffle(respostatblList2);
				view.resposta22.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
				
				model.setPergunta23(perguntatbl.get(2).getPergunta());
				List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
				Collections.shuffle(respostatblList3);
				view.resposta23.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
				
				model.setPergunta24(perguntatbl.get(3).getPergunta());
				List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
				Collections.shuffle(respostatblList4);
				view.resposta24.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
				
				model.setPergunta25(perguntatbl.get(4).getPergunta());
				List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
				Collections.shuffle(respostatblList5);
				view.resposta25.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
					
			}	
			
		}
		
	}catch ( Exception e ) {
		e.printStackTrace();
	}
	
	
	 /********************************************* BASE DADOS DAO  ***************************************************/
	
		try{
			
			List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","base_dados_dao")
					.andWhere(NIVEL, "=", 1).all();
			
			if(perguntatbl !=null){
				
				Collections.shuffle(perguntatbl);
				
				if(perguntatbl.size()>=5) {
					model.setPergunta26(perguntatbl.get(0).getPergunta());
					List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList1);
					view.resposta26.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
					
					model.setPergunta27(perguntatbl.get(1).getPergunta());
					List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList2);
					view.resposta27.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
					
					model.setPergunta28(perguntatbl.get(2).getPergunta());
					List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList3);
					view.resposta28.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
					
					model.setPergunta29(perguntatbl.get(3).getPergunta());
					List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList4);
					view.resposta29.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
					
					model.setPergunta30(perguntatbl.get(4).getPergunta());
					List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList5);
					view.resposta30.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
						
				}	
				
			}
			
		}catch ( Exception e ) {
			e.printStackTrace();
		}
		
		/************************************************************ JAVA  ***************************************************/
		
		try{
			
			List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","java")
					.andWhere(NIVEL, "=", 1).all();
			
			if(perguntatbl !=null){
				
				Collections.shuffle(perguntatbl);
				
				if(perguntatbl.size()>=5) {
					model.setPergunta31(perguntatbl.get(0).getPergunta());
					List<RespostaTbl> respostatblList1 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList1);
					view.resposta31.setValue(Core.toMap(respostatblList1, "idResposta","resposta"));
					
					model.setPergunta32(perguntatbl.get(1).getPergunta());
					List<RespostaTbl> respostatblList2 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList2);
					view.resposta32.setValue(Core.toMap(respostatblList2, "idResposta","resposta"));
					
					model.setPergunta33(perguntatbl.get(2).getPergunta());
					List<RespostaTbl> respostatblList3 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList3);
					view.resposta33.setValue(Core.toMap(respostatblList3, "idResposta","resposta"));
					
					model.setPergunta34(perguntatbl.get(3).getPergunta());
					List<RespostaTbl> respostatblList4 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList4);
					view.resposta34.setValue(Core.toMap(respostatblList4, "idResposta","resposta"));
					
					model.setPergunta35(perguntatbl.get(4).getPergunta());
					List<RespostaTbl> respostatblList5 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList5);
					view.resposta35.setValue(Core.toMap(respostatblList5, "idResposta","resposta"));
						
				}	
				
			}
			
		}catch ( Exception e ) {
			e.printStackTrace();
		}
      
      /************************************************************ GESTAO ACESSO  ***************************************************/
		
		try{
			
			List<PerguntaTbl> perguntatbl = new PerguntaTbl().find().where("conceito","=","gestao_acesso")
					.andWhere(NIVEL, "=", 1).all();
			
			if(perguntatbl !=null){
				
				Collections.shuffle(perguntatbl);
				
				if(perguntatbl.size()>=5) {
					model.setPergunta_36(perguntatbl.get(0).getPergunta());
					List<RespostaTbl> respostatblList36 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(0).getIdPergunta()).all();
					Collections.shuffle(respostatblList36);
					view.resposta36.setValue(Core.toMap(respostatblList36, "idResposta","resposta"));
					
					model.setPergunta_37(perguntatbl.get(1).getPergunta());
					List<RespostaTbl> respostatblList37 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(1).getIdPergunta()).all();
					Collections.shuffle(respostatblList37);
					view.resposta37.setValue(Core.toMap(respostatblList37, "idResposta","resposta"));
					
					model.setPergunta_38(perguntatbl.get(2).getPergunta());
					List<RespostaTbl> respostatblList38 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(2).getIdPergunta()).all();
					Collections.shuffle(respostatblList38);
					view.resposta38.setValue(Core.toMap(respostatblList38, "idResposta","resposta"));
					
					model.setPergunta_39(perguntatbl.get(3).getPergunta());
					List<RespostaTbl> respostatblList39 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(3).getIdPergunta()).all();
					Collections.shuffle(respostatblList39);
					view.resposta39.setValue(Core.toMap(respostatblList39, "idResposta","resposta"));
					
					model.setPergunta_40(perguntatbl.get(4).getPergunta());
					List<RespostaTbl> respostatblList40 = new RespostaTbl().find().where("idPerguntaFk","=",perguntatbl.get(4).getIdPergunta()).all();
					Collections.shuffle(respostatblList40);
					view.resposta40.setValue(Core.toMap(respostatblList40, "idResposta","resposta"));
						
				}	
				
			}
			
		}catch ( Exception e ) {
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
