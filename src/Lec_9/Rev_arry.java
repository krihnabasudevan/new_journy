package Lec_9;

public class Rev_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 4, 5, 67, 89, 10, 12 };
		RevArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void RevArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
