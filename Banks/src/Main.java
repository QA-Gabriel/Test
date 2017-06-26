
public class Main {
	
	
	public static void main(String x[]){
	
	Bank HSBC, Barclays, Natwest, Lloyds;	 
		
	HSBC = Bank.XYZ();
	Barclays = Bank.XYZ();
	Natwest = Bank.XYZ();
	Lloyds = Bank.XYZ();
	HSBC.name = "HSBC";
	Barclays.name = "Barclays";
	Natwest.name = "Natwest";
	Lloyds.name = "Lloyds";
	
	HSBC.a = 75;
	
	System.out.println(HSBC.name);
	System.out.println(Lloyds.name);
	System.out.println(Barclays.name);

	
	}
}
