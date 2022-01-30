package task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import task.Task

/*generate task ID*/

 public class TaskService {
 public List<Task> taskList = new ArrayList<>();
 public String newUniqueId() {
 return UUID.randomUUID().toString().substring(
 0, Math.min(toString().length(), 10));
 }
 
 	class task1 {
 		private String callPatientTaskId;
		private String callPatientTaskName;
		private String description;
		private String checkCallPatientTaskId;
 
 task1() Task searchForCallPatientTask(String callPatientTaskId) throws Exception {
 int index = 0;
 while (index < taskList.size()) {
 if (callPatientTaskId.equals(taskList.get(index).getCallPatientTaskId())) {
 return taskList.get(index);
 }
 index++;
 }
 throw new Exception("The task does not exist!");
 }
 
 /*create new task*/
 newCallPatientTask() {
 task1 task = new CallPatientTask(newUniqueId());
 taskList.add(task);
 }
 
 /*add task name to new task*/
 
 public void newTask(String callPatientTaskName) {
 Task task = new Task(newUniqueId(), callPatientTaskName);
 taskList.add(task);
 }
 
 /*add task description to new task*/
 
 public void newTask(String name, String description) {
 Task task = new Task(newUniqueId(), name, description);
 taskList.add(task);
 }
 
 /*ability to delete task with task ID*/
 
 public void deleteTask(String id) throws Exception {
 taskList.remove(searchForTask(id));
 }
 
 /*ability to update task name with task ID*/
 
 public void updateName(String id, String name) throws Exception {
 searchForTask(id).setName(name);
 }
 
 /*ability to update task description with task ID*/
 
 public void updateDescription(String id, String description)
 throws Exception {
 searchForTask(id).setDescription(description);
 }
 	}
 	
 public List<Task> getTaskList() { return taskList; }
}
