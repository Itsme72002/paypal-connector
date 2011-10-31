
package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * 
 * 				AID for Airlines
 * 			
 * 
 * <p>Java class for AirlineItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalFare" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TotalTaxes" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TotalFee" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="RestrictedTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClearingSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClearingCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDetails" type="{urn:ebay:apis:eBLBaseComponents}FlightDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineItineraryType", propOrder = {
    "passengerName",
    "issueDate",
    "travelAgencyName",
    "travelAgencyCode",
    "ticketNumber",
    "issuingCarrierCode",
    "customerCode",
    "totalFare",
    "totalTaxes",
    "totalFee",
    "restrictedTicket",
    "clearingSequence",
    "clearingCount",
    "flightDetails"
})
public class AirlineItineraryType {

    @XmlElement(name = "PassengerName")
    protected String passengerName;
    @XmlElement(name = "IssueDate")
    protected String issueDate;
    @XmlElement(name = "TravelAgencyName")
    protected String travelAgencyName;
    @XmlElement(name = "TravelAgencyCode")
    protected String travelAgencyCode;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "IssuingCarrierCode")
    protected String issuingCarrierCode;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "TotalFare")
    protected BasicAmountType totalFare;
    @XmlElement(name = "TotalTaxes")
    protected BasicAmountType totalTaxes;
    @XmlElement(name = "TotalFee")
    protected BasicAmountType totalFee;
    @XmlElement(name = "RestrictedTicket")
    protected String restrictedTicket;
    @XmlElement(name = "ClearingSequence")
    protected String clearingSequence;
    @XmlElement(name = "ClearingCount")
    protected String clearingCount;
    @XmlElement(name = "FlightDetails")
    protected List<FlightDetailsType> flightDetails;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the travelAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    /**
     * Sets the value of the travelAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyName(String value) {
        this.travelAgencyName = value;
    }

    /**
     * Gets the value of the travelAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgencyCode() {
        return travelAgencyCode;
    }

    /**
     * Sets the value of the travelAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgencyCode(String value) {
        this.travelAgencyCode = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the issuingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCarrierCode() {
        return issuingCarrierCode;
    }

    /**
     * Sets the value of the issuingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCarrierCode(String value) {
        this.issuingCarrierCode = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTotalFare(BasicAmountType value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the totalTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTotalTaxes() {
        return totalTaxes;
    }

    /**
     * Sets the value of the totalTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTotalTaxes(BasicAmountType value) {
        this.totalTaxes = value;
    }

    /**
     * Gets the value of the totalFee property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTotalFee() {
        return totalFee;
    }

    /**
     * Sets the value of the totalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTotalFee(BasicAmountType value) {
        this.totalFee = value;
    }

    /**
     * Gets the value of the restrictedTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedTicket() {
        return restrictedTicket;
    }

    /**
     * Sets the value of the restrictedTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedTicket(String value) {
        this.restrictedTicket = value;
    }

    /**
     * Gets the value of the clearingSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingSequence() {
        return clearingSequence;
    }

    /**
     * Sets the value of the clearingSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingSequence(String value) {
        this.clearingSequence = value;
    }

    /**
     * Gets the value of the clearingCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCount() {
        return clearingCount;
    }

    /**
     * Sets the value of the clearingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCount(String value) {
        this.clearingCount = value;
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetailsType }
     * 
     * 
     */
    public List<FlightDetailsType> getFlightDetails() {
        if (flightDetails == null) {
            flightDetails = new ArrayList<FlightDetailsType>();
        }
        return this.flightDetails;
    }

}
