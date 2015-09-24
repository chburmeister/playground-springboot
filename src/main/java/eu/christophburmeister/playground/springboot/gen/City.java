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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für City complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="City">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="founded" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "City", propOrder = {
    "code",
    "name",
    "population",
    "founded"
})
public class City {

    protected int code;
    @XmlElement(required = true)
    protected String name;
    protected int population;
    protected int founded;

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der population-Eigenschaft ab.
     * 
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Legt den Wert der population-Eigenschaft fest.
     * 
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Ruft den Wert der founded-Eigenschaft ab.
     * 
     */
    public int getFounded() {
        return founded;
    }

    /**
     * Legt den Wert der founded-Eigenschaft fest.
     * 
     */
    public void setFounded(int value) {
        this.founded = value;
    }

}
