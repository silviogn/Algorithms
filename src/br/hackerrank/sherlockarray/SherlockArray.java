package br.hackerrank.sherlockarray;

public class SherlockArray {

	public static void main(String[] args) {

		//int[] data = {10,10, 290, 299,90,88,22,33,44,5566 };
		//int[] data = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
		int[] data = {3,5,3,0};
		
		int sumRight = 0;
		int sumLeft = 0;
		
		for (int i = 0; i < data.length; i++) {
			sumRight+=data[i];
		}
		
		boolean found = false;
		
		for (int i = 0; i < data.length; i++) {
			sumRight-=data[i];
			
			if (sumLeft == sumRight){
				found = true;
				break;
			}
			
			sumLeft+=data[i];
		}
		
		System.out.println(found == true?"YES":"NO");
		
	}
}
