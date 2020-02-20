/**
 * Property of Gifted Concepts LLC.
 */
package com.sparkys.app.flyway.core.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Tim Richard
 *
 */
@Entity
@Table(name = "employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = "logonid") })
public class Employee extends RootEntity {

    private static final long serialVersionUID = 1L;

    @Embedded
    private BusinessInfo busInfo;

    @Column(name = "ID_NUMBER", unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence_gen")
    @SequenceGenerator(allocationSize = 10, name = "employee_sequence_gen", sequenceName = "EMPLOYEE_SEQ")
    private Long id;

    @Column(name = "logonid", length = 20, nullable = false, unique = true)
    private String logonid;

    /**
     * @return the busInfo
     */
    public BusinessInfo getBusInfo() {
	return busInfo;
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @return the logonid
     */
    public String getLogonid() {
	return logonid;
    }

    /**
     * @param busInfo
     *            the busInfo to set
     */
    public void setBusInfo(final BusinessInfo busInfo) {
	this.busInfo = busInfo;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
	this.id = id;
    }

    /**
     * @param logonid
     *            the logonid to set
     */
    public void setLogonid(final String logonId) {
	this.logonid = logonId;
    }

    @Override
    public String toString() {
	return ReflectionToStringBuilder.toString(this,
	        ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
