
public class Main2 {

public int Converter(int a){


	int decimal = 0; // decimal value 
	int p = 0; //power
	while(true){
		if(a == 0){
			break;
		} else {
			int temp = a % 10; 
			decimal += temp*Math.pow(2, p); // adds values from binary 
			a = a/10; 
			p++;
		}
	}

	return decimal;
	}
}

//1101
//temp = 1
//dec = 1 * (2^0)=1
// a = 110
//p = 1
// temp = 0
// dec = 1 + ( 0 * (2^1)) = 1
// a = 11
// p = 2
// temp = 11 % 10 = 1
//dec = 1 + (1 * 2^2))= 5 

