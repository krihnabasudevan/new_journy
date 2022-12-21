package Lec_4;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a =sc.nextInt();//a = divident 
		int b =sc.nextInt();//b = divisior
		while(a%b!=0) {
			int c =a%b;//c is the remender
			a=b;
			b=c;
		}
System.out.println(b);
	}

}
