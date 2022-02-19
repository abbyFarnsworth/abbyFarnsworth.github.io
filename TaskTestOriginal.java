/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 30 2021
 * CS320
 * task test program
 */
package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*set up parameters for task variables*/ 
class TaskTest {
 private String id, name, description;
 private String tooLongId, tooLongName, tooLongDescription;
 @BeforeEach
 void setUp() {
 id = "1234567890";
 name = "This is twenty chars";
 description = "The task object must have a description.";
 tooLongId = "111222333444555666";
 tooLongName = "This is too long for a task name";
 tooLongDescription =
 "The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.";
 }
 
 /*test retrieve task ID*/
 @Test
 void getTaskIdTest() {
 Task task = new Task(id);
 Assertions.assertEquals(id, task.getTaskId());
 }
 
 /*test retrieve task name*/
 @Test
 void getNameTest() {
 Task task = new Task(id, name);
 Assertions.assertEquals(name, task.getName());
 }
 
 /*test retrieve task description*/
 @Test
 void getDescriptionTest() {
 Task task = new Task(id, name, description);
 Assertions.assertEquals(description, task.getDescription());
 }
 
 /*test set new task name*/
 @Test
 void setNameTest() {
 Task task = new Task();
 task.setName(name);
 Assertions.assertEquals(name, task.getName());
 }
 
 /*test set new task description*/
 @Test
 void setDescriptionTest() {
 Task task = new Task();
 task.setDescription(description);
 Assertions.assertEquals(description, task.getDescription());
 }
 
 /*test if task ID is too long*/
 @Test
 void TaskIdTooLongTest() {
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> new Task(tooLongId));
 }
 
 /*test if task name is too long*/
 @Test
 void setTooLongNameTest() {
 Task task = new Task();
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> task.setName(tooLongName));
 }
 
 /*test if task description is too long*/
 @Test
 void setTooLongDescriptionTest() {
 Task task = new Task();
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> task.setDescription(tooLongDescription));
 }
 
 /*test if task ID is null*/
 @Test
 void TaskIdNullTest() {
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> new Task(null));
 }
 
 /*test if task name is null*/
 @Test
 void TaskNameNullTest() {
 Task task = new Task();
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> task.setName(null));
 }
 
 /*test if task description is null*/
 @Test
 void TaskDescriptionNullTest() {
 Task task = new Task();
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> task.setDescription(null));
 }
}
