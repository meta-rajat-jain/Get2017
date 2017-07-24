import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rajat Jain
 * @date 20 july 2017
 */
/**
 * The Class Assignment1.
 */
public class Assignment2 implements Comparable<Assignment2> {

	/** The sc. */
	Scanner sc = new Scanner(System.in);

	/** The lines. */
	protected static List<String> lines;

	/** The question. */

	/** The question type. */
	String[] questionType;
	String str;

	public Assignment2(String str) {
		this.str = str;
	}

	/**
	 * Read text file by lines.
	 *
	 * @param fileName
	 *            the file name
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static List<String> readTextFileByLines(String fileName)
			throws IOException {
		lines = Files.readAllLines(Paths.get(fileName));
		return lines;
	}

	/** The single select. */
	static int[] singleSelect = new int[10];

	/** The multi select. */
	static String[] multiSelect = new String[10];

	/** The feedback. */
	static String[] feedback = new String[10];

	/** The contact number. */
	static String[] contactNumber = new String[10];

	/** The name. */
	static String[] name = new String[10];

	/** The count. */
	int id, count = 0;

	/**
	 * Read questions.
	 *
	 * @param lines
	 *            the lines
	 */
	int index = 0;

	public void readQuestions(List<String> lines) {
		for (String x : lines) {
			readQuestion(index, x);
		}
		index++;
	}

	/**
	 * Read question.
	 *
	 * @param index
	 *            the index
	 * @param str
	 *            the str
	 */
	public void readQuestion(int index, String str) {

		id = index;
		questionType = str.split(",");
		System.out.print(questionType[0]);

		if (questionType[1].equals(" Single Select")) {
			System.out.print(questionType[2]);
			while (!(sc.hasNext("[1]") || sc.hasNext("[2]")
					|| sc.hasNext("[3]") || sc.hasNext("[4]") || sc
						.hasNext("[5]"))) {
				System.out.print("Please enter correct value");
				sc.next();
			}
			int x = sc.nextInt();
			singleSelect[x] = singleSelect[x] + 1;
		} else if (questionType[1].equals(" Multi Select")) {
			System.out.print(questionType[2]);

			multiSelect[id] += sc.next();
		} else if (questionType[1].equals("Text")) {
			feedback[id] += sc.next();
		} else if (questionType[1].equals(" Number")) {
			contactNumber[id] = sc.next();
		} else if (questionType[1].equals(" Text")) {
			name[id] += sc.next();
		}

	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<String> question = Assignment1
				.readTextFileByLines("./question.txt");
		System.out.println("enter no. of users ");
		int numUsers = sc.nextInt();
		Iterator itr = question.iterator();
		Assignment1 object = new Assignment1();
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
				"./output.txt"), true));
		for (int index = 0; index < numUsers; index++) {
			object.readQuestions(question);
			writer.newLine();
		}
		writer.write("Participant's answer ");
		float result = 0;
		for (int index = 1; index < 6; index++) {

			result = (singleSelect[index] / (float) numUsers) * 100;
			String resultString = "Overall Rating Percentage OF OPTION "
					+ (index) + "IS " + result + "%";
			System.out.println("Overall Rating Percentage OF OPTION " + (index)
					+ "IS " + result + "%");

			writer.write(resultString + "\n" + " ");
			writer.newLine();
		}
		for (int i = 0; i < numUsers; i++) {
			writer.write("mulitselect " + multiSelect[i] + "\n" + "  ");
			writer.newLine();
			writer.write("feedback " + feedback[i] + "\n" + "  ");
			writer.newLine();
			writer.write("contactNumber " + contactNumber[i] + "\n" + "  ");
			writer.newLine();
			writer.write("name " + name[i] + "\n" + "  ");
			writer.newLine();
		}

		String[] questionTyp;
		List<Assignment2> question2 = new ArrayList<Assignment2>();
		for (String x : question) {
			int index = 0;
			index++;
			questionTyp = x.split(",");
			question2.add(new Assignment2(questionTyp[0]));
		}
		Iterator<Assignment2> itr1 = question2.iterator();
		Collections.sort(question2);
		while (itr.hasNext()) {
			System.out.println(itr1.next());

		}
		writer.close();
	}

	@Override
	public int compareTo(Assignment2 o) {
		String str1 = str;
		String str2 = o.str;
		return str1.compareTo(str2);

	}
}