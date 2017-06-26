import java.text.DecimalFormat;

public class Results {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

		int phy,che,mat;
		float total, per;

		
		public void Calculations(){
			total=phy+che+mat;
			per=total*100/450;
		}
		
		public void ShowResults(){
			
			System.out.println("Total Score = " + total);
			System.out.println("Percentage = " + df2.format(per));
		}
}
