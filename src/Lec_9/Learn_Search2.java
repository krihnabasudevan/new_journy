package Lec_9;

import java.util.*;

public class Learn_Search2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();

		}
		int item = sc.nextInt();
		System.out.println(search(arr,item));

	}

	public static int search(int[] arr, int item) {
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;
	} 

}
