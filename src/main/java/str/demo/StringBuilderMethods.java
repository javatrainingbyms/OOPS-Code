package str.demo;

public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdefgh");
		System.out.println(sb);
		//sb.append("XYZ");
		//sb.insert(2, "XYZ");
		//sb.replace(1, 4, "XYZ");
		//sb.setCharAt(2, 'Z');
		System.out.println(sb.length());
		sb.setLength(12);
		System.out.println(sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
/*
 	append, insert, replace, setCharAt, setLength, reverse
*/