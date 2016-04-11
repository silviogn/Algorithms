package br.interviews.globo;

public class SequenciaCaracteres {
	// ======================
	// ## Maior sequência de caracteres iguais
	// ======================
	// Dada uma palavra, escreva um algoritmo que retorne a sequência de
	// caracteres que mais aparecem em sequência.
	// Ex.: "Glooobbo.com", deve retornar "ooo".

	public static void main(String[] args) {

		String palavra = "Glooobbo.com53435465465555555544656879999999999995";
		char[] palavrasplit = palavra.toCharArray();

		char maior = palavrasplit[0];
		int total = 1;

		char atual = palavrasplit[0];
		int totalatual = 1;

		for (int i = 1; i < palavrasplit.length; i++) {
			if (atual == palavrasplit[i]) {
				totalatual++;
			} else {
				if (total < totalatual) {
					total = totalatual;
					maior = atual;
				}
				totalatual = 1;
				atual = palavrasplit[i];
			}
		}

		if (total < totalatual) {
			total = totalatual;
			maior = atual;
		}
		System.out.print(maior + " - " + total);
	}
}