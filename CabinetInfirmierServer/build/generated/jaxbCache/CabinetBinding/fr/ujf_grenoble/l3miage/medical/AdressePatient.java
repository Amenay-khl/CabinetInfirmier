//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.12.02 � 12:46:08 PM CET 
//


package fr.ujf_grenoble.l3miage.medical;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AdressePatient complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AdressePatient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="�tage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="num�ro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codePostal" type="{http://www.ujf-grenoble.fr/l3miage/medical}cPOST"/>
 *         &lt;element name="visite" type="{http://www.ujf-grenoble.fr/l3miage/medical}Visite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdressePatient", propOrder = {
    "\u00e9tage",
    "num\u00e9ro",
    "rue",
    "ville",
    "codePostal",
    "visites"
})
public class AdressePatient {

    protected Integer �tage;
    protected Integer num�ro;
    @XmlElement(required = true)
    protected String rue;
    @XmlElement(required = true)
    protected String ville;
    @XmlElement(required = true)
    protected String codePostal;
    @XmlElement(name = "visite")
    protected List<Visite> visites;

    /**
     * Obtient la valeur de la propri�t� �tage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer get�tage() {
        return �tage;
    }

    /**
     * D�finit la valeur de la propri�t� �tage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void set�tage(Integer value) {
        this.�tage = value;
    }

    /**
     * Obtient la valeur de la propri�t� num�ro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum�ro() {
        return num�ro;
    }

    /**
     * D�finit la valeur de la propri�t� num�ro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum�ro(Integer value) {
        this.num�ro = value;
    }

    /**
     * Obtient la valeur de la propri�t� rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * D�finit la valeur de la propri�t� rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propri�t� codePostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * D�finit la valeur de la propri�t� codePostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

    /**
     * Gets the value of the visites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Visite }
     * 
     * 
     */
    public List<Visite> getVisites() {
        if (visites == null) {
            visites = new ArrayList<Visite>();
        }
        return this.visites;
    }

}
