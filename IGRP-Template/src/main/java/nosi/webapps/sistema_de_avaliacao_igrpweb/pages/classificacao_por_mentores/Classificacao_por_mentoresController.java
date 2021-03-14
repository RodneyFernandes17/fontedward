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
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Omnis perspiciatis accusantium' as avaliador,'Unde accusantium sit magna per' as conteudo,'Doloremque accusantium omnis s' as pontualidade,'Labore magna laudantium ut vol' as dominio,'Elit adipiscing consectetur un' as clareza,'Ut unde officia rem accusantiu' as proatividade,'Dolor stract unde magna accusa' as nivel,'Laudantium sit ut omnis stract' as tarefas "));
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
				row.setNivel(sem.getNivel() + "");
				row.setTarefas(sem.getTarefas() + "");
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
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
