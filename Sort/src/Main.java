import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String x[]) {

		int[] array1 = { 53,21,-1,21,80};

		int rep;

		for (int a = 0; a < array1.length - 1;) {

			if (array1[a] > array1[a + 1]) {

				int b = array1[a];
				int c = array1[a + 1];

				array1[a + 1] = b;
				array1[a] = c;

				a = 0;
			} else

				a++;
		}
		
		int X = 0;
		int z = array1.length - 1;
		System.out.println(array1[z]);
		//System.out.println(Arrays.toString(array1));
		while (X == 0) {
			
			if (array1[z] == array1[z - 1]) {
				z--;
			} else {
				X = 1;
				System.out.println(array1[z - 1]);
			}
			while (X==1){
				//System.out.println(z);
				if (array1[z-1] == array1[z - 2]) {
					
					z--;
				} else {
					X = 2;
					System.out.println(array1[z - 2]);
				}
			}
			
			

		}
	}
}
