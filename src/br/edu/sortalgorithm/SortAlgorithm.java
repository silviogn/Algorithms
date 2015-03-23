package br.edu.sortalgorithm;


public abstract class SortAlgorithm implements ISortAlgorithm {	
	
	public abstract int[] sort(int[] data) throws SortAlgorithmException;
	
	protected void exchange(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
