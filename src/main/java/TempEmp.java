
public class TempEmp extends Emp {
	
	private int days;

	public TempEmp(int code, String name, int salary, int days) {
		super(code, name, salary);
		this.days = days;
	}

	@Override
	public void computeNetSalary() {
		int hra=getSalary()*5/100;
		int net=getSalary()+hra;
		int payableNet=net/31*days;
		System.out.println("Basic : "+getSalary());
		System.out.println("HRA   : "+hra);
		System.out.println("Net   : "+net);
		System.out.println("Net   : "+payableNet+" for "+days+" days.");
		System.out.println("____________________________________");
		
	}

	

	
	
}
