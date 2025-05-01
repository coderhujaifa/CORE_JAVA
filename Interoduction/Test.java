package Interoduction;

public class Test {
	int a=10; //Instance Variable
	static int b=20; //Static Variable
	public static void main(String[]args)
	{
		int c=30; //Local Variable
		final int d=40; //Final Variable
		
		Test t=new Test(); //object Creation
		System.out.println(t.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
