package testpack;

import java.util.Scanner;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("added test case1");
		System.out.println("Changes made");

	}

	public static void multi(int a, int b) {
		System.out.println(a * b);
	}

	public static void multi(int a, int b, int c) {
		System.out.println(a * b * c);

	}

	public void reverseByArun() {
		String actual, rev = "";
		Scanner string = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		actual = string.nextLine();
		int length = actual.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + actual.charAt(i);
		System.out.println("Reverse of entered string is: " + rev);
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
	

	

	public void reverseByBanu() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	}
	

public void reverseByBanumathi() {
	String a, rever = "";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	a = in.nextLine();
	int length = a.length();
	for (int i = length - 1; i >= 0; i--)
		rever = rever + a.charAt(i);
	System.out.println("Reverse of entered string is: " + rever);
	System.out.println("changes done by banumathi");
}
}
