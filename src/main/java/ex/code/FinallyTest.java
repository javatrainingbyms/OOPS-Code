package ex.code;

public class FinallyTest {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, result = 0;
		System.out.println("Starting Calculations ....!");
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			result = n1 / n2;
		}  finally {
			System.out.println("It Will Always Work...!");
		}
		System.out.printf("Dividing %d by %d ....\n", n1, n2);
		System.out.println("Result : " + result);
		System.out.println("Calculations Completed...!");

	}


}
