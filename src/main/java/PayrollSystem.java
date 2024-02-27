import java.util.ArrayList;

public class PayrollSystem {

	public static void printSalarySlip(Emp emp) {
		emp.computeNetSalary();
	}
	
	public static void show(Object obj) {
		
	}
	
	
	public static void main(String[] args) {
		PermEmp emp1=new PermEmp(101,"abc",50000,"engg","se");
		TempEmp emp2=new TempEmp(102,"xyz",50000,20);

		printSalarySlip(emp1);
		printSalarySlip(emp2);
		
		show(emp1);
		show(emp2);
		show("abc");
		ArrayList list=new ArrayList();
	
	}

}
