package FlowControl_Statements;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[]args)
	{
		int a=10,b=20, ch;
		System.out.print("Enter any number...");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("sum" + (a+b));
			break;
		case 2:
			System.out.println("sub" + (a-b));
			break;
		case 3:
			System.out.println("multi" + (a*b));
			break;
		case 4:
			System.out.println("div" + (a/b));
			break;
		}
	}
}
