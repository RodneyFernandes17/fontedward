package nosi.webapps.sistema_de_avaliacao_igrpweb.pages.lista_de_classificacao;

import nosi.core.webapp.Controller;//
import nosi.core.webapp.databse.helpers.ResultSet;//
import nosi.core.webapp.databse.helpers.QueryInterface;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
import java.util.ArrayList; //block import
import java.util.List; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl; //block import
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl; //block import
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.AvaliadoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.FormandoTbl;
import nosi.webapps.sistema_de_avaliacao_igrpweb.dao.TesteTbl;
import nosi.core.webapp.Report;
/*----#end-code----*/
		
public class Lista_de_classificacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_classificacao model = new Lista_de_classificacao();
		model.load();
		Lista_de_classificacaoView view = new Lista_de_classificacaoView();
		view.id_teste.setParam(true);
		view.id_avaliado.setParam(true);
		view.instituicao_flt.loadDomain("intituicoes","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		view.edicao_flt.loadDomain("edicao","sistema_de_avaliacao_igrpweb","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '1' as aprovacao,'../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as foto,'Sed adipiscing magna accusanti' as nome,'Totam lorem anim rem voluptate' as formacao,'Sed anim sit stract accusantiu' as instituicao,'Laudantium mollit dolor ut sed' as edicao,'05-02-2017' as data_de_realizacao,'Doloremque natus deserunt amet' as classificacao,'hidden-2279_7d99' as id_teste,'hidden-1f9a_7172' as id_avaliado "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try {

			TesteTbl testetblfilter = new TesteTbl().find();
			if(Core.isNotNullOrZero(model.getInstituicao_flt())){
				testetblfilter.andWhere("idAvaliadoFk.instituicao","=",model.getInstituicao_flt());
			}
			if(Core.isNotNullOrZero(Core.toInt(model.getEdicao_flt()))){
				testetblfilter.andWhere("idAvaliadoFk.edicao","=",model.getEdicao_flt());
			}
	List<TesteTbl> testetblList = testetblfilter.orderByDesc("valorFinal").all();
	List<Lista_de_classificacao.Table_1> testetblTable = new ArrayList<>();
			if (testetblList != null) {
				for (TesteTbl testetbl : testetblList) {
					Lista_de_classificacao.Table_1 row = new Lista_de_classificacao.Table_1();
					row.setId_avaliado(
							testetbl.getIdAvaliadoFk() != null ? "" + testetbl.getIdAvaliadoFk().getIdAvaliado()
									: null);
					row.setFoto(testetbl.getIdAvaliadoFk() != null
							? Core.getLinkFileByUuid(testetbl.getIdAvaliadoFk().getIdFoto())
							: null);
					row.setNome(testetbl.getIdAvaliadoFk() != null ? testetbl.getIdAvaliadoFk().getNome() : null);
					row.setFormacao(Core.findDomainDescByKey("formacao", testetbl.getIdAvaliadoFk().getFormacao()));
					row.setClassificacao(testetbl.getValorFinal() + " Pontos");
                    row.setInstituicao(Core.findDomainDescByKey("intituicoes", testetbl.getIdAvaliadoFk().getInstituicao()) );
					row.setId_teste("" + testetbl.getIdTeste());
					row.setAprovacao(testetbl.getAprovacao() + "");
					row.setData_de_realizacao(Core.convertLocalDateTimeToString(testetbl.getDataRealizacao(), "dd-MM-yyyy - HH:mm"));
					row.setEdicao(Core.findDomainDescByKey("edicao",
							testetbl.getIdAvaliadoFk() != null ? testetbl.getIdAvaliadoFk().getEdicao() : null));
					testetblTable.add(row);
				}
			}
			model.setTable_1(testetblTable);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionFiltrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_classificacao model = new Lista_de_classificacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Lista_de_classificacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(filtrar)----*/
		return this.forward("sistema_de_avaliacao_igrpweb","Lista_de_classificacao","index",this.queryString()); 
		
		/*----#end-code----*/
			
	}
	
	public Response actionVer() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_classificacao model = new Lista_de_classificacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(ver)----*/
		this.addQueryString("p_id_avaliado", Core.getParam("p_id_avaliado"));
		/*----#end-code----*/
		return this.redirect("sistema_de_avaliacao_igrpweb","Formulario_de_inscricao","index", this.queryString());	
	}
	
	public Response actionEmitir_certificado() throws IOException, IllegalArgumentException, IllegalAccessException{
		Lista_de_classificacao model = new Lista_de_classificacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_teste",Core.getParam("p_id_teste"));
		  this.addQueryString("p_id_avaliado",Core.getParam("p_id_avaliado"));
		  return this.forward("sistema_de_avaliacao_igrpweb","Criacao_de_certificado","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(emitir_certificado)----*/

		TesteTbl teste = new TesteTbl().findOne(Core.getParamInt("p_id_teste"));

		Core.setMessageSuccess("avaliado " + teste.getIdAvaliadoFk().getIdAvaliado());
		Core.setMessageSuccess("formacao " + teste.getFormacaoId().getId());
		
		FormandoTbl contraprov = new FormandoTbl().where("formandoId", "=", teste.getIdAvaliadoFk().getIdAvaliado())
				.andWhere("formacaoId", "=", teste.getFormacaoId().getId()).one();

		String contraprova = "";
		Integer formando = 0;
		if (contraprov != null) {
			Core.setMessageSuccess("" + contraprov.getChaveAut());
			contraprova = contraprov.getChaveAut();
			formando = contraprov.getId();
		} else
			Core.setMessageError("Não foi encontrado o formando!");

		return Core.getLinkReport("certificado_igrpweb",
				new Report().addParam("value_array", formando).setContraProva("IGRPWEB_" + contraprova));

		/*----#end-code----*/
			
	}
	
		
		
/*----#start-code(custom_actions)----*/

	/*----#end-code----*/
}
