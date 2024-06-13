package lr10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookOperation {
    public static List<Element> findBook(NodeList nodeList) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            nodes.add(nodeList.item(i));
        }
        List<Element> books = nodes.stream()
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String author = element.getElementsByTagName("author").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    return author.equalsIgnoreCase("��� �������") && year.equals("1869");
                })
                .collect(Collectors.toList());

        return books;
    }

    public static void addNewBook(Document doc) {
        try {
            Scanner scanner = new Scanner(System.in);
            Element newBook = doc.createElement("book");
            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode(scanner.nextLine()));
            newBook.appendChild(title);

            Scanner scanner1 = new Scanner(System.in);
            Element author = doc.createElement("author");
            author.appendChild(doc.createTextNode(scanner1.nextLine()));
            newBook.appendChild(author);

            Scanner scanner2 = new Scanner(System.in);
            Element year = doc.createElement("year");
            year.appendChild(doc.createTextNode(scanner2.nextLine()));
            newBook.appendChild(year);
            NodeList rootList = doc.getElementsByTagName("library");
            Node root = rootList.item(0);
            root.appendChild(newBook);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\Work\\Java\\java_2023-2024\\examlpe.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void removeBook(Document doc, String titleToDelete) {
        NodeList nodeList = doc.getElementsByTagName("book");
        List<Node> nodesToRemove = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String title = element.getElementsByTagName("title").item(0).getTextContent();
                if (title.equalsIgnoreCase(titleToDelete)) {
                    nodesToRemove.add(node);
                }
            }
        }

        for (Node node : nodesToRemove) {
            Node parentNode = node.getParentNode();
            parentNode.removeChild(node);
            System.out.println("����� ������� �������.");
        }

        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\Work\\Java\\java_2023-2024\\examlpe.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

