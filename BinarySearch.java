package bptnpresentation.week4;

import java.util.Arrays;

public class BinarySearch {
	// Recursive binary search implementation
	public static boolean bs1(int[] arr, int key, int left, int right) {

		if (left > right) {

			return false;
		}
		
		int mid = (left + right) / 2;
		
		if (arr[mid] == key) {
			
			return true;
			
		} else if (key < arr[mid]) {
			
			return bs1(arr, key, left, mid - 1);
			
		} else {
			
			return bs1(arr, key, mid + 1, right);
		}
	}

	// Iterative binary search implementation
	public static boolean bs2(int[] arr, int key, int left, int right) {
		if (left > right) {
			return false;
		}

		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == key) {
				return true; // Key found
			} else if (key < arr[mid]) {
				right = mid - 1; // Search in the left half
			} else {
				left = mid + 1; // Search in the right half
			}
		}

		return false; // Key not found
	}

	public static void main(String[] args) {
		// Sample sorted array
		int[] a = { 2, 3, 6, 7, 8 };

		Arrays.sort(a);

		// Call the binary search
		//boolean result1 = bs1(a, 12, 0, a.length - 1);
		boolean result2 = bs2(a, 7, 0, a.length - 1);

		// Print the results
		//System.out.println("Recursive Binary Search Result: " + result1);
		System.out.println("Iterative Binary Search Result: " + result2);
	}
}
