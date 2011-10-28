
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.corecomponenttypes.AmountType;


/**
 * <p>Java class for FlatShippingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatShippingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalShippingCosts" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="FlatShippingHandlingCosts" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}InsuranceFee" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}InsuranceOption" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ShippingService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlatShippingRateType", propOrder = {
    "additionalShippingCosts",
    "flatShippingHandlingCosts",
    "insuranceFee",
    "insuranceOption",
    "shippingService"
})
public class FlatShippingRateType {

    @XmlElement(name = "AdditionalShippingCosts")
    protected AmountType additionalShippingCosts;
    @XmlElement(name = "FlatShippingHandlingCosts")
    protected AmountType flatShippingHandlingCosts;
    @XmlElement(name = "InsuranceFee")
    protected AmountType insuranceFee;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "ShippingService")
    protected ShippingServiceCodeType shippingService;

    /**
     * Gets the value of the additionalShippingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdditionalShippingCosts() {
        return additionalShippingCosts;
    }

    /**
     * Sets the value of the additionalShippingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdditionalShippingCosts(AmountType value) {
        this.additionalShippingCosts = value;
    }

    /**
     * Gets the value of the flatShippingHandlingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFlatShippingHandlingCosts() {
        return flatShippingHandlingCosts;
    }

    /**
     * Sets the value of the flatShippingHandlingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFlatShippingHandlingCosts(AmountType value) {
        this.flatShippingHandlingCosts = value;
    }

    /**
     * Gets the value of the insuranceFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets the value of the insuranceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceFee(AmountType value) {
        this.insuranceFee = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * Gets the value of the shippingService property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceCodeType }
     *     
     */
    public ShippingServiceCodeType getShippingService() {
        return shippingService;
    }

    /**
     * Sets the value of the shippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceCodeType }
     *     
     */
    public void setShippingService(ShippingServiceCodeType value) {
        this.shippingService = value;
    }

}
