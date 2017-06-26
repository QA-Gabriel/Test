
public class Bank {
	
	int a;
	String name;
	static int num = 1;
	static Bank r;
	
	public void MSG(){
		System.out.println("Hello");
	}
	
	private Bank(){}
	
	public static Bank XYZ(){
		
		if (num >3){
			System.out.println("Maximum 3 Banks Only");
		} 
		
//		if (r==null){
//			
			r = new Bank();
		//
		num ++;
		return r;
	}

}
