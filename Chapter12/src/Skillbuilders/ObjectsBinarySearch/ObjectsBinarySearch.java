package Skillbuilders.ObjectsBinarySearch;

import java.util.Scanner;

public class ObjectsBinarySearch
{

	public static void displayArray(String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("\n");
	}

	public static void searchObjectArray()
	{
		Scanner input = new Scanner(System.in);
		int numObjects;
		String[] test;
		String item;
		int location;

		System.out.print("Enter number of objects: ");
		numObjects = input.nextInt();

		/* populate array */
		test = new String[numObjects];
		for (int i = 0; i < test.length; i++)
		{
			System.out.print("Enter a string: ");
			item = input.next();
			test[i] = item;
		}
		System.out.println("Unsorted:");
		displayArray(test);

		Sorts.mergesort(test, 0, test.length - 1);

		System.out.println("Sorted:");
		displayArray(test);

		/* search for number in sorted array */
		System.out.print("Enter a string to search for: ");
		item = input.next();
		while (!item.equalsIgnoreCase("end"))
		{
			location = Searches.binarySearch(test, 0, test.length - 1, item);
			System.out.println("String at position: " + location);
			System.out.print("Enter a string to search for: ");
			item = input.next();
		}
	}

	public static void main(String[] args)
	{
		searchObjectArray();
	}
}