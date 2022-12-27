package Lec_7;

import java.util.*;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrong(n));

	}
	public static boolean IsArmstrong(int n) {
		int c = count(n);
		int ans=0;
		int temp =n;
		while(n>0) {
			int rem =n%10;
		    ans =(int)(ans +Math.pow(rem,c));
			n=n/10;
			
		}
		if(ans==temp) {
			return true;
			
		}else {
			return false;
		}
		 
		
		
	}

	public static int  count(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

}
