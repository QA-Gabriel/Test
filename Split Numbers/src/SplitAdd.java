
public class SplitAdd {
	
	public static void main(String x[]){
		
		int num, no1, no2, no3;
		num = 734;
		
		no1 = num/100;
		no2= (num-(no1*100))/10;
		no3 = num%10;
		System.out.println(no1 + no2 + no3);
		
		
		
	}

}
