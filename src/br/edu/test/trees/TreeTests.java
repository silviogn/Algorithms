package br.edu.test.trees;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.trees.Tree;

public class TreeTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void rootValid() {	
		Tree<Integer> t = new Tree<Integer>(1);
		 assert(t.getRoot().getData() == 1);		
	}

	@Test(expected=IllegalArgumentException.class)
	public void rootNull() throws IllegalArgumentException{
		 new Tree<String>(null).getRoot();
	}
	
}
