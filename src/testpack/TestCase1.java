package testpack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("added test case1");
		System.out.println("Changes made");
		TestCase1 t=new TestCase1();
		t.reverseByJayi();

		TestCase1 tc=new TestCase1();
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
	String original,reverse="";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	original = in.nextLine();
	int length = original.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + original.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
	}



private void reversebyanitha() {
	String s ="ANITHA DHANAVEL";
	String  rev="";
	int len1= s.length();
	for (int i = len1 - 1; i >= 0; i--) {
	rev = rev+s.charAt(i);	System.out.println("string reverse is " + rev);
	}
	System.out.println("string reverse is " + rev);
		
	
	
	
}

	

public void reverseByBanu() {
	String a,reverse="";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	a = in.nextLine();
	int length = a.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + a.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
}
	

public void reverseBySubasri() {
	String a,reverse="";
	Scanner in =new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	a = in.nextLine();
	int length = a.length();
	for (int i = length - 1; i >= 0; i--)
	reverse = reverse + a.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
}

public void reverseByArun() {
	String a,reverse="";
	Scanner in1 =new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	a = in1.nextLine();
	int length1 = a.length();
	for (int i = length1 - 1; i >= 0; i--)
	reverse = reverse + a.charAt(i);
	System.out.println("Reverse of entered string is: " + reverse);
	
}

public void reversebyDevisathyarani()
{
	String name,rev="";
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter a string reverse");
	name=sc1.nextLine();
	int len1=name.length();
	for(int i=len1-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
		System.out.println(rev);
		
	}
	}


public void reverseStringByHema(){
	String temp = "";
	List<String> reversed = new ArrayList<String>();
	
	List<String> li = new ArrayList<String>();
	
	li.add("Hema");
	li.add("Akarsh");
	
	Iterator<String> i = li.iterator();
	while(i.hasNext()){
		String name = i.next();
						
		for(int i1 = name.length()-1;i1>=0;i1--){
			temp = temp + name.charAt(i1);
			
		}
		
	reversed.add(temp);
		temp = "";			
	}
	for(String s1 :reversed){
		
		System.out.println("List "+s1);
	}

}


}


