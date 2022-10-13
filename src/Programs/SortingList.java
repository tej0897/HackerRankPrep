package Programs;

import java.util.Arrays;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,11,89,130,44,209,67);
        List<Integer> output = list.stream()
                .sorted()
                .toList();
        System.out.println(output);
    }
}
