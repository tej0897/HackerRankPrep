package Programs;

import java.util.Arrays;
import java.util.List;

public class NumberOfElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);

        Long output = (long) list.size();

        System.out.println(output);
    }
}
