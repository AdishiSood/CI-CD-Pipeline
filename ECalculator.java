package ecalculator;

import java.util.logging.Logger;

public class ECalculator {

	static Logger l = Logger.getLogger(ECalculator.class.getName());
	static void add(int a, int b)		
		{
			int result = a+b;
			l.info("After adding a and b : "+ result);
		}
	static void sub(int a, int b)		
	{
		int result = a-b;
		l.info("After substracting a and b : "+ result);
	}
	static void mul(int a, int b)		
	{
		int result = a*b;
		l.info("After multiplying a and b : "+ result);
	}
	static void div(int a, int b)		
	{
		int result = a/b;
		l.info("After dividing a and b : "+ result);
	}
	

public static void main(String args[])
{
	//Logger l = Logger.getLogger(ECalculator.class.getName());
	int a=20, b=10;
	System.out.println("The value of a and b: "+a+","+b);
	ECalculator.add(a,b);
	ECalculator.sub(a,b);
	ECalculator.mul(a,b);
	ECalculator.div(a,b);
	
}
}
