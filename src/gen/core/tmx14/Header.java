//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.20 at 05:04:41 PM JST 
//


package gen.core.tmx14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}note"/>
 *         &lt;element ref="{}prop"/>
 *         &lt;element ref="{}ude"/>
 *       &lt;/choice>
 *       &lt;attribute name="creationtool" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="creationtoolversion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="segtype" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="block"/>
 *             &lt;enumeration value="sentence"/>
 *             &lt;enumeration value="phrase"/>
 *             &lt;enumeration value="paragraph"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="o-tmf" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="adminlang" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="srclang" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="datatype" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="o-encoding" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="creationdate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="creationid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="changedate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="changeid" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "noteOrPropOrUde"
})
@XmlRootElement(name = "header")
public class Header {

    @XmlElements({
        @XmlElement(name = "ude", type = Ude.class),
        @XmlElement(name = "prop", type = Prop.class),
        @XmlElement(name = "note", type = Note.class)
    })
    protected List<Object> noteOrPropOrUde;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String creationtool;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String creationtoolversion;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String segtype;
    @XmlAttribute(name = "o-tmf", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String oTmf;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String adminlang;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String srclang;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String datatype;
    @XmlAttribute(name = "o-encoding")
    @XmlSchemaType(name = "anySimpleType")
    protected String oEncoding;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String creationdate;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String creationid;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String changedate;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String changeid;

    /**
     * Gets the value of the noteOrPropOrUde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteOrPropOrUde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteOrPropOrUde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ude }
     * {@link Prop }
     * {@link Note }
     * 
     * 
     */
    public List<Object> getNoteOrPropOrUde() {
        if (noteOrPropOrUde == null) {
            noteOrPropOrUde = new ArrayList<Object>();
        }
        return this.noteOrPropOrUde;
    }

    /**
     * Gets the value of the creationtool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationtool() {
        return creationtool;
    }

    /**
     * Sets the value of the creationtool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationtool(String value) {
        this.creationtool = value;
    }

    /**
     * Gets the value of the creationtoolversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationtoolversion() {
        return creationtoolversion;
    }

    /**
     * Sets the value of the creationtoolversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationtoolversion(String value) {
        this.creationtoolversion = value;
    }

    /**
     * Gets the value of the segtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegtype() {
        return segtype;
    }

    /**
     * Sets the value of the segtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegtype(String value) {
        this.segtype = value;
    }

    /**
     * Gets the value of the oTmf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTmf() {
        return oTmf;
    }

    /**
     * Sets the value of the oTmf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTmf(String value) {
        this.oTmf = value;
    }

    /**
     * Gets the value of the adminlang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminlang() {
        return adminlang;
    }

    /**
     * Sets the value of the adminlang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminlang(String value) {
        this.adminlang = value;
    }

    /**
     * Gets the value of the srclang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrclang() {
        return srclang;
    }

    /**
     * Sets the value of the srclang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrclang(String value) {
        this.srclang = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the oEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEncoding() {
        return oEncoding;
    }

    /**
     * Sets the value of the oEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEncoding(String value) {
        this.oEncoding = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationdate() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationdate(String value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the creationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationid() {
        return creationid;
    }

    /**
     * Sets the value of the creationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationid(String value) {
        this.creationid = value;
    }

    /**
     * Gets the value of the changedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedate() {
        return changedate;
    }

    /**
     * Sets the value of the changedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedate(String value) {
        this.changedate = value;
    }

    /**
     * Gets the value of the changeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeid() {
        return changeid;
    }

    /**
     * Sets the value of the changeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeid(String value) {
        this.changeid = value;
    }

}
