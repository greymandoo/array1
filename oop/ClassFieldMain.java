package org.java.oop;

public class ClassFieldMain {

	public static void main(String[] args) {

		System.out.println("프로젝트명: " + ClassField.PROJECTNAME);

		//일반 변수 ->
		//객체 타입 변수 ->
		ClassField c1 = new ClassField();
		System.out.println(c1);

		
		ClassField c2 = new ClassField();
		System.out.println(c2);
	}
}
