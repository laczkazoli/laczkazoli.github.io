package Amoba;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
	public static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		try{
		FileHandler fh = new FileHandler("MyLogFile.log");
		fh.setFormatter(new SimpleFormatter()); 
		logger.addHandler(fh);
		}catch(SecurityException se){ 
			logger.warning(se.getMessage());
		}catch(IOException ioe){
			logger.warning(ioe.getMessage());
		}
		
		logger.setUseParentHandlers(false); 
		logger.setLevel(Level.FINEST);

		logger.info("The program is running ");
		
		new PreWindow().firstdisplay();
	}

}
