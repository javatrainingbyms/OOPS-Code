package str.demo;

public class PalindromeTest {

	public static void main(String[] args) {
	
		String s1="kanika";
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=sb.toString();
		if(s1.equals(s2)) {
			System.out.println("Its palindrome...");
		}else {
			System.out.println("Its not a palindrome...");
		}
		/*
		String s="Rats live on no evil star";
		s=s.toLowerCase();
		boolean palindrome=true;
		int len=s.length();
		int j=len-1;
		for(int i=0; i<len/2 ; i++) {
			System.out.println("Comparing "+i+" and "+j);
			char start=s.charAt(i);
			char end=s.charAt(j);
			if(start!=end) {
				palindrome=false;
				break;
			}
			j--;
		}
		
		if(palindrome) {
			System.out.println("Its a palindrome...!");
		}else {
			System.out.println("Its not a palindrome...!");
		}
	*/
	}

}
