package com.metacube.stacks;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Stack
 */
/**
 * The Class StackClass.
 *
 * @param <E>
 *            the element type
 */
public class StackClass<E> {

	/** The node. */
	Node<E> head = null, node;

	/** The size. */
	private int size = 0;

	/**
	 * Instantiates a new stack class.
	 */
	public StackClass() {
		node = new Node<E>();
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Push.
	 *
	 * @param data
	 *            the data
	 */
	public void push(E data) {
		Node<E> newNode = node.getNode(data);
		newNode.previous = this.head;
		this.head = newNode;
		size++;
	}

	/**
	 * Pop.
	 *
	 * @return the e
	 */
	public E pop() {
		E val = null;
		if (head != null) {
			val = head.data;
			head = head.previous;
			size--;
		}
		return val;
	}

	/**
	 * Peek.
	 *
	 * @return the e
	 */
	public E peek() {
		E val = null;
		if (head != null) {
			val = head.data;
		}
		return val;
	}

	/**
	 * Convert infix to postfix.
	 *
	 * @param <E>
	 *            the element type
	 * @param input
	 *            the input
	 * @return the string
	 */
	@SuppressWarnings({ "unchecked", "hiding" })
	public <E> String convertInfixToPostfix(String input) {
		StackClass<E> stack = new StackClass<E>();
		String output = "";
		input = input.replace(" ", "");
		for (int index = 0; index < input.length(); index++) {

			if (Character.isLetterOrDigit(input.charAt(index))) {
				output += input.charAt(index);
			} else if (input.charAt(index) == '(') {
				stack.push((E) String.valueOf(input.charAt(index)));
			} else if (input.charAt(index) == ')') {
				while ((stack.getSize() != 0)
						&& (stack.peek().toString().charAt(0) != '(')) {
					E item = stack.pop();
					output += item.toString();
				}
				if (stack.getSize() != 0
						&& stack.peek().toString().charAt(0) != '(') {
					return "Invalid Expression";
				} else {
					stack.pop();
				}
			} else {
				while (stack.getSize() != 0
						&& (getPrecedence(stack.peek().toString().charAt(0)) >= getPrecedence(input
								.charAt(index)))) {
					E item = stack.pop();
					output += item.toString();
				}
				stack.push((E) String.valueOf(input.charAt(index)));
			}
		}
		while (stack.getSize() != 0) {
			E item = stack.pop();
			output += item.toString();
		}
		return output;
	}

	/**
	 * Gets the precedence.
	 *
	 * @param ch
	 *            the ch
	 * @return the precedence
	 */
	public static int getPrecedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
		case '%':
			return 3;
		}
		return -1;
	}
}
