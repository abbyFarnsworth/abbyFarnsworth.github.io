## Abby Farnsworth
## My ePortfolio

Southern New Hampshire University, Class of 2022

### Coursework






#Software Design & Engineering

This artifact was my final project for CS320 Software Testing, Automation, & Quality Assurance. The project was to create a program written in Java that managed patient, appointment, and employee task information for a doctor’s office. Each of these categories had two code modules written for them, one module to establish the primary aspects of that part of the program, and a service module created to allow the user to perform CRUD functions. JUnit tests were written for each part of the program to ensure quality.

I picked this artifact to go in my ePortfolio so that I could show my experience in software engineering and design. I also wanted to revisit the program because I had some ideas on how it could be expanded. I actually didn’t know going into this how to implement some of my new ideas, but that was all the more reason to do it. I tried to approach the redesign of this program as if I were an employee at this doctor’s office, and I thought about what kind of functionality I would want the system to have.

Some of the improvements were minor. I renamed the Contact Modules to Patient and Patient Service, so that is clearer that those blocks of code are using for managing patient information. Contact is too generic a name. I made a small expansion to the Appointment module, so appointments can be created with a unique ID, the date, the patient’s ID, and a description. I added comments wherever they were lacking, and I added more space between lines of code. I used to keep all lines of code very close together. That is not a programming best practice, because it makes the code harder to read. I also added two new fields to the Patient information class, prescriptions and allergies, to show how the program can be expanded to be more comprehensive, like a real medical program would be (code snippet below). You could keep going and add the patient’s DOB, health insurance information, pharmacy, and so on.

![image](https://user-images.githubusercontent.com/86175837/154808919-1674e535-ae86-44d1-92bc-7b1fd54b7d41.png)

The biggest improvement, and the one I am most proud of, was the expansion of the Task module, used to manage employee tasks. The original Task module only had one task bucket, which meant that every single employee task was labeled generically. I wanted to create different tasks so that when the employees are notified that they have a task to complete, they can immediately see what they need to do. This involved doing something I have never done before—nesting classes. I came up with three tasks that would likely be part of the daily routine at a doctor’s office—place call to patient, retrieve lab results, and send out appointment reminder—and created a class for each of them within the main Task class (code snippet below).

![image](https://user-images.githubusercontent.com/86175837/154809253-828a4b6f-0c6e-4ab0-a553-23ed6c8d77d2.png)
 
This program required a JUnit test to be created for each of the code modules, so there are 6 test programs. The tests are meant to check every function of the code. For example, the Patient Test verifies that the patient ID, first name, last name, phone number, address, prescriptions, and allergies information all fit within the character limit. Phone number is checked for both too many and too few digits. Furthermore, each field is checked to see if it can be pulled from the patient list and if it can be updated (snippet of JUnit test below). 

![image](https://user-images.githubusercontent.com/86175837/154809309-b7c19c0a-52d3-41bb-9337-cd688985f239.png)

I think that this enhancement shows a lot of work concerning data structures and algorithms. The primary data structure used in these modules is a list. We use lists to keep elements in order, and we can easily insert, update, delete, and search the elements. Lists are a good idea when data remains relatively static, which works for a doctor’s office where the same fields are going to be needed over and over. The JUnit tests are used to test the behavior of the methods inside the classes. They are valuable not just because they can find mistakes, but also because they reveal whether or not the method is able to appropriately handle exceptions, reducing the likelihood of a buggy program. 

# code detail for nested classes
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
#Algorithms and Data Structure

This artifact is similar to a presentation I did in October 2021 for CS405 Secure Coding. The presentation involves a description of security policies and secure coding practices that a software development company might follow. I did my original presentation on C++ coding practices, so I did Java this time to expand my horizons a little.
I chose to include this artifact for two primary reasons. The first is because I want to work in Cybersecurity, and this project shows that I have a security mindset. I can determine if there are potential vulnerabilities in software architecture and design. I can write comprehensive security policies, and come up with ideas to ensure the privacy and security of a company’s data and resources. The other reason was to demonstrate skill using algorithms. An algorithm is a fancy word for a set of instructions that solve a problem or accomplish a task. Secure coding is the process of creating code that solves a problem (eliminating security vulnerabilities in your program) and accomplishes a task (creates a safe, effective, functioning piece of software). I think secure coding is a great example of why we create algorithms. 

I reference the SEI Cert Oracle Coding Standard for Java a few times throughout my presentation. The SEI Cert is an entire book of algorithms written to help developers create more secure code. I really like their work and recommend it as a resource because they provide examples of compliant and non-compliant code, assess threat levels of coding issues or errors, and offer suggestions on automated software checking tools.

# example slide on secure coding practices
![image](https://user-images.githubusercontent.com/86175837/154809646-df187da0-f987-4b0d-9764-05e09fd625c4.png)
Link to my YouTube video with the full presentation: https://youtu.be/IOyjVY5J8c8

# example slide on security policies
![image](https://user-images.githubusercontent.com/86175837/154809714-379950bd-e7b3-4204-be0e-cbd51de3510e.png)

#Databases

This artifact is based off a project I did for CS340 Advanced Programming Concepts. That project was to create a Python-driven dashboard that would interface with a NoSQL database. This time, I used a sample database provided by MongoDB and connected it to PyCharm. I didn’t build a dashboard since that requires using HTML, and it is still beyond my skill scope at this time. Instead, I wrote a program that would interface with the database. 

The MongoDB database, called a cluster, is hosted online. You can view it through the website and connect to it through PyCharm. The database MongoDB provided offered listings and reviews for Airbnbs. Below is a snippet of the information that a single entry provides: 

The program was then written in PyCharm to mimic the structure of these entries. Here is a piece of the program that creates new listings:

![image](https://user-images.githubusercontent.com/86175837/154809536-8e2c22b7-a0ba-460c-a461-4a760785e401.png)

You can also update listing fields by searching the listing ID:

![image](https://user-images.githubusercontent.com/86175837/154809582-9a9c751b-7244-4863-9c32-0f14780940be.png)

It will also search entries for you and pull out the information you want to view. If a field is set to 1, the information will pull, and if it is set to 0, you can skip viewing that field.

![image](https://user-images.githubusercontent.com/86175837/154809475-326e51f1-ddd3-4c08-8dac-4dc6809fb66f.png)

I hope including this artifact shows that I am not afraid to expand my skills, learn new systems, and attempt challenging projects. My purpose here is to demonstrate that I can create solutions that deliver value and meet goals. I believe employers are looking for people who can experiment with innovative new techniques and tools. In my experience, the willingness to learn--if that means sitting through hours of online tutorials or scouring the Internet for helpful articles--will take you far.
