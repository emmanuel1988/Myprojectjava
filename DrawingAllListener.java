package drawing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import drawing.Shape;

public class DrawingAllListener implements MouseMotionListener, MouseListener{
    
	Drawing drawing;
	ArrayList<Shape> shapes=new ArrayList<Shape>() ;
	Shape clickShape=null ;
	Shape dragShape = null;
	ArrayList <Shape> multiShape = new ArrayList<Shape>();
	public DrawingAllListener(Drawing d){
		drawing=d;
	}
	
	
	public void mouseClicked(MouseEvent e) {
		
		
			
	            for (Shape s :drawing) {
	          
	                if(e.getModifiers()==MouseEvent.BUTTON3_MASK)
	                {
	                if (s.isOn(e.getPoint())) {
	                	drawing.ajout();
	                    
	                	
	                }
	                drawing.repaint();
	            }
	                }
	                
	            }
	            
	         
	

		
  
	/*private boolean contains(Shape s) {
		// TODO Auto-generated method stub
		return false;
	}*/

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	
        if (multiShape == null) {
        	
            return;
        }
  
        for (Shape s : drawing.multiShape)
        	if(e.getModifiers()==MouseEvent.BUTTON3_MASK)
        	{
            s.setOrigin(e.getPoint());
             drawing.repaint();
        	}
        }

		
	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
}

	
}
