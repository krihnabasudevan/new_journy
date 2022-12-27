package Lec_7;

public class Global_variable_demo {
static int val = 100;//always make it out side of method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int x =90;
		System.out.println(val);
		fun(x);
		fun2(x);
		System.out.println(val);
		

	}
	public static void fun(int x ) {
		System.out.println(x);
		int val = 81;
		System.out.println(val);
	}
	public static void fun2(int x ) {
		System.out.println(x);		
		System.out.println(val);
		val = 120;
		System.out.println(val);
	}
}
