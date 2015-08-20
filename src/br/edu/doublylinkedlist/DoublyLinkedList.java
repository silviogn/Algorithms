package br.edu.doublylinkedlist;

import br.edu.common.NodeDoubly;

public class DoublyLinkedList<E> {

	private NodeDoubly<E> header;
	private NodeDoubly<E> trailer;
	private int size;

	public DoublyLinkedList() {
		header = new NodeDoubly<E>(null, null, null);
		trailer = new NodeDoubly<E>(null, null, null);
		trailer.setPrior(header);
		header.setNext(trailer);
		size = 0;
	}
	
	private void addElement(E element, NodeDoubly<E> prior, NodeDoubly<E> next){
		NodeDoubly<E> newest = new NodeDoubly<E>(element,null,null);
		newest.setPrior(prior);
		prior.setNext(newest);
		newest.setNext(next);
		next.setPrior(newest);
		size++;
	} 
	
	private void removeElement(NodeDoubly<E> prior, NodeDoubly<E> next){
		prior.setNext(next);
		next.setPrior(prior);
		size--;
	}
	
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E firts() {
		if (isEmpty())
			return null;
		return header.getNext().getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return trailer.getPrior().getElement();
	}

	public void addFirst(E element) {
		addElement(element, header, header.getNext());
	}

	public void addLast(E element) {
		addElement(element, trailer.getPrior(), trailer);
	}
	
	public E removeFirst() {
		E temp = firts();
		removeElement(header, header.getNext().getNext());		
		return temp;
	}

	public E removeLast() {
		E temp = last();
		removeElement(trailer.getPrior().getPrior(),trailer);
		return temp;
	}

}
