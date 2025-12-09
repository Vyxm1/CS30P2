/*
Program: TernarySearch.java          Last Date of this Revision: Dec. 9, 2025

Purpose: Modify the Searches class to include a ternarySearch() method. A ternary search, similar to a binary
search, divides an array into three pieces rather than two. A ternary search finds the points that divide
the array into three roughly equal pieces, and then uses these points to determine where the goal
should be searched for.


Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery;

public class TernarySearch
{
	/**
	 * Searches items array for goal.
	 * pre: items is sorted from low to high
	 * post: Position of goal has been returned, or -1 has been returned if goal not found.
	 */
	public static int binarySearch(int[] items, int start, int end, int goal)
	{
		if (start > end)
		{
			return(-1);
		}
		else
		{
			int mid = (start + end) / 2;

			if (goal == items[mid])
			{
				System.out.println("Examining " + mid);
				return mid;
			}
			else if (goal < items[mid])
			{
				System.out.println("Examining " + mid);
				return(binarySearch(items, start, mid - 1, goal));
			}
			else
			{
				System.out.println("Examining " + mid);
				return(binarySearch(items, mid + 1, end, goal));
			}
		}
	}
	
	
	
	public static int ternarySearch(int[] items, int start, int end, int goal)
	{
		if (start > end)
		{
			return(-1);
		}
		else
		{
			
		}
		
	}
}
