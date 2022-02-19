/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * June 6 2021
 * CS320
 * appointment test program
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*set up test parameter variables*/
class AppointmentTest {
 private String id, description;
 private String tooLongId, tooLongDescription;
 private Date date, pastDate;
 @SuppressWarnings("deprecation")
 
 /*set up test parameters*/
 @BeforeEach
 void setUp() {
 id = "1234567890";
 description = "The appt object must have a required description.";
 date = new Date(2021, Calendar.JANUARY, 1);
 tooLongId = "111222333444555";
 tooLongDescription =
 "This description is too long for the appointment requirements, but works for testing.";
 pastDate = new Date(0);
 }
 
 /*test that appointment ID cannot be updated*/
 @Test
 void testUpdateAppointmentId() {
 Appointment appt = new Appointment();
 assertThrows(IllegalArgumentException.class,
 () -> appt.updateAppointmentId(null));
 assertThrows(IllegalArgumentException.class,
 () -> appt.updateAppointmentId(tooLongId));
 appt.updateAppointmentId(id);
 assertEquals(id, appt.getAppointmentId());
 }
 
 /*test get appointment ID*/
 @Test
 void testGetAppointmentId() {
 Appointment appt = new Appointment(id);
 assertNotNull(appt.getAppointmentId());
 assertEquals(appt.getAppointmentId().length(), 10);
 assertEquals(id, appt.getAppointmentId());
 }
 
 /*test updating appointment dates*/
 @Test
 void testUpdateDate() {
 Appointment appt = new Appointment();
 assertThrows(IllegalArgumentException.class, () -> appt.updateDate(null));
 assertThrows(IllegalArgumentException.class,
 () -> appt.updateDate(pastDate));
 appt.updateDate(date);
 assertEquals(date, appt.getAppointmentDate());
 }
 
 /*test get new appointment date*/
 @Test
 void testGetAppointmentDate() {
 Appointment appt = new Appointment(id, date);
 assertNotNull(appt.getAppointmentDate());
 assertEquals(date, appt.getAppointmentDate());
 }
 
 /*test update appointment description*/
 @Test
 void testUpdateDescription() {
	 Appointment appt = new Appointment();
	 assertThrows(IllegalArgumentException.class,
	 () -> appt.updateDescription(null));
	 assertThrows(IllegalArgumentException.class,
	 () -> appt.updateDescription(tooLongDescription));
	 appt.updateDescription(description);
	 assertEquals(description, appt.getDescription());
	 }
/*test retrieve appointment description*/ 
 @Test
 void testGetDescription() {
	 Appointment appt = new Appointment(id, date, description);
	 assertNotNull(appt.getDescription());
	 assertTrue(appt.getDescription().length() <= 50);
	 assertEquals(description, appt.getDescription());
	 }
	}
