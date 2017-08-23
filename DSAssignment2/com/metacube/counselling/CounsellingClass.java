package com.metacube.counselling;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Counselling Process Through Queue
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The Class CounsellingClass.
 */
public class CounsellingClass {

	/** The candidate queue. */
	QueueClass candidateQueue;

	/** The colleges. */
	int colleges[];

	/** The rank. */
	int rank[];

	/** The student objects. */
	Student studentObjects;

	/** The col. */
	Colleges col;

	/** The colg. */
	public static Map<Integer, Colleges> colg = new HashMap<>();

	/** The student. */
	public Map<Integer, Student> student;

	/** The result map. */
	public Map<String, Student> resultMap = new HashMap<>();

	/** The rank colg. */
	int rankColg[];

	/**
	 * Instantiates a new counselling class.
	 */
	public CounsellingClass() {
		candidateQueue = new QueueClass();
		colleges = new int[5];
		studentObjects = new Student();
		student = studentObjects.getDetails();
		rank = new int[student.size()];
		col = new Colleges();
	}

	/**
	 * Creates the candidate queue.
	 */
	public void createCandidateQueue() {
		int i = 0;
		Set<Integer> ranks = student.keySet();
		for (Integer id : ranks) {
			rank[i] = student.get(id).getRank();
			i++;
		}
		Arrays.sort(rank);
		for (int j = 0; j < rank.length; j++) {
			candidateQueue.enqueue(student.get(rank[j]));
		}
	}

	/**
	 * Admission procedure.
	 */
	public void admissionProcedure() {
		for (int i = 0; i < rank.length; i++) {
			getAdmission();
		}
	}

	/**
	 * Gets the admission.
	 *
	 * @return the admission
	 */
	private void getAdmission() {
		colg = col.getCollegeDetail();
		Object ss = candidateQueue.getFront();

		int choiceArray[] = ((Student) ss).getChoice();

		for (int i = 0; i < 5; i++) {
			int collegeChoice = choiceArray[i];
			Colleges cl = colg.get(collegeChoice);
			if (cl.seats != 0) {
				resultMap.put(cl.getName() + "," + ((Student) ss).getName(),
						(Student) ss);
				candidateQueue.dequeue();
				cl.seats--;
				break;
			}
		}
	}

	/**
	 * Prints the result.
	 */
	public void printResult() {
		Set<String> result = resultMap.keySet();
		for (String id : result) {
			String[] collegeId = id.split(",");
			System.out.println("Result is :" + "college name = " + collegeId[0]
					+ "   Name =" + resultMap.get(id).getName());

		}
		candidateQueue.printQueue();
	}

}
