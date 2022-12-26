package Lec_5;
import java.util.*;
public class Pascal_trinagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int row = 0;
//		int str = 0;

		while (row < n) {

			int i = 0;
			int ncr = 1;
			while (i <= row) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			row++;
//			str++;
			System.out.println();

		}

	}

}
