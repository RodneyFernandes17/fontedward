package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.parametrizacao_perguntas_e_respostas;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.PerguntaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.RespostaTbl;
import java.util.LinkedHashMap;
import static nosi.core.i18n.Translator.gt;

/*----#end-code----*/
		
public class Parametrizacao_perguntas_e_respostasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_perguntas_e_respostas model = new Parametrizacao_perguntas_e_respostas();
		model.load();
		Parametrizacao_perguntas_e_respostasView view = new Parametrizacao_perguntas_e_respostasView();
		view.conceito.loadDomain("conceitos","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT 'Lorem doloremque sed omnis totam lorem sit deserunt stract voluptatem elit omnis totam anim amet' as resposta,'1' as resposta_certa "));
		view.nivel.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/

	    LinkedHashMap<String, String> nivel = new LinkedHashMap<>();
		nivel.put(null, gt("-- Selecionar --"));
		nivel.put("1",gt("Nivel 1"));
		nivel.put("2",gt("Nivel 2"));
		nivel.put("3",gt("Nivel 3"));
		nivel.put("4",gt("Nivel 4"));
		nivel.put("5",gt("Nivel 5"));
		view.nivel.setValue(nivel);
	      
	    try{
		String isEdit = Core.getParam("isEdit");
		if (Core.isNotNull(isEdit)) {
			PerguntaTbl perguntatbl = new PerguntaTbl().findOne(Core.getParamInt("p_id_pergunta"));
			if (perguntatbl!=null && !perguntatbl.hasError()) {
				model.setConceito(perguntatbl.getConceito());
				model.setPergunta(perguntatbl.getPergunta());
				model.setNivel(perguntatbl.getNivel()+"");
				model.setId_pergunta(""+perguntatbl.getIdPergunta());
		
	            try{
	            RespostaTbl respostatblfilter = new RespostaTbl().find();
	            if(Core.isNotNullOrZero(Core.toInt(model.getId_pergunta()))){
	                respostatblfilter.andWhere("idPerguntaFk","=",Core.toInt(model.getId_pergunta()));
	            }
	            List<RespostaTbl> respostatblList = respostatblfilter.all();
	            if ( Core.isNotNull(respostatblList) ) {
	                    List <Parametrizacao_perguntas_e_respostas.Separatorlist_1>  separatorlistDocs =new ArrayList<>();
	                    respostatblList.forEach(respostatbl-> {
	                        Parametrizacao_perguntas_e_respostas.Separatorlist_1 row = new Parametrizacao_perguntas_e_respostas.Separatorlist_1();

	                        row.setResposta( new Pair(respostatbl.getResposta(),respostatbl.getResposta()) );
	            			row.setResposta_certa( new Pair(respostatbl.getRespostaCerta(),respostatbl.getRespostaCerta()) );
	            			row.setSeparatorlist_1_id( new Pair(""+respostatbl.getIdResposta(),""+respostatbl.getIdResposta()) );
	                        separatorlistDocs.add(row);
	                    });
	                    model.setSeparatorlist_1( separatorlistDocs);
	                }
	            }catch ( Exception e ) {
	                e.printStackTrace();
	            }
		
			view.btn_salvar.addParameter("isEdit", "true");
			}
		}
		}catch ( Exception e ) {
			e.printStackTrace();
		}
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSalvar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Parametrizacao_perguntas_e_respostas model = new Parametrizacao_perguntas_e_respostas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(salvar)----*/
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try{
		if (model.validate()) {
			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
			if(!transaction.isActive())
				transaction.begin();
			PerguntaTbl perguntatbl  = new PerguntaTbl();
			if(Core.isNotNull(isEdit)) {
				 perguntatbl = session.find(PerguntaTbl.class, Core.getParamInt("p_id_pergunta"));
			}
			if (perguntatbl != null){
				perguntatbl.setPergunta(model.getPergunta());
				perguntatbl.setConceito(model.getConceito());
				perguntatbl.setNivel(Core.toInt(model.getNivel()));
			}
			session.persist(perguntatbl);
			List<String> respostatbleditList = new ArrayList<>();
			if(model.getP_separatorlist_1_edit() != null){
				respostatbleditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
			}
			for(Parametrizacao_perguntas_e_respostas.Separatorlist_1 row : model.getSeparatorlist_1()){
				RespostaTbl respostatbl = new RespostaTbl();
				if( Core.isNotNullOrZero(row.getSeparatorlist_1_id().getKey())){
					if(!respostatbleditList.isEmpty() && respostatbleditList.remove(row.getSeparatorlist_1_id().getKey())){
						respostatbl = session.find(RespostaTbl.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));
					}
					else
						continue;
				}
					
				respostatbl.setResposta(row.getResposta().getKey());
				respostatbl.setRespostaCerta(""+row.getResposta_certa().getKey());
				respostatbl.setIdPerguntaFk(perguntatbl);
				session.persist(respostatbl);
			}
		String [] respostatbldeletedIdsArray = model.getP_separatorlist_1_del();
		if ( Core.isNotNull(respostatbldeletedIdsArray ) ) {
		for ( String docId : respostatbldeletedIdsArray ) {
			if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
				RespostaTbl respostatbl = session.find(RespostaTbl.class, Core.toInt(docId));
				session.delete(respostatbl);
				}
			}
		}
		
			transaction.commit();
			Core.setMessageSuccess();
		}
		else
			Core.setMessageError();
		}catch ( Exception e ) {
			e.printStackTrace();
			Core.setMessageError("Error: "+ e.getMessage());
			if (transaction != null)
				transaction.rollback();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		if(Core.isNotNull(isEdit)) {
			this.addQueryString("isEdit", "true");
			return this.forward("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index",this.queryString());
		}
		
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Parametrizacao_perguntas_e_respostas","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
