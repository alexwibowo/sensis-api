package org.isolution.sensis.domain;

/**
 * User: Alex Wibowo
 * Date: 19/08/11
 * Time: 9:56 PM
 */
public enum AddressType {
    /**
     *  Vanity address. A vanity address usually contains a familiar point of interest rather than an exact street address.
     *  For example, a business located in a shopping centre may use the name of the shopping
     *  centre rather than the actual street address of the centre.
     */
    VANITY,

    /**
     *  Physical business address. This is the physical location of the business's store,
     *  office or other building.
     */
    PHYSICAL,

    /**
     *  Postal address. Often different from physical address, especially
     *  if the business has a Post Office (PO) box.
     */
    POSTAL
}
