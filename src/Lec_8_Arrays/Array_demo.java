 package Lec_8_Arrays;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  []arr= new int [5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++) {
			arr[i]=(100)*(i+1);
		
		}
		for(int i = 0; i<arr.length; i++) {
	
			System.out.print(arr[i]+" ");
		}
		 
		
		
			

	}

}
