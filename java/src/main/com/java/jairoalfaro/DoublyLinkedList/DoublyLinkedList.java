package main.com.java.jairoalfaro.DoublyLinkedList;

import main.com.java.jairoalfaro.DoublyLinkedList.Node;

public class DoublyLinkedList<T> {
	private Node<T> head;

	private Node<T> tail;

	private int count;

	public int getCount() {
		return this.count;
	}

	public void add(T value) {
		addFirst(value);
	}

	public void addFirst(T value) {
		Node<T> node = new Node<T>(value);

		Node<T> temp = head;

		// Point head to the new node
		head = node;

		// Insert the rest of the list behind the head
		head.setNext(temp);

		if (count == 0) {
			// if the list was empty then Head and Tail should
			// both point to the new node.
			tail = head;
		} else {
			// temp.Previous was null, now Head
			temp.setPrevious(head);
		}

		count++;
	}

	public void addLast(T value) {
		Node<T> node = new Node<T>(value);

		if (count == 0) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		count++;
	}

	public void removeFirst() {
		if (count != 0) {
			head = head.getNext();

			count--;

			if (count == 0) {
				tail = null;
			} else {
				head.setPrevious(null);
			}
		}
	}

	public void removeLast() {
		if (count != 0) {
			if (count == 1) {
				head = null;
				tail = null;
			} else {
				tail.getPrevious().setNext(null);
				tail = tail.getPrevious();
			}

			count--;
		}
	}

	public boolean contains(T value) {
		Node<T> current = head;

		while (current != null) {
			if (current.getValue().equals(value)) {
				return true;
			}

			current = current.getNext();
		}

		return false;
	}

	public void clear() {
		head = null;
		tail = null;
		count = 0;
	}
}
