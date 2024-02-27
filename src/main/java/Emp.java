import lombok.Data;

@Data
public abstract class Emp {
	private int code;
	private String name;
	private int salary;
	
	public Emp() {
		
	}
	public Emp(int code, String name, int salary) {
		this.code = code;
		this.name = name;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("Code : "+code);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
	public abstract void computeNetSalary();
	
}
