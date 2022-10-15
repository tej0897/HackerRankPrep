package Programs;

import java.util.List;

public class FirstElementOfList {
    public int firstElementCheck(List<Integer> list){
        return list.stream()
                .findFirst()
                .get();
    }
}
