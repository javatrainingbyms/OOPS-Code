import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff extends Person {
	private String code;
	private String dept;
	private String desg;
	private int salary;
	// private String city="MUMBAI";

	@Override
	public void show() {
		System.out.println("show from staff..");
	}

	public void display() {
		super.show();
		// System.out.println(super.city);
		/// System.out.println(city);
	}

	public String toString() {
		String info = super.toString() + "," + dept + "," + desg;
		return info;
	}

	public static void main(String[] args) {
		Staff staff = new Staff();
		// staff.show();
		//staff.display();
		staff.toString();
		/*
		 * staff.setName("xyz"); staff.setAddress("bhopal"); staff.setDept("mkt");
		 * staff.setDesg("manager"); staff.setMobile("90909445566"); String
		 * str=staff.toString(); System.out.println(str);
		 */
	}

}
