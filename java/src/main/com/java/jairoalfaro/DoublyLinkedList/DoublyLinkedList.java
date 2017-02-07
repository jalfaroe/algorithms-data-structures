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

		head = node;
		head.setNext(temp);

		if (count == 0) {
			tail = head;
		} else {
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
