package br.edu.heapsort;

import br.edu.common.Artifacts;
import br.edu.sortalgorithm.ISortAlgorithm;
import br.edu.sortalgorithm.SortAlgorithmException;

public class RunHeapSort {

	public static void main(String[] args) {
		
		ISortAlgorithm heapSort = HeapSort.Instance();
		
		try {
			for(int a : heapSort.sort(Artifacts.data)){
				System.out.println(a);
			}
		} catch (SortAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
