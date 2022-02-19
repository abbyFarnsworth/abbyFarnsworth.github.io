/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * June 6 2021
 * CS320
 * appointment program
 */
package appointment;

import java.util.Date;

public class Appointment {
 final private byte APPOINTMENT_ID_LENGTH;
 final private byte APPOINTMENT_DESCRIPTION_LENGTH;
 final private String INITIALIZER;
 private String appointmentId;
 private Date appointmentDate;
 private String description;
 
 /*set up appointment parameters*/
 
 {
 APPOINTMENT_ID_LENGTH = 10;
 APPOINTMENT_DESCRIPTION_LENGTH = 50;
 INITIALIZER = "INITIAL";
 }
 
 /*Create new appointment */
 Appointment() {
 Date today = new Date();
 appointmentId = INITIALIZER;
 appointmentDate = today;
 description = INITIALIZER;
 }
 
 /*add appointment ID*/
 Appointment(String id) {
 Date today = new Date();
 updateAppointmentId(id);
 appointmentDate = today;
 description = INITIALIZER;
 }
 
 Appointment(String id, Date date) {
 updateAppointmentId(id);
 updateDate(date);
 description = INITIALIZER;
 }
 /*add appointment description*/
 Appointment(String id, Date date, String description) {
 updateAppointmentId(id);
 updateDate(date);
 updateDescription(description);
 }
 
 /*appointment ID cannot be null & cannot exceed set length*/
 public void updateAppointmentId(String id) {
 if (id == null) {
 throw new IllegalArgumentException("Appointment ID cannot be null.");
 } else if (id.length() > APPOINTMENT_ID_LENGTH) {
 throw new IllegalArgumentException("Appointment ID cannot exceed " +
 APPOINTMENT_ID_LENGTH +
 " characters.");
 } else {
 this.appointmentId = id;
 }
 
 /*appointment date cannot be null & cannot be past date*/
 }
 public String getAppointmentId() { return appointmentId; }
 public void updateDate(Date date) {
 if (date == null) {
 throw new IllegalArgumentException("Appointment date cannot be null.");
 } else if (date.before(new Date())) {
 throw new IllegalArgumentException("Cannot make appointment in the past.");
 } else {
	 this.appointmentDate = date;
	 }
}
 /*allow appointment description update*/
 public Date getAppointmentDate() { return appointmentDate; }
 public void updateDescription(String description) {
 if (description == null) {
 throw new IllegalArgumentException("Appointment description cannot be null.");
 } else if (description.length() > APPOINTMENT_DESCRIPTION_LENGTH) {
 throw new IllegalArgumentException("Appointment description cannot exceed " +
	 APPOINTMENT_DESCRIPTION_LENGTH + " characters.");
	 } else {
	 this.description = description;
	 }
	 }
 
 public String getDescription() { return description; }
}