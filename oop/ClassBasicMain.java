package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {
		
		//class member, ��ü�� �������� �ʾƵ� ��� ����, ����
		ClassBasic.projectYear = 2022;
		ClassBasic.classMethod();
		
		//new -> object constructor
		//�ν��Ͻ�ȭ(��üȭ)
		ClassBasic class1 =	new ClassBasic();
		//instance member -> ��ü�� ������ �� ���� ����
		class1.userId = "m111";
		class1.userPw = "1111";
		class1.userAge = 10;
		class1.instanceMethod();
		System.out.println(class1.userId);
		System.out.println(class1.userPw);
		System.out.println(class1.userAge);
		
		class1.setProjectName("JAVAPROJECT2022"); //setter, private member initialization
		String projectName = class1.getProjectName();
		System.out.println(projectName); //getter
		
		
		ClassBasic class2 = new ClassBasic();
		class2.userId = "a111";
		class2.userPw = "2222";
		class2.userAge = 20;
		class2.instanceMethod();
		System.out.println(class2.userId);
		System.out.println(class2.userPw);
		System.out.println(class2.userAge);
		
	}
	
}
