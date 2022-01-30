package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import patient.Patient;

public class PatientTest {
	
	/* test patient info pulls in correctly*/	

void testPatient() {
	Patient patient = new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	assertTrue(patient.getPatientID().equals("123ABC"));
	assertTrue(patient.getFirstName().equals("Leslie"));
	assertTrue(patient.getLastName().equals("Jones"));
	assertTrue(patient.getPhoneNumber().equals("2078819223"));
	assertTrue(patient.getAddress().equals("1231 Briar Rd"));
	assertTrue(patient.getPrescriptions().equals("Maxalt"));
	assertTrue(patient.getAllergies().equals("penicillin"));
}

/* test length of strings*/

void testPatientIDTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	});

}

void testFirstNameTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	});
}

void testLastNameTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	});	
}

void testPhoneNumberTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	});
}

void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
		});	
}

void testPrescriptionsTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
	});
}

	void testAllergiesTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Patient("123ABC", "Leslie", "Jones", "2078819223", "1231 Briar Rd", "Maxalt", "penicillin");
		});
}
}