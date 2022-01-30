package task;

/*each task includes task ID, task name, and task description*/

public class Task {

	
	/*task 1 used for patient calls*/ 
	class task1 {
		private String callPatientTaskId;
		private String callPatientTaskName;
		private String description;
		private String checkCallPatientTaskId;
		
		task1() {
		    callPatientTaskId = "INITIAL";
		    callPatientTaskName = "Place call to patient ID: ";
		    description = "INITIAL DESCRIPTION";
		 }
		
		task1(String callPatientTaskId) {
			 checkCallPatientTaskId(callPatientTaskId);
			 callPatientTaskName = "Place call to patient ID: ";
			 description = "INITIAL DESCRIPTION";
			 }
			 
		task1(String callPatientTaskId, String callPatientTaskName) {
			 checkCallPatientTaskId(callPatientTaskId);
			 callPatientTaskName = "Place call to patient ID: ";
			 description = "INITIAL DESCRIPTION";
			 }
			 
		task1(String callPatientTaskId, String callPatientTaskName, String desc) {
			 checkCallPatientTaskId(callPatientTaskId);
			 callPatientTaskName = "Place call to patient ID: ";
			 setDescription(desc);
			 }
		
		/*name cannot be blank or longer than 25 characters*/
		 
		 protected void setName(String callPatientTaskName) {
		 if (callPatientTaskName == null || callPatientTaskName.length() > 20) {
		 throw new IllegalArgumentException(
		 "Task name is invalid. Ensure it is shorter than 25 characters and not empty.");
		 } else {
		 this.callPatientTaskName = callPatientTaskName;
		 }
		 
		 /*task description cannot be blank or longer than 50 characters*/
		 }
		 public final String getDescription() { return description; }
		 protected void setDescription(String taskDescription) {
		 if (taskDescription == null || taskDescription.length() > 50) {
		 throw new IllegalArgumentException(
		 "Task description is invalid. Ensure it is shorter than 50 characters and not empty.");
		 } else {
		 this.description = taskDescription;
		 }
		 
		 /*task ID cannot be blank or longer than 10 characters*/
		 }
		 private void checkCallPatientTaskId(String checkCallPatientTaskId) {
		 if (checkCallPatientTaskId == null || checkCallPatientTaskId.length() > 10) {
		 throw new IllegalArgumentException(
		 "Error: The task ID was null or longer than 10 characters");
		 } else {
		 this.checkCallPatientTaskId = checkCallPatientTaskId;
		 }
		 }
	}
	
	/*task 2 used for retrieving lab results*/
	class task2 {
		private String labResultsTaskId;
		private String labResultsTaskName;
		private String description2;
		private String checkLabResultsTaskId;
		
		 task2() {
			 labResultsTaskId = "INITIAL";
			 labResultsTaskName = "Deliver lab results to patient ID: ";
			 description2 = "INITIAL DESCRIPTION";
		 }
		 
		 task2(String labResultsTaskId) {
			 checkLabResultsTaskId(labResultsTaskId);
			 labResultsTaskName = "Deliver lab results to patient ID: ";
			 description2 = "INITIAL DESCRIPTION";
			 }
	

		task2(String labResultsTaskId, String labResultsTaskName) {
			 checkLabResultsTaskId(labResultsTaskId);
			 labResultsTaskName = "Deliver lab results to patient ID: ";
			 description2 = "INITIAL DESCRIPTION";
			 }
				 
		 task2(String labResultsTaskId, String labResultsTaskName, String desc) {
			 checkLabResultsTaskId(labResultsTaskId);
			 labResultsTaskName = "Deliver lab results to patient ID: ";
			 setDescription2(description2);
			 }
		 
