package com.basicprograms.exceptions;
import java.io.*;
public class CreateException 
{
	public static void main(String[] args)
	{
        try 
        {
            // Code that might throw either IOException or FileNotFoundException
            FileReader file = new FileReader("somefile.txt");
            try (BufferedReader fileInput = new BufferedReader(file))
            {
				System.out.println(fileInput.readLine());
			}
        }
        catch (IOException e) 
        {
            System.out.println("Exception caught: " + e);
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }
        
        System.out.println("Program continues...");
	}
}
