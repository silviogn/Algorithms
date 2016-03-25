package br.edu.sort.insertionsort;

import br.edu.sort.base.SortAlgorithm;
import br.edu.sort.exception.SortAlgorithmErrorCode;
import br.edu.sort.exception.SortAlgorithmException;

public class InsertionSort extends SortAlgorithm{

	private InsertionSort() {
		
	}
	
	public static InsertionSort newInstance(){
		return new InsertionSort();
	}
	
	@Override
	public int[] sort(int[] data) throws SortAlgorithmException {
		
		if (data == null) {
			throw new SortAlgorithmException(SortAlgorithmErrorCode.DataNullNotAllowed);
		}

		if (data.length == 0) {
			throw new SortAlgorithmException(SortAlgorithmErrorCode.ZeroLenghtDataNotAllowed); 
		}

		for (int i = 1; i < data.length; i++) {
			int temp = data[i];
			int j = i - 1;
			while (j >= 0 && temp < data[j]) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = temp;
		}
		return data;
	}
}
