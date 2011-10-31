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
 *                 3DSecureInfoType
 *                 Information about 3D Secure parameters.
 *             
 * 
 * <p>Java class for ThreeDSecureInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDSecureInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThreeDSecureRequest" type="{urn:ebay:apis:eBLBaseComponents}ThreeDSecureRequestType" minOccurs="0"/>
 *         &lt;element name="ThreeDSecureResponse" type="{urn:ebay:apis:eBLBaseComponents}ThreeDSecureResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDSecureInfoType", propOrder = {
    "threeDSecureRequest",
    "threeDSecureResponse"
})
public class ThreeDSecureInfoType {

    @XmlElement(name = "ThreeDSecureRequest")
    protected ThreeDSecureRequestType threeDSecureRequest;
    @XmlElement(name = "ThreeDSecureResponse")
    protected ThreeDSecureResponseType threeDSecureResponse;

    /**
     * Gets the value of the threeDSecureRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureRequestType }
     *     
     */
    public ThreeDSecureRequestType getThreeDSecureRequest() {
        return threeDSecureRequest;
    }

    /**
     * Sets the value of the threeDSecureRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureRequestType }
     *     
     */
    public void setThreeDSecureRequest(ThreeDSecureRequestType value) {
        this.threeDSecureRequest = value;
    }

    /**
     * Gets the value of the threeDSecureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureResponseType }
     *     
     */
    public ThreeDSecureResponseType getThreeDSecureResponse() {
        return threeDSecureResponse;
    }

    /**
     * Sets the value of the threeDSecureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureResponseType }
     *     
     */
    public void setThreeDSecureResponse(ThreeDSecureResponseType value) {
        this.threeDSecureResponse = value;
    }

}
