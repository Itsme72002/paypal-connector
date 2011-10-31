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
 * <p>Java class for CountryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="GQ"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="TF"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="GY"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HM"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JM"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="YT"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="QA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="LC"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="VC"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="SZ"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VU"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VG"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="YU"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZW"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="QM"/>
 *     &lt;enumeration value="QN"/>
 *     &lt;enumeration value="QO"/>
 *     &lt;enumeration value="QP"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="GG"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="JE"/>
 *     &lt;enumeration value="TL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryCodeType")
@XmlEnum
public enum CountryCodeType {

    AF("AF"),
    AL("AL"),
    DZ("DZ"),
    AS("AS"),
    AD("AD"),
    AO("AO"),
    AI("AI"),
    AQ("AQ"),
    AG("AG"),
    AR("AR"),
    AM("AM"),
    AW("AW"),
    AU("AU"),
    AT("AT"),
    AZ("AZ"),
    BS("BS"),
    BH("BH"),
    BD("BD"),
    BB("BB"),
    BY("BY"),
    BE("BE"),
    BZ("BZ"),
    BJ("BJ"),
    BM("BM"),
    BT("BT"),
    BO("BO"),
    BA("BA"),
    BW("BW"),
    BV("BV"),
    BR("BR"),
    IO("IO"),
    BN("BN"),
    BG("BG"),
    BF("BF"),
    BI("BI"),
    KH("KH"),
    CM("CM"),
    CA("CA"),
    CV("CV"),
    KY("KY"),
    CF("CF"),
    TD("TD"),
    CL("CL"),
    @XmlEnumValue("C2")
    C_2("C2"),
    CN("CN"),
    CX("CX"),
    CC("CC"),
    CO("CO"),
    KM("KM"),
    CG("CG"),
    CD("CD"),
    CK("CK"),
    CR("CR"),
    CI("CI"),
    HR("HR"),
    CU("CU"),
    CY("CY"),
    CZ("CZ"),
    DK("DK"),
    DJ("DJ"),
    DM("DM"),
    DO("DO"),
    TP("TP"),
    EC("EC"),
    EG("EG"),
    SV("SV"),
    GQ("GQ"),
    ER("ER"),
    EE("EE"),
    ET("ET"),
    FK("FK"),
    FO("FO"),
    FJ("FJ"),
    FI("FI"),
    FR("FR"),
    GF("GF"),
    PF("PF"),
    TF("TF"),
    GA("GA"),
    GM("GM"),
    GE("GE"),
    DE("DE"),
    GH("GH"),
    GI("GI"),
    GR("GR"),
    GL("GL"),
    GD("GD"),
    GP("GP"),
    GU("GU"),
    GT("GT"),
    GN("GN"),
    GW("GW"),
    GY("GY"),
    HT("HT"),
    HM("HM"),
    VA("VA"),
    HN("HN"),
    HK("HK"),
    HU("HU"),
    IS("IS"),
    IN("IN"),
    ID("ID"),
    IR("IR"),
    IQ("IQ"),
    IE("IE"),
    IL("IL"),
    IT("IT"),
    JM("JM"),
    JP("JP"),
    JO("JO"),
    KZ("KZ"),
    KE("KE"),
    KI("KI"),
    KP("KP"),
    KR("KR"),
    KW("KW"),
    KG("KG"),
    LA("LA"),
    LV("LV"),
    LB("LB"),
    LS("LS"),
    LR("LR"),
    LY("LY"),
    LI("LI"),
    LT("LT"),
    LU("LU"),
    MO("MO"),
    MK("MK"),
    MG("MG"),
    MW("MW"),
    MY("MY"),
    MV("MV"),
    ML("ML"),
    MT("MT"),
    MH("MH"),
    MQ("MQ"),
    MR("MR"),
    MU("MU"),
    YT("YT"),
    MX("MX"),
    FM("FM"),
    MD("MD"),
    MC("MC"),
    MN("MN"),
    MS("MS"),
    MA("MA"),
    MZ("MZ"),
    MM("MM"),
    NA("NA"),
    NR("NR"),
    NP("NP"),
    NL("NL"),
    AN("AN"),
    NC("NC"),
    NZ("NZ"),
    NI("NI"),
    NE("NE"),
    NG("NG"),
    NU("NU"),
    NF("NF"),
    MP("MP"),
    NO("NO"),
    OM("OM"),
    PK("PK"),
    PW("PW"),
    PS("PS"),
    PA("PA"),
    PG("PG"),
    PY("PY"),
    PE("PE"),
    PH("PH"),
    PN("PN"),
    PL("PL"),
    PT("PT"),
    PR("PR"),
    QA("QA"),
    RE("RE"),
    RO("RO"),
    RU("RU"),
    RW("RW"),
    SH("SH"),
    KN("KN"),
    LC("LC"),
    PM("PM"),
    VC("VC"),
    WS("WS"),
    SM("SM"),
    ST("ST"),
    SA("SA"),
    SN("SN"),
    SC("SC"),
    SL("SL"),
    SG("SG"),
    SK("SK"),
    SI("SI"),
    SB("SB"),
    SO("SO"),
    ZA("ZA"),
    GS("GS"),
    ES("ES"),
    LK("LK"),
    SD("SD"),
    SR("SR"),
    SJ("SJ"),
    SZ("SZ"),
    SE("SE"),
    CH("CH"),
    SY("SY"),
    TW("TW"),
    TJ("TJ"),
    TZ("TZ"),
    TH("TH"),
    TG("TG"),
    TK("TK"),
    TO("TO"),
    TT("TT"),
    TN("TN"),
    TR("TR"),
    TM("TM"),
    TC("TC"),
    TV("TV"),
    UG("UG"),
    UA("UA"),
    AE("AE"),
    GB("GB"),
    US("US"),
    UM("UM"),
    UY("UY"),
    UZ("UZ"),
    VU("VU"),
    VE("VE"),
    VN("VN"),
    VG("VG"),
    VI("VI"),
    WF("WF"),
    EH("EH"),
    YE("YE"),
    YU("YU"),
    ZM("ZM"),
    ZW("ZW"),

