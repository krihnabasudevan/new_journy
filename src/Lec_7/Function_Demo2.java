package Lec_7;

public class Function_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		//addTwoNumber();
		System.out.println(addTwoNumber());//when return value need to be printed it need to be capture in some variable
		int m = addTwoNumber();
		System.out.println(m);
		System.out.println("bey");

	}
	public static int  addTwoNumber() {//int indicate the return type 
		int a =9;
		int b = 11;
		int c = a+b; //here all the variables are local and have scope only in this function
//		System.out.println(c);
		return c;
	}

}
