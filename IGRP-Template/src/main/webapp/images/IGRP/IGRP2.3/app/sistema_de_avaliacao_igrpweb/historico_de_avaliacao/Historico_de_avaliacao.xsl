<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/view/igrp.view.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/table-colors.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/highcharts/igrp.charts.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/colorpicker/css/bootstrap-colorpicker.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/IGRP.daterangepicker.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-834cd62f"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/view_1"><div class="box clearfix view-block gen-container-item " has-img="true" template="default" item-separator-border="true" gen-class="" item-name="view_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/view_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/view_1/fields"/><xsl:if test="rows/content/view_1/fields/view_1_img"><img src="{rows/content/view_1/fields/view_1_img/value}"/></xsl:if><div class="view-body clearfix "><xsl:if test="rows/content/view_1/fields/nome"><div class="view-item text-{rows/content/view_1/fields/nome/@class} gen-fields-holder" item-name="nome"><xsl:if test="rows/content/view_1/fields/nome/@img != ''"><i class="fa {rows/content/view_1/fields/nome/@img} view-img"><xsl:if test="rows/content/view_1/fields/nome/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/nome/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/nome/@showlabel != 'false' or not(rows/content/view_1/fields/nome/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/nome/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/nome/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/area"><div class="view-item text-{rows/content/view_1/fields/area/@class} gen-fields-holder" item-name="area"><xsl:if test="rows/content/view_1/fields/area/@img != ''"><i class="fa {rows/content/view_1/fields/area/@img} view-img"><xsl:if test="rows/content/view_1/fields/area/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/area/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/area/@showlabel != 'false' or not(rows/content/view_1/fields/area/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/area/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/area/value"/></span></div></xsl:if><xsl:if test="rows/content/view_1/fields/mentor"><div class="view-item text-{rows/content/view_1/fields/mentor/@class} gen-fields-holder" item-name="mentor"><xsl:if test="rows/content/view_1/fields/mentor/@img != ''"><i class="fa {rows/content/view_1/fields/mentor/@img} view-img"><xsl:if test="rows/content/view_1/fields/mentor/@showlabel = 'false'"><xsl:attribute name="title"><xsl:value-of select="rows/content/view_1/fields/mentor/label"/></xsl:attribute></xsl:if></i></xsl:if><xsl:if test="rows/content/view_1/fields/mentor/@showlabel != 'false' or not(rows/content/view_1/fields/mentor/@showlabel)"><span class="view-label"><xsl:value-of select="rows/content/view_1/fields/mentor/label"/></span></xsl:if><span class="view-value"><xsl:value-of select="rows/content/view_1/fields/mentor/value"/></span></div></xsl:if></div></div></div></xsl:if><xsl:if test="rows/content/table_1"><div class="box box-table-contents gen-container-item " gen-class="" item-name="table_1"><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"><xsl:apply-templates mode="table-legend" select="rows/content/table_1/table/legend_color"/></div></div><div class="table-box"><div class="table-box-inner"><table id="table_1" class="table table-striped  igrp-data-table IGRP_contextmenu " exports=""><thead><tr><xsl:if test="rows/content/table_1/fields/media_tbl"><th td-name="media_tbl" align="left" class="color-th gen-fields-holder" group-in=""><xsl:value-of select="rows/content/table_1/fields/media_tbl/label"/></th></xsl:if><xsl:if test="rows/content/table_1/fields/semana"><th td-name="semana" align="center" show-label="true" class="number  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/semana/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/data"><th td-name="data" align="center" show-label="true" class="date  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/data/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/tema"><th td-name="tema" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/tema/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/media_semanal"><th td-name="media_semanal" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/media_semanal/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/conteudo"><th td-name="conteudo" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/conteudo/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/pontualidade"><th td-name="pontualidade" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/pontualidade/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/dominio"><th td-name="dominio" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/dominio/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/clareza"><th td-name="clareza" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/clareza/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/proatividade"><th td-name="proatividade" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/proatividade/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/nivel"><th td-name="nivel" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/nivel/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/tarefas"><th td-name="tarefas" align="center" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/tarefas/label"/></span></th></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/table_1/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><input type="hidden" name="p_id_avaliado_fk" value="{id_avaliado}"/><input type="hidden" name="p_id_avaliado_fk_desc" value="{id_avaliado_desc}"/><xsl:if test="media_tbl"><td align="" data-row="{position()}" data-title="{../../label/media_tbl}" class="color" item-name="media_tbl" data-sort="{media_tbl}"><xsl:call-template name="tdcolor"><xsl:with-param name="color" select="media_tbl"/></xsl:call-template></td></xsl:if><xsl:if test="semana"><td align="center" data-order="{semana}" data-row="{position()}" data-title="{../../../fields/semana/label}" class="number" item-name="semana"><span class=""><xsl:value-of select="semana"/></span></td></xsl:if><xsl:if test="data"><td align="center" data-order="{data}" data-row="{position()}" data-title="{../../../fields/data/label}" class="date" item-name="data"><span class=""><xsl:value-of select="data"/></span></td></xsl:if><xsl:if test="tema"><td align="center" data-order="{tema}" data-row="{position()}" data-title="{../../../fields/tema/label}" class="text" item-name="tema"><span class=""><xsl:value-of select="tema"/></span></td></xsl:if><xsl:if test="media_semanal"><td align="center" data-order="{media_semanal}" data-row="{position()}" data-title="{../../../fields/media_semanal/label}" class="text" item-name="media_semanal"><span class=""><xsl:value-of select="media_semanal"/></span></td></xsl:if><xsl:if test="conteudo"><td align="center" data-order="{conteudo}" data-row="{position()}" data-title="{../../../fields/conteudo/label}" class="text" item-name="conteudo"><span class=""><xsl:value-of select="conteudo"/></span></td></xsl:if><xsl:if test="pontualidade"><td align="center" data-order="{pontualidade}" data-row="{position()}" data-title="{../../../fields/pontualidade/label}" class="text" item-name="pontualidade"><span class=""><xsl:value-of select="pontualidade"/></span></td></xsl:if><xsl:if test="dominio"><td align="center" data-order="{dominio}" data-row="{position()}" data-title="{../../../fields/dominio/label}" class="text" item-name="dominio"><span class=""><xsl:value-of select="dominio"/></span></td></xsl:if><xsl:if test="clareza"><td align="center" data-order="{clareza}" data-row="{position()}" data-title="{../../../fields/clareza/label}" class="text" item-name="clareza"><span class=""><xsl:value-of select="clareza"/></span></td></xsl:if><xsl:if test="proatividade"><td align="center" data-order="{proatividade}" data-row="{position()}" data-title="{../../../fields/proatividade/label}" class="text" item-name="proatividade"><span class=""><xsl:value-of select="proatividade"/></span></td></xsl:if><xsl:if test="nivel"><td align="center" data-order="{nivel}" data-row="{position()}" data-title="{../../../fields/nivel/label}" class="text" item-name="nivel"><span class=""><xsl:value-of select="nivel"/></span></td></xsl:if><xsl:if test="tarefas"><td align="center" data-order="{tarefas}" data-row="{position()}" data-title="{../../../fields/tarefas/label}" class="text" item-name="tarefas"><span class=""><xsl:value-of select="tarefas"/></span></td></xsl:if></tr></xsl:for-each></tbody></table><xsl:apply-templates select="rows/content/table_1/table/context-menu" mode="table-context-menu"><xsl:with-param name="view" select="'lavel-menu'"/></xsl:apply-templates></div></div></div></div></xsl:if><xsl:if test="rows/content/chart_1"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_1"/><xsl:with-param name="chart_type" select="rows/content/chart_1/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Gráfico de Evolução Semanal'"/><xsl:with-param name="url" select="rows/content/chart_1/url"/><xsl:with-param name="filter" select="'true'"/><xsl:with-param name="filter_type" select="''"/></xsl:call-template></div></div></xsl:if><xsl:if test="rows/content/paragraph_1"><div class=" igrp-paragraph gen-container-item " gen-class="" item-name="paragraph_1"><div class="box-body disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/paragraph_1/fields/paragraph_1_text/value"/></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/bootstrap-contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-more.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/exporting.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/funnel.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/heatmap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/treemap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-3d.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/igrp.charts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/colorpicker/js/bootstrap-colorpicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/colorpicker/colorpicker.init.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/daterangepicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/IGRP.daterangepicker.config.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/locale/dp.locale.pt.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=18"/><xsl:include href="../../../xsl/tmpl/IGRP-charts.tmpl.xsl?v=18"/></xsl:stylesheet>