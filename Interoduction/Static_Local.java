package Interoduction;

public class Static_Local {
	static int a=10;
	
	void fun ()
	{
		int b=20;
		System.out.println(a+" "+b);
		++a;  ++b;
	}
	public static void main(String[]args)
	{
		Static_Local r=new Static_Local();
		r.fun ();
		r.fun ();
	}
}
