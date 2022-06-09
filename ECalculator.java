package ecalculator;

public class ECalculator {

	static void add(int a, int b)		
		{
			int result = a+b;
			System.out.println("After adding a and b : "+ result);
		}
	static void sub(int a, int b)		
	{
		int result = a-b;
		System.out.println("After substracting a and b : "+ result);
	}
	static void mul(int a, int b)		
	{
		int result = a*b;
		System.out.println("After multiplying a and b : "+ result);
	}
	static void div(int a, int b)		
	{
		int result = a/b;
		System.out.println("After dividing a and b : "+ result);
	}
	

public static void main(String args[])
{
	int a=20, b=10;
	System.out.println("The value of a and b: "+a+","+b);
	add(a,b);
	sub(a,b);
	mul(a,b);
	div(a,b);
}
}
