package Lec_4;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int p =a*b;
		while(a%b!=0) {
			int c =a%b;
			a=b;
			b=c;
		}
		int Lcm =p*b;
		System.out.println(Lcm);

	}

}
