
public class Main {

		public static void main (String x[]){
			
			for (int A = 1; A<=10; A++){
				
				if ( A%2 == 0){
					
					System.out.println(A);
					
				} else {
					
					for( int B = 1; B <= A; B++){
						
						System.out.print(B);
						
						
					}
					
					System.out.println();
				}
				
			} 
		}
}
