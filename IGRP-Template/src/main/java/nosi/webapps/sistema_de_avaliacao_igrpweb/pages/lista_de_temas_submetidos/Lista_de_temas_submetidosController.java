package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_temas_submetidos;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TemaTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;

/*----#end-code----*/

public class Lista_de_temas_submetidosController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException {
		Lista_de_temas_submetidos model = new Lista_de_temas_submetidos();
		model.load();
		Lista_de_temas_submetidosView view = new Lista_de_temas_submetidosView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Aperiam aliqua sit omnis amet' as nome,'Totam mollit stract laudantium' as tema_semanal,'01-02-2013' as data_de_envio "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			TemaTbl tematblfilter = new TemaTbl().find();
			List<TemaTbl> tematblList = tematblfilter.orderByAsc("idAvaliadoFk.nome").all();
			List<Lista_de_temas_submetidos.Table_1> tematblTable = new ArrayList<>();
			if (tematblList != null) {
				for (TemaTbl tematbl : tematblList) {
					Lista_de_temas_submetidos.Table_1 row = new Lista_de_temas_submetidos.Table_1();
					row.setNome(tematbl.getIdAvaliadoFk() != null ? tematbl.getIdAvaliadoFk().getNome() : null);
					row.setTema_semanal(tematbl.getTema());
					row.setData_de_envio(
							Core.convertLocalDateTimeToString(tematbl.getData(), "dd-MM-yyyy - HH:mm") + "");
					tematblTable.add(row);
				}
			}
			model.setTable_1(tematblTable);
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
