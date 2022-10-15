package Programs;

import java.util.List;

public class EvenNumbers {
    public List<Integer> evenCheck(List<Integer> list) {

        return(list.stream()
                .filter(number -> number % 2 == 0)
                .toList());
    }
}
