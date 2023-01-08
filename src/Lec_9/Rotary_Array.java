package Lec_9;

import java.util.*;

public class Rotary_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = sc.nextInt();
		RotateArray(arr, k);
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void RotateArray(int[] arr, int k) {
		k = k % arr.length;
		for (int j = 1; j <= k; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];

			}
			arr[0] = temp;
		}
	}

}