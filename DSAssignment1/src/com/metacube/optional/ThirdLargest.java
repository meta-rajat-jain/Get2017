package com.metacube.optional;
import java.util.Scanner;

public class ThirdLargest {
	public static int getThirdLargest(int[] arr) {
		int firstLargest = arr[0];
		int secondLargest = arr[1];
		int thirdLargest = arr[2];

		for (int i = 3; i < arr.length; i++) {
			if (firstLargest < arr[i]) {
				firstLargest = arr[i];
			} else if (secondLargest < arr[i]) {
				secondLargest = arr[i];
			} else if (thirdLargest < arr[i]) {
				thirdLargest = arr[i];
			}
		}
		if (firstLargest < secondLargest) {
			if (firstLargest < thirdLargest) {
				return firstLargest;
			} else {
				return thirdLargest;
			}
		} else if (secondLargest < thirdLargest) {
			if (secondLargest < firstLargest) {
				return secondLargest;
			} else {
				return thirdLargest;
			}
		} else if (thirdLargest < firstLargest) {
			if (thirdLargest < secondLargest) {
				return thirdLargest;
			} else {
				return secondLargest;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter digit");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(getThirdLargest(arr));
	}
}
