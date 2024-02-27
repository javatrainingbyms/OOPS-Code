
public class PermEmp extends Emp {
	private String dept;
	private String desg;
	
	public PermEmp(int code, String name, int salary, String dept, String desg) {
		//this.code=code;
		//this.name=name;
		//this.salary=salary;
		super(code,name,salary);
		this.dept=dept;
		this.desg=desg;
	}
	public void show() {
		super.show();
		System.out.println("Dept : "+dept);
		System.out.println("Desg : "+desg);
	}
	public static void main(String[] args) {
		PermEmp emp1=new PermEmp(101,"manoj",50000,"engg","se");
		emp1.show();
	}
	@Override
	public void computeNetSalary() {
		int hra=getSalary()*10/100;
		int da=getSalary()*20/100;
		int net=getSalary()+hra+da;
		System.out.println("Basic : "+getSalary());
		System.out.println("HRA   : "+hra);
		System.out.println("DA    : "+da);
		System.out.println("Net   : "+net);
		System.out.println("____________________________________");
		
	}
	
}
