package class10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:/testing/app.properties");
		Properties prop = new Properties();
		// prop.load(ReadWriteProperties.class.getClassLoader().getResourceAsStream("application.properties"));
		prop.load(fi);
		String browser = prop.getProperty("browser");
		System.out.println(browser);

		prop.setProperty("my.key", "myValue");

		FileOutputStream f = new FileOutputStream("C:/testing/app.properties");
		prop.store(f, "Added from code");

	}

}
