/**
 *
 */
package com.sparkys.app.flyway.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author Tim Richard
 *
 */
@MappedSuperclass
public class RootEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "VERSION_ID", nullable = false)
    @Version
    private Long version;

    @Override
    public boolean equals(final Object obj) {

	if (this == obj)
	    return true;
	if (obj == null)
	    return false;

	if (this == obj) {
	    return true;
	}

	final RootEntity otherObject = (RootEntity) obj;

	return new EqualsBuilder().append(version, otherObject.version)
	        .isEquals();
    }

    /**
     * @return the version
     */
    public Long getVersion() {
	return version;
    }

    @Override
    public int hashCode() {

	return new HashCodeBuilder()/* .append(id) */.append(version)
	        .toHashCode();
    }

    /**
     * @param version
     *            the version to set
     */
    public void setVersion(final Long version) {
	this.version = version;
    }

}
