package org.isolution.sensis.domain;

import java.io.Serializable;

/**
 * User: alexwibowo
 */
public class Image implements Serializable {

    private String thumbnailUrl;

    private String largeUrl;

    private String altText;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}
