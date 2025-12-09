package Skillbuilders.ObjectInsertionSort;

import java.util.Scanner;
import java.util.Random;

public class ObjectsInsertionSort
{

	public static void displayArray(Circle[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("\n");
	}

	public static void sortObjectArray()
	{
		Scanner input = new Scanner(System.in);
		int numObjects;
		Circle[] test;
		Random rand = new Random();

		System.out.print("Enter number of objects: ");
		numObjects = input.nextInt();
		input.close();

		/* populate array */
		test = new Circle[numObjects];
		for (int i = 0; i < test.length; i++)
		{
			test[i] = new Circle(rand.nextInt(10));
		}
		System.out.println("Unsorted:");
		displayArray(test);

		Sorts.insertionSort(test);

		System.out.println("Sorted:");
		displayArray(test);
	}

	public static void main(String[] args)
	{
		sortObjectArray();
	}
}