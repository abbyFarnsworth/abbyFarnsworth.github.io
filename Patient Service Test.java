package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import patient.PatientService;

/* variables used to create tests*/

public class PatientServicesTest {
	 void setUp() {
		String patientID = "123ABC";
		String firstNameTest = "Leslie";
		String lastNameTest = "Jones";
		String phoneNumberTest = "2078819223";
		String addressTest = "1231 Briar Rd";
		String prescriptions = "Maxalt";
		String allergies = "penicillin";
		String tooLongPatientId = "112233AABB";
		String tooLongFirstName = "Leslie Anne Jones";
		String tooLongLastName = "Leslie Anne Jones";
		String tooLongPhoneNumber = "2078819223555";
		String tooShortPhoneNumber = "20788";
		String tooLongAddress = "1231 Briar Road S. Portland Maine 04106";
		String tooLongPrescriptions = "This prescription has too many characters. Must be under 50.";
		String tooLongAllegies = "This list of allergies has too many characters. Must be under 50.";
		 }

	 /* pull patient info from list & test that the strings meet guidelines*/	
	 
	 /*test patient ID*/
	 @Test
	 void newPatientTest() {
	 PatientService service = new PatientService();
	 service.newPatient();
	 assertAll(
	 "service",
	 ()
	 -> assertNotNull(service.getPatientList().get(0).getPatientID()),
	 ()
	 -> assertEquals("INITIAL", service.getPatientList().get(0).getFirstName()),
	 ()
	 -> assertEquals("INITIAL", service.getPatientList().get(0).getLastName()),
	 ()
	 -> assertEquals("1235559999", service.getPatientList().get(0).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL", service.getPatientList().get(0).getAddress()),
	 ()
	 -> assertEquals("INITIAL", service.getPatientList().get(0).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL", service.getPatientList().get(0).getAllergies()));
	 
	 /*Test patient first name*/
	 String firstNameTest;
	 service.newPatient();
	 assertAll(
	 "service",
	 ()
	 -> assertNotNull(service.getPatientList().get(1).getPatientID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getPatientList().get(1).getFirstName()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getPatientList().get(1).getLastName()),
	 ()
	 -> assertEquals("1235559999",
	 service.getPatientList().get(1).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getPatientList().get(1).getAddress()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(1).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(1).getAllergies()));
	 
	 /*Test patient last name*/
	 service.newPatient(firstNameTest, lastNameTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getPatientList().get(2).getPatientID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getPatientList().get(2).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getPatientList().get(2).getLastName()),
	 ()
	 -> assertEquals("1235559999",
	 service.getPatientList().get(2).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getPatientList().get(2).getAddress()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(2).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL", 
	 service.getPatientList().get(2).getAllergies()));
	 
	 /*Test patient phone number*/
	 service.newPatient(firstNameTest, lastNameTest, phoneNumberTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getPatientList().get(3).getPatientID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getPatientList().get(3).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getPatientList().get(3).getLastName()),
	 ()
	 -> assertEquals(phoneNumberTest,
	 service.getPatientList().get(3).getPhoneNumber()),
	 ()
	 -> assertEquals("INITIAL",
	 service.getPatientList().get(3).getAddress()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(3).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL", 
	 service.getPatientList().get(3).getAllergies()));
	 
	 /*Test patient address*/
	 service.newPatient(firstNameTest, lastNameTest, phoneNumberTest,addressTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getPatientList().get(4).getPatientID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getPatientList().get(4).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getPatientList().get(4).getLastName()),
	 ()
	 -> assertEquals(phoneNumberTest,
	 service.getPatientList().get(4).getPhoneNumber()),
	 ()
	 -> assertEquals(addressTest,
	 service.getPatientList().get(4).getAddress()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(4).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL", 
	 service.getPatientList().get(4).getAllergies()));
	 }
	 
