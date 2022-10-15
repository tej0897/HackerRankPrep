package test;

import Programs.DuplicatesInList;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class DuplicatesInListTest {

    @Test
    public void duplicatesCheck() {
        var duplicatesInList = new DuplicatesInList();
        List<Integer> list = Arrays.asList(11, 11, 19);
        assertEquals("11,19",duplicatesInList.DuplicateCheck(list));

    }
}