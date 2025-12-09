package Skillbuilders.SearchLocations;



 public class Searches
 {
	/**
	 * Searches items array for goal
	 * pre: items is sorted from low to high
	 * post: Position of goal has been returned, or -1 has been returned if goal not found.
	 */
	public static int binarySearch(int[] items, int start, int end, int goal) {

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
				return(mid);
			}
			else if (goal < items[mid])
			{
				System.out.println("Examining " + mid);
				return(binarySearch(items, start, mid-1, goal));
			}
			else
			{
				System.out.println("Examining " + mid);
				return(binarySearch(items, mid+1, end, goal));
			}
		}
	}
}