    /**
     * 
     * 		                NOTE: APO/FPO was defined in eBay list previously 
     * 		                but they are not defined in ISO 3166. This country 
     * 		                will remain on eBay country code list for backward 
     * 		                compatibility.
     * 		             
     * 
     */
    AA("AA"),

    /**
     * 
     * 		                NOTE: Guernsey was defined in eBay list previously 
     * 		                but they are not defined in ISO 3166. This country 
     * 		                will remain on eBay country list for backward 
     * 		                compatibility.
     * 		             
     * 
     */
    QM("QM"),

    /**
     * 
     * 		                 NOTE: Jan Mayen was defined in eBay list previously 
     * 		                 but they are not defined in ISO 3166. This country 
     * 		                 will remain on eBay country list for backward 
     * 		                 compatibility.
     * 		             
     * 
     */
    QN("QN"),

    /**
     * 
     * 		                 NOTE: Jersey was defined in eBay list previously 
     * 		                 but they are not defined in ISO 3166. This country 
     * 		                 will remain on eBay country list for backward 
     * 		                 compatibility.
     * 		             
     * 
     */
    QO("QO"),

    /**
     * 
     * 		                 NOTE: Tahiti was defined in eBay list previously 
     * 		                 but they are not defined in ISO 3166. This country 
     * 		                 will remain on eBay country list for backward 
     * 		                 compatibility.
     * 		             
     * 
     */
    QP("QP"),

    /**
     * 
     * 		                 NOTE: Serbia and Montenegro was not defined in the list previously
     * 							  but now an ISO 3166 code has been defined. As of 41.0 this
     * 							  country is supported in PayPal PRO.
     * 		             
     * 
     */
    CS("CS"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),
    GG("GG"),
    IM("IM"),
    JE("JE"),
    TL("TL");
    private final String value;

    CountryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryCodeType fromValue(String v) {
        for (CountryCodeType c: CountryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
