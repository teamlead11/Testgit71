package testpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		addNumber();
		reversebyvicky();
		
		//list
		
		List<Integer> emp=new ArrayList<>();
		emp.add(10);
		emp.add(20);
		emp.add(30);
		
		System.out.println("Before="+emp);
		emp.add(2,300);
		System.out.println("After="+emp);
	}

	public static void add() {
		System.out.println("some code added by hema");
	}
	
	public static void addNumber(){
		int a = 2;
		int b = 5;
		System.out.println("Addition of two numbers :" +(a+b));
		
	}
	
   private static void reversebyvicky() {
	   Scanner inp = new Scanner(System.in);
		int number, reverse = 0;
		System.out.println("Enter the value that you have to reverse: ");
		number = inp.nextInt();
		
		for (; number != 0; number /= 10) {
			reverse = (reverse * 10) + number%10;
		}
		System.out.println("The reversed value: " + reverse);
}
	
	public static void toCheckPalindrome(){
		   
		   int n = 122;
		   int i = 0;
		   int a = n;
		   int r = 0;
		   
		   while (a>0){
			   r= a%10;
			   i = (i*10) + r;
			   a = a/10;
		   }
		   
		   if(n == i){
			   System.out.println("n is a palindrome number");
		   }else{
			   System.out.println("n is not a palindrome number");
		   }
		   
	   }
	
	
	public static void toReverseTheNumber() {

		int n = 12345;
		int a = n;
		

		while (a > 0) {
			int r = a % 10;
			System.out.print(r);
			a = a / 10;
		}

	}
 		
 	
 		
 
}
