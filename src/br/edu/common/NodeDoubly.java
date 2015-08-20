package br.edu.common;

public class NodeDoubly<E> {

	private E element;
	private NodeDoubly<E> next;
	private NodeDoubly<E> prior;
	
	public NodeDoubly(E element, NodeDoubly<E> next, NodeDoubly<E> prior) {
		this.element = element;
		this.next = next;
		this.prior = prior;
	}

	public NodeDoubly<E> getNext() {
		return next;
	}

	public void setNext(NodeDoubly<E> next) {
		this.next = next;
	}

	public NodeDoubly<E> getPrior() {
		return prior;
	}

	public void setPrior(NodeDoubly<E> prior) {
		this.prior = prior;
	}

	public E getElement() {
		return element;
	}
}
