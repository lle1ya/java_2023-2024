package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "123banana", "cherry!", "orange");
        System.out.println(LetterFilter(list));
    }
    public static List<String> LetterFilter(List<String> list){
        return list.stream()
                .filter(x -> x.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
