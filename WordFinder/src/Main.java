
public class Main {
	
	public static void main(String x[]){
		
		String Message="    I am Gabriel ";
		String Words="am";
		String replace ="!";
		int WordCount = 0;
		
		for(int i = 0; i <= Message.length() - Words.length(); i++)
		{
			if (Message.substring(i, (i + Words.length())).equals(Words))
				{
				if (WordCount == 0){
					
					System.out.print("Word Positions: ");
				}else{
					
					System.out.print(",");
				}
					WordCount++;
					System.out.print(i);
				}
		}
		//System.out.println();
		//System.out.println("Word Count: " + WordCount);
		System.out.println(Message);

	}
}
