import java.util.Scanner;

public class IT24100316Lab4Q2{
  public static void main (String[] args){

 //define variables
	double examMarks,examPercentage,labMarks,labPercentage,Final_Exam_Marks;

//create scanner
	Scanner exam = new Scanner(System.in);

//take input and validate
	System.out.println("please enter exam marks(out of 100):");
	examMarks = exam.nextDouble();
	if(0>examMarks || examMarks>100)
		{System.out.println("Invalid input for exam marks.Terminating program");} 
	
	System.out.println("please enter the percentage given for the exam:");
	examPercentage = exam.nextDouble();
		if(0>examPercentage || examPercentage>100)
		{System.out.println("The percentage must add up to 100.Terminating program");}  
	
	System.out.println("please enter lab marks(out of 100):");
	labMarks = exam.nextDouble();
	if(0>labMarks || labMarks>100)
		{System.out.println("Invalid input for lab marks.Terminating program");}  
	
	System.out.println("please enter the percentage given for the lab submission:");
	labPercentage = exam.nextDouble();
		if(0>labPercentage || labPercentage>100)
		{System.out.println("The percentage must add up to 100.Terminating program");}   	

//calculation
	Final_Exam_Marks = examMarks*(examPercentage/100) + labMarks*(labPercentage/100);

//validate final exam marks and take output
		if(0>Final_Exam_Marks || Final_Exam_Marks>100)
		{System.out.println("Invalid input:exam marks can't be upto 100");} 	
		else
		System.out.println("Final exam mark is:"+Final_Exam_Marks);
		
  
  }
}