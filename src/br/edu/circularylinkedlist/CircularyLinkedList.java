package br.edu.circularylinkedlist;

import br.edu.common.Node;

public class CircularyLinkedList<E> {

	private Node<E> tail;

	private int size;

	public CircularyLinkedList() {
		tail = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E getFirst() {
		if (isEmpty())
			return null;
		return tail.getNext().getElement();
	}

	public void rotate() {
		if (!isEmpty()) {
			tail = tail.getNext();
		}
	}

	public void addFirst(E element) {
		if (isEmpty()) {
			tail = new Node<E>(element, null);
			tail.setNext(tail);
		} else {
			Node<E> n = new Node<E>(element, tail.getNext());
			tail.setNext(n);
		}
		size++;
	}

	public void addLast(E element) {
		addFirst(element);
		rotate();
	}

	public E removeFirst() {
		if (isEmpty()) {
			return null;
		} else {
			Node<E> toRemove = tail.getNext();

			if (toRemove == tail) {
				tail = null;
			} else {
				tail.setNext(toRemove.getNext());
			}
			size--;
			return toRemove.getElement();
		}
	}
}
