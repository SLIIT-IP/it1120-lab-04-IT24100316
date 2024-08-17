import java.util.Scanner;

public class IT24100316Lab4Q1{
  public static void main (String[] args){

 //define variables
	double number;

//create scanner
	Scanner num = new Scanner(System.in);

//take input
	System.out.println("Enter a number:");
	number = num.nextDouble(); 	

//calculation
	if(number==0)
		{System.out.println("The number is Zero");}
	else if(number>0)
		{System.out.println("The number is: Positive");}
	else
		{System.out.println("The number is: Negative");}
	
  
  }
}