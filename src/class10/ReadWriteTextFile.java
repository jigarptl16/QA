package class10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/testing/test.txt");
		file.createNewFile();

		FileWriter writer = new FileWriter(file);
		writer.write("Hello\n");
		writer.write("Hello\n");
		writer.write("Hello\n");

		BufferedWriter bf = new BufferedWriter(writer);
		bf.write("Hello World");
		bf.newLine();
		bf.write("Hello World");

		bf.flush();
		bf.close();

		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);

		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		// reader.lines().forEach(System.out::println);

	}

}
