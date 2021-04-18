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
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.Formando;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.ImagensTbl;
import nosi.core.webapp.Report;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.ImagensTbl;
import nosi.core.webapp.UploadedFile;
/*----#end-code----*/

public class Criacao_de_certificadoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Criacao_de_certificado model = new Criacao_de_certificado();
		model.load();
		Criacao_de_certificadoView view = new Criacao_de_certificadoView();
		/*----#start-code(index)----*/

		try {
			Integer formando = Core.getParamInt("value_array");
			Formando avaliadotbl = new Formando().findOne(formando);
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				if(Core.isNotNull(Core.getLinkFileByUuid(avaliadotbl.getFormando().getIdFoto())))
					view.foto.setValue(Core.getLinkFileByUuid(avaliadotbl.getFormando().getIdFoto()));
				model.setNome(avaliadotbl.getFormando().getNome());
			
				model.setId_avaliado("" + avaliadotbl.getFormando().getIdAvaliado());
							
				model.setTexto_1("que completou com sucesso a formação de");
				model.setTitulo(avaliadotbl.getFormacao().getNome());
				model.setTexto_2("com duração de " + avaliadotbl.getFormacao().getHora()
						+ " horas e que se realizou de "
						+ Core.convertLocalDateToString(avaliadotbl.getFormacao().getDataIn(), "dd-MM-yyyy") + " a "
						+ Core.convertLocalDateToString(avaliadotbl.getFormacao().getDataFim(), "dd-MM-yyyy") + " em "
						+ avaliadotbl.getFormacao().getLocal() + ".");
				model.setCallback_url(
						"http://cloud.nosi.cv/IGRP/app/webapps?r=sistema_de_avaliacao_igrpweb/Validar_certificado/index&dad=sistema_de_avaliacao_igrpweb&target=_blank&isPublic=1&lang=pt_PT&p_contra_prova="
								+ avaliadotbl.getChaveAut());
			}
			
			model.setTexto_3("NOSI.CV/IGRPWEB");
			
			ImagensTbl imagenslogo = new ImagensTbl().findOne(1);
			if (imagenslogo != null && !imagenslogo.hasError()) {
				if(Core.isNotNull(Core.getLinkFileByUuid(imagenslogo.getIdFoto())))
					view.logo.setValue(Core.getLinkFileByUuid(imagenslogo.getIdFoto()));
			}
			ImagensTbl imagensfundo = new ImagensTbl().findOne(2);
			if (imagensfundo != null && !imagensfundo.hasError()) {
				if(Core.isNotNull(Core.getLinkFileByUuid(imagensfundo.getIdFoto())))
					view.fundo.setValue(Core.getLinkFileByUuid(imagensfundo.getIdFoto()));
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
