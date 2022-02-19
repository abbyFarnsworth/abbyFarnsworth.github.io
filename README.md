## Abby Farnsworth's ePortfolio

Southern New Hampshire University, Class of 2022

### Coursework






#Software Design & Engineering

This artifact was my final project for CS320 Software Testing, Automation, & Quality Assurance. The project was to create a program written in Java that managed patient, appointment, and employee task information for a doctor’s office. Each of these categories had two code modules written for them, one module to establish the primary aspects of that part of the program, and a service module created to allow the user to perform CRUD functions. JUnit tests were written for each part of the program to ensure quality.

I picked this artifact to go in my ePortfolio so that I could show my experience in software engineering and design. I also wanted to revisit the program because I had some ideas on how it could be expanded. I actually didn’t know going into this how to implement some of my new ideas, but that was all the more reason to do it. I tried to approach the redesign of this program as if I were an employee at this doctor’s office, and I thought about what kind of functionality I would want the system to have.

Some of the improvements were minor. I renamed the Contact Modules to Patient and Patient Service, so that is clearer that those blocks of code are using for managing patient information. Contact is too generic a name. I made a small expansion to the Appointment module, so appointments can be created with a unique ID, the date, the patient’s ID, and a description. I added comments wherever they were lacking, and I added more space between lines of code. I used to keep all lines of code very close together. That is not a programming best practice, because it makes the code harder to read. I also added two new fields to the Patient information class, prescriptions and allergies, to show how the program can be expanded to be more comprehensive, like a real medical program would be (code snippet below). You could keep going and add the patient’s DOB, health insurance information, pharmacy, and so on.
![code snippet 1](https://github.com/abbyFarnsworth/abbyFarnsworth.github.io/blob/main/code%20snippet%201.png)
The biggest improvement, and the one I am most proud of, was the expansion of the Task module, used to manage employee tasks. The original Task module only had one task bucket, which meant that every single employee task was labeled generically. I wanted to create different tasks so that when the employees are notified that they have a task to complete, they can immediately see what they need to do. This involved doing something I have never done before—nesting classes. I came up with three tasks that would likely be part of the daily routine at a doctor’s office—place call to patient, retrieve lab results, and send out appointment reminder—and created a class for each of them within the main Task class (code snippet below).
 
This program required a JUnit test to be created for each of the code modules, so there are 6 test programs. The tests are meant to check every function of the code. For example, the Patient Test verifies that the patient ID, first name, last name, phone number, address, prescriptions, and allergies information all fit within the character limit. Phone number is checked for both too many and too few digits. Furthermore, each field is checked to see if it can be pulled from the patient list and if it can be updated (snippet of JUnit test below). 
 
I think that this enhancement shows a lot of work concerning data structures and algorithms. The primary data structure used in these modules is a list. We use lists to keep elements in order, and we can easily insert, update, delete, and search the elements. Lists are a good idea when data remains relatively static, which works for a doctor’s office where the same fields are going to be needed over and over. The JUnit tests are used to test the behavior of the methods inside the classes. They are valuable not just because they can find mistakes, but also because they reveal whether or not the method is able to appropriately handle exceptions, reducing the likelihood of a buggy program. 

```java
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
```
Algorithms and Data Structure
![screenshot](https://github.com/abbyFarnsworth/abbyFarnsworth.github.io/blob/main/Screenshot%202022-02-18%20175133.png)
https://youtu.be/IOyjVY5J8c8

Databases

