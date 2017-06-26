
public class Main {
	
	
	public Main(int x, int y, int z){
		
		System.out.println("A");
		
	}
	
	public Main(int A){
		this(5,8,9);
		System.out.println("B");
	}

	public Main(int A, int B){
		this(A);
		System.out.println("C");
	}
	
	public static void main(String x[]){
		
		Main y = new Main(2);
		
		
		
	}
}
