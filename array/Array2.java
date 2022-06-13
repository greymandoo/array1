package org.java.array;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("¹è¿­");
		
		char[] ch = {'a','b','c','d','e'};
		for (int i=0;i<ch.length;i++) {
			System.out.print(ch[i] + " ");
		}
		
		System.out.println("\n====================");
		
		for(char ch1:ch) {
			System.out.print(ch1);
		}
		
		int[] arrInt = new int[10];
		for(int i:arrInt) {
			System.out.print(i + " ");
		}

		
		
	}
	
}
