/**
 *
 */
package com.sparkys.app.flyway.core.utils;

import com.sparkys.app.flyway.core.entities.AddressInfo;
import com.sparkys.app.flyway.core.entities.BusinessInfo;
import com.sparkys.app.flyway.core.entities.Employee;

/**
 * @author Timmy Richard
 *
 */
public class EmployeeUtils {

    private static AddressInfo buildAddressInfo() {

	final AddressInfo address = new AddressInfo();
	address.setAddress("1432 Mocking Bird Ln.");
	address.setCity("St Louis");
	address.setCountry("USA");
	address.setState("MO");
	address.setZipCode(63101);
	return address;
    }

    private static BusinessInfo buildBusinessInfo(final AddressInfo address) {

	final BusinessInfo busInfo = new BusinessInfo();
	busInfo.setAddress(address);
	busInfo.setBusinessPhone("123 456-7890");
	busInfo.setCompany("Wrenches For U");
	busInfo.setEmailAddress("myemailaddress@mail.com");
	busInfo.setFaxPhone("123 456-7891");
	busInfo.setHomePhone("123 456-7892");
	busInfo.setJobTitle("My Title Means Nothing");
	busInfo.setFirstName("Tony");
	busInfo.setLastName("Montana");
	busInfo.setMobilePhone("123 456-7893");
	busInfo.setNotes("Who need notes when winging it is just fine!!!");
	busInfo.setWebPage("http://mywebpage.com");
	return busInfo;
    }

    public static final Employee createEmployee() {

	final Employee employee = new Employee();
	employee.setLogonid("mylogonid");
	final AddressInfo address = buildAddressInfo();
	employee.setBusInfo(buildBusinessInfo(address));

	return employee;
    }

    private EmployeeUtils() {
	// no arg
    }

}
