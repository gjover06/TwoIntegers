/**
Author:George Samu
Date:5/24/2020

*/
import java.util.Scanner;

public class TwoIntegers
{
	public static void main (String[]args)
	{
	//Describe the program
	System.out.print("The following will test ");
	System.out.print("whether one integer is a multiple");
	System.out.print(" of a second integer");
	
	//Space between
	System.out.println();
	
	// collect data of first Integer
	Scanner keyboard =new Scanner(System.in);
	System.out.println("Enter the first integer: ");
	double firstInteger= keyboard.nextDouble();
	
	//collecting Second integer
	System.out.println("Enter the second integer: ");
	double secondInteger=keyboard.nextDouble();
	
	double remainder=firstInteger%secondInteger;
	
	System.out.println("Enter the first integer: " + firstInteger);
	System.out.println("Enter the second integer: " + secondInteger);
	System.out.println(firstInteger+" is a a multiple of "+ secondInteger+
						" if the following" + " is zero: "+ remainder);
	
	}//end main
}//end 