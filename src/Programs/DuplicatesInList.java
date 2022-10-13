package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,11,19,45,11,191,45,191);
        List<Integer> finalOutput = list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .toList();
        System.out.println(finalOutput);
    }
}
