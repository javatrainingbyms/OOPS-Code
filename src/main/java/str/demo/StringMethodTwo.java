package str.demo;

import java.util.Scanner;

public class StringMethodTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Password : ");
		String password=sc.next();
		byte b[]=password.getBytes();
		for(byte item:b) {
			System.out.println(item);
		}
		/*
		char charArr[]=password.toCharArray();
		int noOfDigits=0;
		for(char ch:charArr) {
				if(ch>=48 && ch<57) {
					noOfDigits++;
				}
		}
		System.out.println(noOfDigits);
		*/
		/*
		//min 8 chars, atleast 2 digits
		int length=password.length();
		if(length>=8) {
			int noOfDigits=0;
			for(int i=0; i<length; i++) {
				char ch=password.charAt(i);
				//System.out.println(ch);
				if(ch>=48 && ch<57) {
					noOfDigits++;
				}
			}
			if(noOfDigits>=2) {
				System.out.println("Valid Password...");
			}else {
				System.out.println("Atleast Two Digits Required ...");
			}
		}else {
			System.out.println("Minimum Length Must Be 8. ");
		}
		*/
	}

}

/*
 	int length() char charAt(int)
  	char[] toCharArray()
  	byte[] getBytes()
  
 */