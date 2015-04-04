package br.edu.interviews;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"silvio","slvo","cholo","ronaldo"};
		
		String[] arrRetorno = AibrbnbSoftwareEngineerDictionary.getContainedWords(array, "silvo");
		
		System.out.print(arrRetorno);
		
	}

}
