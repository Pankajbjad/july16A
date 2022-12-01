package logicalprograms;

import java.util.Scanner;

public class AcceptInputFromUser 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);			//nextint    //use to accept int input from user
		System.out.print("enter num1: ");			//use print statment
		
		int num1 = s1.nextInt();
		
		
		System.out.print("enter num2: ");
		int num2 = s1.nextInt();
		
		System.out.println(num1+num2);
			
		
		
		
		
		}

}
