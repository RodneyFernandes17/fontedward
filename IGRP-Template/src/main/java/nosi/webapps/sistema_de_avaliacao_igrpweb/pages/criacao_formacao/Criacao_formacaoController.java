package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_formacao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.core.gui.components.IGRPSeparatorList.Pair; //block import
import java.util.List; //block import
import java.util.ArrayList; //block import
import java.util.Map; //block import
import java.util.HashMap; //block import
import java.util.stream.Collectors; //block import
import java.util.ArrayList; //block import
import java.util.Arrays; //block import
import java.util.List; //block import
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.pages.criacao_formacao.Criacao_formacao.Separatorlist_1; //block import
import org.hibernate.Session; //block import
import org.hibernate.Transaction; //block import
import java.util.List; //block import
import java.util.LinkedHashMap; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.EnunciadoTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormacaoTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormandoTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl; //block import
/*----#end-code----*/
		
public class Criacao_formacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Criacao_formacao model = new Criacao_formacao();
		model.load();
		 //model.setLink_upload_img(this.getConfig().getResolveUrl("igrp","file","save-image-txt&p_page_name="+Core.getCurrentPage()));
		Criacao_formacaoView view = new Criacao_formacaoView();
		view.formadores.loadDomain("avaliadores","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.instituicao.loadDomain("intituicoes","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT '' as procurar_avaliado,'Rem perspiciatis ut accusantium omnis' as nome_avaliado,'hidden-d0e9_e1b2' as id_avaliado "));
		view.teste_de_avaliacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {
			EnunciadoTbl enunciadotblfilter = new EnunciadoTbl().find();

			List<EnunciadoTbl> enunciadotblList = enunciadotblfilter.all();
			view.teste_de_avaliacao.setValue(Core.toMap(enunciadotblList, "id", "descricao", "-- Selecionar --"));

			String isEdit = Core.getParam("isEdit");
			if (Core.isNotNull(isEdit)) {
				FormacaoTbl formacaotbl = new FormacaoTbl().findOne(Core.getParamInt("p_id_formacao"));
				if (formacaotbl != null && !formacaotbl.hasError()) {
					model.setNome(formacaotbl.getNome());
					model.setFormadores(formacaotbl.getGformadores().split(";"));
					model.setHoras_de_formacao(formacaotbl.getHora());
					model.setData_inicio(Core.convertLocalDateToString(formacaotbl.getDataIn(), "dd-MM-yyyy"));
					model.setData_fim(Core.convertLocalDateToString(formacaotbl.getDataFim(), "dd-MM-yyyy"));
					model.setLocal(formacaotbl.getLocal());
					model.setTopicos(formacaotbl.getTopicos());
                 	model.setInstituicao(formacaotbl.getInstituicao());
					model.setId_formacao(formacaotbl.getId().toString());
					model.setTeste_de_avaliacao(formacaotbl.getEnunciadoId() != null?formacaotbl.getEnunciadoId().getId()+"":"");
					model.setCodigo_do_teste(formacaotbl.getCodigoEnun());

					view.btn_criar_formacao.addParameter("isEdit", "true");

					FormandoTbl formandofilter = new FormandoTbl().find();
					if (Core.isNotNullOrZero(Core.toInt(model.getId_formacao()))) {
						formandofilter.andWhere("formacaoId", "=", Core.toInt(model.getId_formacao()));
					}
					List<FormandoTbl> formandoList = formandofilter.all();
					if (Core.isNotNull(formandoList)) {
						List<Criacao_formacao.Separatorlist_1> separatorlistDocs = new ArrayList<>();
						formandoList.forEach(formando -> {
							Criacao_formacao.Separatorlist_1 row = new Criacao_formacao.Separatorlist_1();

							row.setProcurar_avaliado(new Pair(formando.getAvaliadoId().getNome().toString(),
									formando.getAvaliadoId().getNome().toString()));
							row.setNome_avaliado(new Pair(formando.getAvaliadoId().getNome().toString(),
									formando.getAvaliadoId().getNome().toString()));
							row.setId_avaliado(new Pair(formando.getAvaliadoId().getIdAvaliado().toString(),
									formando.getAvaliadoId().getIdAvaliado().toString()));
							row.setSeparatorlist_1_id(
									new Pair(formando.getId().toString(), formando.getId().toString()));
							separatorlistDocs.add(row);
						});
						model.setSeparatorlist_1(separatorlistDocs);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionCriar_formacao() throws IOException, IllegalArgumentException, IllegalAccessException{
		Criacao_formacao model = new Criacao_formacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_avaliacao_igrpweb","Criacao_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(criar_formacao)----*/
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try {
			if (model.validate()) {
				session = Core.getSession(Core.defaultConnection());
				transaction = session.getTransaction();
				if (!transaction.isActive())
					transaction.begin();
				FormacaoTbl formacaotbl = new FormacaoTbl();
				if (Core.isNotNull(isEdit)) {
					formacaotbl = session.find(FormacaoTbl.class, Core.toInt(model.getId_formacao()));
				}
				if (formacaotbl != null) {
					formacaotbl.setNome(model.getNome());
					formacaotbl.setHora(model.getHoras_de_formacao());
					formacaotbl.setDataIn(Core.convertStringToLocalDate(model.getData_inicio(), "dd-MM-yyyy"));
					formacaotbl.setDataFim(Core.convertStringToLocalDate(model.getData_fim(), "dd-MM-yyyy"));
                  	formacaotbl.setInstituicao(model.getInstituicao());
					formacaotbl.setLocal(model.getLocal());
					formacaotbl.setGformadores(
							model.getFormadores() != null ? String.join(";", model.getFormadores()) : null);
					formacaotbl.setTopicos(model.getTopicos());
					EnunciadoTbl enunciadotbl_foreign = session.find(EnunciadoTbl.class,
							Core.toInt(model.getTeste_de_avaliacao()));
					formacaotbl.setEnunciadoId(enunciadotbl_foreign);
					formacaotbl.setCodigoEnun(model.getCodigo_do_teste());
				}
				session.persist(formacaotbl);
				List<String> formandoeditList = new ArrayList<>();
				if (model.getP_separatorlist_1_edit() != null) {
					formandoeditList = new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
				}
				for (Criacao_formacao.Separatorlist_1 row : model.getSeparatorlist_1()) {
					FormandoTbl formando = new FormandoTbl();
					if (Core.isNotNullOrZero(row.getSeparatorlist_1_id().getKey())) {
						if (!formandoeditList.isEmpty()
								&& formandoeditList.remove(row.getSeparatorlist_1_id().getKey())) {
							formando = session.find(FormandoTbl.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));
						} else
							continue;
					}

					formando.setFormacaoId(formacaotbl);
					AvaliadoTbl avaliadotbl_foreign = session.find(AvaliadoTbl.class,
							Core.toInt(row.getId_avaliado().getKey()));
					String ano = Core.getCurrentYear().toString();
					String code_ano = String.valueOf(ano).substring(2);
					String chave_aut = code_ano.concat(avaliadotbl_foreign.getIdAvaliado().toString());
					formando.setChaveAut(chave_aut);
					formando.setAvaliadoId(avaliadotbl_foreign);
					session.persist(formando);
				}
				String[] formandodeletedIdsArray = model.getP_separatorlist_1_del();
				if (Core.isNotNull(formandodeletedIdsArray)) {
					for (String docId : formandodeletedIdsArray) {
						if (Core.isNotNull(docId) && !docId.isEmpty()) {
							FormandoTbl formando = session.find(FormandoTbl.class, Core.toInt(docId));
							session.delete(formando);
						}
					}
				}

				transaction.commit();
				Core.setMessageSuccess();
			} else
				Core.setMessageError();
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

		if (Core.isNotNull(isEdit)) {
			this.addQueryString("isEdit", "true");
			return this.forward("sistema_de_avaliacao_igrpweb", "Criacao_formacao", "index", this.queryString());
		}
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Criacao_formacao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
