package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.ver_observacao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Ver_observacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ver_observacao model = new Ver_observacao();
		model.load();
		Ver_observacaoView view = new Ver_observacaoView();
		/*----#start-code(index)----*/
		try {

			SemanalTbl semanaltbl = new SemanalTbl().findOne(Core.getParamInt("p_id_semanal"));
			if (semanaltbl != null && !semanaltbl.hasError()) {
				model.setAvaliador("" + semanaltbl.getNomeAvaliador());
				model.setObservacao(semanaltbl.getObservacao());
				
				if(Core.isNotNull(Core.getParam("isVer"))){
					view.observacao.propertie().add("readonly", "true");
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


/*----#end-code----*/
}
