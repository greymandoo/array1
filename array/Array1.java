package org.java.array;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("�迭");
		
		//int�� �����͸� ���� �� �� �ִ� �迭 arr1�� �����ߴ�
		int[] arr1 = new int[5];
		//intialization
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
		//for�� �̿��� arr1�� 01234�� �ʱ�ȭ�ϰ� �ֿܼ� �� ������ ���� ���
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = 0+1;
			System.out.println("arr1["+i+"]="+arr1[i]);
			
		}
		
		System.out.println("�迭�� �� ����: " + arr1.length);
		System.out.println("�迭�� ������ �ε���: " + (arr1.length-1));
		
		//int�� �����͸� ���� �� �� �մ� �迭 arr3�� �����ϰ� int�� 1, 2, 3, 4, 5�� �ʱ�ȭ
		int[] arr3 = new int[] {1,2,3,4,5};
		
		//int�� �����͸� ���� �� �� �ִ� �迭 arr4�� �����ϰ� int�� 1, 2, 3, 4, 5�� �ʱ�ȭ
		int[] arr4 = {1,2,3,4,5};
		
		char[] chArr1 = new char[5];
		for (int i=0;i<chArr1.length;i++) {
			System.out.println("chArr1["+i+"]=" + chArr1[i]);
		}
		char[] chArr2 = new char[]{'a', 'b', 'c', 'd', 'e'};
		for (int i=0;i<chArr2.length;i++) {
			System.out.println("chArr2["+i+"]=" + chArr2[i]);
		}
		
		String[] strArr = new String[] {"j", "a", "v", "a", "22"};
		for (int i=0;i<strArr.length;i++) {
			System.out.println("strArr["+i+"]=" + strArr[i]);
		}
		
		//1���� 45���� �������� ���ο� �迭 lotto�� ����, �ֿܼ� ������ ��Ұ��� ����
		int[] lotto = new int[45];
		int lottoSize = lotto.length;
		for (int i=0;i<lottoSize;i++) { 
			lotto[i] = i+1;
			System.out.println("lotto[" + i + "]=" + lotto[i]);
		}
		
		
	}
	
}
