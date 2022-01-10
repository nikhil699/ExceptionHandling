package com.wipro.exceptionhandling;
import java.util.*;
import java.util.Scanner;
public class ExampleEH1 
{
	public static void main(String[] args) 
	{
		  int a;
		  int i;
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter How Many Value You Want Too Enter");
		  a=scan.nextInt();	
		  System.out.println("! Now Enter Your Value");
		  int array[] = new int[a];
		  for(i=0;i<a;i++)
		  {
			  array[i]=scan.nextInt();
		  }
		  try
		  {
			System.out.println("Enter Your Value Which You Want To Print !!!!!");
			int p = scan.nextInt();
			System.out.println("Your Input Is "+p+" And our Output IIs "+array[p-1]);
			
		  }
		  catch(ArrayIndexOutOfBoundsException ex)
		  {
			  System.out.println("Array Index Out Of Bounds Exception");
		  }
		  catch(InputMismatchException e)
		  {
			 System.out.println("Java.util.InputMismatchException    "); 
		  }
		 
	}
 
  
}
