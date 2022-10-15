package test;

import Programs.Maximum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTest {

    @Test
    public void maxCheck() {
        var max = new Maximum();
        List<Integer> list = Arrays.asList(10, 11, 19);
        assertEquals("19",max.checkMax(list));
    }

}