package br.edu.sort.base;

import br.edu.sort.exception.SortAlgorithmException;


public abstract class SortAlgorithm implements ISorteableAlgorithm {	
	
	public abstract int[] sort(int[] data) throws SortAlgorithmException;

	protected void exchange(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
