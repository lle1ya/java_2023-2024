package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonOperation {
    public static void findBook(JSONObject jsonObject){
        Scanner scanner = new Scanner(System.in);
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        System.out.println();
        String author = scanner.nextLine();
        jsonArray.stream()
                .filter(book -> book instanceof JSONObject)
                .filter(book -> author.equals(((JSONObject) book).get("author")))
                .forEach(book -> {
                    System.out.println("\n������� �������: " + book);
                    System.out.println("�������� �����: " + ((JSONObject) book).get("title"));
                    System.out.println("�����: " + ((JSONObject) book).get("author"));
                    System.out.println("��� �������: " + ((JSONObject) book).get("year"));
                });

    }
    public static void addBook(JSONObject jsonObject){
        Scanner scanner = new Scanner(System.in);
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        JSONObject newBook = new JSONObject();
        System.out.println();
        newBook.put("title", scanner.nextLine());
        newBook.put("author", scanner.nextLine());
        newBook.put("year", scanner.nextInt());
        jsonArray.add(newBook);
        try (FileWriter file = new FileWriter("D:\\Work\\Java\\java_2023-2024\\lr10\\example2\\example-json.json")) {
            file.write(jsonObject.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeBook(JSONObject jsonObject){
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }
        }
        try (FileWriter file = new FileWriter("D:\\Work\\Java\\java_2023-2024\\src\\lr10\\example2\\example-json.json")) {
            file.write(jsonObject.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
