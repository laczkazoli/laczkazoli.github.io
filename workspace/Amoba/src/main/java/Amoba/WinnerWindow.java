package Amoba;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WinnerWindow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int getWinnerWindow() {
		String s = null;
		if (Window.szamlalo % 2 == 0) {
			s = "0";
		} else {
			s = "X";
		}
		JFrame f1 = new JFrame("Finish");
		Object[] options = { "New game", "Exit" };
		int n = JOptionPane.showOptionDialog(f1, "A(z) " + s + " nyert", "Winner",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		return n;
	}

}