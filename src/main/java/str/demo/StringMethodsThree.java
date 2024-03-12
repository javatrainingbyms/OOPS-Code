package str.demo;

public class StringMethodsThree {

	public static void main(String[] args) {
		
		String str="this is java code and java is object oriented";
		int idx=str.indexOf("is",28);
		System.out.println(idx);
		
		//int idx=str.indexOf('j', 33);
		//System.out.println(idx);
		
		//all occurences and count also
		/*
		int start=0;
		int count=0;
		
		while(true) {
			int idx=str.indexOf('j',start);
			if(idx==-1)break;
			count++;
			System.out.println(idx);
			start=idx+1;
		}
		
		System.out.println("Total Occurences : "+count);

*/
		

	}

}
/*
 	int indexOf(char)
 	int indexOf(char,int)
	int indexOf(String)
	int indexOf(String,int)
	
*/