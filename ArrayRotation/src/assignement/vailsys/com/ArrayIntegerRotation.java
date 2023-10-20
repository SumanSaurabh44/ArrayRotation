package assignement.vailsys.com;

import java.util.Scanner;

public class ArrayIntegerRotation {
	public static int[] rotateArray(int[] arr, int positions) {
		//To handle negative positions to rotate by throwing an error message
		if (positions < 0) {
			throw new IllegalArgumentException("Negative values for the positions to rotate are not allowed!");
		}
		//Calculate the effective number of positions to rotate by taking the remainder of the specified positions with the length of the array. 
		//This step ensures that the rotation doesn't exceed the length of the array
		int effectivePositions = positions % arr.length;
		int[] rotatedArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int newIndex = (i - effectivePositions + arr.length) % arr.length;
			rotatedArray[newIndex] = arr[i];
		}
		return rotatedArray;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Enter the positions to rotate:");
		Scanner sc=new Scanner(System.in);
		int positionsToRotate=sc.nextInt();
		int[] rotatedArr = rotateArray(arr, positionsToRotate);
		for (int num : rotatedArr) {
			System.out.print(num + " ");
		}
	}
}
