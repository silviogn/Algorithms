package br.edu.sort.heapsort;

import br.edu.sortalgorithm.SortAlgorithm;
import br.edu.sortalgorithm.SortAlgorithmErrorCode;
import br.edu.sortalgorithm.SortAlgorithmException;

public class HeapSort extends SortAlgorithm {

	private static HeapSort instance = null;

	public static HeapSort Instance() {
		if (instance == null) {
			instance = new HeapSort();
		}
		return instance;
	}

	public int[] sort(int[] data) throws SortAlgorithmException {

		if (data == null)
			throw new SortAlgorithmException(SortAlgorithmErrorCode.DataNullNotAllowed);

		if (data.length == 0)
			throw new SortAlgorithmException(SortAlgorithmErrorCode.ZeroLenghtDataNotAllowed);

		buildheap(data);
		for (int i = data.length - 1; i >= 0; i--) {
			exchange(data, i, 0);
			heapify(data, i, 0);
		}
		return data;
	}

	private HeapSort() {}

	private void heapify(int[] data, int size, int i) {
		int left = ((2 * i) + 1);
		int right = ((2 * i) + 2);
		int max = i;

		if ((left < size) && (data[left] > data[i])) {
			max = left;
		}

		if ((right < size) && (data[right] > data[max])) {
			max = right;
		}

		if (max != i) {
			exchange(data, i, max);
			heapify(data, size, max);
		}
	}

	private void buildheap(int[] data) {
		for (int i = (data.length / 2) - 1; i >= 0; i--) {
			heapify(data, (data.length - 1), i);
		}
	}
}
