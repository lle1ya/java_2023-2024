package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        int maxAttempts = 3;
        int attempts = 0;
        boolean connected = false;
        while (attempts < maxAttempts && !connected) {
            String url = "https://itlearn.ru/first-steps";
            try {
                Document doc = Jsoup.connect(url).get();
                Elements links = doc.select("a[href]");
                try (FileWriter writer = new FileWriter("links.txt")) {
                    for (Element link : links) {
                        writer.write(link.attr("abs:href") + "\n");
                    }
                    connected = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                attempts++;
                e.printStackTrace();
            }
        }
    }
}
