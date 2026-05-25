package com.cts.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
	/* Function to sort array using insertion sort */
	private void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String args[]) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = { 20, 10, 5, 6, 2, 3, 4 };

		System.out.println("Before Sorting an array : " + Arrays.toString(arr));
		insertionSort.insertionSort(arr);
		System.out.println("After Sorting an array : " + Arrays.toString(arr));
	}
}