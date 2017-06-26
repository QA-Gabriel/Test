import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main implements In {
	
	public static void main(String x[]){
		
		int [] array1 = new int[6];
		
		array1[0]=9;
		array1[1]=7;
		array1[2]=10;
		array1[3]=12;
		array1[4]=1;
		array1[5]=12;
		
		for ( int a = 0 ; a < array1.length - 1;) {
			
			if ( array1[a] > array1[a+1]){
				
				int b = array1[a];
				int c = array1[a+1];
				
				array1[a+1] = b;
				array1[a] = c;
				
				a=0;
			}else
				
				a++;
			}
		
		System.out.println("Lowest Value: " + array1[0]);
		System.out.println("Highest Value: " + array1[array1.length -1]);
		
		
	}

	public void method1(int x, int z) {
		
		System.out.println(x + z);
		
	}

	public void method2(int t) {
		
		System.out.println(t);
		
		
	}

}
