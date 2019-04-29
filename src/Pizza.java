package pizza_google_hashcode_practice;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.lang.*; 


public class Pizza {

	public static void main(String[] args) throws IOException 
	{
		
        //text file, should be opening in default text editor
        String path = "Z:\\Users\\els\\eclipse-workspace\\pizza_google_hashcode_practice";
		File file_pizza_a = new File(path + "\\a_example.in");
		File file_pizza_b = new File(path + "\\b_small.in");
		File file_pizza_c = new File(path + "\\c_medium.in");
		File file_pizza_d = new File(path + "\\d_big.in");
		Scanner PizzaFile;
		String PizzaFile_ReadLine;
		int FileContainsNumLines = 0;
		
		// fix me add a loop and switch for file names. 
		for(int i =0; i<4; i++) // four files
		{				
			switch(i) {
			case 0 : 
				PizzaFile = new Scanner(file_pizza_a); // OPEN pizza file.
				while( PizzaFile.hasNextLine() )
	 			{
	 			  PizzaFile_ReadLine = PizzaFile.nextLine(); // READ file.
	 			  FileContainsNumLines++;
	 			} 
	 			PizzaFile.close();
	 			char[] PizzaPie0Array = new char[FileContainsNumLines];
	 			PizzaFile = new Scanner(file_pizza_a); // OPEN pizza file.
				break;
			case 1 : 
				PizzaFile = new Scanner(file_pizza_b); // OPEN pizza file.
				break;
			case 2 : 
				PizzaFile = new Scanner(file_pizza_c); // OPEN pizza file.
				break; 
			default : 	
				PizzaFile = new Scanner(file_pizza_d); // OPEN pizza file.
				break; 
			}
			// Read files:
			System.out.println();
			PizzaFile_ReadLine = PizzaFile.nextLine(); // READ pizza file.

 			while(PizzaFile_ReadLine.length() > 0 ) // WHILE not a blank line
 			{  	 
 				System.out.println(PizzaFile_ReadLine);
				charArray buildPizzaArray(String PizzaFile_ReadLine)
 			 			   
				if( PizzaFile.hasNextLine() )
				{
					PizzaFile_ReadLine = PizzaFile.nextLine(); // READ file.
				} 
				else {  break; }
 			
 			} // ENDWHILE pizza 					
 			PizzaFile.close(); 
 			
		} // End For loop
	}// end class main
	
  public String[] buildPizzaArray(String pizzaContains) 
  {	  
	  String[] charArray = new char[pizzaContains.length()];
	   if(pizzaContains != null && pizzaContains.length() > 0)
	   { 
		   for(int i=0; i<pizzaContains.length(); i++)
		   {	   
			   charArray[i] = pizzaContains.charAt(i);
		   }	   
	   }   
	   return charArray;
   }
  
  
} // end class  Pizza
