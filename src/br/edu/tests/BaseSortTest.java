package br.edu.tests;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import br.edu.sort.base.ISorteableAlgorithm;
import br.edu.sort.exception.SortAlgorithmException;

public class BaseSortTest {

	protected static int[] data;
	protected static ISorteableAlgorithm iSorteableAlgorithm;
	protected static Random random;
	
	public BaseSortTest() {
		random = new Random();
	}

	@Before
	public void setUpBeforeClass() throws Exception {
		data = new int[10000];		
		for (int i = 0; i < 10000; i++) {
			data[i] = random.nextInt();
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		data = null;
		random = null;
	}

	@Test
	public void correctOrder() throws SortAlgorithmException {
		data = iSorteableAlgorithm.sort(data);
		for (int i = 0; i < data.length - 2; i++) {
			assertFalse(data[i] > data[i + 1]);
		}
	}
	
	@Test(expected=SortAlgorithmException.class)
	public void execptionDataNull() throws SortAlgorithmException{
		data = iSorteableAlgorithm.sort(null);
	}
	
	
	@Test(expected=SortAlgorithmException.class)
	public void exectionDataZeroLenght() throws SortAlgorithmException{
		data = iSorteableAlgorithm.sort(new int[0]);
	}
}








