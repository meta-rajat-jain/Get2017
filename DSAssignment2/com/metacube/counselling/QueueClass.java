package com.metacube.counselling;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Counselling Process Through Queue
 */
/**
 * The Class QueueClass.
 */
public class QueueClass {

	/** The queue. */
	Object queue[];

	/** The rear. */
	int MAX = 10, size = 0, front = 0, rear = -1;

	/**
	 * Instantiates a new queue class.
	 */
	public QueueClass() {
		queue = new Object[MAX];
	}

	/**
	 * Enqueue.
	 *
	 * @param item
	 *            the item
	 */
	void enqueue(Object item) {
		if (size == MAX) {
			resize(queue);
		} else {
			rear++;
			queue[rear] = item;
			size++;
		}
	}

	/**
	 * Dequeue.
	 *
	 * @return the object
	 */
	public Object dequeue() {
		if (front > rear) {
			front=0;
			rear=-1;
			return -1;
		} else {
			Object element = queue[front++];
			size--;
			return element;
		}
	}

	/**
	 * Make empty.
	 */
	public void makeEmpty() {

		for (int x = front; x <= rear; x++) {
			dequeue();
		}

	}

	/**
	 * Gets the front.
	 *
	 * @return the front
	 */
	public Object getFront() {
		if (front == -1) {
			return -1;
		} else {
			return queue[front];
		}
	}

	/**
	 * Prints the queue.
	 */
	public void printQueue() {
		if (front > (rear) || rear == -1) {
			System.out.println("Every student is allotted the seat");

		} else {
			for (int x = front; x <= rear; x++) {
				System.out.println("Element in queue is" + queue[x].toString());
			}
		}
	}

	/**
	 * Resize.
	 *
	 * @param array
	 *            the array
	 * @return the object[]
	 */
	public Object[] resize(Object[] array) {
		Object[] newArray = new Object[array.length + MAX];
		MAX = MAX + array.length;
		for (int index = 0; index < array.length; index++) {
			newArray[index] = array[index];
		}
		return newArray;
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		QueueClass que = new QueueClass();
		que.enqueue(5);
		que.enqueue(6);
		que.enqueue(7);
		que.enqueue(8);
		que.enqueue(9);
		que.enqueue(10);
		que.printQueue();
		System.out.println("dequed elemenr is" + que.dequeue());
		System.out.println("dequed elemenr is" + que.dequeue());
		System.out.println("dequed elemenr is" + que.dequeue());
		que.printQueue();
		System.out.println("getfront: " + que.getFront());
		System.out.println("dequed elemenr is" + que.dequeue());
		que.makeEmpty();

		que.printQueue();

	}
}
