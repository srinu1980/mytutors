package com.cts.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

	void selectionSort(int arr[]) {
		int size = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < size - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i + 1; j < size; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort selectionSortb = new SelectionSort();
		int arr[] = { 20, 10, 5, 6, 2, 3, 4 };

		System.out.println("Before Sorting an array : " + Arrays.toString(arr));
		selectionSortb.selectionSort(arr);
		System.out.println("After Sorting an array : " + Arrays.toString(arr));
	}
}