package main.com.java.jairoalfaro.stack;

import main.com.java.jairoalfaro.linkedlist.LinkedList;

// A Last In First Out (LIFO) collection implemented as a linked list.
public class Stack<T> {

	private LinkedList<T> list = new LinkedList<T>();

	// Adds the specified item to the stack
	public void push(T item) {
		list.addFirst(item);
	}

	// Removes and returns the top item from the stack
	public T pop() {
		if (list.getCount() == 0) {
			throw new IllegalStateException("The stack is empty");
		}

		T value = list.getFirst();
		list.removeFirst();

		return value;
	}

	// Returns the top item from the stack without removing it from the stack
	public T peek() {
		if (list.getCount() == 0) {
			throw new IllegalStateException("The stack is empty");
		}

		return list.getFirst();
	}

	public void clear() {
		list.clear();
	}

	public int getCount() {
		return list.getCount();
	}
}
