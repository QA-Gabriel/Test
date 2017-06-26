
public class Main {

	public static void main(String xyz[]) throws MyExp{
		
	int a, b, c;
	a=b=c=0;
	
	try{
		
		a=0;
		b=Integer.parseInt(xyz[1]);
		c=a/b;
		System.out.println("The Result: " + c);
		
		if (a==0);
			throw new MyExp(); 

		
		}catch(MyExp x){
		System.out.println("vmkldfngsjk");
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
