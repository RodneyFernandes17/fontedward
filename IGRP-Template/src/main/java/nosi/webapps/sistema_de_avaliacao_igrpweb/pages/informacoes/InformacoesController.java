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
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;

/*----#end-code----*/
		
public class InformacoesController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Informacoes model = new Informacoes();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		InformacoesView view = new InformacoesView();
		/*----#start-code(index)----*/
			try{
	
		TesteTbl testetbl = new TesteTbl().findOne(Core.getParamInt("p_id_teste"));
		if (testetbl!=null && !testetbl.hasError()) {
			model.setNome(testetbl.getIdAvaliadoFk().getNome());
			model.setTeste_nivel(""+testetbl.getIdAvaliadoFk().getNivel());
			model.setClassificacao(""+testetbl.getValorFinal());
			model.setView_1_img(Core.getLinkFileByUuid(testetbl.getIdAvaliadoFk().getIdFoto()));
          	model.setIgrp_studio(""+testetbl.getValorIgrpStudio());
			model.setPage_designer(""+testetbl.getValorPageDesigner());
			model.setBpmn_e_report_designer(""+testetbl.getValorBpmnReport());
			model.setGerador_de_codigo_e_blockly(""+testetbl.getValorGeradorBlockly());
			model.setEclipse_e_git(""+testetbl.getValorEclipseGit());
			model.setBase_de_dados_e_dao(""+testetbl.getValorBaseDadosDao());
			model.setJava(""+testetbl.getValorJava());
          	model.setGestao_de_acessos(""+testetbl.getValorGestaoAcesso());
			model.setId_teste(""+testetbl.getIdTeste());
			model.setId_avaliado(""+testetbl.getIdAvaliadoFk().getIdAvaliado());
		}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
