/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Concordance
 */
package com.metacube.concordance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class Concordance.
 */
public class Concordance {

	/** The concordance list. */
	Map<Character,List<Integer>> concordanceList = new HashMap<>();
	
	/** The get index. */
	List<Integer> getIndex ;
		
	/**
	 * Gets the concordance.
	 *
	 * @param input the input
	 * @return the concordance
	 */
	public Map<Character,List<Integer>> getConcordance(String input){
		input.trim();
		input = input.replaceAll("\\s","");
		input = input.toLowerCase();
		System.out.println(input);
		for(int index = 0 ; index < input.length() ; index++){
			if(concordanceList.containsKey(input.charAt(index))){
				System.out.println(input.charAt(index));
			getIndex = new ArrayList<Integer>();		
			getIndex = concordanceList.get(input.charAt(index));
			getIndex.add(index + 1);
			concordanceList.put(input.charAt(index), getIndex);
			}
			else{
				System.out.println(input.charAt(index));
				  getIndex = new ArrayList<>();
		            getIndex.add(index + 1);
		            concordanceList.put(input.charAt(index), getIndex);
			}
			
		}
		return concordanceList;
		
	}
	
	
	
}
