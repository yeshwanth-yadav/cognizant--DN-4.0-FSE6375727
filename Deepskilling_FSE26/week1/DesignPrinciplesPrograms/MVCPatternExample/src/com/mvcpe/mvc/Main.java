package com.mvcpe.mvc;

public class Main {
	 public static void main(String[] args) {
	       
	        Student student = new Student("S101", "Yeshwanth", "A");

	       
	        StudentView view = new StudentView();

	   
	        StudentController controller = new StudentController(student, view);

	     
	        controller.updateView();

	        controller.setStudentName("Yeshwanth Yadav");
	        controller.setStudentGrade("A+");

	        controller.updateView();
	    }
}
