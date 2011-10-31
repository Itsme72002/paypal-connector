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
 * <p>Java class for FundingSourceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingSourceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowPushFunding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserSelectedFundingSource" type="{urn:ebay:apis:eBLBaseComponents}UserSelectedFundingSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingSourceDetailsType", propOrder = {
    "allowPushFunding",
    "userSelectedFundingSource"
})
public class FundingSourceDetailsType {

    @XmlElement(name = "AllowPushFunding")
    protected String allowPushFunding;
    @XmlElement(name = "UserSelectedFundingSource")
    protected UserSelectedFundingSourceType userSelectedFundingSource;

    /**
     * Gets the value of the allowPushFunding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowPushFunding() {
        return allowPushFunding;
    }

    /**
     * Sets the value of the allowPushFunding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowPushFunding(String value) {
        this.allowPushFunding = value;
    }

    /**
     * Gets the value of the userSelectedFundingSource property.
     * 
     * @return
     *     possible object is
     *     {@link UserSelectedFundingSourceType }
     *     
     */
    public UserSelectedFundingSourceType getUserSelectedFundingSource() {
        return userSelectedFundingSource;
    }

    /**
     * Sets the value of the userSelectedFundingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSelectedFundingSourceType }
     *     
     */
    public void setUserSelectedFundingSource(UserSelectedFundingSourceType value) {
        this.userSelectedFundingSource = value;
    }

}
