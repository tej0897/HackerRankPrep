package Programs;

import java.util.Arrays;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);
        Integer output = list.stream()
                .max(Integer :: compare)
                .get();

        System.out.println(output);
    }

}
