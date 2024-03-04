package str.demo;

import java.lang.reflect.Field;

public class StringMethodsOne {

	public static void main(String[] args) throws Exception {
		
		String s1="gopi";
		String s2="Gopi";
		int n=s1.compareTo(s2);
		//System.out.println(n);
		
		Class c=Class.forName("str.demo.Demo");
		Field fields[]=c.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getName());
			//field.get(ERIC);
			//System.out.println(field.toGenericString());
			field.setAccessible(true);
			String str="";
			System.out.println(field.get(str));
		
		}
		/*
		String correctId = new String("serosoft");
		String correctPassword = new String("indore");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		String id = sc.next();
		System.out.println("Enter Pwd : ");
		String pwd = sc.next();

		if (id.equalsIgnoreCase(correctId)) {
			if (pwd.equals(correctPassword)) {
				System.out.println("Valid Credentials....!");
			}else {
				System.out.println("Invalid Password...!");
			}
		} else {
			System.out.println("Invalid Id...!");
		}
		*/
	}

}
/*
 * non-static
 * 
 * boolean equals(String)
 * boolean equalsIgnoreCase(String)
 * boolean startsWith(String)
 * boolean endsWith(String)
 * int compareTo(String)
 *       int n=s1.compareTo(s2);
 *       s1>s2       +ve
 *       s1<s2       -ve
 *       s1=s2       0
 */
