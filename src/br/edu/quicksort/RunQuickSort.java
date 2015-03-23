package br.edu.quicksort;

public class RunQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {8,4,9,6,21,8,11,8,11,10,13,13,19,21,36,37,8,8,17,27,12,9,29,29,25,30,9,17,20,40,69,61,64,279,500,256,216,590,4026,7129,7129,7129,7129,7129,4026,7129,2308,10000,15154,12582,12600,24481,16063};
		
		data = new QuickSort().sort(0, data.length-1, data);
		
		for(int a : data){
			System.out.println(a);
		}
	}

}
