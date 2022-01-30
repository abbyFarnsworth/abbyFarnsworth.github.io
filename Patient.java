package patient;

public class Patient {
	private static final int PATIENT_PHONENUM_LENGTH = 10;
	private static final byte PATIENT_ID_LENGTH = 10;
	private static final byte PATIENT_FNAME_LENGTH = 10;
	private static final byte PATIENT_LNAME_LENGTH = 10;
	private static final byte PATIENT_ADDRESS_LENGTH = 30;
	private static final byte PATIENT_PRESCRIPTIONS_LENGTH = 50;
	private static final byte PATIENT_ALLERGIES_LENGTH = 50;
	private static final String INITIALIZER = "INITIAL";
	private static final String INITIALIZER_NUM = "1235559999";
    private String patientID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String prescriptions;
    private String allergies;

    /*create a new patient*/
     Patient() {
    	 this.patientID = INITIALIZER;
    	 this.firstName = INITIALIZER;
    	 this.lastName = INITIALIZER;
    	 this.phoneNumber = INITIALIZER_NUM;
    	 this.address = INITIALIZER;
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
     
     Patient(String patientID) {
    	 updatePatientID(patientID);
    	 this.firstName = INITIALIZER;
    	 this.lastName = INITIALIZER;
    	 this.phoneNumber = INITIALIZER_NUM;
    	 this.address = INITIALIZER;
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
     
      Patient(String PatientID, String firstName) {
    	 updatePatientID(PatientID);
    	 updateFirstName(firstName);
    	 this.lastName = INITIALIZER;
    	 this.phoneNumber = INITIALIZER_NUM;
    	 this.address = INITIALIZER;
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
     
	Patient(String patientID, String firstName, String lastName) {
    	 updatePatientID(patientID);
    	 updateFirstName(firstName);
    	 updateLastName(lastName);
    	 this.phoneNumber = INITIALIZER_NUM;
    	 this.address = INITIALIZER;
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
	
    Patient(String patientID, String firstName, String lastName,
    	 String phoneNumber) {
    	 updatePatientID(patientID);
    	 updateFirstName(firstName);
    	 updateLastName(lastName);
    	 updatePhoneNumber(phoneNumber);
    	 this.address = INITIALIZER;
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
    
    public Patient(String patientID, String firstName, String lastName,
    	 String phoneNumber, String address) {
    	 updatePatientID(patientID);
    	 updateFirstName(firstName);
    	 updateLastName(lastName);
    	 updatePhoneNumber(phoneNumber);
    	 updateAddress(address);
    	 this.prescriptions = INITIALIZER;
    	 this.allergies = INITIALIZER;
    	 }
    
    Patient(String patientID, String firstName, String lastName,
       	 String phoneNumber, String address, String prescriptions) {
       	 updatePatientID(patientID);
       	 updateFirstName(firstName);
       	 updateLastName(lastName);
       	 updatePhoneNumber(phoneNumber);
       	 updateAddress(address);
       	 updatePrescriptions(prescriptions);
       	 this.allergies = INITIALIZER;
       	 }
    
    public Patient(String patientID, String firstName, String lastName,
          	 String phoneNumber, String address, String prescriptions, String allergies) {
          	 updatePatientID(patientID);
          	 updateFirstName(firstName);
          	 updateLastName(lastName);
          	 updatePhoneNumber(phoneNumber);
          	 updateAddress(address);
          	 updatePrescriptions(prescriptions);
          	 updateAllergies(allergies);
          	 }
    	
    protected final String getContactId() { return patientID; }
    public final String getFirstName() { return firstName; }
    public final String getLastName() { return lastName; }
    public final String getPhoneNumber() { return phoneNumber; }
    public final String getAddress() { return address; }
    public final String getPrescriptions() { return prescriptions; }
    public final String getAllergies() { return allergies; }
    
    /*allow for updates to patient info*/
    protected void updateFirstName(String firstName) {
    	 if (firstName == null) {
    	 throw new IllegalArgumentException("First name cannot be empty");
    	 } else if (firstName.length() > PATIENT_FNAME_LENGTH) {
    	 throw new IllegalArgumentException("First name cannot be longer than " +
    	 PATIENT_FNAME_LENGTH + " characters");
    	 } else {
    	 this.firstName = firstName;
    	 }
    	 }
    
    protected void updateLastName(String lastName) {
    	 if (lastName == null) {
    	 throw new IllegalArgumentException("Last name cannot be empty");
    	 } else if (lastName.length() > PATIENT_LNAME_LENGTH) {
    	 throw new IllegalArgumentException("Last name cannot be longer than " +
    	 PATIENT_LNAME_LENGTH + " characters");
    	 } else {
    	 this.lastName = lastName;
    	 }
    	 }
    
    protected void updatePhoneNumber(String phoneNumber) {
    	 String regex = "[0-9]+";
    	 if (phoneNumber == null) {
    	 throw new IllegalArgumentException("Phone number cannot be empty.");
    	 } else if (phoneNumber.length() != PATIENT_PHONENUM_LENGTH) {
    	 throw new IllegalArgumentException(
    	 "Phone number length invalid. Ensure it is " +
    	 PATIENT_PHONENUM_LENGTH + " digits.");
    	 } else if (!phoneNumber.matches(regex)) {
    	 throw new IllegalArgumentException(
    	 "Phone number cannot have anything but numbers");
    	 } else {
    	 this.phoneNumber = phoneNumber;
    	 }
    	 }
    
    protected void updateAddress(String address) {
    	 if (address == null) {
    	 throw new IllegalArgumentException("Address cannot be empty");
    	 } else if (address.length() > PATIENT_ADDRESS_LENGTH) {
    	 throw new IllegalArgumentException("Address cannot be longer than " +
    	 PATIENT_ADDRESS_LENGTH +
    	 " characters");
    	 } else {
    	 this.address = address;
    	 }
    	 }
    
    protected void updatePrescriptions(String prescriptions) {
   	 if (prescriptions == null) {
   	 throw new IllegalArgumentException("Prescriptions cannot be empty. If none, type NA.");
   	 } else if (prescriptions.length() > PATIENT_PRESCRIPTIONS_LENGTH) {
   	 throw new IllegalArgumentException("Prescriptions cannot be longer than " +
   	 PATIENT_PRESCRIPTIONS_LENGTH +
   	 " characters");
   	 } else {
   	 this.prescriptions = prescriptions;
   	 }
   	 }
    
    protected void updateAllergies(String allergies) {
      	 if (allergies == null) {
      	 throw new IllegalArgumentException("Allergies cannot be empty. If none, type NA.");
      	 } else if (prescriptions.length() > PATIENT_ALLERGIES_LENGTH) {
      	 throw new IllegalArgumentException("Allergies cannot be longer than " +
      	 PATIENT_ALLERGIES_LENGTH +
      	 " characters");
      	 } else {
      	 this.allergies = allergies;
      	 }
      	 }
    	 
    protected void updatePatientID(String patientID) {
    	 if (patientID == null) {
    	 throw new IllegalArgumentException("Patient ID cannot be empty");
    	 } else if (patientID.length() > PATIENT_ID_LENGTH) {
    	 throw new IllegalArgumentException("Patient ID cannot be longer than " +
    	 PATIENT_ID_LENGTH + " characters");
    	 } else {
    	 this.patientID = patientID;
    	 }
    	 }
	
    public Object getPatientID() {
		//method stub
		return null;
	}

}