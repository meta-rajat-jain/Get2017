/*
 * 
 */
package com.metacube.arraylist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
import java.util.Arrays;

/**
 * The Class MyArrayList.
 *
 * @param <E> the element type
 */
public class MyArrayList<E> {

	/** The array. */
	Object[] array = null;
	
	/** The max. */
	static int MAX = 5;

	/**
	 * Instantiates a new my array list.
	 */
	public MyArrayList() {
		array = new Object[MAX];
	}

	/**
	 * Adds the element.
	 *
	 * @param element the element
	 */
	public void addElement(E element) {
		if (getSize() == MAX) {
			this.array = resize(this.array);
		} 
			int index = getSize();
			array[index] = element;
	}

	/**
	 * Sets the element.
	 *
	 * @param index the index
	 * @param element the element
	 * @return true, if successful
	 */
	public boolean setElement(int index, E element) {
		
		if(index > getSize()){
			return false;
		}
		 else {
			if (getSize() == MAX) {
				array = resize(array);
			}
			for (int jindex = getSize() - 1; jindex >= index; jindex--) {
				array[jindex+1] = array[jindex];
			}
			array[index] = element;
			return true;
		}
	}

	/**
	 * Resize.
	 *
	 * @param array the array
	 * @return the object[]
	 */
	public Object[] resize(Object[] array) {
		Object[] newArray = new Object[array.length + MAX];
		MAX= MAX + array.length;
		for (int index = 0; index < array.length; index++) {
			newArray[index] = array[index];
		}
		return newArray;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		int index = 0;
		for (index = 0; index < this.array.length; index++) {
			if (array[index] == null) {
				break;
			}
		}
		return index;
	}

	/**
	 * Gets the element.
	 *
	 * @param element the element
	 * @return the element
	 */
	public int getElement(E element) {
		int index;
		for (index = 0; index < getSize(); index++) {
			if ( (array[index]).equals(element) ) {
				return index+1;
			}
		}
		return -1;
	}

	/**
	 * Removes the element from position.
	 *
	 * @param position the position
	 * @return true, if successful
	 */
	public boolean removeElementFromPosition(int position) {
		if(position >= getSize()){
			return false;
		}
		for (int index = position; index < getSize()-1; index++) {
			array[index] = array[index + 1];
		}
		array[getSize() - 1] = null;
		return true;
	}
	
	/**
	 * Removes the element.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public boolean removeElement(E element){
		for(int index = 0;index < getSize() ; index++){
			if ( (array[index]).equals(element) ){
				for(int jindex = index;jindex < getSize()-1 ; jindex++){
					array[jindex] = array[jindex+1];
				}
				array[getSize() - 1] = null;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Clear array list.
	 */
	public void clearArrayList(){
		Object[] newArray = new Object[MAX];
		array = newArray;
	}
	
	/**
	 * Reverse array list.
	 */
	public void reverseArrayList(){
		Object[] newArray = new Object[array.length];
		int jindex = 0;
		for(int index = getSize()-1 ; index >=0  ; index--){
			newArray[jindex++] = array[index];
		}
			this.array = newArray;
	}
	
	/**
	 * Gets the element by position.
	 *
	 * @param position the position
	 * @return the element by position
	 */
	@SuppressWarnings("unchecked")
	public E getElementByPosition(int position){
		return (E)array[position];
	}
	
	/**
	 * Prints the array list.
	 *
	 * @return the object[]
	 */
	public Object[] printArrayList(){
		return this.array;
	}
	
	/**
	 * Sort array list.
	 */
	public void sortArrayList(){
		for(int index = 0; index < getSize() ; index++){
			for(int jindex = index+1; jindex < getSize() ; jindex++){
			if(((Comparable<E>) array[index]).compareTo((E) array[jindex]) > 0) {
			Object temp = array[jindex];
			array[jindex] = array[index];
			array[index] = temp;
			}
			}
			}
	}
}
