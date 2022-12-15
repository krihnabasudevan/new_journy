package Lec_1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 91;
		if (n > 90) {
			System.out.println("A+");

		} else if (n > 80 && n <= 90) {
			System.out.println("A");
		} else if (n > 70 && n <= 80) {
			System.out.println("B+");
		} else if (n > 60 && n <= 70) {
			System.out.println("B");
		} else if (n > 50 && n <= 60) {
			System.out.println("c+");
		} else if (n > 40 && n <= 50) {
			System.out.println("c");
		} else if (n > 30 && n <= 40) {
			System.out.println("D");
		} else {
			System.out.println("your have failed");
		}

	}

}
