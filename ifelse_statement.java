package FlowControl_Statements;

import java.util.Scanner;

public class ifelse_statement {
	public static void main(String[]args)
	{
		int age;
		System.out.println("Enter Any Number....");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age>=18)
		{
			System.out.println("Major");
		}
		else
		{
			System.out.println("Minor");
		}
	}

}
