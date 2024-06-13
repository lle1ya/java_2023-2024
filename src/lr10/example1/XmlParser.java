package lr10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\Work\\Java\\java_2023-2024\\examlpe.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //BookOperation.addNewBook(doc);
            System.out.println("�������� �������: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\n������� �������: " + node.getNodeName());
               if  (node.getNodeType() == node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("�������� �����: "
                            + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("�����: "
                            + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("��� �������: "
                            + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
            BookOperation.findBook(nodeList);
            BookOperation.removeBook(doc, "����� � ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
