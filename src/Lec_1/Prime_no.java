package Lec_1;
import java.util.*;
public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count =0;
		int i =2;
		while(i<=n/2) {
			if(n%i==0) {
				count =count+1;
			}
			i=i+1;
		}
			if(count>=1) {
				System.out.println("prime");
				
			}else {
				System.out.println("not prime");
			}
		

	}

}
