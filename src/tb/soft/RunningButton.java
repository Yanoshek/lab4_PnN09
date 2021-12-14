package tb.soft;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;

public class RunningButton extends JButton {
	private int numberOfCatches;
	private Random rand = new Random();
	RunningButton() {
		setText("run");
		int width = getWidth();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				System.out.println(width/2);
				if(e.getX() <= 130) {
					catchInteraction();
				}
			}
		});
	}
	private void catchInteraction() {
		setLocation(rand.nextInt(400),rand.nextInt(400));
	}
	
}
