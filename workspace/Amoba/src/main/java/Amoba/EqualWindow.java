package Amoba;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EqualWindow {
	

	public static int getEqualWindow() {
		JFrame f1 = new JFrame("Finish");
		Object[] options = { "New game", "Exit" };
		return JOptionPane.showOptionDialog(f1, "Sajnos dontetlen", "Equal",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

	}

}
