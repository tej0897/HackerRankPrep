package test;

import Programs.Maximum;
import Programs.NotStartsWithOne;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotStartsWithOneTest {
    @Test
    public void oneCheckTest() {
        var one = new NotStartsWithOne();
        List<Integer> list = Arrays.asList(10, 21, 19);
        assertEquals("21",one.oneCheck(list));
    }

}