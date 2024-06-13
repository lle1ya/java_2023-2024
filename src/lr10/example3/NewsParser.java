package lr10.example3;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        int maxAttempts = 3;
        int attempts = 0;
        boolean connected = false;

        while (attempts < maxAttempts && !connected) {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                        "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                        "tr > td:nth-child(1)");

                try (FileWriter writer = new FileWriter("news.txt")) {
                    for (int i = 3; i < 20; i++) {
                        if (!(i % 2 == 0)) {
                            List<Node> nodes = newsParent.get(0).childNodes();
                            writer.write("Тема: " +
                                    ((Element) nodes.get(i))
                                            .getElementsByClass("blocktitle")
                                            .get(0).childNodes().get(0) + "\n");
                            writer.write("Дата: " +
                                    ((Element) nodes.get(i))
                                            .getElementsByClass("blockdate")
                                            .get(0).childNodes().get(0) +
                                    "\n\n");
                        }
                    }
                    connected = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                attempts++;
            }
        }
    }
}