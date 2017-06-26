
public class Bank {
	
	static int Dollar;
	int x; 
	
	public void SetDollar(int A){
		Dollar = A;	
	}
	
	public void ConvertMoney(int M){
		
		System.out.println("Converted: " + M * Dollar);
	}
	
	public void DollarRate(){
		System.out.println("Dollar: " + Dollar);
	}
	
	public void what(){
	
		x=15;
		
	}
	public static void main(String x[]){
		
		//Creates Objects 
		Bank HSBC, Natwest;
		
		//Creates Variables & Constructors
		HSBC = new Bank();
		Natwest = new Bank();
		
		HSBC.SetDollar(90);
		HSBC.DollarRate();
		HSBC.ConvertMoney(100);
		
		Natwest.SetDollar(50);
		Natwest.DollarRate();
		Natwest.ConvertMoney(944);	
	}
}
