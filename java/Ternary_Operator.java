package Operators.java;

public class Ternary_Operator {
	public static void main(String[]args)
	{
		int a=10,b=20,c=30,Zaid;
		Zaid= (a>b) ?  (a > c ? a : c) : (b > c ? b  : c);
		System.out.println(Zaid);
	}
}
