package org.isolution.sensis.domain;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:54 PM
 */
public class Category {

    /**
     * Unique ID associated with the category.
     */
    private int id;

    /**
     * The name of the category the business is listed under.
     */
    private String name;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
