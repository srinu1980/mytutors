package com.cts.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

	// recursive bubble sort
	private void bubbleSort(int arr[], int n) {
		// Base case
		if (n == 1)
			return;

		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				// swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n - 1);
	}

	// Simple logic using for loops
	private void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// optimized
	private void optimizedBubbleSort(int[] arr) {
		int i = 0, n = arr.length;

		boolean swapNeeded = true;
		while (i < n - 1 && swapNeeded) {
			swapNeeded = false;
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					swapNeeded = true;
				}
			}
			if (!swapNeeded)
				break;
			i++;
		}
	}

	public static void main(String[] args) {

		final int[] arr = { 1, 4, 5, 6, 7, 8, 2, 3 };
		final BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Before sorting the array elements : " + Arrays.toString(arr));
		bubbleSort.bubbleSort(arr);

		System.out.println("After sorting the array elements : " + Arrays.toString(arr));

		bubbleSort.optimizedBubbleSort(arr);
		System.out.println("After sorting the array elements order : " + Arrays.toString(arr));

		bubbleSort.bubbleSort(arr, arr.length);
		System.out.println("After sorting the array elements order : " + Arrays.toString(arr));
	}
}