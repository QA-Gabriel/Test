
public class NumberConverter {

	
	
	public static void main(String x[]){
				
		int num, no1, no2, no3, no4;
		
		num = 65;
		//no1 = num/1000;
		//no2 = (num-(no1 * 1000))/100; 
		//no3 = (num%100)/10;
		//no4 = num%10;
//		
		Words english = new Words();
		if(num>=1000)
			{
				System.out.println( english.units(num/1000) + " Thousand");
				num = num -(num/1000*1000);
			}
		if(num>=100){
			System.out.println(english.units(num/100) + " hundred ");
			num=num- (num/100*100);
		}
		if(num>=20){
				System.out.println(english.Tens(num/10*10));
				num= num%10;
			
		}
		if(num<20){
			System.out.println(english.units(num));
			
		}
			
		
	//	System.out.println(no1 + " " + no2 + " " + no3 + " " + no4);
		

//		TensToWords x2;
//		x2 = new TensToWords();
//		x2.Tens();
//	
		
		/*
		UnitsToWords x1;
		x1 = new UnitsToWords();
		x1.units("unit");
		
		TensToWords x2;
		x2 = new TensToWords();
		x2.Tens("tens");
		
		HundredToWords x3;
		x3 = new HundredToWords();
		x3.Hundred("Hundred");
		
		ThousandToWords x4;
		x4 = new ThousandToWords();
		x4.Thousand("Thousand");
		
		String u = x1.units("unit");
		String t = x2.Tens("ten");
		String h = x3.Hundred("Hundred");
		String th = x4.Thousand("Thousand");
		
		
		System.out.println(th + " " + h + " " + t + " " + u);
	*/
		
		
	}

	
}
