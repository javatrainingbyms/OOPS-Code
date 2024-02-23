
public class StudentData {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRno(101);
		student.setName("abcd");
		student.setAddress("indore");
		student.setMobile("9090933445");
		student.setEmail("abcd@gmail.com");
		
		String res=student.toString();
		System.out.println(res);
	}

}
