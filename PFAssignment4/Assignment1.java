import java.util.*;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 18 july 2017 Assignment 4's Assignment 1 of Tower Of Hanoi
 */
public class Assignment1 {

	/** The toh. */
	static List<String> toh = new ArrayList<String>();

	/**
	 * Tower of hanoi.
	 *
	 * @param source
	 *            the source
	 * @param destination
	 *            the destination
	 * @param temp
	 *            the temp
	 * @param numOfDisk
	 *            the num of disk
	 * @return the list
	 */
	static List<String> towerOfHanoi(String source, String destination,
			String temp, int numOfDisk) {

		String str = new String();
		if (numOfDisk == 1) {
			str += "Move Disk " + numOfDisk + " From " + source + " to "
					+ destination;
			toh.add(str);
		} else {
			towerOfHanoi(source, temp, destination, numOfDisk - 1);
			str += "Move Disk " + numOfDisk + " From " + source + " to "
					+ destination;
			toh.add(str);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);
		}
		return toh;
	}

}
