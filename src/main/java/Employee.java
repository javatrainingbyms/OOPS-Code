import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int code;
	private String name;
	private String desg;
	//setter, getter, constructors, toString method, equals method
	
	
	
	public static void main(String[] args) {
	
		String s1=new String("indore");
		String s2=new String("indore");
		System.out.println(s1.equals(s2));
		Employee e1=new Employee(111,"abc","mgr");
		Employee e2=new Employee(111,"abc","mgr");
		Employee e3=e1;
		System.out.println(e1==e2);
		//System.out.println(e1==e3);
		boolean result=e1.equals(e2);
		System.out.println(result);
		
		/*
		Employee emp1=new Employee();
		emp1.setCode(111);
		emp1.setName("abc");
		emp1.setDesg("manager");
		
		Employee emp2=emp1;
		
		System.out.println("emp 1 : "+emp1);
		System.out.println("emp 2 : "+emp2);
		//emp2.desg="sr.mgr.";
		//System.out.println(emp1);
		//System.out.println(emp2);
		
		emp2=new Employee(112, "xyz", "qa");
		System.out.println("emp 2 : "+emp2);
		*/
	}



	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + code; result = prime * result + ((desg == null) ? 0
	 * : desg.hashCode()); result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 * 
	 * 
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (code != other.code) return false;
	 * if (desg == null) { if (other.desg != null) return false; } else if
	 * (!desg.equals(other.desg)) return false; if (name == null) { if (other.name
	 * != null) return false; } else if (!name.equals(other.name)) return false;
	 * return true; }
	 */
	
}
