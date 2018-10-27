package testpack;

import java.util.Scanner;

public class TestCase1 {
	

	public static void main(String[] args) {
		
	}	
	public static void multi(int a, int b) {
		System.out.println(a * b);
	}

	public static void multi(int a, int b, int c) {
		System.out.println(a * b * c);

	}

	public static void reverseBySaravanan()
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
		
		
	}

	
	private static void reverseByVicky1() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the string that need to get reversed: ");
		String StringGiven = inp.nextLine();
		int length = StringGiven.length(), i = length -1;
		String rev = "";
				
		while(i >=0) {
			rev = rev + StringGiven.charAt(i);
			i--;
			
		}
		System.out.println("The reversed String is: " + rev);
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





private void reversebyanitha() {
String s ="ANITHA DHANAVEL";
String  rev="";
int len= s.length();
for (int i = len - 1; i >= 0; i--) {
rev = rev+s.charAt(i);	

}
System.out.println("string reverse is " + rev);

}

private void reversebyLogesh() {
	String s = "Logeshwaran";
	String rev ="";
	int len =s.length();
	for(int a = len - 1; a >= 0; a++)
	{
	rev = rev + s.charAt(a);
	}
	System.out.println("String Reverse Is " + rev);
	}


private void reversebyLogeshwaran() {
	String s = "Logesh";
	String rev ="";
	int len =s.length();
	for(int a = len - 1; a >= 0; a++)
	{
	rev = rev + s.charAt(a);
	}
	System.out.println("String Reverse Is " + rev);
	}



private void reversebyDinesh() {
	String name = "Dinesh";
	String temp= null;
	for(int i= name.length()-1; i >= 0; i--)
	{
	char ch = name.charAt(i);
	temp =temp+ch;
	
	}
	System.out.println("Reverse string "+temp);
	}

public void reverseByJayapal() {
	String actual, rev = "";
	Scanner string = new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	actual = string.nextLine();
	int length = actual.length();
	for (int i = length - 1; i >= 0; i--)
		rev = rev + actual.charAt(i);
	System.out.println("Reverse of entered string is: " + rev);
}

private void reversebyDineshtesting() {
	String name = "Dinesh";
	String temp= null;
	for(int i= name.length()-1; i >= 0; i--)
	{
	char ch = name.charAt(i);
	temp =temp+ch;
	
	}
	System.out.println("Reverse string "+temp);
	}

	}







