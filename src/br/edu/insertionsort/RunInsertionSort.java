package br.edu.insertionsort;

import br.edu.common.Artifacts;

public class RunInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data =  Artifacts.data;
		data = new InsertionSort().sort(data);
		for(int a : data){
			System.out.println(a);
		}
		

	}

}
