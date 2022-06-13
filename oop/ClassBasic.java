package org.java.oop;

public class ClassBasic {

	//field
	//instance member
	public String userId;
	public String userPw;
	public int userAge;
	//encapsulation
	private String projectName; //instance member
	//class member(static)
	public static int projectYear;
	
	public ClassBasic(){
		//객체 생성시 필요한 특수한 메서드
		System.out.println("constructor");
	}
	
	//method------------------------------------
	//instance method
	public void instanceMethod() {
		System.out.println("Instance Method");
	}
	
	//class method, class member(static)
	public static void classMethod() {
		System.out.println("Class Method");
	}
	
	//getters, setters
	//set private member(field) -> initialization
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	//get private member(field)
	public String getProjectName() {
		return this.projectName; //호출할 곳에 반환
	}

	
	
}
