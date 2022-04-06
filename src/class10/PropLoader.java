package class10;

import java.io.IOException;
import java.util.Properties;

public class PropLoader {

	private static Properties prop = new Properties();
	static {

		try {
			prop.load(ReadWriteProperties.class.getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private PropLoader() {

	}

	public static String get(String key) {
		return prop.getProperty(key);
	}

}
