package Lec_2;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int i =1;
	
		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
