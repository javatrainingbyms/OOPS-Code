import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Human {
	
	private String name;
	private int age;
	
	public void showName() {
		System.out.println("Name : "+name);
		this.showAge();
	}
	public void showAge() {
		System.out.println("Age  : "+age);
	}
	public static void main(String[] args) {
		Human gopi=new Human("Gopi",30);
		gopi.showName();
	}
}
