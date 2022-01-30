package patient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* auto generate patient IDs*/

public class PatientService {
	private String uniqueId;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	public String prescriptions;
	public String allergies;
	
	private List<Patient> patientList = new ArrayList<Patient>();
	 {
	 uniqueId = UUID.randomUUID().toString().substring(
	 0, Math.min(toString().length(), 10));
	 }
	

/* add new patient to array*/
		 
	public void newPatient() 
	{
		 Patient patient = new Patient(newUniqueId(), firstName, lastName, phoneNumber, address, prescriptions, allergies);
		 patientList.add(patient);
		 }

	 
	 /* delete patient by patient ID*/
	 public void deletePatient(String patientID) throws Exception {
	 patientList.remove(searchForPatient(patientID));
	 }
	 
	 
	 /* update patient by patient ID*/
	 
	 public void updateFirstName(String patientID, String firstName) throws Exception {
	 searchForPatient(patientID).updateFirstName(firstName);
	 }
	 
	 public void updateLastName(String patientID, String lastName) throws Exception {
	 searchForPatient(patientID).updateLastName(lastName);
	 }
	 
	 public void updatePhoneNumber(String patientID, String phoneNumber) throws Exception {
	 searchForPatient(patientID).updatePhoneNumber(phoneNumber);
	 }
	 
	 public void updateAddress(String patientID, String address) throws Exception {
		 searchForPatient(patientID).updateAddress(address);
	 }
	 
	 public void updatePrescriptions(String patientID, String prescriptions) throws Exception {
		 searchForPatient(patientID).updatePrescriptions(prescriptions);
	 }
	 
	 public void updateAllergies(String patientID, String allergies) throws Exception {
		 searchForPatient(patientID).updateAllergies(allergies);
	 }
	 
	
	 /* add patient ID to list*/
	 public List<Patient> getPatientList() { return patientList; }
	 private String newUniqueId() {
		 return uniqueId = UUID.randomUUID().toString().substring(
		 0, Math.min(toString().length(), 10));
		 }
	 private Patient searchForPatient(String patientID) throws Exception {
	 int index = 0;
	 while (index < patientList.size()) {
	 if (patientID.equals(patientList.get(index).getPatientID())) {
	 return patientList.get(index);
	 }
	 index++;
	 }
	 throw new Exception("The task cannot be completed");
	 }
	 
	}
