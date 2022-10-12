import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerEx {
	private static final Logger logger =Logger.getLogger(LoggerEx.class);

	public static void main(String[] args) {
		System.out.println("Suresh");
		PropertyConfigurator.configure("D:\\Selenium_WP_practice_18_04_22\\XTest\\src\\log4j.properties");
		logger.info("Suresh Pelluru great");
		

	}

}
