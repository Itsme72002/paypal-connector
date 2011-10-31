/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.ReverseTransactionResponseDetailsType;


/**
 * <p>Java class for ReverseTransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverseTransactionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ReverseTransactionResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseTransactionResponseType", propOrder = {
    "reverseTransactionResponseDetails"
})
public class ReverseTransactionResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ReverseTransactionResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ReverseTransactionResponseDetailsType reverseTransactionResponseDetails;

    /**
     * Gets the value of the reverseTransactionResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseTransactionResponseDetailsType }
     *     
     */
    public ReverseTransactionResponseDetailsType getReverseTransactionResponseDetails() {
        return reverseTransactionResponseDetails;
    }

    /**
     * Sets the value of the reverseTransactionResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseTransactionResponseDetailsType }
     *     
     */
    public void setReverseTransactionResponseDetails(ReverseTransactionResponseDetailsType value) {
        this.reverseTransactionResponseDetails = value;
    }

}
