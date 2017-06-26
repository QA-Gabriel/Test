
public class Main {

	public static void main(String x[]) {

		int c;
		int[] array = {1,2};
		
		try {

			c = 4 / 0;
			System.out.println("Result: " + c);
			
			
			
			System.out.println(array.toString());
			

		} catch (ArithmeticException AB) {
			System.out.println("Can't Divide By Zero");

		} catch(ArrayIndexOutOfBoundsException AB){
			
			System.out.println("ABC");
		}

	}
}
