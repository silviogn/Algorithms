package br.edu.tests.sort;

import br.edu.sort.insertionsort.InsertionSort;
import br.edu.tests.BaseSortTest;

public class InsertionSortTest extends BaseSortTest {

	public InsertionSortTest(){
		super();
		iSorteableAlgorithm = InsertionSort.newInstance();
	}
}
