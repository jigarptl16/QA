package class11;

import org.apache.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(LoggingDemo.class);
		log.debug("This is a debug log");
		log.info("This is a info log");
		log.warn("This is a warning log");
		log.error("This is a error log");

	}

}
