/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * <p>Java class for ShippingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="HandlingAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="InsuranceAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingInfoType", propOrder = {
    "shippingMethod",
    "shippingCarrier",
    "shippingAmount",
    "handlingAmount",
    "insuranceAmount"
})
public class ShippingInfoType {

    @XmlElement(name = "ShippingMethod", required = true)
    protected String shippingMethod;
    @XmlElement(name = "ShippingCarrier", required = true)
    protected String shippingCarrier;
    @XmlElement(name = "ShippingAmount", required = true)
    protected BasicAmountType shippingAmount;
    @XmlElement(name = "HandlingAmount", required = true)
    protected BasicAmountType handlingAmount;
    @XmlElement(name = "InsuranceAmount", required = true)
    protected BasicAmountType insuranceAmount;

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrier(String value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setShippingAmount(BasicAmountType value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the handlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getHandlingAmount() {
        return handlingAmount;
    }

    /**
     * Sets the value of the handlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setHandlingAmount(BasicAmountType value) {
        this.handlingAmount = value;
    }

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setInsuranceAmount(BasicAmountType value) {
        this.insuranceAmount = value;
    }

}
