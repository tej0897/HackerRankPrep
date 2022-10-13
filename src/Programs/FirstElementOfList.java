package Programs;

import java.util.Arrays;
import java.util.List;

public class FirstElementOfList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);

        int output = list.stream()
                .findFirst()
                .get();

        System.out.println(output);
    }
}
