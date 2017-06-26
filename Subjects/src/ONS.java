
public class ONS {

	public static void main(String x[]) {

		Results2 John, Peter, Paul;
		
		John = new Results2();
		John.grades(0, 0, 0);
		John.showResults();
		
		Peter = new Results2();
		Peter.grades(200, 150, 42);
		Peter.showResults();
		
		Paul = new Results2();
		Paul.grades(37, 84, 150);
		Paul.showResults();
		
	}
}

class Results2 {
	private int phy, che, mat, total, fail;
	private float per;
	boolean error = false;
	
	public void showResults() {
		
		//if there is no error then print results & do calculations
		if(error==false){
			
			if (fail == 1){ 
				System.out.println("Retake The Exam");
				System.out.println();
			} else if (fail==2){
				System.out.println("Please Repeat Course");
				System.out.println();
			} else if (fail==3){
				System.out.println("Go Home");
				System.out.println();
			}else{
				total = phy + che + mat;
				per = (float) total * 100 / 450;
				System.out.println("Total Score: " + total);
				System.out.println("Percentage: " + per);
				System.out.println();	
			}
		}
	}
	

	public void grades(int A, int B, int C) {

		if (A >= 0 & A <= 150) {
			phy = A;
			if (phy < 70) fail++;
			
		} else {
			System.out.println("Invalid Physics Score");
			System.out.println();
			error = true;
		}
		
		if (B >= 0 & B <= 150) {
			che = B;
			if (che < 70) fail++;
			
		} else {
			System.out.println("Invalid Chemistry Score");
			System.out.println();
			error = true;
		}
		
		if (C >= 0 & C <= 150) {
			mat = C;
			if (mat < 70) fail++;
		} else {
			System.out.println("Invalid Math Score");
			error = true;
		}

	}
}
