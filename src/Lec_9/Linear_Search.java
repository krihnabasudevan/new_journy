package Lec_9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, -3, 90, 7, -9, 79, -18, 902 };
		int item= 79 ;
		System.out.println(search(arr,item));
			
		}
		public static int search(int []arr,int item ) {
			for(int i = 1; i<=arr.length-1; i++) {
				if(arr[i]==item) {
					return i;
				}
			
		}
			return -1;

	}

}
