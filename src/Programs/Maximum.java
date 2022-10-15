package Programs;

import java.util.List;

public class Maximum {
    public int checkMax(List<Integer> list) {
        return(list.stream()
                .max(Integer :: compare)
                .get());
    }

}
