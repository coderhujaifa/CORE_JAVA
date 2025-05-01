package Interoduction;

public class Instance_Static {
	int a = 30; // Instance Variable

	void fun() {
		int b = 20;
		System.out.println(a + " " + b);
		++a;  ++b;
	}

	public static void main(String[] args) {
		Instance_Static r = new Instance_Static();
		r.fun();
		r.fun();
	}
}
