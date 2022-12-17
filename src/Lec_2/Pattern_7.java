package Lec_2;

import java.util.*;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (i == 1 || i == n) {
				int j = 1;
				while (j <= n) {
					System.out.print("* ");
					j++;
				}
			} else {
				System.out.print("* ");
				int k = 1;
				while (k <= n - 2) {
					System.out.print("  ");
					k++;
				}
				System.out.print("* ");
			}

			System.out.println();
			i++;
		}
	}

}
