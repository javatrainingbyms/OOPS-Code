package str.demo;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		String names[]= {"gopi","harsh","manoj","rajesh","mahendra","sumit","om","prakash"};
		
		//StringJoiner sj=new StringJoiner("<<-->>");
		StringJoiner sj=new StringJoiner("#","[","]");
		for(String name:names) {
			sj.add(name.substring(0, 3));
		}
		String result=sj.toString();
		System.out.println(result);
		//System.out.println("{"+result+"}");
		/*
		String result="";
		for(String name:names) {
			result=result+name+"-";
		}
		result=result.substring(0,result.length()-1);
		System.out.println(result);
		*/
		
		//int age=30;
		//String city="Hyderabad";
		//System.out.println("Age of Gopi is "+age+" and he is from "+city);
		//System.out.printf("Age of Gopi is %d and he is from %s",age,city);
	}

}
