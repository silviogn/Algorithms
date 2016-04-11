package br.edu.sort.quicksort;

import br.edu.sort.base.SortAlgorithm;
import br.edu.sort.exception.SortAlgorithmErrorCode;
import br.edu.sort.exception.SortAlgorithmException;

public class QuickSort extends  SortAlgorithm {
	
	private  QuickSort() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static QuickSort newInstance(){
		return new QuickSort();
	}
	

	@Override
	public int[] sort(int[] data) throws SortAlgorithmException {
		
		if (data == null){
			throw new SortAlgorithmException(SortAlgorithmErrorCode.DataNullNotAllowed);
		}
		
		if (data.length == 0){
			throw new SortAlgorithmException(SortAlgorithmErrorCode.ZeroLenghtDataNotAllowed);
		}
		data = sort(data, 0, data.length-1);
		return data;
	} 
	
	private int[] sort(int[] data, int left, int right){
		if (left < right){
			int pivot = divide(data, left, right);
			sort(data, left, pivot-1);
			sort(data, pivot+1, right);
		}
		return data;
	}
	
	private int divide(int data[], int left, int right){
		int j = left - 1;
		int i = left;
		
		while (i < right){
			if (data[i] <= data[right]){
				exchange(data, i, ++j);
			}
			i++;
		}
		exchange(data, right, ++j);
		return j;
	}	
}
