package br.edu.insertionsort;

public class InsertionSort {

	public int[] sort(int[] data) {
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
