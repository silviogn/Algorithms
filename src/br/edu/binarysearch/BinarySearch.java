package br.edu.binarysearch;

public class BinarySearch {

	public static boolean search(int[] data, int low, int high, int value) {
		if (low > high) { return false; }
		//teste
		int middle = (low + high) / 2;
		
		if (data[middle] == value) {
			return true;
		} else 
			if (data[middle] > value) {
				return search(data, low, middle-1, value);
		} else {
			return search(data, middle+1, high, value);
		}
	}
}
