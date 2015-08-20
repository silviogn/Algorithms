package br.edu.singlylinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {
	
	@Test
	public void verifyNullElements() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		assertEquals(l.first(), null);
		assertEquals(l.last(), null);
	}
	
	@Test
	public void verifySizeToEmpty() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		assertEquals(l.getSize(), 0);
	}
	
	
	@Test
	public void verifyLasAndFirstSameElement() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		assertEquals(l.first(), "A");
		assertEquals(l.last(), "A");
	}

	
	@Test
	public void checkCorrectFirs() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		l.addFirst("B");
		l.addFirst("C");
		assertEquals(l.first(), "C");
		
	}
	
	@Test
	public void testTwoElements() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		l.addLast("B");
		assertEquals(l.first(), "A");
		assertEquals(l.last(), "B");
	}
	
	
	@Test
	public void testThreeElements() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		l.addLast("B");
		l.addLast("C");
		assertEquals(l.first(), "A");
		assertEquals(l.last(), "C");
		assertEquals(l.getSize(), 3);
	}
	
	@Test
	public void removeFirst() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		l.addLast("B");
		l.addLast("C");
		assertEquals(l.getSize(), 3);
		l.removeFirst();
		assertEquals(l.first(), "B");
		assertEquals(l.getSize(), 2);
	}
	
	@Test
	public void removeFirstVerifyReturn() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst("A");
		l.addLast("B");
		l.addLast("C");
		assertEquals(l.removeFirst(), "A");
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void checkFirstNul() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addFirst(null);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void checkLastNul() {
		SinglyLinkedList<String> l = new SinglyLinkedList<String>();
		l.addLast(null);
	}
	
	
	
}
