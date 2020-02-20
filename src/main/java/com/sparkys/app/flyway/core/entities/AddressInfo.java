/**
 * Property of Gifted Concepts LLC.
 */
package com.sparkys.app.flyway.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Tim Richard
 *
 */
@Embeddable
public class AddressInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "address", length = 50)
    @NotNull(message = "{com.sparkys.online.orders.addressinfo.address.required}")
    @Size(max = 50, message = "{com.sparkys.online.orders.addressinfo.address.size}", min = 1)
    private String address;

    @Column(name = "city", length = 30)
    @NotNull(message = "{com.sparkys.online.orders.addressinfo.city.required}")
    @Size(max = 30, message = "{com.sparkys.online.orders.addressinfo.city.size}", min = 1)
    private String city;

    @Column(name = "country", length = 30)
    private String country;

    @Column(name = "state", length = 2)
    @NotNull(message = "{com.sparkys.online.orders.addressinfo.state.required}")
    @Size(max = 2, message = "{com.sparkys.online.orders.addressinfo.state.size}", min = 2)
    private String state;

    @Column(name = "zip_code", length = 5)
    @NotNull(message = "{com.sparkys.online.orders.addressinfo.zip.required}")
    private Integer zipCode;

    /**
     * @return the address
     */
    public String getAddress() {
	return address;
    }

    /**
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
	return country;
    }

    /**
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * @return the zipCode
     */
    public Integer getZipCode() {
	return zipCode;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(final String address) {
	this.address = address;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(final String city) {
	this.city = city;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(final String country) {
	this.country = country;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(final String state) {
	this.state = state;
    }

    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(final Integer zipCode) {
	this.zipCode = zipCode;
    }

}
