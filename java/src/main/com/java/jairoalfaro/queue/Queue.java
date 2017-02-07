package main.com.java.jairoalfaro.queue;

import main.com.java.jairoalfaro.linkedlist.LinkedList;

// A First In First Out collection
public class Queue<T> {
	private LinkedList<T> list = new LinkedList<T>();

	// Adds an item to the back of the queue
	public void enqueue(T item) {
		list.addLast(item);
	}

	// Removes and returns the front item from the queue
	public T dequeue() {
		if (list.getCount() == 0) {
			throw new IllegalStateException("The queue is empty.");
		}

		T value = list.getFirst();

		list.removeFirst();

		return value;
	}

	// Returns the front item from the queue without removing it from the queue
	public T peek() {
		if (list.getCount() == 0) {
			throw new IllegalStateException("The queue is empty.");
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
