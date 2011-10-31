
package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoBillType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoBillType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoAutoBill"/>
 *     &lt;enumeration value="AddToNextBilling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoBillType")
@XmlEnum
public enum AutoBillType {

    @XmlEnumValue("NoAutoBill")
    NO_AUTO_BILL("NoAutoBill"),
    @XmlEnumValue("AddToNextBilling")
    ADD_TO_NEXT_BILLING("AddToNextBilling");
    private final String value;

    AutoBillType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoBillType fromValue(String v) {
        for (AutoBillType c: AutoBillType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
