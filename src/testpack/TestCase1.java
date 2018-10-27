package testpack;
import java.util.Scanner;

import java.util.Scanner;

public class TestCase1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("added test case1");
		System.out.println("Changes made");
		TestCase1 t=new TestCase1();
		t.reverseByJayi();

		TestCase1 tc=new TestCase1();
		TestCase1 reverseString=new TestCase1();
		tc.reversebysindhu();

		String str=reverseString.reverseBySaravanan();
		System.out.println(str);
	}

	public static void multi(int a, int b) {
		System.out.println(a * b);
	}

	public static void multi(int a, int b, int c) {
		System.out.println(a * b * c);

	}
	public  String reverseBySaravanan()
	{
		String str1,str2="";
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Your name to reverse");
		str1 = in.nextLine();
		int len = str1.length();
		len = len;
		for( int start = len-1; start >0 ; start--)
		{
			str2 = str2 + str1.charAt(start);
		}
		return str2;
		
		
	}

 public void reversebysindhu() {
	String original, reverse = "";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	original = in.nextLine();
	int length = original.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + original.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
	}
	
	

private void reverseByJayi() {
	String original,reverse="";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	original = in.nextLine();
	int length = original.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + original.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
	}

}

