/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserWithdrawalLimitTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserWithdrawalLimitTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Limited"/>
 *     &lt;enumeration value="Unlimited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserWithdrawalLimitTypeType")
@XmlEnum
public enum UserWithdrawalLimitTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Limited")
    LIMITED("Limited"),
    @XmlEnumValue("Unlimited")
    UNLIMITED("Unlimited");
    private final String value;

    UserWithdrawalLimitTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserWithdrawalLimitTypeType fromValue(String v) {
        for (UserWithdrawalLimitTypeType c: UserWithdrawalLimitTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}