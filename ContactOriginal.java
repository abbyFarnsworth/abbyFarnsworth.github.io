/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 23 2021
 * CS320
 * contact program test
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	/* test contact info pulls in correctly*/	

void testContact() {
	Contact contact = new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
	assertTrue(contact.getContactID().equals("123ABC"));
	assertTrue(contact.getFirstName().equals("Leslie"));
	assertTrue(contact.getLastName().equals("Jones"));
	assertTrue(contact.getPhoneNumber().equals("2078819223"));
	assertTrue(contact.getAddress().equals("1231 Briar Rd"));
}

/* test length of strings*/

void testContactIDTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
	});

}
void testFirstNameTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
	});
}
void testLastNameTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
	});	
}
void testPhoneNumberTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
	});
}	
void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd");
		});	
}
}