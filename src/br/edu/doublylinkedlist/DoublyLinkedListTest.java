package br.edu.doublylinkedlist;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void initial() {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.addFirst(1);
		list.addLast(2);
		list.addFirst(3);
		list.addLast(4);
		
		Integer first = list.removeFirst();
		Integer last = list.removeLast();
		
		System.out.println(list.getSize());
		
	}

}
