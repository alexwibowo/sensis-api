package org.isolution.sensis.domain;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:58 PM
 */
public enum GeoCodeGranularity {
    /**
     * The location is resolved to a property granularity where the
     * latitude and longitude are the centroid of the property.
     */
    PROPERTY,

    /**
     * The location is resolved to a street granularity where the latitude and
     * longitude are the centroid of the street.
     */
    STREET,

    /**
     * The location is resolved to a suburb granularity where the
     * latitude and longitude are the centroid of the suburb.
     */
    SUBURB,

    /**
     * The location is resolved to a region granularity where the latitude and
     * longitude are the centroid of the region.
     */
    REGION,

    /**
     * The location is resolved to a state granularity where the latitude
     * and longitude are the centroid of the state.
     */
    STATE
}
