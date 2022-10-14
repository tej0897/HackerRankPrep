package Programs;

import java.util.*;

public class RepeatWords2 {
    public static void main(String[] args) {

        List<String> output = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        String input = "long long time ago, in a galaxy far far away";
        String[] words = input.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        Arrays.stream(words).forEach(e->map.put(e, map.getOrDefault(e, 0) + 1));
        map.forEach((k,v)->{
            output.add(k);
            count.add(v);
        });
    }
}
