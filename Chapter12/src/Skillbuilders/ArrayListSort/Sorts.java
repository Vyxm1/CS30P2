package Skillbuilders.ArrayListSort;


 import java.util.ArrayList;

 public class Sorts 
 {

	/**
	 * Sorts an ArrayList of Double data from low to high
	 * pre: items contains Double elements
	 * post: items has been sorted from low to high
	 */
	public static void selectionSort(ArrayList<Double> items) 
	{		//review
		Double element1, element2;

		for (int index = 0; index < items.size(); index++) 
		{
			for (int subIndex = index; subIndex < items.size(); subIndex++) 
			{
				element1 = items.get(index);
				element2 = items.get(subIndex);
				
				if (element2.compareTo(element1) < 0) 
				{
					items.set(index, element2);
					items.set(subIndex, element1);
				}
			}
		}
	}


	/**
	 * Sorts an array of data from low to high
	 * pre: none
	 * post: items has been sorted from low to high
	 */
	/*
	 public static void selectionSort(int[] items) {
	 

		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex] < items[index]) {
					int temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}
		}
	}


	/**
	 * Sorts an array of objects from low to high
	 * pre: none
	 * post: objects have been sorted from low to high
	 */
	
	/*
	public static void selectionSort(Comparable[] items) {

		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex].compareTo(items[index]) < 0) {
					Comparable temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}
		}
	}


	/**
	 * Sorts an array of integer from low to high
	 * pre: none
	 * post: Integers have been sorted from low to high
	 */
	
	/*
	public static void insertionSort(int[] items) 
	{
		int temp, previousIndex;

		for (int index = 1; index < items.length; index++) {	//start with second item
			temp = items[index];
			previousIndex = index - 1;
			while ((items[previousIndex] > temp) && (previousIndex > 0)) {
				items[previousIndex + 1] = items[previousIndex];
				// decrease index to compare current item to next previous item 
				previousIndex -= 1;
			}
			if (items[previousIndex] > temp) {
				// shift item in first element up into next element position 
				items[previousIndex + 1] = items[previousIndex];
				// place current item at index 0 (first element) 
				items[previousIndex] = temp;
			} else {
				// place current item at index ahead of previous item 
				items[previousIndex + 1] = temp;
			}
		}
	}


	/**
	 * Merges two sorted portion of items array
	 * pre: items[start..mid] is sorted. items[mid+1..end] sorted.
	 * start <= mid <= end
	 * post: items[start..end] is sorted.
	 */
	/*
	private static void merge(int[] items, int start, int mid, int end) {
		int[] temp = new int[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;

		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1  += 1;
			}
			spot += 1;
		}
		// copy values from temp back to items 
		for (int i =  start; i <= end; i++) {
			items[i] = temp[i];
		}

	}


	/**
	 * Sorts items[start..end]
	 * pre: start > 0, end > 0
	 * post: items[start..end] is sorted low to high
	 */
	/*
	public static void mergesort(int[] items, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
		}
	}
	*/
}