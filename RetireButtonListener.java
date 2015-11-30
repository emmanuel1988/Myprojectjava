package drawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetireButtonListener implements ActionListener{
Drawing drawing;



	
	public RetireButtonListener(Drawing drawing){
		this.drawing = drawing;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		 
			 drawing.retire();
}

}
