package Lec_9;
import java.util.*;
public class Rotate_Array_revAlgo {

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
	public static void RotateArray(int []arr, int k ) {
		k=k%arr.length;
		int n = arr.length;
		RevArray(arr,0,n-k-1);
		RevArray(arr,n-k,n-1);
		RevArray(arr,0,n-1);
		
		
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
