class X {
	
	public X() {
		System.out.println("X-0");
	}
	public X(int x) {
		System.out.println("X-1");
	}
	public X(int x, int y) {
		System.out.println("X-2");
	}
	public X(String s) {
		System.out.println("X-S-1");
	}
}
class Y extends X {
	public Y() {
		super(1,2);
		System.out.println("Y-0");
	}
	public Y(int x) {
		super(1);
		System.out.println("Y-1");
	}
	public Y(int x, int y) {
		//super("abc");
		System.out.println("Y-2");
	}
}
public class Demo {
	public static void main(String[] args) {
		Y ob=new Y(1,2);
		
	}
}
