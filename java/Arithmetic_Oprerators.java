package Operators.java;

import java.util.Scanner;

public class Arithmetic_Oprerators {
	public static void main(String[]args)
	{
		int a,b;
		System.out.println("Enter 2 Number...");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		System.out.println("Addition "+(a+b));
		System.out.println("Subtraction "+(a-b));
		System.out.println("Multimaplication "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Reminder "+(a%b));
	}
}
