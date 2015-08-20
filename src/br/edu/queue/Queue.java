package br.edu.queue;

import br.edu.common.Node;

public class Queue<E> {

	private int size;
	private Node<E> first;
	private Node<E> last;

	public Queue() {
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

	public void enqueue(E element) {
		if (isEmpty()) {
			last = new Node<E>(element, null);
			first = last;
			first.setNext(last);
		} else {
			last.setNext(new Node<E>(element, null));
			last = last.getNext();
		}
		size++;
	}

	public E dequeue() {
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
