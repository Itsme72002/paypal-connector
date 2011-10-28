
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetAccessPermissionsRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAccessPermissionsRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CancelURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogoutURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InitFlowType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkipLoginPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiredAccessPermissions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OptionalAccessPermissions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpp-header-image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpp-header-border-color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpp-header-back-color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpp-payflow-color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAccessPermissionsRequestDetailsType", propOrder = {
    "returnURL",
    "cancelURL",
    "logoutURL",
    "initFlowType",
    "skipLoginPage",
    "requiredAccessPermissions",
    "optionalAccessPermissions",
    "localeCode",
    "pageStyle",
    "cppHeaderImage",
    "cppHeaderBorderColor",
    "cppHeaderBackColor",
    "cppPayflowColor",
    "firstName",
    "lastName",
    "address"
})
public class SetAccessPermissionsRequestDetailsType {

    @XmlElement(name = "ReturnURL", required = true)
    protected String returnURL;
    @XmlElement(name = "CancelURL", required = true)
    protected String cancelURL;
    @XmlElement(name = "LogoutURL", required = true)
    protected String logoutURL;
    @XmlElement(name = "InitFlowType")
    protected String initFlowType;
    @XmlElement(name = "SkipLoginPage")
    protected String skipLoginPage;
    @XmlElement(name = "RequiredAccessPermissions")
    protected List<String> requiredAccessPermissions;
    @XmlElement(name = "OptionalAccessPermissions")
    protected List<String> optionalAccessPermissions;
    @XmlElement(name = "LocaleCode")
    protected String localeCode;
    @XmlElement(name = "PageStyle")
    protected String pageStyle;
    @XmlElement(name = "cpp-header-image")
    protected String cppHeaderImage;
    @XmlElement(name = "cpp-header-border-color")
    protected String cppHeaderBorderColor;
    @XmlElement(name = "cpp-header-back-color")
    protected String cppHeaderBackColor;
    @XmlElement(name = "cpp-payflow-color")
    protected String cppPayflowColor;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Address")
    protected AddressType address;

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the cancelURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelURL() {
        return cancelURL;
    }

    /**
     * Sets the value of the cancelURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelURL(String value) {
        this.cancelURL = value;
    }

    /**
     * Gets the value of the logoutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutURL() {
        return logoutURL;
    }

    /**
     * Sets the value of the logoutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutURL(String value) {
        this.logoutURL = value;
    }

    /**
     * Gets the value of the initFlowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitFlowType() {
        return initFlowType;
    }

    /**
     * Sets the value of the initFlowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitFlowType(String value) {
        this.initFlowType = value;
    }

    /**
     * Gets the value of the skipLoginPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipLoginPage() {
        return skipLoginPage;
    }

    /**
     * Sets the value of the skipLoginPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipLoginPage(String value) {
        this.skipLoginPage = value;
    }

    /**
     * Gets the value of the requiredAccessPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredAccessPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredAccessPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequiredAccessPermissions() {
        if (requiredAccessPermissions == null) {
            requiredAccessPermissions = new ArrayList<String>();
        }
        return this.requiredAccessPermissions;
    }

    /**
     * Gets the value of the optionalAccessPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalAccessPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalAccessPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptionalAccessPermissions() {
        if (optionalAccessPermissions == null) {
            optionalAccessPermissions = new ArrayList<String>();
        }
        return this.optionalAccessPermissions;
    }

    /**
     * Gets the value of the localeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCode() {
        return localeCode;
    }

    /**
     * Sets the value of the localeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCode(String value) {
        this.localeCode = value;
    }

    /**
     * Gets the value of the pageStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageStyle() {
        return pageStyle;
    }

    /**
     * Sets the value of the pageStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageStyle(String value) {
        this.pageStyle = value;
    }

    /**
     * Gets the value of the cppHeaderImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCppHeaderImage() {
        return cppHeaderImage;
    }

    /**
     * Sets the value of the cppHeaderImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCppHeaderImage(String value) {
        this.cppHeaderImage = value;
    }

    /**
     * Gets the value of the cppHeaderBorderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCppHeaderBorderColor() {
        return cppHeaderBorderColor;
    }

    /**
     * Sets the value of the cppHeaderBorderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCppHeaderBorderColor(String value) {
        this.cppHeaderBorderColor = value;
    }

    /**
     * Gets the value of the cppHeaderBackColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCppHeaderBackColor() {
        return cppHeaderBackColor;
    }

    /**
     * Sets the value of the cppHeaderBackColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCppHeaderBackColor(String value) {
        this.cppHeaderBackColor = value;
    }

    /**
     * Gets the value of the cppPayflowColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCppPayflowColor() {
        return cppPayflowColor;
    }

    /**
     * Sets the value of the cppPayflowColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCppPayflowColor(String value) {
        this.cppPayflowColor = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
