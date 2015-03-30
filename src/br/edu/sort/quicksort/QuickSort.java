package br.edu.sort.quicksort;

import br.edu.sort.base.SortAlgorithm;
import br.edu.sort.exception.SortAlgorithmErrorCode;
import br.edu.sort.exception.SortAlgorithmException;

public class QuickSort extends  SortAlgorithm{
	
	private int[] divide(int low, int high, int[] data) {
		if (low < high) {
			int pivot = partition(low, high, data);
			divide(low, pivot - 1, data);
			divide(pivot + 1, high, data);
		}
		return data;
	}
 
	private int partition(int low, int high, int[] data) {
		int wall = low - 1;
		for (int j = low; j < high; j++) {
			if (data[j] <= data[high]) {
				wall++;
				exchange(data, wall, j);
			}
		}
		wall++;
		exchange(data,wall, high);
		return wall;
	}

	@Override
	public int[] sort(int[] data) throws SortAlgorithmException {
		
		if (data == null){
			throw new SortAlgorithmException(SortAlgorithmErrorCode.DataNullNotAllowed);
		}
		
		if (data.length == 0){
			throw new SortAlgorithmException(SortAlgorithmErrorCode.ZeroLenghtDataNotAllowed);
		}
		
		return divide(0,data.length-1,data);
	}
}
