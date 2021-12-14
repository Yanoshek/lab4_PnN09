package tb.soft;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	Container container = getContentPane();
	JPanel RunningButtonPanel = new ButtonPanel();
	JButton runningButton = new RunningButton();
	JPanel canvas = new Canvas();
	
	Window() {
		setSize(600,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		defineLocations();
		addActionListeners();
		defineLayout();
		defineContent();
		setVisible(true);
		
	}
	private void defineLocations() {
		runningButton.setBounds(225, 500, 150, 30);
	}
	private void defineLayout() {
		container.setLayout(null);
	}
	
	private void defineContent() {
		RunningButtonPanel.add(runningButton);
		setContentPane(RunningButtonPanel);
		
	}
	private void addActionListeners() {
		runningButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				remove(RunningButtonPanel);
				setContentPane(canvas);
				canvas.requestFocus();
				invalidate();
				validate();
				repaint();
			}
		});
		
	}
}
