/**@author abby.farnswor_snhu
 * Jan 22 2022
 * appointment service program*/

package appointment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import patient.PatientService

/*assign appointment ID*/
public class AppointmentService {
 final private List<Appointment> appointmentList = new ArrayList<>();
 private String newUniqueId() {
 return UUID.randomUUID().toString().substring(
 0, Math.min(toString().length(), 10));
 }
 
 /*create new appointment*/
 public void newAppointment() {
 Appointment appt = new Appointment(newUniqueId());
 appointmentList.add(appt);
 }
 
 /*add date to new appointment*/
 public void newAppointment(Date date) {
 Appointment appt = new Appointment(newUniqueId(), date);
 appointmentList.add(appt);
 }
 
 /*add patient ID to new appointment*/
 public void newAppointment(Date date, String patientID) {
 Appointment appt = new Appointment(newUniqueId(), date, patientID);
 appointmentList.add(appt);
 }

 /*add description to new appointment*/
 public void newAppointment(Date date, String description) {
 Appointment appt = new Appointment(newUniqueId(), date, description);
 appointmentList.add(appt);
 }
 
 /*delete appointment by appointment ID*/
 public void deleteAppointment(String id) throws Exception {
 appointmentList.remove(searchForAppointment(id));
 }
 
 /*exception thrown if appointment ID is not valid*/
 protected List<Appointment> getAppointmentList() { return appointmentList; }
 private Appointment searchForAppointment(String id) throws Exception {
 int index = 0;
 while (index < appointmentList.size()) {
 if (id.equals(appointmentList.get(index).getAppointmentId())) {
 return appointmentList.get(index);
 }
 index++;
 }
 throw new Exception("This appointment does not exist.");
 }
}