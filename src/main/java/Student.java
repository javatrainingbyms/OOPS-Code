import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//blueprint of a Student

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
	//properties of object (data members)
	private int rno;
	private int marks;
	private static int totalPassed;
	private static int totalFailed;
	
	public String toString() {
		return super.toString()+","+rno+","+marks;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getRno() {
		return this.rno;
	}

	
	public void info() {
		System.out.println("Roll No. : "+rno);
		System.out.println("Name     : "+getName());
		System.out.println("_____________________________________");
	}
	
	public static void showAvg(Student s1, Student s2) {
		System.out.println("Avg Marks : "+(s1.marks+s2.marks)/2);
	}
	
	public static void printOverallResult() {
		System.out.println("Total Passed : "+totalPassed);
		System.out.println("Total Failed : "+totalFailed);
		System.out.println("========================================");
	}
	public void printInfo() {
		System.out.println("Roll No : "+rno);
		System.out.println("Name    : "+getName());
		System.out.println("Marks   : "+marks);
		if(marks>=33) {
			System.out.println("Candidate Passed With : "+marks);
			totalPassed++;
		}else {
			System.out.println("Candidate Failed With : "+marks);
			totalFailed++;
		}
		System.out.println("_____________________________________");
	}

	

}
