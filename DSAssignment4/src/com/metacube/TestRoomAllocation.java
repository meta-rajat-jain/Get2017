/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 24-August-2017
 * @project Test for Room Allotment using Hash Table
 * 
 */

package com.metacube.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.roomallotment.Guest;
import com.metacube.roomallotment.MyHashTable;


/**
 * The Class TestRoomAllocation.
 */
public class TestRoomAllocation {

	/** The hashtable. */
	static MyHashTable<Integer,Guest> hashtable = new MyHashTable<Integer,Guest>();
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Guest guest1 = new Guest();
		guest1.setName("rajat");
		guest1.setAge(23);
		hashtable.insertValue(23, guest1);
		Guest guest2 = new Guest();
		guest2.setName("jain");
		guest2.setAge(23);
		hashtable.insertValue(23,guest2);
	}

	/**
	 * Test hash function.
	 */
	@Test
	public void testHashFunction() {
		int actual = hashtable.hashFunction(23);
		int expected = 10;
		assertEquals(expected,actual);
		actual = hashtable.hashFunction(25);
		expected = 12;
		assertEquals(expected,actual);
	}
	
	/**
	 * Test get value.
	 */
	@Test
	public void testGetValue(){
		Guest guest = hashtable.getValue(23,"rajat");
		int actual = guest.getRoom();
		int expected = 11;
		assertEquals(expected,actual);
		
		guest = hashtable.getValue(23, "jain");
		actual = guest.getRoom();
		expected = 1;
		assertEquals(expected,actual);
	}

}
