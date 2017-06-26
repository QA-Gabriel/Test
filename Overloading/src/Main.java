
public class Main {
	
	public  Main(){
		System.out.println("Overloading");
		System.out.println("------------");
	}
	
	public void add(int a){
		
		System.out.println(a);
	}
	
	public void add(int a, int b){
		
		System.out.println(a + b);
	}
	
	public void add(int a, int b, int c){
		
		System.out.println(a + b + c);
	}
	
	public static void main(String x[]){
		
		Main y;
		y = new Main();
		
		y.add(1);
		y.add(10, 10);
		y.add(10,20,30);
	}

}
