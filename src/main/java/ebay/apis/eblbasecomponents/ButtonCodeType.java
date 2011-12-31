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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HOSTED"/>
 *     &lt;enumeration value="ENCRYPTED"/>
 *     &lt;enumeration value="CLEARTEXT"/>
 *     &lt;enumeration value="TOKEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonCodeType")
@XmlEnum
public enum ButtonCodeType {


    /**
     *  Creates Hosted Button
     * 
     */
    HOSTED,

    /**
     *  Creates Encrypted Button
     * 
     */
    ENCRYPTED,

    /**
     *  Creates Cleartext Button
     * 
     */
    CLEARTEXT,

    /**
     *  Creates Token or temporary Button
     * 
     */
    TOKEN;

    public String value() {
        return name();
    }

    public static ButtonCodeType fromValue(String v) {
        return valueOf(v);
    }

}