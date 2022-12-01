package logicalprograms;

import java.util.Scanner;

public class AcceptInputFromUserex2 
{
	public static void main(String[] args) 
	{
		Scanner s2=new Scanner(System.in);
		System.out.print("enter num1: ");
		
		int num1 = s2.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = s2.nextInt();
		
		System.out.println(num1*num2);
		
		
	}

}
