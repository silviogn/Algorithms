package br.edu.generics;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Identification<String,Integer> val;
		
		val = new Identification<String, Integer>("Silvio", 100);
		
		System.out.print(val.getA());
		

		
		
	}

}
