package drawing;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AjoutButtonListener implements ActionListener{
Drawing drawing;



	
	public AjoutButtonListener(Drawing drawing){
		this.drawing = drawing;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		 
			 drawing.ajout(); 
		 
		  
		
	}

}
