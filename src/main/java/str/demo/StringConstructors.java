package str.demo;

public class StringConstructors {

	public static void main(String[] args) {
		
		String s1=new String();
		System.out.println(s1);
		
		String s2=new String("indore");
		System.out.println(s2);
		
		char ch[]= {'a','b','c','d','e','f','g','h'};
		String s3=new String(ch);
		System.out.println(s3);
		
		String s4=new String(ch,0,4);//char[],offset,length
		System.out.println(s4);

		byte b[]= {65,66,67,68,69,70,71,72,73,74,75,76};
		String s5=new String(b);
		System.out.println(s5);
		
		String s6=new String(b,4,3);
		System.out.println(s6);
	
	}

}
/*
 	String()
 	String(String)
 	String(char[])
 	String(char[],int,int)
 	String(byte[])
 	String(byte[],int,int)
*/