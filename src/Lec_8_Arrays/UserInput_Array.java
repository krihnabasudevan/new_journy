package Lec_8_Arrays;

import java.util.*;

public class UserInput_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		display(arr);

	}
	public static void display(int []drr) {
		for (int i = 0; i < drr.length; i++) {
			System.out.print(drr[i]+" ");
		}
		System.out.println();
		
	}

}
