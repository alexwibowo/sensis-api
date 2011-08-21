package org.isolution.sensis.domain;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class Address {

    /**
     * Address line (eg, level/unit number, street number and street name).
     */
    private String addressLine;

    /**
     * The type of address.
     */
    private AddressType type;

    /**
     * 	Suburb or town name.
     */
    private String suburb;

    private String state;

    /**
     * Postcode
     */
    private String postcode;

    /**
     * Latitude of business address (may be approximate). Can be used for plotting business location on a map.
     * This is only provided for primaryAddress if applicable.
     */
    private String latitude;

    /**
     * Longitude of business address (may be approximate). Can be used for plotting business
     * location on a map. This is only provided for primaryAddress if applicable.
     */
    private String longitude;

    /**
     * Describes the precision of latitude and longitude.
     */
    private GeoCodeGranularity geoCodeGranularity;

    public Address() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public GeoCodeGranularity getGeoCodeGranularity() {
        return geoCodeGranularity;
    }

    public void setGeoCodeGranularity(GeoCodeGranularity geoCodeGranularity) {
        this.geoCodeGranularity = geoCodeGranularity;
    }
}
