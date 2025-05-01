package Interoduction;

public class Variable {
	static int b=20; //Static Variable
	int c=30; //Instance Variable
	public static void main(String[]args)
	{
		int a=10; //Local Variable
		Variable ref=new Variable();
		
		System.out.println(a);
		System.out.println(Variable.b);
		System.out.println(ref.c);	
	}
}
