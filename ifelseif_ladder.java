package FlowControl_Statements;

import java.util.Scanner;

public class ifelseif_ladder {
	public static void main(String[]args)
	{
		int marks;
		System.out.println("Enter Any number");
		Scanner s=new Scanner(System.in);
		marks=s.nextInt();
		if(marks>80)
		{
			System.out.println("Topper");
		}
		else if(marks<80 && marks>=70)
		{
			System.out.println("First");
		}
		else if(marks<70 && marks>=60)
		{
			System.out.println("second");
		}
		else
		{
			System.out.println("third");
		}
	}
}
