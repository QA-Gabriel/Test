
public class Main {
	
	public static void main(String x[]){
		
		String Message="I am Gabriel am dfsdfdfd am vjnjsamjjdfngj";
		String Words="am";
		String replace ="!";
		int a = 0;
		
		for(int i = 0; i <= Message.length() - Words.length(); i++)
		{
			if (Message.substring(i, (i + Words.length())).equals(Words))
				{
				
				String x2 = Message.substring(a,i);
				a = i + Words.length();
				String x1 = x2 + replace;
				System.out.print(x1);
				
		}
	}
		System.out.println(Message.substring(a, Message.length()));
	}
}