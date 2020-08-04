package NinjaSelenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {

	private static final Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	
	
	public static void main(String[] args) {
		
		
		log.debug("Debug message Logged");
		log.error("Error message Logged");
		log.fatal("FATAL message Logged");
	}

}
