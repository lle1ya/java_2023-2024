package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
        System.out.println(filterNumbersByDivisor(list,5));
    }
    public static List<Integer> filterNumbersByDivisor(List<Integer> list, int divider){
        return list.stream()
                .filter(x -> x % divider == 0)
                .collect(Collectors.toList());
    }
}
