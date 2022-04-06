package class11;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {
	private static final String FILENAME = "C:/testing/testing.xml";
	Document doc;

	public XMLReader() throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		doc = db.parse(new File(FILENAME));
		doc.getDocumentElement().normalize();
	}

	public String getUsername(int caseId) {
		NodeList list = doc.getElementsByTagName("case");
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String id = element.getAttribute("id");
				if (id.equals(String.valueOf(caseId))) {
					return element.getElementsByTagName("username").item(0).getTextContent();
				}
			}
		}

		return null;
	}
	
	public String getPassword(int caseId) {
		NodeList list = doc.getElementsByTagName("case");
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String id = element.getAttribute("id");
				if (id.equals(String.valueOf(caseId))) {
					return element.getElementsByTagName("password").item(0).getTextContent();
				}
			}
		}

		return null;
	}
	
	public String getError(int caseId) {
		NodeList list = doc.getElementsByTagName("case");
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String id = element.getAttribute("id");
				if (id.equals(String.valueOf(caseId))) {
					return element.getElementsByTagName("error").item(0).getTextContent();
				}
			}
		}

		return null;
	}
}
