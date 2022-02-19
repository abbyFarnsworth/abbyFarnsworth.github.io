/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 23 2021
 * CS320
 * contact services program
 */
package contact;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* auto generate contact IDs*/

public class ContactService {
	private String uniqueId;
	 private List<Contact> contactList = new ArrayList<>();
	 {
	 uniqueId = UUID.randomUUID().toString().substring(
	 0, Math.min(toString().length(), 10));
	 }
	

 /* adding new contacts to array*/
		 
	 public void newContact() {
		 Contact contact = new Contact(newUniqueId());
		 contactList.add(contact);
		 }
		 public void newContact(String firstname) {
		 Contact contact = new Contact(newUniqueId(), firstname);
		 contactList.add(contact);
		 }
		 public void newContact(String firstname, String lastname) {
		 Contact contact = new Contact(newUniqueId(), firstname, lastname);
		 contactList.add(contact);
		 }
		 public void newContact(String firstname, String lastname,
		 String phonenumber) {
		 Contact contact =
		 new Contact(newUniqueId(), firstname, lastname, phonenumber);
		 contactList.add(contact);
		 }
		 public void newContact(String firstname, String lastname, String phonenumber,
		 String address) {
		 Contact contact =
		 new Contact(newUniqueId(), firstname, lastname, phonenumber, address);
		 contactList.add(contact);
		 }

	 
	 /* delete contact by contact ID*/
	 public void deleteContact(String contactID) throws Exception {
	 contactList.remove(searchForContact(contactID));
	 }
	 
	 /* update contact by contact ID*/
	 
	 public void updateFirstName(String contactID, String firstName) throws Exception {
	 searchForContact(contactID).updateFirstName(firstName);
	 }
	 public void updateLastName(String contactID, String lastName) throws Exception {
	 searchForContact(contactID).updateLastName(lastName);
	 }
	 public void updatePhoneNumber(String contactID, String phoneNumber)
	 throws Exception {
	 searchForContact(contactID).updatePhoneNumber(phoneNumber);
	 }
	 public void updateAddress(String contactID, String address) throws Exception {
		 searchForContact(contactID).updateAddress(address);
		 }
	 
	 /* add contact ID to list*/
	 protected List<Contact> getContactList() { return contactList; }
	 private String newUniqueId() {
	 return uniqueId = UUID.randomUUID().toString().substring(
	 0, Math.min(toString().length(), 10));
	 }
	 private Contact searchForContact(String contactID) throws Exception {
	 int index = 0;
	 while (index < contactList.size()) {
	 if (contactID.equals(contactList.get(index).getContactID())) {
	 return contactList.get(index);
	 }
	 index++;
	 }
	 throw new Exception("The task cannot be completed");
	 }
	}


