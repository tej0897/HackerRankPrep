package Programs;

import java.util.Collections;
import java.util.List;

public class DuplicatesInList {
    public List<Integer> DuplicateCheck(List<Integer> list) {

        return(list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .toList());
    }
}
