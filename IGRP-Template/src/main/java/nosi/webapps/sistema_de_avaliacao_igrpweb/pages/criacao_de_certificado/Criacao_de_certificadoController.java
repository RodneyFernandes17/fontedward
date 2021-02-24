package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_de_certificado;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.core.webapp.Report;
/*----#end-code----*/
		
public class Criacao_de_certificadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Criacao_de_certificado model = new Criacao_de_certificado();
		model.load();
		Criacao_de_certificadoView view = new Criacao_de_certificadoView();
		view.avaliador.loadDomain("avaliadores","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		try {
			Integer idAvaliado = Core.getParamInt("value_array");
			AvaliadoTbl avaliadotbl = new AvaliadoTbl().findOne(idAvaliado);
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				view.foto.setValue(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
				model.setNome(avaliadotbl.getNome());
				model.setId_avaliado("" + avaliadotbl.getIdAvaliado());
				model.setHoras_de_formacao(avaliadotbl.getHoras());
				model.setAvaliador(avaliadotbl.getFormador());
				model.setChave_de_validacao(avaliadotbl.getChaveAut());
				
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
