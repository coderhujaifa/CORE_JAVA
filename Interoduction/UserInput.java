package Interoduction;

import java.util.Scanner;

public class UserInput {
	public static void main(String[]args)
	{
		int a; int b;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Value");
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.print(a+" "+b);
	}
}
