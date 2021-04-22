<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : infirmiere.xsl
    Created on : 12 octobre 2020, 18:42
    Author     : Yanis
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns= "http://www.ujf-grenoble.fr/l3miage/medical"
                xmlns:act = "http://www.ujf-grenoble.fr/l3miage/actes">
    
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->	
    <xsl:param name="destinedId"/>   
    <xsl:variable name="actes" select="document('actes.xml', /)/act:ngap"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <title>infirmiere.xsl</title>
                <!--W3-->    
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <!--W3-->    
                <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"/>

                <script type="text/javascript">
                    function openFacture(prenom, nom, actes) {
                    var width  = 500;
                    var height = 300;
                    if(window.innerWidth) {
                    var left = (window.innerWidth-width)/2;
                    var top = (window.innerHeight-height)/2;
                    }
                    else {
                    var left = (document.body.clientWidth-width)/2;
                    var top = (document.body.clientHeight-height)/2;
                    }
                    var factureWindow = window.open('','facture','menubar=yes, scrollbars=yes, top='+top+', left='+left+', width='+width+', height='+height+'');
                    factureText = "Facture pour : " + prenom + " " + nom;
                    factureWindow.document.write(factureText);
                    }        
                </script>
                
                <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Miriam Libre"/>
                <style>
                    .w3-mir {
                    font-family: "Lobster", serif;
                    text-align: center;
                    }
                </style>
            </head>
            <body class="w3-container w3-auto">
                
<div class="w3-container w3-mir">
 <p class="w3-xxxlarge">Liste des patients</p>
</div>
                
                <div class="w3-panel w3-pale-blue w3-border">
                    <h3>Bonjour <xsl:value-of select='/cabinet/infirmiers/infirmier[@id=$destinedId]/nom'/>,</h3>
                    <p>Aujourd'hui, vous avez 
                        <xsl:value-of select='count(/cabinet/patients/patient/visite[@intervenant=$destinedId])'/>
                        patients.</p>
                </div>
                <br/>
                <br/>
                <br/>
                <div class="w3-container">
                    <ul class="w3-ul w3-card-4">
                        <xsl:apply-templates select="/cabinet/patients/patient/visite[@intervenant=$destinedId]">
                            <xsl:sort select="./@date" order="ascending"/>
                        </xsl:apply-templates>
                
                    </ul>
                </div>
                <br/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match = "visite" >
        
        
        
        <xsl:variable name="etage" select="../adresse/étage"/>
        <xsl:variable name="numero" select="../adresse/numéro"/>
        
        <li class="w3-bar">
            
            <span class="w3-bar-item w3-button w3-white w3-xlarge w3-right">
                <input name="button_fact"   Type="button"   value="Facture" >
                    <xsl:attribute name="onclick">
                        openFacture('<xsl:value-of select="../nom"/>','<xsl:value-of select="../prénom"/>','<xsl:value-of select="./acte"/>')
                    </xsl:attribute>     
                </input>
            </span>
            <img src="img_avatar6.png" class="w3-bar-item w3-circle w3-hide-small" style="width:101px"/>
            <br></br>
            <br></br>
            <br></br>
            <br></br>
            <div class="w3-bar-item">
                <span class="w3-large">
                    <b>
                        <xsl:value-of select ="../nom"/>
                    </b> à visiter le <b>
                        <xsl:value-of select ="./@date"/>
                    </b>
                </span>
                <br/>
                <span>
                     Adresse :
                    <xsl:if test="$numero">
                       n°<xsl:value-of select ="../adresse/numéro"/>
                        <xsl:text> </xsl:text> 
                    </xsl:if>
                    <xsl:value-of select ="../adresse/rue"/>,<xsl:text> </xsl:text> 
                    <xsl:if test="$etage">
                        étage : <xsl:value-of select ="../adresse/étage"/> - 
                        <xsl:text> </xsl:text> 
                    </xsl:if>
                    <xsl:value-of select ="../adresse/codePostal"/> 
                    <xsl:text> </xsl:text> 
                    <xsl:value-of select ="../adresse/ville"/>
                    <br/>
                    Soins à effectuer :
                    <xsl:apply-templates select="./acte"/>
                </span>
            </div>
        </li>
    </xsl:template>
    
    <xsl:template match = "acte" >
        <br/>
        <xsl:variable name="id_acte" select="./@id"/>
        Acte : <xsl:value-of select ="./@id"/> - Libellé : <xsl:value-of select="$actes/act:actes/act:acte[@id=$id_acte]"/>
    </xsl:template>
    
</xsl:stylesheet>
