
public class StudentData {

	public static void main(String[] args) {
		Student piyush=new Student(101, "piyush", 70);
		Student gopi=new Student(102,"gopi");
		Student amit=new Student();
		Student manoj=new Student();
		
		piyush.setRno(111);
		piyush.setName("piyush");
		piyush.setMarks(70);
		
		gopi.setRno(222);
		gopi.setName("gopi");
		gopi.setMarks(80);
		
		amit.setRno(333);
		amit.setName("amit");
		amit.setMarks(90);
		
		manoj.setRno(444);
		manoj.setName("manoj");
		manoj.setMarks(25);
		
		
		piyush.printInfo();
		gopi.printInfo();
		amit.printInfo();
		manoj.printInfo();
		
		//Student.printOverallResult();
		Student.showAvg(piyush, manoj);
		Student.showAvg(amit, manoj);
		//piyush.showAvg(amit);
		//amit.showAvg(manoj);
	}

}
