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
/**
 * The Class JoinArrayList.
 *
 * @param <E> the element type
 */
public class JoinArrayList<E> extends MyArrayList<E> {

/**
 * Join two array list.
 *
 * @param list1 the list 1
 * @param list2 the list 2
 */
public void joinTwoArrayList(MyArrayList<E> list1, MyArrayList<E> list2) {
int size = list2.getSize();
for (int index = 0; index < size; index++) {
list1.addElement(list2.getElementByPosition(index));
}
}

}