<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/highcharts/igrp.charts.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-d13dd134"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/form_2"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_2"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_2/fields"/><xsl:if test="rows/content/form_2/fields/areas_ou_projetos"><div class="col-sm-12 form-group  gen-fields-holder" item-name="areas_ou_projetos" item-type="select"><label for="{rows/content/form_2/fields/areas_ou_projetos/@name}"><xsl:value-of select="rows/content/form_2/fields/areas_ou_projetos/label"/></label><select class="form-control select2 " id="form_2_areas_ou_projetos" name="{rows/content/form_2/fields/areas_ou_projetos/@name}" multiple="multiple"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_2/fields/areas_ou_projetos"/></xsl:call-template><xsl:for-each select="rows/content/form_2/fields/areas_ou_projetos/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_2/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/chart_1"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_1"/><xsl:with-param name="chart_type" select="rows/content/chart_1/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Nº de Estagiários por Áreas ou Projetos'"/><xsl:with-param name="url" select="rows/content/chart_1/url"/><xsl:with-param name="filter" select="'true'"/><xsl:with-param name="filter_type" select="''"/></xsl:call-template></div></div></xsl:if><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/mentores"><div class="col-sm-12 form-group  gen-fields-holder" item-name="mentores" item-type="select"><label for="{rows/content/form_1/fields/mentores/@name}"><xsl:value-of select="rows/content/form_1/fields/mentores/label"/></label><select class="form-control select2 " id="form_1_mentores" name="{rows/content/form_1/fields/mentores/@name}" multiple="multiple"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/mentores"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/mentores/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/chart_2"><div class="box gen-container-item " gen-structure="graphic" gen-class="" item-name="chart_2"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/chart_2/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><xsl:call-template name="igrp-graph"><xsl:with-param name="table" select="rows/content/chart_2"/><xsl:with-param name="chart_type" select="rows/content/chart_2/chart_type"/><xsl:with-param name="height" select="'250'"/><xsl:with-param name="title" select="'Nº de Estagiários por Mentores'"/><xsl:with-param name="url" select="rows/content/chart_2/url"/><xsl:with-param name="filter" select="'true'"/><xsl:with-param name="filter_type" select="''"/></xsl:call-template></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-more.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/exporting.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/funnel.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/heatmap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/treemap.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/highcharts-3d.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/highcharts/igrp.charts.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=24"/><xsl:include href="../../../xsl/tmpl/IGRP-charts.tmpl.xsl?v=24"/></xsl:stylesheet>