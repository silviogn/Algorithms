package br.edu.sort.heapsort.tests;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.sort.exception.SortAlgorithmException;
import br.edu.sort.heapsort.HeapSort;

public class HeapSortTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test(expected = SortAlgorithmException.class)
	public void VerifyNullData() throws SortAlgorithmException {
		HeapSort.Instance().sort(null);
	}

	@Test(expected = SortAlgorithmException.class)
	public void VerifyZeroLenghtData() throws SortAlgorithmException {
		HeapSort.Instance().sort(new int[] {});
	}

	@Test
	public void TestCorrectOrderArray() throws SortAlgorithmException {

		int[] dataSorted = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 15, 16 };
		int[] data = new int[] { 15, 16, 14, 2, 4, 15, 5, 6, 7, 15, 8, 9, 10, 11, 12, 13, 1, 3 };
		data = HeapSort.Instance().sort(data);
		boolean correct = true;
		
		for (int i = 0; i < data.length; i++) {
			if (dataSorted[i] != data[i]) {
				correct = false;
				break;
			}
		}
		assertTrue(correct);
	}

	@Test
	public void TestCorrectOrderBulck() throws SortAlgorithmException {
		int[] data = new int[1000000];
		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt();
		}

		data = HeapSort.Instance().sort(data);
		boolean correct = true;
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i]>data[i+1]){
				correct = false;
				break;
			}
		}
		assertTrue(correct);
	}
}
