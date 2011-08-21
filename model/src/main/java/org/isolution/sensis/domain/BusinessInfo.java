package org.isolution.sensis.domain;


/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:22 PM
 */
public class BusinessInfo {
    /**
     * Legal identifier associated with the business (eg, liquor licence number).
     * Optional
     */
    private int legalId;

    /**
     * Australian Business Number
     * Optional
     */
    private String abn;

    /**
     * Australian Company Number
     * Optional
     */
    private String acn;

    /**
     * Approximate number of employees (eg, '25-50').
     * Optional
     */
    private String numberOfEmployees;

    /**
     * Date the business was established.
     * Optional
     */
    private String dateEstablished;

    public BusinessInfo() {
    }

    public int getLegalId() {
        return legalId;
    }

    public void setLegalId(int legalId) {
        this.legalId = legalId;
    }

    public String getAbn() {
        return abn;
    }

    public void setAbn(String abn) {
        this.abn = abn;
    }

    public String getAcn() {
        return acn;
    }

    public void setAcn(String acn) {
        this.acn = acn;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getDateEstablished() {
        return dateEstablished;
    }

    public void setDateEstablished(String dateEstablished) {
        this.dateEstablished = dateEstablished;
    }
}
