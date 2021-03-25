package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.classificacao_por_mentores;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.SemanalTbl;

/*----#end-code----*/
		
public class Classificacao_por_mentoresController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Classificacao_por_mentores model = new Classificacao_por_mentores();
		model.load();
		Classificacao_por_mentoresView view = new Classificacao_por_mentoresView();
		view.id_semanal.setParam(true);
		view.id_avaliado.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Adipiscing stract mollit strac' as avaliador,'Consectetur laudantium volupta' as conteudo,'Ipsum rem sit sit perspiciatis' as pontualidade,'Aperiam lorem sit ut ipsum' as dominio,'Deserunt laudantium sit totam' as clareza,'Unde natus aperiam stract iste' as proatividade,'Labore sed iste magna labore' as nivel,'Aliqua sit adipiscing voluptat' as tarefas,'hidden-4456_a100' as id_semanal,'hidden-3b2e_9150' as id_avaliado "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {
			Integer semana_avv = Core.getParamInt("p_semana");
			Integer id_avaliad = Core.getParamInt("p_id_avaliado");

			List<SemanalTbl> semanaList = new SemanalTbl().find().andWhere("idTemaFk.nrSemana", "=", semana_avv)
					.andWhere("idAvaliadoFk", "=", id_avaliad).all();
			List<Classificacao_por_mentores.Table_1> semanaltblTable = new ArrayList<>();
			for (SemanalTbl sem : semanaList) {
				Classificacao_por_mentores.Table_1 row = new Classificacao_por_mentores.Table_1();
				row.setAvaliador(sem.getNomeAvaliador() + "");
				row.setConteudo(sem.getConteudo() + "");
				row.setPontualidade(sem.getPontualidade() + "");
				row.setDominio(sem.getDominio() + "");
				row.setClareza(sem.getClareza() + "");
				row.setProatividade(sem.getProactividade() + "");
				row.setId_avaliado(sem.getIdAvaliadoFk().getIdAvaliado()+"");
				row.setNivel(sem.getNivel() + "");
				row.setTarefas(sem.getTarefas() + "");
				if(!Core.getCurrentUser().getId().equals(sem.getIdAvaliador()))
					row.hiddenButton(view.btn_editar);
              row.setId_semanal(""+sem.getIdSemanal());
              if(Core.isNull(sem.getObservacao()))
            	  row.hiddenButton(view.btn_observacoes);
              
				semanaltblTable.add(row);
			}
			model.setTable_1(semanaltblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Classificacao_por_mentores model = new Classificacao_por_mentores();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_semanal",Core.getParam("p_id_semanal"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_avaliacao_semanal","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
		 this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		this.addQueryString("p_id_semanal", Core.getParam("p_id_semanal"));
		this.addQueryString("isEdit", "true");
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Formulario_avaliacao_semanal","index", this.queryString());	
	}
	
	public Response actionObservacoes() throws IOException, IllegalArgumentException, IllegalAccessException{
		Classificacao_por_mentores model = new Classificacao_por_mentores();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_semanal",Core.getParam("p_id_semanal"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Ver_observacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(observacoes)----*/
		this.addQueryString("isVer", "true");
		this.addQueryString("p_id_semanal", Core.getParam("p_id_semanal"));
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Ver_observacao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
