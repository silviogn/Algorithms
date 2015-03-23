package br.edu.quicksort;

public class QuickSort {
	
	public int[] sort(int low, int high, int[] data) {
		if (low < high) {
			int pivot = partition(low, high, data);
			sort(low, pivot - 1, data);
			sort(pivot + 1, high, data);
		}
		return data;
	}
 
	private int partition(int low, int high, int[] data) {
		int wall = low - 1;
		for (int j = low; j < high; j++) {
			if (data[j] <= data[high]) {
				wall++;
				exchange(wall, j,data);
			}
		}
		wall++;
		exchange(wall, high, data);
		return wall;
	}
 
	private void exchange(int low, int high, int[] data) {
		int temp = data[low];
		data[low] = data[high];
		data[high] = temp;
	}
	

}
