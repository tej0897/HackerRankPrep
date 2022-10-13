package Programs;

import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeat {
    public static void main(String[] args) {
        String input = "long long time ago, in a galaxy far far away";

        // convert string into stream
        Map< Character, Long > result = input
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v == 1) {
                System.out.println("first non repeating char is: " +k);
                System.exit(0);
            }
        });
    }
}
