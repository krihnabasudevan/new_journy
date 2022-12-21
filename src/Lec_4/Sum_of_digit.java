package Lec_4;

import java.util.*;

public class Sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		while(n>0){
			int m = n % 10;
			j = j+ m;
			n=n/10;
		}
		System.out.println(j);
	}

}
