package org.isolution.sensis.domain;

import java.io.Serializable;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class Contact implements Serializable{
    /**
     * The contact detail. Maybe a phone number, web address or email.
     */
    private String value;

    /**
     * The type of contact. See the table below for possible values.
     */
    private ContactType type;

    /**
     *  Contains a short description of the contact.
     */
    private String description;

    public Contact() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