		 /*name cannot be blank or longer than 25 characters*/
		 protected void setName(String labResultsTaskName) {
		 if (labResultsTaskName == null || labResultsTaskName.length() > 25) {
		 throw new IllegalArgumentException(
		 "Task name is invalid. Ensure it is shorter than 25 characters and not empty.");
		 } else {
		 this.labResultsTaskName = labResultsTaskName;
		 }
			 
		 /*task description cannot be blank or longer than 50 characters*/
		 }
		 public final String getDescription2() { return description2; }
		 protected void setDescription2(String description2) {
		 if (description2 == null || description2.length() > 50) {
		 throw new IllegalArgumentException(
		 "Task description is invalid. Ensure it is shorter than 50 characters and not empty.");
		 } else {
		 this.description2 = description2;
		 }
			 
		 /*task ID cannot be blank or longer than 10 characters*/
		 }
		 private void checkLabResultsTaskId(String checkLabResultsTaskId) {
		 if (checkLabResultsTaskId == null || checkLabResultsTaskId.length() > 10) {
		 throw new IllegalArgumentException(
		 "Error: The task ID was null or longer than 10 characters");
		 } else {
		 this.checkLabResultsTaskId = checkLabResultsTaskId;
		 }
		 } 

		
	}
	 
	/*task 3 is used for sending out appointment reminders*/
	 class task3 {
		 private String appointmentReminderTaskId;
		 private String appointmentReminderTaskName;
		 private String description3;
		 private String checkAppointmentReminderTaskId;
		 
		 task3( ) {
			 appointmentReminderTaskId = "INITIAL";
			 appointmentReminderTaskName = "Send appointment reminder to patient ID: ";
			 description3 = "INITIAL DESCRIPTION";
		 }
		 
		 task3(String appointmentReminderTaskId) {
			 checkAppointmentReminderTaskId(appointmentReminderTaskId);
			 appointmentReminderTaskName = "Send appointment reminder to patient ID: ";
			 description3 = "INITIAL DESCRIPTION";
			 }
				 

		private void checkAppointmentReminderTaskId(String appointmentReminderTaskId) {
			//method stub
			
		}

		task3(String appointmentReminderTaskId, String appointmentReminderTaskName) {
			 checkAppointmentReminderTaskId(appointmentReminderTaskId);
			 appointmentReminderTaskName = "Send appointment reminder to patient ID: ";
			 description3 = "INITIAL DESCRIPTION";
			 }
				 
		 task3(String appointmentReminderTaskId, String appointmentReminderTaskName, String desc) {
			 checkAppointmentReminderTaskId(appointmentReminderTaskId);
			 appointmentReminderTaskName = "Send appointment reminder to patient ID: ";
			 setDescription3(desc);
			 }
	

	 /*name cannot be blank or longer than 25 characters*/
	 protected void setName(String appointmentReminderTaskName) {
	 if (appointmentReminderTaskName == null || appointmentReminderTaskName.length() > 25) {
	 throw new IllegalArgumentException(
	 "Task name is invalid. Ensure it is shorter than 25 characters and not empty.");
	 } else {
	 this.appointmentReminderTaskName = appointmentReminderTaskName;
	 }
		 
	 /*task description cannot be blank or longer than 50 characters*/
	 }
	 public final String getDescription3() { return description3; }
	 protected void setDescription3(String description3) {
	 if (description3 == null || description3.length() > 50) {
	 throw new IllegalArgumentException(
	 "Task description is invalid. Ensure it is shorter than 50 characters and not empty.");
	 } else {
	 this.description3 = description3;
	 }
		 
	 /*task ID cannot be blank or longer than 10 characters*/
	 }
	 private void checkLabResultsTaskId(String checkAppointmentReminderTaskId) {
	 if (checkAppointmentReminderTaskId == null || checkAppointmentReminderTaskId.length() > 10) {
	 throw new IllegalArgumentException(
	 "Error: The task ID was null or longer than 10 characters");
	 } else {
	 this.checkAppointmentReminderTaskId = appointmentReminderTaskId;
	 }
	 } 

}
	 
}