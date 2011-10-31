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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 	       		Contains the eBay Stores-specific item attributes 
 * 	       		department number and store location. StorefrontInfo 
 * 	       		is shown for any item that belongs to an eBay Store 
 * 	       		owner, regardless of whether it is fixed price or 
 * 	       		auction type. Returned as null for international 
 * 	       		fixed price items.
 *      			
 * 
 * <p>Java class for StorefrontType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorefrontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}StoreCategoryID"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}StoreURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorefrontType", propOrder = {
    "storeCategoryID",
    "storeURL"
})
public class StorefrontType {

    @XmlElement(name = "StoreCategoryID")
    protected int storeCategoryID;
    @XmlElement(name = "StoreURL")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;

    /**
     *  
     * 			      			assumed this type is specific to add/get/revise item, then each StorefrontType nust have category id, for store details this node makes no sense to use
     * 			        	
     * 
     */
    public int getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     */
    public void setStoreCategoryID(int value) {
        this.storeCategoryID = value;
    }

    /**
     *  
     * 			      			in case or revise item for example - to change store category (department) you do not need to change store URL, so it will notbe in request
     * 			      		
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * Sets the value of the storeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

}
