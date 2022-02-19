/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 23 2021
 * CS320
 * contact services program test
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* variables used to create tests*/

public class ContactServicesTest {
	 void setUp() {
		String contactID = "123ABC";
		String firstNameTest = "Leslie";
		String lastNameTest = "Jones";
		String phoneNumberTest = "2078819223";
		String addressTest = "1231 Briar Rd";
		String tooLongContactId = "112233AABB";
		String tooLongFirstName = "Leslie Anne Jones";
		String tooLongLastName = "Leslie Anne Jones";
		String tooLongPhoneNumber = "2078819223555";
		String tooShortPhoneNumber = "20788";
		String tooLongAddress = "1231 Briar Road S. Portland Maine 04106";
		 }

	 /* pull contact info from list & test that the strings meet guidelines*/	 
	
	 @Test
	 void newContactTest() {
	 ContactService service = new ContactService();
	 service.newContact();
	 assertAll(
	 "service",
	 ()
	 -> assertNotNull(service.getContactList().get(0).getContactID()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(0).getFirstName()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(0).getLastName()),
	 ()
	 -> assertEquals("1235559999",
	 service.getContactList().get(0).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(0).getAddress()));
	 service.newContact(firstNameTest);
	 assertAll(
	 "service",
	 ()
	 -> assertNotNull(service.getContactList().get(1).getContactID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getContactList().get(1).getFirstName()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(1).getLastName()),
	 ()
	 -> assertEquals("1235559999",
	 service.getContactList().get(1).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(1).getAddress()));
	 service.newContact(firstNameTest, lastNameTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getContactList().get(2).getContactID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getContactList().get(2).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getContactList().get(2).getLastName()),
	 ()
	 -> assertEquals("1235559999",
	 service.getContactList().get(2).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(2).getAddress()));
	 service.newContact(firstNameTest, lastNameTest, phoneNumberTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getContactList().get(3).getContactID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getContactList().get(3).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getContactList().get(3).getLastName()),
	 ()
	 -> assertEquals(phoneNumberTest,
	 service.getContactList().get(3).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getContactList().get(3).getAddress()));
	 service.newContact(firstNameTest, lastNameTest, phoneNumberTest,addressTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getContactList().get(4).getContactID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getContactList().get(4).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getContactList().get(4).getLastName()),
	 ()
	 -> assertEquals(phoneNumberTest,
	 service.getContactList().get(4).getPhoneNumber()),
	 ()
	 -> assertEquals(addressTest,
	 service.getContactList().get(4).getAddress()));
	 }
	
	 /*test ability to delete contact*/
	 @Test
	 void deleteContactTest() {
	 ContactService service = new ContactService();
	 service.newContact();
	 assertThrows(Exception.class, () -> service.deleteContact(contactID));
	 assertAll(()
	 -> service.deleteContact(
	 service.getContactList().get(0).getContactID()));
	 }
	
	 /*test ability to update contact first name*/
	 @Test
	 void updateFirstNameTest() throws Exception {
	 ContactService service = new ContactService();
	 service.newContact();
	 service.updateFirstName(service.getContactList().get(0).getContactID(),
	 firstNameTest);
	 assertEquals(firstNameTest, service.getContactList().get(0).getFirstName());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateFirstName(
	 service.getContactList().get(0).getContactID(),
	 tooLongFirstName));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateFirstName(
	 service.getContactList().get(0).getContactID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateFirstName(contactID, firstNameTest));
	 }
	
	 /*test ability to update contact last name*/
	 @Test
	 void updateLastNameTest() throws Exception {
	 ContactService service = new ContactService();
	 service.newContact();
	 service.updateLastName(service.getContactList().get(0).getContactID(),
	 lastNameTest);
	 assertEquals(lastNameTest, service.getContactList().get(0).getLastName());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateLastName(
	 service.getContactList().get(0).getContactID(), tooLongLastName));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateLastName(
	 service.getContactList().get(0).getContactID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateLastName(contactID, lastNameTest));
	 }
	
	 /*test ability to update contact phone number*/
	 @Test
	 void updatePhoneNumberTest() throws Exception {
	 ContactService service = new ContactService();
	 service.newContact();
	 service.updatePhoneNumber(service.getContactList().get(0).getContactID(),
	 phoneNumberTest);
	 assertEquals(phoneNumberTest,
	 service.getContactList().get(0).getPhoneNumber());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getContactList().get(0).getContactID(),
	 tooLongPhoneNumber));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getContactList().get(0).getContactID(),tooShortPhoneNumber));
	 assertThrows(
	 IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getContactList().get(0).getContactID(), contactId));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getContactList().get(0).getContactID(), null));
	 assertThrows(Exception.class,
	 () -> service.updatePhoneNumber(contactId, lastNameTest));
						 }
	 /*test ability to update contact address*/
	 @Test
	 void updateAddressTest() throws Exception {
	 ContactService service = new ContactService();
	 service.newContact();
	 service.updateAddress(service.getContactList().get(0).getContactID(),
	 addressTest);
	 assertEquals(addressTest, service.getContactList().get(0).getAddress());
	 assertThrows(IllegalArgumentException.class,
     ()
	 -> service.updateAddress(
	 service.getContactList().get(0).getContactID(),tooLongAddress));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateAddress(
	 service.getContactList().get(0).getContactID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateAddress(contactID, addressTest));
	 }
			 
	
}