package br.edu.binarysearch;

import static org.junit.Assert.*;
import org.junit.Test;


public class BinarySearchTest {

	int[] data = {1,2,3,4,5,6,7,8,9,10,11};
	
	@Test
	public void higerLessThanLow() {
		assertEquals(BinarySearch.search(data, data.length-1, 0, 90),false);
	}
	
	@Test
	public void searchInexistent() {
		assertEquals(BinarySearch.search(data, 0, data.length-1, 90),false);
	}
	
	@Test
	public void searchMiddle() {
		assertEquals(BinarySearch.search(data, 0, data.length-1, 6),true);
	}
	
	@Test
	public void searchLessThanMiddle() {
		assertEquals(BinarySearch.search(data, 0, data.length-1, 3),true);
	}
	
	@Test
	public void searchGreatherThanMiddle() {
		assertEquals(BinarySearch.search(data, 0, data.length-1, 10),true);
	}
	

}