	 /*Test patient prescriptions*/
	 service.newPatient(firstNameTest, lastNameTest, phoneNumberTest,addressTest, prescriptionsTest);
	 assertAll("service",
	 ()
	 -> assertNotNull(service.getPatientList().get(5).getPatientID()),
	 ()
	 -> assertEquals(firstNameTest,
	 service.getPatientList().get(5).getFirstName()),
	 ()
	 -> assertEquals(lastNameTest,
	 service.getPatientList().get(5).getLastName()),
	 ()
	 -> assertEquals(phoneNumberTest,
	 service.getPatientList().get(5).getPhoneNumber()),
	 ()
	 -> assertEquals(addressTest,
	 service.getPatientList().get(5).getAddress()),
	 ()
	 ->assertEquals("INITIAL",
	 service.getPatientList().get(5).getPrescriptions()),
	 ()
	 ->assertEquals("INITIAL", 
	 service.getPatientList().get(5).getAllergies()));
	 }

     /*Test patient allergies*/
     service.newPatient(firstNameTest, lastNameTest, phoneNumberTest,addressTest, prescriptionsTest, allergiesTest);
     assertAll("service",
     ()
     -> assertNotNull(service.getPatientList().get(6).getPatientID()),
     ()
     -> assertEquals(firstNameTest,
     service.getPatientList().get(6).getFirstName()),
     ()
     -> assertEquals(lastNameTest,
     service.getPatientList().get(6).getLastName()),
     ()
     -> assertEquals(phoneNumberTest,
     service.getPatientList().get(6).getPhoneNumber()),
     ()
     -> assertEquals(addressTest,
     service.getPatientList().get(6).getAddress()),
     ()
     ->assertEquals("INITIAL",
     service.getPatientList().get(6).getPrescriptions()),
     ()
     ->assertEquals("INITIAL", 
     service.getPatientList().get(6).getAllergies()));
     }
	
	 /*test ability to delete patient*/
	 @Test
	 void deletePatientTest() {
	 PatientService service = new PatientService();
	 service.newPatient();
	 assertThrows(Exception.class, () -> service.deletePatient(patientID));
	 assertAll(()
	 -> service.deletePatient(
	 service.getPatientList().get(0).getPatientID()));
	 }
	
	 /*test ability to update patient first name*/
	 @Test
	 void updateFirstNameTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updateFirstName(service.getPatientList().get(0).getPatientID(),
	 firstNameTest);
	 assertEquals(firstNameTest, service.getPatientList().get(0).getFirstName());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateFirstName(
	 service.getPatientList().get(0).getPatientID(),
	 tooLongFirstName));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateFirstName(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateFirstName(patientID, firstNameTest));
	 }
	
	 /*test ability to update patient last name*/
	 @Test
	 void updateLastNameTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updateLastName(service.getPatientList().get(0).getPatientID(),
	 lastNameTest);
	 assertEquals(lastNameTest, service.getPatientList().get(0).getLastName());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateLastName(
	 service.getPatientList().get(0).getPatientID(), tooLongLastName));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateLastName(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateLastName(patientID, lastNameTest));
	 }
	
	 /*test ability to update patient phone number*/
	 @Test
	 void updatePhoneNumberTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updatePhoneNumber(service.getPatientList().get(0).getPatientID(),
	 phoneNumberTest);
	 assertEquals(phoneNumberTest,
	 service.getPatientList().get(0).getPhoneNumber());
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getPatientList().get(0).getPatientID(),
	 tooLongPhoneNumber));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getPatientList().get(0).getPatientID(),tooShortPhoneNumber));
	 assertThrows(
	 IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getPatientList().get(0).getPatientID(), patientId));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePhoneNumber(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updatePhoneNumber(patientId, lastNameTest));
						 }
	 /*test ability to update patient address*/
	 @Test
	 void updateAddressTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updateAddress(service.getPatientList().get(0).getPatientID(),
	 addressTest);
	 assertEquals(addressTest, service.getPatientList().get(0).getAddress());
	 assertThrows(IllegalArgumentException.class,
     ()
	 -> service.updateAddress(
	 service.getPatientList().get(0).getPatientID(),tooLongAddress));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateAddress(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateAddress(patientID, addressTest));
	 }
	 
	 /*test ability to update patient prescriptions*/
	 @Test
	 void updatePrescriptionsTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updatePrescriptions(service.getPatientList().get(0).getPatientID(),
	 prescriptionsTest);
	 assertEquals(prescriptionsTest, service.getPatientList().get(0).getPrescriptions());
	 assertThrows(IllegalArgumentException.class,
     ()
	 -> service.updatePrescriptions(
	 service.getPatientList().get(0).getPatientID(),tooLongPrescriptions));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updatePrescriptions(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updatePrescriptions(patientID, prescriptionsTest));
	 }
	 
	 /*test ability to update patient allergies*/
	 @Test
	 void updateAllergiesTest() throws Exception {
	 PatientService service = new PatientService();
	 service.newPatient();
	 service.updateAllergies(service.getPatientList().get(0).getPatientID(),
	 allergiesTest);
	 assertEquals(allergiesTest, service.getPatientList().get(0).getAllergies());
	 assertThrows(IllegalArgumentException.class,
     ()
	 -> service.updateAllergies(
	 service.getPatientList().get(0).getPatientID(),tooLongAllergies));
	 assertThrows(IllegalArgumentException.class,
	 ()
	 -> service.updateAllergies(
	 service.getPatientList().get(0).getPatientID(), null));
	 assertThrows(Exception.class,
	 () -> service.updateAllergies(patientID, allergiesTest));
	 }
			 
	
}