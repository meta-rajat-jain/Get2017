/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Concordance
 */
package com.metacube.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.metacube.concordance.Concordance;

/**
 * The Class ConcordanceTest.
 */
public class ConcordanceTest {
	
	/** The concordance. */
	static Map<Character,List<Integer>> concordance;
	
	/** The concord. */
	static Concordance concord;
	
	/**
	 * Sets the up.
	 */
	@Before
	public  void setUp(){
		concord = new Concordance();
		concordance = new HashMap<>();
	}
	
	
	/**
	 * Test concordance positive.
	 */
	@Test
	public final void testConcordancePositive() {
		String input = "Hello World";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[8], d=[10], e=[2], w=[6], h=[1], l=[3, 4, 9], o=[5, 7]}";
		assertEquals(actual,expected);
	}
	
	/**
	 * Test concordance negative.
	 */
	@Test
	public final void testConcordanceNegative() {
		String input = "Hello World";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[7], d=[10], e=[2], w=[6], h=[1], l=[3, 4, 9], o=[5, 7]}";
		assertFalse(actual == expected);
	}
	
	/**
	 * Test concordance positive different case.
	 */
	@Test
	public final void testConcordancePositiveDifferentCase() {
		String input = "HeLlo WOrld";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[8], d=[10], e=[2], w=[6], h=[1], l=[3, 4, 9], o=[5, 7]}";
		assertEquals(actual,expected);
	}
	
	/**
	 * Test concordance negative different case.
	 */
	@Test
	public final void testConcordanceNegativeDifferentCase() {
		String input = "HeLlo WOrld";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[8], d=[10], e=[2], w=[6], h=[1], l=[4, 9], o=[5, 7]}";
		assertFalse(actual == expected);
	}
	
	/**
	 * Test concordance positive with space.
	 */
	@Test
	public final void testConcordancePositiveWithSpace() {
		String input = "HeLlo              WOrld";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[8], d=[10], e=[2], w=[6], h=[1], l=[3, 4, 9], o=[5, 7]}";
		assertEquals(actual,expected);
	} 
	
	/**
	 * Test concordance negative with space.
	 */
	@Test
	public final void testConcordanceNegativeWithSpace() {
		String input = "HeLlo              WOrld";
		concordance = concord.getConcordance(input);
		String actual= concordance.toString();
		String expected = "{r=[8], d=[10], e=[2], w=[6], h=[1], l=[3, 4, 9], o=[5, 7] =[]}";
		assertFalse(actual == expected);
	} 
}
