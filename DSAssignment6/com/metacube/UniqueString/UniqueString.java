/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.UniqueString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.lang.*;
/**
 * The Class UniqueString.
 */
public class UniqueString {

	/** The result map. */
	Map<String,Integer> resultMap = new HashMap<>();

	/**
	 * Gets the unique elements.
	 *
	 * @param input the input
	 * @return the unique elements
	 */
	public String getUniqueElements(String input1){
		String result ="";
		input1 = input1.trim();
		input1 = input1.toLowerCase();
		if(resultMap.containsKey(input1)){
			result += "Using result in cache :";
			return result + resultMap.get(input1);
		}
		else{
			try{
			char[] charArray = new char[26];
			int[] numArray = new int[10];
			char ch;
			int count=0;
			char[] input = input1.toCharArray();
			for(int index = 0 ; index < input.length ; index++) {
				ch = input[index];
				if(Character.isDigit(ch)){
					if(numArray[ch-'0'] == 0){
						count++;
						numArray[ch-'0']++;
					}
				}
				else if(charArray [ch-'a']==0){
					count++;
					charArray [ch-'a']++;
				}
			}
			result += "Computing result :";
			resultMap.put(input1, count);
			return result + count;
		}catch(Exception e){
			return "Not a valid String as Use of special operator are not allowed" ;
		}
		}
	}

	
	

}
