
public class ChangeMachine {
	
	public static void main(String x[]){
		
		double Cost, Paid, Change, AmountLeft;
		int Fifty, Twenty, Ten, Five, Two, One, fifP, twentP, tenP, fiveP, twoP, oneP;
		Fifty= 0;
		Twenty=0;
		Ten=0;
		Five=0; 
		Two=0;
		One=0;
		fifP=0;
		twentP=0;
		tenP=0;
		fiveP=0;
		twoP=0;
		oneP=0;
	
		Cost = 49.9;
		Paid = 100;
		
		Change = Paid - Cost;
		
		System.out.println("Total Change: " + Change);
		
		
		
		if (Change  >= 50){
			
			Fifty = (int)(Change / 50);
			 Change = Change % 50 ;
			 System.out.println("£50: " + Fifty);
			
		}
		
		if(Change >= 20){
			
			Twenty = (int)(Change/20);
			Change = Change % 20;
			System.out.println("£20: " + Twenty);
		}
		
		if(Change >= 10){
			
			Ten = (int)(Change/10);
			Change = Change % 10;
			System.out.println("£10: " + Ten);
		}
		
		if(Change >= 5){
			
			Five = (int)(Change/5);
			Change = Change % 5;
			System.out.println("£5: " + Five);
		}
		if(Change >= 2){
			
			Two = (int)(Change/2);
			Change= Change % 2;
			System.out.println("£2: " + Two);
			
			
			if(Change >= 1){
				
				One = (int)Change / 1;
				Change = Change % 1;
				System.out.println("£1: " + One);
				
			}
			Change = Change * 100;
			Change = Math.round(Change);
			
			if(Change >= .5){
				fifP = (int)(Change/.5);
				Change = Change % .5;
				System.out.println("50p: " + fifP);
			}
			
			if(Change>= .2){
				twentP = (int)(Change/.2);
				Change = Change % .2;
				System.out.println("20p: " + twentP);
				
			}
			
			if(Change>= .1){
				tenP = (int)(Change/.1);
				Change = Change % .1;
				System.out.println("10p: " + tenP);
			}
			
			if(Change>= .05){
				fiveP = (int)(Change/.05);
				Change = Change % .05;
				System.out.println("5p: " + fiveP);
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	
}
