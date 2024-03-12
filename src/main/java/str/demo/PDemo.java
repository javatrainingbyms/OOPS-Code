package str.demo;

public class PDemo {

	public static void main(String[] args) {
		
		
		
		String s="Rats live on no evil star";
		//s=s.toUpperCase();
		int len=s.length();
		int j=len-1;
		boolean found=true;
		
		for(int i=0; i<len/2; i++) {
			char start=s.charAt(i);
			char end=s.charAt(j);
			if(start!=end) {
				found=false;
				break;
			}
			j--;
		}
		if(found) {
			System.out.println("Its palindrome");
		}else {
			System.out.println("Its not palindrome");
		}
	}

}
