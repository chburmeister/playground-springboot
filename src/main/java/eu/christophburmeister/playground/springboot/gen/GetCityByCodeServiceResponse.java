//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.09.18 um 07:26:52 PM CEST 
//


package eu.christophburmeister.playground.springboot.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://christophburmeister.eu/playground/springboot/gen}City"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "city"
})
@XmlRootElement(name = "getCityByCodeServiceResponse")
public class GetCityByCodeServiceResponse {

    @XmlElement(required = true)
    protected City city;

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

}
