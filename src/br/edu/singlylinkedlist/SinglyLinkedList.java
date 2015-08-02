package br.edu.singlylinkedlist;

public class SinglyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		return isEmpty() ? null : head.getElement();
	}

	public E last() {
		return isEmpty() ? null : tail.getElement();
	}

	public void addFirst(E element) {

		if (element == null)
			throw new IllegalArgumentException(
					"Parameter element can't be null.");

		this.head = new Node<E>(element, head);

		if (isEmpty())
			this.tail = head;

		size++;
	}

	public void addLast(E element) {

		if (element == null)
			throw new IllegalArgumentException(
					"Parameter element can't be null.");

		Node<E> node = new Node<E>(element, null);

		if (isEmpty()) {
			head = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		E value = head.getElement();
		head = head.getNext();
		size--;
		return value;
	}

	public static class Node<E> {

		private E element;

		private Node<E> next;

		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

}
