package com.metacube.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.metacube.stacks.StackClass;

/*
 * Class containing the testcases to test the functionality defined in the class Stack.
 */
public class StackTest {
	StackClass<Integer> integerStack;
	StackClass<String> stringStack;
	StackClass<String> linkedList;
	
	@Before
	public void setUp(){
		integerStack=new StackClass<Integer>();
		stringStack=new StackClass<String>();
		linkedList = new StackClass<String>();
	}
	
	
	@Test
	public void testPush(){
		integerStack.push(10);
		integerStack.push(20);
		Assert.assertEquals((Integer)20, (Integer)integerStack.peek());
		Assert.assertEquals(2, integerStack.getSize());
		
		stringStack.push("abc");
		stringStack.push("def");
		Assert.assertEquals((String)"def", (String)stringStack.peek());
		Assert.assertEquals(2, stringStack.getSize());
	}
	
	@Test
	public void testPopWithElementsInStack(){
		integerStack.push(10);
		integerStack.push(20);
		Assert.assertEquals((Integer)20, (Integer)integerStack.pop());
		Assert.assertEquals(1, integerStack.getSize());
		
		stringStack.push("abc");
		stringStack.push("def");
		Assert.assertEquals((String)"def", (String)stringStack.pop());
		Assert.assertEquals(1, stringStack.getSize());
	}
	
	@Test
	public void testPopWhenStackEmpty(){
		Assert.assertEquals(null, (Integer)integerStack.pop());
		Assert.assertEquals(null, (String)stringStack.pop());
		
	}
	
	@Test
	public void testPeekWithElementsInStack(){
		integerStack.push(10);
		integerStack.push(20);
		Assert.assertEquals((Integer)20, (Integer)integerStack.peek());
		Assert.assertEquals(2, integerStack.getSize());
		
		stringStack.push("abc");
		stringStack.push("def");
		Assert.assertEquals((String)"def", (String)stringStack.peek());
		Assert.assertEquals(2, stringStack.getSize());
	}
	
	@Test
	public void testPeekWhenStackEmpty(){
		Assert.assertEquals(null, (Integer)integerStack.peek());
		Assert.assertEquals(null, (String)stringStack.peek());
	}
	
	@Test
	public void testStackSizeWithElementsInStack(){
		integerStack.push(10);
		integerStack.push(20);
		Assert.assertEquals(2, integerStack.getSize());
		
		stringStack.push("abc");
		stringStack.push("def");
		Assert.assertEquals(2, stringStack.getSize());
	}
	
	@Test
	public void testStackSizeWithStackEmpty(){
		Assert.assertEquals(0, integerStack.getSize());
		Assert.assertEquals(0, stringStack.getSize());
	}
	@Test
	public void testValidDigitsInfixToPostfixConversion(){
		String actual=linkedList.convertInfixToPostfix("1234+(12^13)+15*(6%9)");
		String expected="12341213^+1569%*+";
		assertEquals(expected, actual);
	}
	
	
	//test cases for valid input in characters form.
	@Test
	public void testValidCharacterInInfixToPostFixConversion(){
		String actual=linkedList.convertInfixToPostfix("(a+b*c^d-e)^(f+g*h)-i");
		String expected="abcd^*+e-fgh*+^i-";
		assertEquals(expected, actual);
	}
	
	
}
