package br.edu.common;

public class Convertion {

	public static int[] converToIntArray(String sData, int size) {
		String[] dataArray = sData.split(" ");
		int[] data = new int[dataArray.length];
		for (int i = 0; i < size; i++) {
			data[i] = Integer.parseInt(dataArray[i]);
		}
		return data;
	}

}
