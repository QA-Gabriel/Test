
public class Calculation {

	
	public void times(int Table, int Range){
		
		int A;
		System.out.println("Times Table is: "+Table);
		System.out.println("----------------------------");
		
		for(A=1 ; A<=Range; A++ ){
			System.out.println(Table + " x " + A +"="+(Table*A));
			
		}
	}
	
}
