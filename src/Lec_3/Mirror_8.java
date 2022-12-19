package Lec_3;

import java.util.*;

public class Mirror_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 1;
		int i = 1;
		while (i <= 2 * n - 1) {
			int j = 1;
			while (j <= s) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
			if (i <= n) {
				s++;
			} else {
				s--;
			}
		}

	}

}
