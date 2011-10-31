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
 * <p>Java class for CompleteCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotComplete"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompleteCodeType")
@XmlEnum
public enum CompleteCodeType {

    @XmlEnumValue("NotComplete")
    NOT_COMPLETE("NotComplete"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    CompleteCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteCodeType fromValue(String v) {
        for (CompleteCodeType c: CompleteCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}