package br.edu.stack;

import java.security.InvalidParameterException;

import br.edu.common.Node;

public class Stack<E> {

	private int size;

	private Node<E> top;

	public Stack() {
		top = null;
		size = 0;
	}

	public void push(E element) {
		
		if (element == null){
			throw new InvalidParameterException("The parameter element can't be null.");
		}
		
		if (isEmpty()) {
			top = new Node<E>(element, null);
		} else {
			top = new Node<E>(element, top);
		}
		size++;
	}

	public E pop() {

		if (isEmpty()) {
			return null;
		} else {
			E temp = top.getElement();
			top = top.getNext();
			size--;
			return temp;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

}
