package br.edu.recursion.fatorial;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FatorialTest {

	@Test(expected=IllegalArgumentException.class)
	public void lessThanZero() {
		Fatorial.fatorial(-900);
	}
	
	@Test
	public void argumenNEqualsZero() {
		assertEquals(Fatorial.fatorial(0), 1);
	}
	
	@Test
	public void fatorialOfFive() {
		assertEquals(Fatorial.fatorial(5), 120);
	}

}
