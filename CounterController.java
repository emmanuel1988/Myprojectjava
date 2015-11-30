package drawing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CounterController implements ActionListener {

	Drawing drawing;
	Shape shape;
	DrawingAllListener dal;
	
	public CounterController(Drawing drawing) {
		this.drawing = drawing;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		drawing.addShape(shape);
		
		
	}

}