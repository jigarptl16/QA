package class11;

public class ReadXMLDemo {

	public static void main(String[] args) throws Exception {
		XMLReader reader = new XMLReader();
		System.out.println(reader.getUsername(2));
		System.out.println(reader.getPassword(2));
		System.out.println(reader.getError(2));
	}

}
