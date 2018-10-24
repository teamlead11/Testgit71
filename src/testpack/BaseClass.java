package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		addNumber();
	}

	public static void add() {
		System.out.println("some code added by hema");
	}
	
	public static void addNumber(){
		int a = 2;
		int b = 5;
		System.out.println("Addition of two numbers :" +(a+b));
		
	}
}
