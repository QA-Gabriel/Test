
public class test {

	public static void main(String x[]){
		float divisionAnswer;
		int addAnswer, subtractAnswer, multiplyAnswer;
		
		
		Maths3 y = new Maths3();
		
		addAnswer = y.add(20, 34);
		subtractAnswer = y.subtract(30, 20);
		multiplyAnswer= y.multiply(5, 6);
		divisionAnswer = y.division(5, 2);
		
		System.out.println(addAnswer); 
		System.out.println(subtractAnswer); 
		System.out.println(divisionAnswer); 
		System.out.println(multiplyAnswer); 
		
	}
	
}
