import java.util.Arrays;

public class Maps implements KeyValues  {
	
	public static void main(String x[]){
		
		int [][] array1 = new int [4][4];
		
		KeyValues k;
		k = new Maps();
		
		k.remove(1);
		
		for (int i = 0; i < 4 ; i++ ){
			
			for (int j = 0; j < 4 ; j++ ){
				array1[i][j] = (int) Math.pow(i, j);
			}
		}
		
		System.out.println(Arrays.deepToString(array1));
	}

	public void add(int Key, int Value ) {
		
		
		
	}

	
	public void remove(int Key) {
		
		
		for (int a = Key; a>=0; a++){
			
			
		}
		
 		System.out.println("remove");
	}

	
	public void findKey(int Key) {
 		
	}

	
	public void mapKey(int Key, int Value) {
 		
	}

	
	public void containsValue(int Value) {
		
	}

}
