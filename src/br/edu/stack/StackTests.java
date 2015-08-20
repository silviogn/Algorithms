package br.edu.stack;

import static org.junit.Assert.*;
import org.junit.Test;


public class StackTests {

	@Test
	public void test() {
		Stack<String> st = new Stack<String>();
		st.push("silvio");
		st.push("normey");
		assertEquals(st.pop(),"normey");
	}

}
