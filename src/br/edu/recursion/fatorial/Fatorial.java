package br.edu.recursion.fatorial;

public class Fatorial {

	public static int fatorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException(
					"The argument n must be greater or equals to zero");
		} else if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}
}
