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


/**
 *  
 *                        Contains information required To list a business item.
 *                        BusinessSeller - only for add item, the RestrictedToBusiness and VATPercent for both get and add,
 *                        for revise all must be optional
 *                    
 * 
 * <p>Java class for VATDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestrictedToBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VATDetailsType", propOrder = {
    "businessSeller",
    "restrictedToBusiness",
    "vatPercent"
})
public class VATDetailsType {

    @XmlElement(name = "BusinessSeller")
    protected Boolean businessSeller;
    @XmlElement(name = "RestrictedToBusiness")
    protected Boolean restrictedToBusiness;
    @XmlElement(name = "VATPercent")
    protected Float vatPercent;

    /**
     * Gets the value of the businessSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessSeller() {
        return businessSeller;
    }

    /**
     * Sets the value of the businessSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessSeller(Boolean value) {
        this.businessSeller = value;
    }

    /**
     * Gets the value of the restrictedToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToBusiness() {
        return restrictedToBusiness;
    }

    /**
     * Sets the value of the restrictedToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToBusiness(Boolean value) {
        this.restrictedToBusiness = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercent(Float value) {
        this.vatPercent = value;
    }

}
