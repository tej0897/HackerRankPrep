package test;

import Programs.FirstElementOfList;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstElementOfListTest {

    @Test
    public void firstElementOfList(){
        var list = new FirstElementOfList();
        List<Integer> myList = Arrays.asList(11,15,19,45,78,191,450);
        assertEquals(11, list.firstElementCheck(myList));
    }
}
