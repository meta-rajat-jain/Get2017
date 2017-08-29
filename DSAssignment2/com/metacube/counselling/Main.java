package com.metacube.counselling;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Counselling Process Through Queue
 */
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Colleges college1 = new Colleges("CTAE", 1, 1);
		Colleges college2 = new Colleges("CTE", 1, 2);
		Colleges college3 = new Colleges("CT", 1, 3);
		Colleges college4 = new Colleges("CTA", 0, 4);
		Colleges college5 = new Colleges("TAE", 1, 5);
		Student s = new Student();
		int choice[] = { 1, 2, 3, 4, 5 };
		s.addStudentDetail(choice, "rajat", 1);
		int choice1[] = { 1, 3, 1, 4, 5 };
		s.addStudentDetail(choice1, "raj", 3);
		int choice2[] = { 1, 2, 1, 4, 5 };
		s.addStudentDetail(choice2, "rajt", 2);
		int choice3[] = { 1, 2, 3, 4, 5 };
		s.addStudentDetail(choice3, "raat", 5);
		int choice4[] = { 1, 2, 3, 4, 5 };
		s.addStudentDetail(choice4, "rjat", 4);
		s.getDetails();
		CounsellingClass cc = new CounsellingClass();
		cc.createCandidateQueue();
		cc.admissionProcedure();
		cc.printResult();
	}

}
