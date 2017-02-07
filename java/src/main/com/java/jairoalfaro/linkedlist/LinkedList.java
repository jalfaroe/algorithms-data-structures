package main.com.java.jairoalfaro.linkedlist;

public class LinkedList<T> {

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

		count++;

		if (count == 1) {
			tail = head;
		}
	}

	public void addLast(T value) {
		Node<T> node = new Node<T>(value);

		if (count == 0) {
			head = node;
		} else {
			tail.setNext(node);
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
			}
		}
	}

	public void removeLast() {
		if (count != 0) {
			if (count == 1) {
				head = null;
				tail = null;
			} else {
				Node<T> current = head;
				while (current.getNext() != tail) {
					current = current.getNext();
				}

				current.setNext(null);
				tail = current;
			}

			count--;
		}
	}

	public void remove(T value) {
		Node<T> previous = null;
		Node<T> current = head;

		while (current != null) {
			if (current.getValue().equals(value)) {
				// Remove First
				if (previous == null) {
					head = current.getNext();

					if (head.getNext() == null) {
						tail = null;
					}
				}
				// it's a node in the middle or end
				else {
					previous.setNext(current.getNext());

					// it was the end - so update Tail
					if (current.getNext() == null) {
						tail = previous;
					}
				}

				count--;
			} else {
				previous = current;
			}

			current = current.getNext();
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

	public void printList() {

		Node<T> node = head;

		while (node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
	}
}