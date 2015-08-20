package br.edu.dequeue;

import br.edu.common.Node;

public class Deque<E> {

	private int size;
	private Node<E> first;
	private Node<E> last;

	public Deque() {
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E getFirst() {
		if (isEmpty()) {
			return null;
		} else {
			return first.getElement();
		}
	}

	public E getLast() {
		if (isEmpty()) {
			return null;
		} else {
			return last.getElement();
		}
	}

	private void initialize(E element) {
		last = new Node<E>(element, null);
		first = last;
		first.setNext(last);
	}

	public void enqueueFirst(E element) {
		if (isEmpty()) {
			initialize(element);
		} else {
			first = new Node<E>(element, first);
		}
		size++;
	}

	public void enqueueLast(E element) {
		if (isEmpty()) {
			initialize(element);
		} else {
			last.setNext(new Node<E>(element, null));
			last = last.getNext();
		}
		size++;
	}

	public E dequeueFirst() {
		if (isEmpty()) {
			return null;
		} else {
			E temp = first.getElement();
			first = first.getNext();
			size--;
			return temp;
		}
	}

	public E dequeueLast() {
		if (isEmpty()) {
			return null;
		} else {
			E temp = first.getElement();
			first = first.getNext();
			size--;
			return temp;
		}
	}
}
