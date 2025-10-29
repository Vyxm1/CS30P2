package Skillbuilders;

import java.io.File;
import java.util.Scanner;

public class MyFilePart1
{

	public static void main(String[] args)
	{
		File textFile;
		String fileName;
		
		Scanner input = new Scanner(System.in);
		
		// Obtain file name from user
		System.out.println("Enter file name: ");
		fileName = input.nextLine();
		
		// Determine if file exists
		textFile = new File(fileName);
		
		if (textFile.exists())
		{
			System.out.println("File exists.");
		}
		else
		{
			System.out.println("File does not Exist.");
		}
	}

}
