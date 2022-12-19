package Lec_3;

import java.util.Scanner;

public class Mirror_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=n;
			while(j>i) {
				System.out.print("  ");
				j--;
			}
			int k =1;
			while(k<=i) {
				System.out.print("* ");
				k++;
				
			}			int m =2;
			while(m<=i) {
				System.out.print("* ");
				m++;
				
			}
			System.out.println();
			i++;
		}

	}

}
