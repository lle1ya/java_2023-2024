package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("qwerty", "asd", "zxcv");
        System.out.println(StringLengthFilter(list,3));
    }
    public static List<String> StringLengthFilter(List<String> list, int length){
       return list.stream()
               .filter(x -> x.length()>length)
               .collect(Collectors.toList());
    }
}
