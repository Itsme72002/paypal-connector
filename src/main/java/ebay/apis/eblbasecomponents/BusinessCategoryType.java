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
 * <p>Java class for BusinessCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Category-Unspecified"/>
 *     &lt;enumeration value="Antiques"/>
 *     &lt;enumeration value="Arts"/>
 *     &lt;enumeration value="Automotive"/>
 *     &lt;enumeration value="Beauty"/>
 *     &lt;enumeration value="Books"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Cameras-and-Photography"/>
 *     &lt;enumeration value="Clothing"/>
 *     &lt;enumeration value="Collectibles"/>
 *     &lt;enumeration value="Computer-Hardware-and-Software"/>
 *     &lt;enumeration value="Culture-and-Religion"/>
 *     &lt;enumeration value="Electronics-and-Telecom"/>
 *     &lt;enumeration value="Entertainment"/>
 *     &lt;enumeration value="Entertainment-Memorabilia"/>
 *     &lt;enumeration value="Food-Drink-and-Nutrition"/>
 *     &lt;enumeration value="Gifts-and-Flowers"/>
 *     &lt;enumeration value="Hobbies-Toys-and-Games"/>
 *     &lt;enumeration value="Home-and-Garden"/>
 *     &lt;enumeration value="Internet-and-Network-Services"/>
 *     &lt;enumeration value="Media-and-Entertainment"/>
 *     &lt;enumeration value="Medical-and-Pharmaceutical"/>
 *     &lt;enumeration value="Money-Service-Businesses"/>
 *     &lt;enumeration value="Non-Profit-Political-and-Religion"/>
 *     &lt;enumeration value="Not-Elsewhere-Classified"/>
 *     &lt;enumeration value="Pets-and-Animals"/>
 *     &lt;enumeration value="Real-Estate"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="Sports-and-Recreation"/>
 *     &lt;enumeration value="Travel"/>
 *     &lt;enumeration value="Other-Categories"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessCategoryType")
@XmlEnum
public enum BusinessCategoryType {

    @XmlEnumValue("Category-Unspecified")
    CATEGORY_UNSPECIFIED("Category-Unspecified"),
    @XmlEnumValue("Antiques")
    ANTIQUES("Antiques"),
    @XmlEnumValue("Arts")
    ARTS("Arts"),
    @XmlEnumValue("Automotive")
    AUTOMOTIVE("Automotive"),
    @XmlEnumValue("Beauty")
    BEAUTY("Beauty"),
    @XmlEnumValue("Books")
    BOOKS("Books"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Cameras-and-Photography")
    CAMERAS_AND_PHOTOGRAPHY("Cameras-and-Photography"),
    @XmlEnumValue("Clothing")
    CLOTHING("Clothing"),
    @XmlEnumValue("Collectibles")
    COLLECTIBLES("Collectibles"),
    @XmlEnumValue("Computer-Hardware-and-Software")
    COMPUTER_HARDWARE_AND_SOFTWARE("Computer-Hardware-and-Software"),
    @XmlEnumValue("Culture-and-Religion")
    CULTURE_AND_RELIGION("Culture-and-Religion"),
    @XmlEnumValue("Electronics-and-Telecom")
    ELECTRONICS_AND_TELECOM("Electronics-and-Telecom"),
    @XmlEnumValue("Entertainment")
    ENTERTAINMENT("Entertainment"),
    @XmlEnumValue("Entertainment-Memorabilia")
    ENTERTAINMENT_MEMORABILIA("Entertainment-Memorabilia"),
    @XmlEnumValue("Food-Drink-and-Nutrition")
    FOOD_DRINK_AND_NUTRITION("Food-Drink-and-Nutrition"),
    @XmlEnumValue("Gifts-and-Flowers")
    GIFTS_AND_FLOWERS("Gifts-and-Flowers"),
    @XmlEnumValue("Hobbies-Toys-and-Games")
    HOBBIES_TOYS_AND_GAMES("Hobbies-Toys-and-Games"),
    @XmlEnumValue("Home-and-Garden")
    HOME_AND_GARDEN("Home-and-Garden"),
    @XmlEnumValue("Internet-and-Network-Services")
    INTERNET_AND_NETWORK_SERVICES("Internet-and-Network-Services"),
    @XmlEnumValue("Media-and-Entertainment")
    MEDIA_AND_ENTERTAINMENT("Media-and-Entertainment"),
    @XmlEnumValue("Medical-and-Pharmaceutical")
    MEDICAL_AND_PHARMACEUTICAL("Medical-and-Pharmaceutical"),
    @XmlEnumValue("Money-Service-Businesses")
    MONEY_SERVICE_BUSINESSES("Money-Service-Businesses"),
    @XmlEnumValue("Non-Profit-Political-and-Religion")
    NON_PROFIT_POLITICAL_AND_RELIGION("Non-Profit-Political-and-Religion"),
    @XmlEnumValue("Not-Elsewhere-Classified")
    NOT_ELSEWHERE_CLASSIFIED("Not-Elsewhere-Classified"),
    @XmlEnumValue("Pets-and-Animals")
    PETS_AND_ANIMALS("Pets-and-Animals"),
    @XmlEnumValue("Real-Estate")
    REAL_ESTATE("Real-Estate"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("Sports-and-Recreation")
    SPORTS_AND_RECREATION("Sports-and-Recreation"),
    @XmlEnumValue("Travel")
    TRAVEL("Travel"),
    @XmlEnumValue("Other-Categories")
    OTHER_CATEGORIES("Other-Categories");
    private final String value;

    BusinessCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessCategoryType fromValue(String v) {
        for (BusinessCategoryType c: BusinessCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
