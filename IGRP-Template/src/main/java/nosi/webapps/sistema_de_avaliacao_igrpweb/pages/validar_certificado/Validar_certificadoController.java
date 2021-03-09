package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.validar_certificado;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Validar_certificadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Validar_certificado model = new Validar_certificado();
		model.load();
		Validar_certificadoView view = new Validar_certificadoView();
		/*----#start-code(index)----*/
		
		if(Core.isNotNull(model.getContra_prova())) {
			String contraprova= "IGRPWEB_"+model.getContra_prova();
			model.setIframe_1_src(Core.getLinkContraProva(contraprova).replace("http", "https"));
			
		}	
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionValidar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Validar_certificado model = new Validar_certificado();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Validar_certificado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(validar)----*/
		 return this.forward("sistema_de_avaliacao_igrpweb","Validar_certificado","index",this.queryString());
		
		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
