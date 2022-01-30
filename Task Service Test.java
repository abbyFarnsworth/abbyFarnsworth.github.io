package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/*set up parameters for task variables*/

class TaskServiceTest {
 private String id, name, description;
 private String tooLongName, tooLongDescription;
 @BeforeEach
 void setUp() {
 id = "1234567890";
 name = "This is twenty chars";
 description = "The task object must have a description.";
 tooLongName = "This is too long for a task name";
 tooLongDescription =
 "The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.";
 }
 
 /*test creating new task*/
 @Test
 void newTaskTest() {
 TaskService service = new TaskService();
 service.newTask();
 Assertions.assertNotNull(service.getTaskList().get(0).getTaskId());
 Assertions.assertNotEquals("INITIAL",
 service.getTaskList().get(0).getTaskId());
 }
 
 /*test creating new task name*/
 @Test
 void newTaskNameTest() {
 TaskService service = new TaskService();
 service.newTask(name);
 Assertions.assertNotNull(service.getTaskList().get(0).getName());
 Assertions.assertEquals(name, service.getTaskList().get(0).getName());
 }
 
 /*test creating new task description*/
 @Test
 void newTaskDescriptionTest() {
 TaskService service = new TaskService();
 service.newTask(name, description);
 Assertions.assertNotNull(service.getTaskList().get(0).getDescription());
 Assertions.assertEquals(description,
 service.getTaskList().get(0).getDescription());
 }
 
 /*test that task name is not too long*/
 @Test
 void newTaskTooLongNameTest() {
 TaskService service = new TaskService();
 Assertions.assertThrows(IllegalArgumentException.class,
 () -> service.newTask(tooLongName));
 }
 
 /*test that task description is not too long*/
 @Test
 void newTaskTooLongDescriptionTest() {
 TaskService service = new TaskService();
 assertThrows(IllegalArgumentException.class,
 () -> service.newTask(name, tooLongDescription));
 }
 
 /*test that task name is not null*/
 @Test
 void newTaskNameNullTest() {
 TaskService service = new TaskService();
 assertThrows(IllegalArgumentException.class, () -> service.newTask(null));
 }
 
 /*test that task description is not null*/
 @Test
 void newTaskDescriptionNullTest() {
 TaskService service = new TaskService();
 assertThrows(IllegalArgumentException.class,
 () -> service.newTask(name, null));
 }
 
 /*test ability to delete task*/
 @Test
 void deleteTaskTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 assertEquals(1, service.getTaskList().size());
 service.deleteTask(service.getTaskList().get(0).getTaskId());
 assertEquals(0, service.getTaskList().size());
 }
 
 /*exception thrown if task is not found to delete*/
 @Test
 void deleteTaskNotFoundTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 assertEquals(1, service.getTaskList().size());
 assertThrows(Exception.class, () -> service.deleteTask(id));
 assertEquals(1, service.getTaskList().size());
 }
 
 /*test ability to update task name*/
 @Test
 void updateNameTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 service.updateName(service.getTaskList().get(0).getTaskId(), name);
 assertEquals(name, service.getTaskList().get(0).getName());
 }
 
 /*test ability to update task description*/
 @Test
 void updateDescriptionTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 service.updateDescription(service.getTaskList().get(0).getTaskId(),
 description);
 assertEquals(description, service.getTaskList().get(0).getDescription());
 }
 
 /*exception thrown if task name is not found to update*/
 @Test
 void updateNameNotFoundTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 assertThrows(Exception.class, () -> service.updateName(id, name));
 }
 
 /*exception thrown if task description is not found to update*/
 @Test
 void updateDescriptionNotFoundTest() throws Exception {
 TaskService service = new TaskService();
 service.newTask();
 assertThrows(Exception.class,
 () -> service.updateDescription(id, description));
 }
 
 /*test task ID generation & assignment to list*/
 @RepeatedTest(4)
 void UuidTest() {
	 TaskService service = new TaskService();
	 service.newTask();
	 service.newTask();
	 service.newTask();
	 assertEquals(3, service.getTaskList().size());
	 assertNotEquals(service.getTaskList().get(0).getTaskId(),
	 service.getTaskList().get(1).getTaskId());
	 assertNotEquals(service.getTaskList().get(0).getTaskId(),
	 service.getTaskList().get(2).getTaskId());
	 assertNotEquals(service.getTaskList().get(1).getTaskId(),
	 service.getTaskList().get(2).getTaskId());
	 }
	}