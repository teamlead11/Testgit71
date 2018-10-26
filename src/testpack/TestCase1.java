package testpack;

import java.util.Scanner;

import java.util.Scanner;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("added test case1");
		System.out.println("Changes made");
		TestCase1 t = new TestCase1();
		t.reverseByJayi();

		TestCase1 tc = new TestCase1();
		tc.reversebysindhu();

	}

	public static void multi(int a, int b) {
		System.out.println(a * b);
	}

	public static void multi(int a, int b, int c) {
		System.out.println(a * b * c);

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
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	}

	private void reverseBylokesh() {
		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		original = s.nextLine();
		int length = original.length();
		for (int a = length - 1; a >= 0; a--) {
			reverse = reverse + original.charAt(a);
			System.out.println("Reverse Of Entered String Is: " + reverse);
		}
	}

	private void reverseByLokes() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	}

	public void reverseByArun() {
		String actual, rev = "";
		@SuppressWarnings("resource")
		Scanner string = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		actual = string.nextLine();
		int length = actual.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + actual.charAt(i);
		System.out.println("Reverse of entered string is: " + rev);
	}

	public void multi(int a, int b, int c, int d) {
		System.out.println(a * b * c * d);
	}

	public void reverseByMeenakshis() {
		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = s.nextLine();
		int len = original.length();
		for (int i = len - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	}

}
