
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Bronze"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Titanium"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerLevelCodeType")
@XmlEnum
public enum SellerLevelCodeType {


    /**
     * 
     * 						Bronze
     * 					
     * 
     */
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),

    /**
     * 
     * 						Silver
     * 					
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * 
     * 						Gold
     * 					
     * 
     */
    @XmlEnumValue("Gold")
    GOLD("Gold"),

    /**
     * 
     * 						Platinum
     * 					
     * 
     */
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),

    /**
     * 
     * 						Titanium
     * 					
     * 
     */
    @XmlEnumValue("Titanium")
    TITANIUM("Titanium"),

    /**
     * 
     * 						None
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerLevelCodeType fromValue(String v) {
        for (SellerLevelCodeType c: SellerLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
