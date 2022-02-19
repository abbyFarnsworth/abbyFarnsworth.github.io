/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 23 2021
 * CS320
 * contact program
 */
package contact;

public class Contact {

	public static void main(String[] args) {
	
	}
/* variables used to create a contact*/
	
private String contactID;
private String firstName;
private String lastName;
private String phoneNumber;
private String address;

/* defines needed info & length for each string*/

public Contact (String contactID, String firstName, String lastName, String phoneNumber, String address) {
	if(contactID == null || contactID.length()> 10) {
		throw new IllegalArgumentException("Invalid input"); 
	}
	if(firstName == null || firstName.length()> 10) {
		throw new IllegalArgumentException("Invalid input"); 
	}
	if(lastName == null || lastName.length()> 10) {
		throw new IllegalArgumentException("Invalid input"); 
	}
	if(phoneNumber == null || phoneNumber.length() != 10) {
		throw new IllegalArgumentException("Invalid input"); 
	}
	if(address == null || address.length() > 30) {
		throw new IllegalArgumentException("Invalid input"); 
	}
	
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
}

/* sets up variables used to retrieve contact info */

public String getContactID() {
	return contactID;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public String getAddress() {
	return address;
}
}