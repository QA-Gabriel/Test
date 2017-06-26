import java.awt.*;
import java.awt.Event.*;

public class Windows {
	
	public static void main(String x[]){
		
		Frame Win = new Frame();
		TextField T1= new TextField();
		Button B1= new Button("Click");
		Panel P1 = new Panel();
		Win.add(T1, BorderLayout.NORTH);
		Win.add(B1, BorderLayout.CENTER);
		Win.add(P1, BorderLayout.SOUTH);
		
		Win.setSize(300,500);
		Win.setVisible(true);
		Win.setResizable(false);
		
		Event2 E = new Event2(T1);
		B1.addActionListener(E);
		
		
	}

}
