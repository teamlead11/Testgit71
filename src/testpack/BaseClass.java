package testpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BaseClass {

	/*public static void main(String[] args) {
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
		
	}*/ 
	public static class ReverseEveryWordOfGroupOfString {

		/*
		 * This method splits given string by space delimiter and returns a String
		 * array.
		 */
		public static String[] splitStringBySpace(String inputStringToSplit) {
			return inputStringToSplit.split(" ");
		}

		/*
		 * This method reverse the given word and return it.
		 */
		public static String reverseWord(String inputWord) {
			String reverse = "";
			// Reading char by char from end and appending
			for (int i = inputWord.length() - 1; i >= 0; i--) {
				reverse = reverse + inputWord.charAt(i);
			}
			return reverse;
		}

		public static void main(String[] args) {

			// User input for the string to know length
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the string to reverse each word:");

			String userInput = sc.nextLine();

			sc.close();
			
			// Split string
			String[] splitedString = splitStringBySpace(userInput);
			
			// Output with each word reversed
			String desiredString="";
			
			// Reversing word by word and appending
			for(int j=0;j<splitedString.length;j++)
			{
				desiredString= desiredString + reverseWord(splitedString[j]) +" ";
			}
			
			System.out.println("Original string            :"+userInput);
			
			System.out.println("String with reversed words :"+desiredString);
		}
	}
	
	
	
   /*private static void reversebyvicky() {
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
		   
	   }*/
 		
	public static void toReverseNumberByHema(){
		   
		   int n = 122;
		   int i = 0;
		   int a = n;
		   int r = 0;
		   
		   while (a>0){
			   r= a%10;
			   i = (i*10) + r;
			   a = a/10;
		   }
		 System.out.println("Reversed Number is "+i);  
		  		   
	   }
	
	public static void add() {
		System.out.println("some code added by Suba");
	}
 
}
