package QuickSort;

import java.util.Scanner;

public class TestQuickSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		QuickSorting.quickSort(arr, 0, n - 1);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
