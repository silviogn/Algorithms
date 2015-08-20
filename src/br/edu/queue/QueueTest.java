package br.edu.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	
	@Test
	public void verifyNullElements() {
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		int a;
		a = q.getFirst();
		q.dequeue();
		a = q.getFirst();
		q.dequeue();
		a = q.getFirst();
		q.enqueue(4);
		a = q.getFirst();
		assertEquals(a,3);
	}
}
