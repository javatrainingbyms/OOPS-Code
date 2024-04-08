package ex.code;

public class PropExample {
	public static void div(int a, int b) {
		System.out.println("Start-of-div...");
		try {
			System.out.println(a / b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled In div....!");
		}
		System.out.println("End-of-div...");
	}

	public static void callDiv(int x, int y) {
		System.out.println("Start-of-callDiv...");
		try {
			div(x, y);
		} catch (Exception e) {
			System.out.println("Handled In callDiv....!");
		}
		System.out.println("End-of-callDiv...");
	}

	public static void main(String args[]) {
		System.out.println("Start-of-main...");
		int n1 = 10;
		int n2 = 0;
		try {
			callDiv(n1, n2);
		} catch (Exception e) {
			System.out.println("Handled In Main....!");
		}
		System.out.println("End-of-main...");
	}
}
