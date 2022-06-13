package org.java.array;

public class Array4 {

	public static void main(String[] args) {
		System.out.println("¹è¿­");

		int[][] arr1 = new int[4][3];
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);

		int a=1;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(i + "Çà: ");
			for (int j=0;j<arr1[i].length;j++) {
//				arr1[i][j] = i*3 + j + 1;
				
				arr1[i][j]=a++;
				
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
