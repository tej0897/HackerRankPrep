package test;

import Programs.EvenNumbers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {

    @Test
    public void evenCheck() {
        var evenCheck = new EvenNumbers();
        List<Integer> list = Arrays.asList(10, 11, 19);
        assertEquals("10",evenCheck.evenCheck(list));
    }
}