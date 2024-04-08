package ex.code;

public class ThrowTest {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, result = 0;
		System.out.println("Starting Calculations ....!");
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			if (n2 > n1) {
				// here we want an ArithmeticException to be occured and control should transfer
				// to catch
				// ArithmeticException ob=new ArithmeticException("Denominator Cant Be
				// Larger...!");
				// ArithmeticException ob=new ArithmeticException();
				LargeNumberException ob = new LargeNumberException("Only Small Denominator Allowed...!");
				throw ob;
			}
			result = n1 / n2;
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			n2 = 2;
			result = n1 / n2;
		} catch (LargeNumberException e) {
			e.printStackTrace();
		}
		System.out.printf("Dividing %d by %d ....\n", n1, n2);
		System.out.println("Result : " + result);
		System.out.println("Calculations Completed...!");

	}

}
