package testpack;

import java.util.ArrayList;
import java.util.List;

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
 		
 	
 		
 
}
