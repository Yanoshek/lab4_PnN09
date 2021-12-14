package tb.soft;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	JLabel text = new JLabel("Naciśnij przycisk aby kontynuować");
	ButtonPanel() {
		setLayout(null);
		defineLocations();
		addComponents();
	}
	private void defineLocations() {
		text.setBounds(200, 200, 400, 30);
	}
	private void addComponents() {
		add(text);
	}
	
}
