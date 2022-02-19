/**
 * 
 */
/**
 * @author abby.farnswor_snhu
 * May 30 2021
 * CS320
 * task service program
 */
package task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*generate task ID*/

public class TaskService {
 private final List<Task> taskList = new ArrayList<>();
 private String newUniqueId() {
 return UUID.randomUUID().toString().substring(
 0, Math.min(toString().length(), 10));
 }
 private Task searchForTask(String id) throws Exception {
 int index = 0;
 while (index < taskList.size()) {
 if (id.equals(taskList.get(index).getTaskId())) {
 return taskList.get(index);
 }
 index++;
 }
 throw new Exception("The Task does not exist!");
 }
 public void newTask() {
 Task task = new Task(newUniqueId());
 taskList.add(task);
 }
 /*add task name to new task*/
 
 public void newTask(String name) {
 Task task = new Task(newUniqueId(), name);
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
 
 public List<Task> getTaskList() { return taskList; }
}
