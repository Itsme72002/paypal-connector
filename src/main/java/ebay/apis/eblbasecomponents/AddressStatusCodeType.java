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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressStatusCodeType")
@XmlEnum
public enum AddressStatusCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed");
    private final String value;

    AddressStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressStatusCodeType fromValue(String v) {
        for (AddressStatusCodeType c: AddressStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
