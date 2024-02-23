import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
	private String name;
	private String address;
	private String mobile;
	private String email;
	public String city="INDORE";
	
	public  void show() {
		System.out.println("show from person....!");
	}
	
	
	@Override
	public String toString() {
		return name+","+address+","+mobile+","+email;
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("abc"); p.setMobile("9090933344"); p.setEmail("abc@gmail.com"); p.setAddress("indore");
		String str=p.toString();
		System.out.println(str);
		
	}
}
