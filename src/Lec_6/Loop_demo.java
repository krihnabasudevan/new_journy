package Lec_6;

public class Loop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(byte i=1;i<=12;i++) {//i++; i = (byte)(i+1)
			System.out.println(i);
			//an infinite loop will if value will 128 and above 
		}
		byte b = 5;
		byte a =4;
		byte c =(byte)(70+90);//out of range will also throw error;
		byte d =(byte)(a+b);//we need to type caste in case of variable in byte ;
		System.out.println(d);
		System.out.println(c);

	}

}
