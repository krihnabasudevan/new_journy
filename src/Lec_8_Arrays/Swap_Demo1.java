package Lec_8_Arrays;

public class Swap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int []arr= {10,20,30,40 ,50};
		int []other=arr;
		System.out.println(arr);
		System.out.println(other);
		System.out.println(arr[0]+" "+arr[1]);
		
		
		swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);//will not change the value because there will not be any change in heap 
		

	}
	public static void swap(int a , int b ) {
		int temp = a ;
		a=b;
		b=temp;
		System.out.print(a+" ");
		System.out.println(b);

		
	}

}
