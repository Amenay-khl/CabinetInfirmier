
package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getStrLength complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getStrLength">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStrLength", propOrder = {
    "firstParam"
})
public class GetStrLength {

    protected String firstParam;

    /**
     * Obtient la valeur de la propriété firstParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstParam() {
        return firstParam;
    }

    /**
     * Définit la valeur de la propriété firstParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstParam(String value) {
        this.firstParam = value;
    }

}
