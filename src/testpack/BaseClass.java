package testpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		addNumber();
		
		//list
		
		List<Integer> emp=new ArrayList<>();
		emp.add(10);
		emp.add(20);
		emp.add(30);
		
		System.out.println("Before="+emp);
		emp.add(2,300);
		System.out.println("Afetr="+emp);
	}

	public static void add() {
		System.out.println("some code added by hema");
	}
	
	public static void addNumber(){
		int a = 2;
		int b = 5;
		System.out.println("Addition of two numbers :" +(a+b));
		
	}
	
	 
	public static void reverse(){

		   {
		      String original, reverse = "";
		      Scanner a = new Scanner(System.in);
		     
		      System.out.println("Enter a name to reverse");
		      original = a.nextLine();
		     
		      int length = original.length();
		     
		      for (int i = length - 1 ; i >= 0 ; i--)
		         reverse = reverse + original.charAt(i);
		         
		      System.out.println("Reverse of the Name: " + reverse);
		   }
	
		
	}
	}	
 

