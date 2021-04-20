package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.formulario_de_inscricao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import java.time.LocalDate;

import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;

/*----#end-code----*/
		
public class Formulario_de_inscricaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Formulario_de_inscricao model = new Formulario_de_inscricao();
		model.load();
		Formulario_de_inscricaoView view = new Formulario_de_inscricaoView();
		view.ilha_natural.loadDomain("ilha","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.instituicao.loadDomain("intituicoes","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.edicao_de_nosiakademia.loadDomain("edicao","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.formacao.loadDomain("formacao","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.universidade.loadDomain("universidade","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/*----#start-code(index)----*/
	
		try {
			
			AvaliadoTbl avaliadotbl;
			String jaInscrito="NAO";

			if(Core.isNotNull(Core.getParam("p_id_avaliado"))) {
				avaliadotbl = new AvaliadoTbl().findOne(Core.getParamInt("p_id_avaliado"));
				jaInscrito="SIM";
			}
			else {
				avaliadotbl = new AvaliadoTbl().find().where("idUtilizador","=",Core.getCurrentUser().getId()).one();
				if(avaliadotbl!=null)
					jaInscrito="SIM";
			}
			
			if (avaliadotbl != null && !avaliadotbl.hasError()) {
				view.foto.setValue(Core.getLinkFileByUuid(avaliadotbl.getIdFoto()));
				model.setNome(avaliadotbl.getNome());
				model.setIlha_natural(avaliadotbl.getIlha());
				model.setEdicao_de_nosiakademia(avaliadotbl.getEdicao());
				model.setFormacao(avaliadotbl.getFormacao());
				model.setOutra_formacao(avaliadotbl.getOutraForm());
				model.setUniversidade(avaliadotbl.getUniversidade());
				model.setOutra_universidade(avaliadotbl.getOutraUniv());
				model.setContacto(avaliadotbl.getContacto());
				model.setEmail(avaliadotbl.getEmail());
				model.setInstituicao(avaliadotbl.getInstituicao());
				view.btn_salvar.addParameter("isEdit", "true");
			}
			
			if (jaInscrito.equals("SIM")) {
				view.nome.propertie().add("disabled", "true");
				view.foto.propertie().add("disabled", "true");
				view.ilha_natural.propertie().add("disabled", "true");
				view.edicao_de_nosiakademia.propertie().add("disabled", "true");
				view.formacao.propertie().add("disabled", "true");
				view.outra_formacao.propertie().add("disabled", "true");
				view.universidade.propertie().add("disabled", "true");
				view.outra_universidade.propertie().add("disabled", "true");
				view.contacto.propertie().add("disabled", "true");
				view.email.propertie().add("disabled", "true");
				view.instituicao.propertie().add("disabled", "true");
				view.btn_salvar.setVisible(false);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Formulario_de_inscricao model = new Formulario_de_inscricao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar)----*/
				Session session = null;
		Transaction transaction = null;
		try {
			if (Core.isNull(model.getFoto())) {
				Core.setMessageError("Foto Não Submetida!");
				 return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString());

			} else {
				if (model.validate()) {
					session = Core.getSession(Core.defaultConnection());
					transaction = session.getTransaction();
					if (!transaction.isActive())
						transaction.begin();
					AvaliadoTbl avaliadotbl = new AvaliadoTbl();
					avaliadotbl.setIdFoto(avaliadotbl.getIdFoto() == null ? model.getFoto_uuid() : avaliadotbl.getIdFoto());
					avaliadotbl.setNome(model.getNome());
					avaliadotbl.setIlha(model.getIlha_natural());
					avaliadotbl.setEdicao(model.getEdicao_de_nosiakademia());
					avaliadotbl.setFormacao(model.getFormacao());
					avaliadotbl.setOutraForm(model.getOutra_formacao());
					avaliadotbl.setUniversidade(model.getUniversidade());
					avaliadotbl.setOutraUniv(model.getOutra_universidade());
					avaliadotbl.setContacto(model.getContacto());
					avaliadotbl.setEmail(model.getEmail());
					avaliadotbl.setIdUtilizador(Core.getCurrentUser().getId());
					avaliadotbl.setInstituicao(model.getInstituicao());
					avaliadotbl.setDataRegistro(LocalDate.now());
					session.persist(avaliadotbl);
					
					transaction.commit();
					Core.setMessageSuccess();
					this.addQueryString("p_id_avaliado", avaliadotbl.getIdAvaliado());
				} else
					Core.setMessageError();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Core.setMessageError("Error: " + e.getMessage());
			if (transaction != null)
				transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
