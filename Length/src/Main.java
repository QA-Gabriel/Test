
public class Main {
	
	public static void main(String X[]){
		
		String N = "I am going to S. london";
		String letter="";
		String letter2="";
		int foundspace=N.length();
//		int lastletter = N.length();
//		int nextletter = N.length();
//		int Spaceno;
//		Spaceno = 0;
//		
		
		for (int A=N.length()-1 ; A >=0 ;A--){
			letter = N.substring(A , A+1);
		//	System.out.println(letter);
			switch (letter){
			
			case " ":
			//	System.out.println("**"+foundspace);
				for (int B=A+1; B<foundspace; B++){
						letter2 = N.substring(B, B+1);
						System.out.print(letter2);
					}
				foundspace=A;
				System.out.println();

				break;
			
			}			
			if (A==0)
			{
				for (int B=0; B<foundspace; B++){
					letter2 = N.substring(B, B+1);
					System.out.print(letter2);
				}
	
			}
			
	}

}
