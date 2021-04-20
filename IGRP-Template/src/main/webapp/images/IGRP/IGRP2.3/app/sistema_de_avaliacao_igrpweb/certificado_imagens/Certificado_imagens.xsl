<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-5fc90c89"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/form_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/fundo"><div class="form-group col-sm-3  gen-fields-holder" item-name="fundo" item-type="file"><label for="{rows/content/form_1/fields/fundo/@name}"><span><xsl:value-of select="rows/content/form_1/fields/fundo/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""><xsl:if test="rows/content/form_1/fields/fundo/@temp-value"><xsl:attribute name="value"><xsl:value-of select="rows/content/form_1/fields/fundo/@temp-value"/></xsl:attribute></xsl:if></input><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_1/fields/fundo/@name}" name="{rows/content/form_1/fields/fundo/@name}" value="{rows/content/form_1/fields/fundo/value}" target-rend="" class="transparent " type="file" accept=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/fundo"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/form_2"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_2"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/form_2/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_2/fields"/><xsl:if test="rows/content/form_2/fields/logo"><div class="form-group col-sm-3  gen-fields-holder" item-name="logo" item-type="file"><label for="{rows/content/form_2/fields/logo/@name}"><span><xsl:value-of select="rows/content/form_2/fields/logo/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""><xsl:if test="rows/content/form_2/fields/logo/@temp-value"><xsl:attribute name="value"><xsl:value-of select="rows/content/form_2/fields/logo/@temp-value"/></xsl:attribute></xsl:if></input><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/form_2/fields/logo/@name}" name="{rows/content/form_2/fields/logo/@name}" value="{rows/content/form_2/fields/logo/value}" target-rend="" class="transparent " type="file" accept=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_2/fields/logo"/></xsl:call-template></input></span></span></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_2/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/form_3"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_3"><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_3/fields"/><xsl:if test="rows/content/form_3/fields/fundo_view"><div class="col-sm-3  holder- gen-fields-holder" item-name="fundo_view"><div class="row" style="margin-left:0px;margin-right: 0px;"><img src="{rows/content/form_3/fields/fundo_view/value}" data-label="{rows/content/form_3/fields/fundo_view/label}" name="fundo_view" id="id-fundo_view" width="" height="" class="  "/></div></div></xsl:if><xsl:if test="rows/content/form_3/fields/logo_view"><div class="col-sm-3  holder- gen-fields-holder" item-name="logo_view"><div class="row" style="margin-left:0px;margin-right: 0px;"><img src="{rows/content/form_3/fields/logo_view/value}" data-label="{rows/content/form_3/fields/logo_view/label}" name="logo_view" id="id-logo_view" width="" height="" class="  "/></div></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_3/tools-bar" mode="form-buttons"/></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=2"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=2"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=2"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=2"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=2"/></xsl:stylesheet>