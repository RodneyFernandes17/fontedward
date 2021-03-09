package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.certificado_imagens;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.ImagensTbl;
import nosi.core.webapp.UploadedFile;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.ImagensTbl;
import nosi.core.webapp.UploadedFile;

/*----#end-code----*/
		
public class Certificado_imagensController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Certificado_imagens model = new Certificado_imagens();
		model.load();
		Certificado_imagensView view = new Certificado_imagensView();
		/*----#start-code(index)----*/
		
		try {

			ImagensTbl imagenslogo = new ImagensTbl().findOne(1);
			if (imagenslogo != null && !imagenslogo.hasError()) {
				view.logo_view.setValue(Core.getLinkFileByUuid(imagenslogo.getIdFoto()));
			}
			ImagensTbl imagensfundo = new ImagensTbl().findOne(2);
			if (imagensfundo != null && !imagensfundo.hasError()) {
				view.fundo_view.setValue(Core.getLinkFileByUuid(imagensfundo.getIdFoto()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar_fundo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Certificado_imagens model = new Certificado_imagens();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Certificado_imagens","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar_fundo)----*/
		try {
			ImagensTbl imagenstbl = new ImagensTbl().findOne(2);
			if (Core.isNotNull(imagenstbl)) {
				imagenstbl.setIdFoto(model.getFundo() != null && model.getFundo().isUploaded()
						? imagenstbl.getIdFoto() == null ? Core.saveFileNGetUuid(model.getFundo())
								: Core.updateFile(model.getFundo(), imagenstbl.getIdFoto()) ? imagenstbl.getIdFoto()
										: imagenstbl.getIdFoto()
						: null);
				imagenstbl.setDescricao("fundo");
				imagenstbl.update();
				Core.setMessageSuccess();
			} else
				Core.setMessageError("Não foi possível fazer a edição.");
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Certificado_imagens","index", this.queryString());	
	}
	
	public Response actionSalvar_logo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Certificado_imagens model = new Certificado_imagens();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Certificado_imagens","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar_logo)----*/
		try {
			ImagensTbl imagenstbl = new ImagensTbl().findOne(1);
			if (Core.isNotNull(imagenstbl)) {
				imagenstbl.setIdFoto(model.getLogo() != null && model.getLogo().isUploaded()
						? imagenstbl.getIdFoto() == null ? Core.saveFileNGetUuid(model.getLogo())
								: Core.updateFile(model.getLogo(), imagenstbl.getIdFoto()) ? imagenstbl.getIdFoto()
										: imagenstbl.getIdFoto()
						: null);
				imagenstbl.setDescricao("logo");
				imagenstbl.update();
				Core.setMessageSuccess();
			} else
				Core.setMessageError("Não foi possível fazer a edição.");
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Certificado_imagens","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
