/**
 * Property of Gifted Concepts LLC.
 */
package com.sparkys.app.flyway.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Tim Richard
 *
 */
@Embeddable
public class BusinessInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Embedded
    private AddressInfo address;

    @Column(name = "business_phone", length = 15)
    private String businessPhone;

    @Column(name = "company", length = 30)
    private String company;

    @Column(name = "email_address", length = 50)
    private String emailAddress;

    @Column(name = "fax_phone", length = 15)
    private String faxPhone;

    @Column(name = "first_name", length = 30)
    private String firstName;

    @Column(name = "home_phone", length = 15)
    private String homePhone;

    @Column(name = "job_title", length = 30)
    private String jobTitle;

    @Column(name = "last_name", length = 30)
    private String lastName;

    @Column(name = "mobile_phone", length = 15)
    private String mobilePhone;

    @Column(name = "notes", length = 255)
    private String notes;

    @Column(name = "web_page", length = 100)
    private String webPage;

    /**
     * @return the address
     */
    public AddressInfo getAddress() {
	return address;
    }

    /**
     * @return the businessPhone
     */
    public String getBusinessPhone() {
	return businessPhone;
    }

    /**
     * @return the company
     */
    public String getCompany() {
	return company;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
	return emailAddress;
    }

    /**
     * @return the faxPhone
     */
    public String getFaxPhone() {
	return faxPhone;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    @Transient
    public String getFullName() {

	final StringBuilder fullName = new StringBuilder();
	fullName.append(getFirstName());
	fullName.append(" ");
	fullName.append(getLastName());

	return fullName.toString();
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
	return homePhone;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
	return jobTitle;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @return the mobilePhone
     */
    public String getMobilePhone() {
	return mobilePhone;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
	return notes;
    }

    /**
     * @return the webPage
     */
    public String getWebPage() {
	return webPage;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(final AddressInfo address) {
	this.address = address;
    }

    /**
     * @param businessPhone
     *            the businessPhone to set
     */
    public void setBusinessPhone(final String businessPhone) {
	this.businessPhone = businessPhone;
    }

    /**
     * @param company
     *            the company to set
     */
    public void setCompany(final String company) {
	this.company = company;
    }

    /**
     * @param emailAddress
     *            the emailAddress to set
     */
    public void setEmailAddress(final String emailAddress) {
	this.emailAddress = emailAddress;
    }

    /**
     * @param faxPhone
     *            the faxPhone to set
     */
    public void setFaxPhone(final String faxPhone) {
	this.faxPhone = faxPhone;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(final String firstName) {
	this.firstName = firstName;
    }

    /**
     * @param homePhone
     *            the homePhone to set
     */
    public void setHomePhone(final String homePhone) {
	this.homePhone = homePhone;
    }

    /**
     * @param jobTitle
     *            the jobTitle to set
     */
    public void setJobTitle(final String jobTitle) {
	this.jobTitle = jobTitle;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(final String lastName) {
	this.lastName = lastName;
    }

    /**
     * @param mobilePhone
     *            the mobilePhone to set
     */
    public void setMobilePhone(final String mobilePhone) {
	this.mobilePhone = mobilePhone;
    }

    /**
     * @param notes
     *            the notes to set
     */
    public void setNotes(final String notes) {
	this.notes = notes;
    }

    /**
     * @param webPage
     *            the webPage to set
     */
    public void setWebPage(final String webPage) {
	this.webPage = webPage;
    }

    @Override
    public String toString() {
	return ReflectionToStringBuilder.toString(this,
	        ToStringStyle.MULTI_LINE_STYLE);
    }
}
