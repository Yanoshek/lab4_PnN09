package tb.soft;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Point;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

public class Canvas extends JPanel implements MouseInputListener {
	private Point cursorPosition = null;
	private String shape = null;
	JLabel text = new JLabel("Naciśnij o lub k aby wybrać kształt, następnie wciśnij lewy przycisk myszy");
	Canvas() {
		setFocusable(true);
		setLayout(null);
		defineLocations();
		addComponents();
		setBackground(new Color(76,180,32));
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				drawFigure(e);
			}
		});
		addMouseListener(this);
		setVisible(true);
	}
	private void defineLocations() {
		text.setBounds(75, 200, 450, 30);
	}
	public void addComponents() {
		add(text);
	}
	private void drawFigure(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_O) {
			shape = "circle";
			
		}
		if (e.getKeyCode() == KeyEvent.VK_K) {
			shape="square";
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(shape == null) return;
		this.cursorPosition = e.getPoint();
		if (cursorPosition == null)
			return;

		int x = (int) cursorPosition.getX();
		int y = (int) cursorPosition.getY();
		
		switch(shape) {
		case "circle":
			repaint();
			break;
		case "square":
			repaint();
			break;
		default: 
			break;
		}
		
	}
	
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		if(shape==null) return;
		Graphics2D g2 = (Graphics2D) g;
		double width = 200;
		double height = 150;
		if(shape == "circle") {
			Ellipse2D circle = new Ellipse2D.Double();
			circle.setFrameFromCenter(cursorPosition.getX(), cursorPosition.getY(), cursorPosition.getX()+100, cursorPosition.getY()+100);
			g2.draw(circle);
		}
		if(shape == "square") {
			Rectangle2D rect = new Rectangle2D.Double(cursorPosition.getX(), cursorPosition.getY(), width, height);
			g2.draw(rect);
		}
		
		
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
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
