package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe Interface graphique pour l'application de dessin
 */
public class Paint implements Observer{

	private JFrame frame;
	private JButton clearButton;
	private JButton ajoutButton;
	private JButton retireButton;
	private JButton moveButton;
	private JButton circleButton;
	private JButton rectangleButton;
	private JPanel buttonPanel;
	private JPanel mainPanel;
	private Drawing drawing;
	private JTextField counterFld;
	
	public Paint(CounterController controller) {
		circleButton = new JButton("Circle");
		rectangleButton = new JButton("Rectangle");
		moveButton=new JButton("move");
		counterFld = new JTextField();
		counterFld.setPreferredSize(new Dimension(70, 20));
		
		circleButton.addActionListener(controller);
		rectangleButton.addActionListener(controller);
		//moveButton.addActionListener(controller);
		
	
		
	}
	
	public void run(){
		frame = new JFrame("Paint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel(new BorderLayout());
		
		drawing = new Drawing();
		drawing.setBackground(Color.WHITE);
		clearButton = new JButton("Clear");
		ajoutButton=new JButton("Ajouter");
		retireButton=new JButton("Dissocier");
		buttonPanel = new JPanel();
		buttonPanel.add(clearButton);
		buttonPanel.add(ajoutButton);
		buttonPanel.add(circleButton);
		buttonPanel.add(rectangleButton);
		buttonPanel.add(counterFld);
		buttonPanel.add(retireButton);
		
		
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.add(drawing, BorderLayout.CENTER);
		
		//listeners pour les boutons
		clearButton.addActionListener(new ClearButtonListener(drawing));
		circleButton.addActionListener(new CircleButtonListener(drawing));
		rectangleButton.addActionListener(new RectangleButtonListener(drawing));
		ajoutButton.addActionListener(new AjoutButtonListener(drawing));
		retireButton.addActionListener(new RetireButtonListener(drawing));
		
		
		
		//listeners pour la zone de dessin
		DrawingMouseListener l = new DrawingMouseListener(drawing);
		DrawingAllListener ll=new DrawingAllListener(drawing);
		drawing.addMouseListener(l);
		drawing.addMouseMotionListener(l);
		drawing.addMouseListener(ll);
		drawing.addMouseMotionListener(ll);
		frame.getContentPane().add(mainPanel);
		frame.setSize(640,480);
		frame.setVisible(true);
	}
	public static Drawing drawings = new Drawing();
	public static CounterController controller = new CounterController(drawings);
	
	public static void main(String[] args){
		Paint app = new Paint(controller);
		drawings.addObserver(app);
		app.run();
	}


	@Override
	public void update(int value) {
		counterFld.setText(Integer.toString(value));
	}
}