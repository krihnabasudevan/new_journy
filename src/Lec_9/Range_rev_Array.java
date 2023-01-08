package Lec_9;

import java.util.*;

public class Range_rev_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 23, 4, 5, 67, 89, 10, 12, 90, 78, 8, -1, 24 };
		int i = sc.nextInt();
		int j = sc.nextInt();

		RevArray(arr, i, j);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

	public static void RevArray(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
