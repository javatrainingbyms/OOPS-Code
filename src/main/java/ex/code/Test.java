package ex.code;

public class Test {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, result = 0;
		System.out.println("Starting Calculations ....!");
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			result = n1 / n2;
		} catch (ArithmeticException e) {
			//String str=e.toString();
			//String str=e.getMessage();
			e.printStackTrace();
			//System.out.println(str);
			try {
				n2=Integer.parseInt(args[2]);
			}catch(ArrayIndexOutOfBoundsException e1) {
				n2=2;
			}
			result = n1 / n2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient Inputs...! ");
		} catch (NumberFormatException e) {
			System.out.println("Only Numbers Allowed...!");
		} catch (Exception e) {
			System.out.println("Some Unknown Problem...!");
		}
		System.out.printf("Dividing %d by %d ....\n", n1, n2);
		System.out.println("Result : " + result);
		System.out.println("Calculations Completed...!");

	}

}
