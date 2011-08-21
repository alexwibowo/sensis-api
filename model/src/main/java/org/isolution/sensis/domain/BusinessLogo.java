package org.isolution.sensis.domain;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:21 PM
 */
public class BusinessLogo {
    /**
     * The url of the logo image.
     */
    private String url;

    /**
     * Alternate text for the business logo. Can be used, for example, as the alternate text for HTML images tags.
     */
    private String altText;

    public BusinessLogo() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}
