import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 18 july 2017 Assignment 4's Assignment 2 to Generate permutations.
 */

public class Permutation {

	/**
	 * @param input
	 *            the input String
	 * @return the list of possible permutations
	 */
	public static List<String> generatePermutations(String input) {
		// System.out.print(" input " + input);
		if (input.length() == 1) {
			List<String> base = new ArrayList<String>();
			base.add(input);
			return base;
		}
		List<String> permutation = new ArrayList<String>();
		/*
		 * for index = 0
		 */
		for (int index = 0; index < input.length(); index++) {
			/*
			 * Here first all the possible combination of index 0 element is
			 * generated then index 1 and so on
			 * 
			 * for index = 0 {for abc} generatePermutations(input.subString(0,0)
			 * + input.subString(1,3); since in subString Method endIndex is not
			 * inclusive hence subString(0,0) will return nothing and
			 * subString(1,3) will return the string from 1st index to 2nd
			 * index. so it will call generatePermutations("BC"), for bc {index
			 * =0} Since it is recursice call it will call
			 * generatePermutations((0,0) and (0,1) which will then finally be
			 * added to the list by if condition.Hence we have c added to
			 * permute.
			 * 
			 * after this is will add b to the list by 2nd for loop; then for bc
			 * { index =1} same procedure will be repeated but this time b will
			 * be returned to the list and c is added and hence we have cb
			 * 
			 * therefore we have BC and CB which are returned and as soon they
			 * are returned A is added to them we have ABC,ACB then procedure is
			 * repated for index =1 {for ABC} and all the possible combinations
			 * are genrated.
			 */
			List<String> permute = generatePermutations(input.substring(0,
					index) + input.substring(index + 1, input.length()));

			for (int j = 0; j < permute.size(); j++) {
				permutation.add(input.charAt(index) + permute.get(j));
			}
		}
		Set<String> res = new HashSet<String>(permutation);
		List<String> result = new ArrayList<String>(res);
		return result;
	}
	
}