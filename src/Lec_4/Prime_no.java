package Lec_4;

import java.util.*;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f= 0;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				f++;
				break;
			}
		}
		if(f==1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
