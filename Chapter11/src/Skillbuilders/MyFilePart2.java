package Skillbuilders;

import java.util.Scanner;
import java.io.*;

public class MyFilePart2
{

	public static void main(String[] args)
	{
		File textFile;
		String response;

		Scanner input = new Scanner(System.in);

		textFile = new File("C:\\Users\\38128011\\git\\CS30P2\\Chapter11\\src\\Skillbuilders\\zzz.txt");


		if (textFile.exists())
		{
			System.out.println("zzz.txt already exists.");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("File named zzz.txt has been created");
			}
			catch (IOException e)
			{
				System.out.println("File couldn't be created");
				System.err.println("IOexception" + e.getMessage());
			}

		}

		System.out.println("Would you like to keep this file? (Y/N): ");
		response = input.nextLine();
		if (response.equalsIgnoreCase("N"))
		{
			if (textFile.delete())
			{
				System.out.println("File has been deleted.");
			}
		}
		else
		{
			System.out.println("File has been kept.");
		}

	}

}
