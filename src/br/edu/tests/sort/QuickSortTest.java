package br.edu.tests.sort;


import br.edu.sort.quicksort.QuickSort;
import br.edu.tests.BaseSortTest;

public class QuickSortTest  extends BaseSortTest {

	public QuickSortTest(){
		super();
		iSorteableAlgorithm = QuickSort.newInstance(); 
	}
	
}
