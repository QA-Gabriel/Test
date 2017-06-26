
public class Main {
	
	public static void main(String x[]){
		
		String Message=" HEllo my friends";
		String Words="";
		
		for(int i=Message.length()-1; i>=0 ; i--)
		{
			Words= Message.substring(i, i+1)+Words;
			if ( Message.substring(i,i+1).equals(" "))
				{
				System.out.println(Words);
					System.out.println();
					Words="";
				}
		}
	}
	
}
