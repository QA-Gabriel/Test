
public class Division {

	public static void main(String xyz[]){
		
	int a, b, c;
	a=b=c=0;
	
	try{
		
		a=Integer.parseInt(xyz[0]);
		b=Integer.parseInt(xyz[1]);
		c=a/b;
		System.out.println("The Result: " + c);
		}
	catch(NumberFormatException x){
		System.out.println("Please Only use numerical Values");
	}catch(ArithmeticException abc){
		System.out.println("Cannot divide by zero");
	}catch(ArrayIndexOutOfBoundsException x){
		System.out.println("Please Put 2 values");
	}catch(Exception x ){
		System.out.println("Any other exception");
	}
		
	}
	
}
