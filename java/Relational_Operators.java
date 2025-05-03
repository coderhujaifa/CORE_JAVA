package Operators.java;

import java.util.Scanner;

public class Relational_Operators {
	public static void main(String[]args)
	{
		int a,b;
		System.out.println("Enter 2 Number...");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		System.out.println("True/False "+(a<b));
		System.out.println("True/False "+(a>b));
		System.out.println("True/False "+(a>=b));
		System.out.println("True/False "+(a<=b));
		System.out.println("True/False "+(a==b));
		System.out.println("True/False "+(a!=b));
	}
}
