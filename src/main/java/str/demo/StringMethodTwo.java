package str.demo;

import java.util.Scanner;

public class StringMethodTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Password : ");
		String password=sc.next();
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
		
	}

}

/*
 * int length() char charAt(int)
 * 
 * 
 */