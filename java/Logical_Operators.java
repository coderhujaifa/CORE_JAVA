package Operators.java;

public class Logical_Operators {
	public static void main(String[]args)
	{
		System.out.println("Logiocal And");
		System.out.println(10>5 && (2>1));
		System.out.println(10> 5 && (2<1));
		System.out.println(10<5 && (2<1));
		
		System.out.println("Logiocal OR");
		System.out.println(10>5 || (2>1));
		System.out.println(10> 5 || (2<1));
		System.out.println(10<5 || (2<1));
		
		System.out.println("Logiocal NOT");
		System.out.println(!(10>5 ));
		System.out.println(!(10<5 ));
	}
}
