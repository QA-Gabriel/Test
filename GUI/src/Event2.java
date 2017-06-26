import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event2 implements ActionListener {
	
	TextField x; //reference variable
	
	public Event2(TextField T){
		x =T;
	}
	
	public void actionPerformed(ActionEvent T) {

		x.setText("Hello");		
	}

}
