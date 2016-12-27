package br.hackerrank.base;

import java.util.Scanner;

public class ReadJavaInput {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = null;
        double d = 0;
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
	}
}
