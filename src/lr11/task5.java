package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("привет", "пока", "привет пока");
        System.out.println(searchString(list,"привет"));
    }
    public static List<String> searchString(List<String> list, String string){
        return list.stream()
                .filter(s -> s.contains(string))
                .collect(Collectors.toList());
    }
}
