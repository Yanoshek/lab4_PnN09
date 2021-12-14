package tb.soft;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
				} catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		});

	}

}
