package Lec_3;
import java.util.*;
public class Mirror_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int i =1;
	
		while(i<=n) {
			int j =1;
			while(j<i) {
				System.out.print("  ");
				j++;
			}
			int k = n;
			while(k>=i) {
				System.out.print("* ");
				k--;
			}
			int m = n;
			while(m>i) {
				System.out.print("* ");
				m--;
			}
			System.out.println();
			i++;
		}

	}

}
