package Lec_2;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int row =1;
	
		while(row<=n) {
			int cst =1;
			while(cst<=row) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
