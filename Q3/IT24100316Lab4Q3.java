import java.util.Scanner;

public class IT24100316Lab4Q3{
  public static void main (String[] args){

 //define variables
	double number;
	String result;
 
//create scanner 
	Scanner numb = new Scanner(System.in);

//take user input
	System.out.println("Enter a number :");
	number = numb.nextDouble();

//use ternary operator
	result = (number==0) ? "The number is: Zero" :
		 (number<0) ? "The number is: Negative" :
		 "The number is: Positive" ;

//print result
	System.out.println(result);
 
 }
}