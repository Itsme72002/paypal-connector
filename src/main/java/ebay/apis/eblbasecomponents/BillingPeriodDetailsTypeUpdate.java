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
 * <p>Java class for BillingPeriodDetailsType_Update complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingPeriodDetailsType_Update">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingPeriod" type="{urn:ebay:apis:eBLBaseComponents}BillingPeriodType" minOccurs="0"/>
 *         &lt;element name="BillingFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalBillingCycles" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ShippingAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingPeriodDetailsType_Update", propOrder = {
    "billingPeriod",
    "billingFrequency",
    "totalBillingCycles",
    "amount",
    "shippingAmount",
    "taxAmount"
})
public class BillingPeriodDetailsTypeUpdate {

    @XmlElement(name = "BillingPeriod")
    protected BillingPeriodType billingPeriod;
    @XmlElement(name = "BillingFrequency")
    protected Integer billingFrequency;
    @XmlElement(name = "TotalBillingCycles")
    protected Integer totalBillingCycles;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "ShippingAmount")
    protected BasicAmountType shippingAmount;
    @XmlElement(name = "TaxAmount")
    protected BasicAmountType taxAmount;

    /**
     * Gets the value of the billingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPeriodType }
     *     
     */
    public BillingPeriodType getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * Sets the value of the billingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPeriodType }
     *     
     */
    public void setBillingPeriod(BillingPeriodType value) {
        this.billingPeriod = value;
    }

    /**
     * Gets the value of the billingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Sets the value of the billingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingFrequency(Integer value) {
        this.billingFrequency = value;
    }

    /**
     * Gets the value of the totalBillingCycles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBillingCycles() {
        return totalBillingCycles;
    }

    /**
     * Sets the value of the totalBillingCycles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBillingCycles(Integer value) {
        this.totalBillingCycles = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTaxAmount(BasicAmountType value) {
        this.taxAmount = value;
    }

}
