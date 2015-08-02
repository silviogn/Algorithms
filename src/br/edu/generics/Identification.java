package br.edu.generics;

public class Identification<A, B> {

	private A a;
	private B b;

	public Identification(A a, B b) {
		this.a = a;
		this.b = b;

	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

}
