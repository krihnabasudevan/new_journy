package Lec_3;

import java.util.*;

public class Mirror7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
				
			}
			System.out.println();
			i++;
			
		}
		int k =1;
		while(k<=n) {
			int m=n-1;
			while(m>=k) {
				System.out.print("* ");
				m--;
			}
				
			System.out.println();
			k++;
		}

	}

}
