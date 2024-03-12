package str.demo;

import java.util.StringTokenizer;

public class StringTokenizerMethods {

	public static void main(String[] args) {
		String cities="indore,bhopal,delhi,chennai goa;pune";
		
		//StringTokenizer st=new StringTokenizer(cities);
		StringTokenizer st=new StringTokenizer(cities, ",; o");
		
		while(st.hasMoreTokens()) {
			String item=st.nextToken();
			System.out.println(item);
		}

	}

}

/*
 	StringTokenizer(String)
 	StringTokenizer(String,String)
 	
 
*/
