package org.isolution.sensis.domain;

import java.util.List;
import java.util.Map;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class ResultEntry {
    /**
     * Unique identifier for this listing. This value can be used to bookmark the listing and later retrieval using the Get by Listing ID endpoint.
     */
    private int id;

    /**
     * 	Name of the business.
     */
    private String name;

    /**
     * Short business description (70 characters maximum). Usually the first description displayed.
     * Optional
     */
    private String shortDesriptor;

    /**
     * Secondary business description (160 characters maximum). Usually the second description displayed.
     * Optional
     */
    private String mediumDescriptor;

    /**
     * Additional details about opening hours or service (eg, 'By Appointment Only').
     * Optional
     */
    private String serviceNotes;

    /**
     * URL of listing on the Yellow Pages website. This page displays all details of the business including a map showing the location.
     * Optional
     */
    private String detailsLink;

    /**
     * If the business is a mobile business (such as a mobile dog wash).
     * Optional
     */
    private Boolean pureMobileBusiness;

    /**
     * 	Information about rates and prices (eg, call costs for a phone service).
     * Optional
     */
    private String priceQualifier;

    /**
     *  If this business has exposure advertising products that ensures this business appears for searches in this location.
     * Optional
     */
    private Boolean hasExposureProducts;

    /**
     * The url and altText of the business logo.
     * Optional
     * @link BusinessLogo
     */
    private BusinessLogo businessLogo;

    /**
     * Details of the business itself, such as the number of employees and the date established.
     * Optional
     * @link BusinessInfo
     */
    private BusinessInfo businessInfo;

    /**
     * List of categories that the business is listed under.
     */
    private List<Category> categories;

    /**
     * Reporting id information required for reporting usage events for current listing. See Reporting Usage Events.
     */
    private String reportingId;

    private String listingType;

    /**
     * List of primary contact details. See primaryContacts.
     */
    private List<Contact> primaryContacts;

    /**
     *  The primary business address. See primaryAddress.
     */
    private Address primaryAddress;

    /**
     * List of additional business addresses. Each array item follows the same structure as primaryAddress.
     */
    private List<Address> additionalAddresses;

    /**
     * 	The opening hours of the business.
     * 	@link org.isolution.sensis.domain.OperatingHour
     * 	@link org.isolution.sensis.domain.DayType
     */
    private Map<DayType, OperatingHour> openingHours;

    private List<Image> imageGallery;

    public ResultEntry() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportingId() {
        return reportingId;
    }

    public void setReportingId(String reportingId) {
        this.reportingId = reportingId;
    }

    public String getListingType() {
        return listingType;
    }

    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    public boolean isPureMobileBusiness() {
        return pureMobileBusiness;
    }

    public void setPureMobileBusiness(boolean pureMobileBusiness) {
        this.pureMobileBusiness = pureMobileBusiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailsLink() {
        return detailsLink;
    }

    public void setDetailsLink(String detailsLink) {
        this.detailsLink = detailsLink;
    }

    public List<Contact> getPrimaryContacts() {
        return primaryContacts;
    }

    public void setPrimaryContacts(List<Contact> primaryContacts) {
        this.primaryContacts = primaryContacts;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public boolean isHasExposureProducts() {
        return hasExposureProducts;
    }

    public void setHasExposureProducts(boolean hasExposureProducts) {
        this.hasExposureProducts = hasExposureProducts;
    }

    public String getShortDesriptor() {
        return shortDesriptor;
    }

    public void setShortDesriptor(String shortDesriptor) {
        this.shortDesriptor = shortDesriptor;
    }

    public String getMediumDescriptor() {
        return mediumDescriptor;
    }

    public void setMediumDescriptor(String mediumDescriptor) {
        this.mediumDescriptor = mediumDescriptor;
    }

    public String getServiceNotes() {
        return serviceNotes;
    }

    public void setServiceNotes(String serviceNotes) {
        this.serviceNotes = serviceNotes;
    }

    public String getPriceQualifier() {
        return priceQualifier;
    }

    public void setPriceQualifier(String priceQualifier) {
        this.priceQualifier = priceQualifier;
    }

    public BusinessLogo getBusinessLogo() {
        return businessLogo;
    }

    public void setBusinessLogo(BusinessLogo businessLogo) {
        this.businessLogo = businessLogo;
    }

    public BusinessInfo getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(BusinessInfo businessInfo) {
        this.businessInfo = businessInfo;
    }

    public List<Address> getAdditionalAddresses() {
        return additionalAddresses;
    }

    public void setAdditionalAddresses(List<Address> additionalAddresses) {
        this.additionalAddresses = additionalAddresses;
    }

    public Map<DayType, OperatingHour> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(Map<DayType, OperatingHour> openingHours) {
        this.openingHours = openingHours;
    }

    public List<Image> getImageGallery() {
        return imageGallery;
    }

    public void setImageGallery(List<Image> imageGallery) {
        this.imageGallery = imageGallery;
    }


}
