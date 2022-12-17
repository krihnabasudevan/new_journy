package Lec_2;

import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int Star = n;
		while (row <= n) {
			int cst = 1;
			while (cst <= Star) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
		}
	}

}
