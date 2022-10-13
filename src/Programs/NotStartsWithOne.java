package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotStartsWithOne {
    public static void main(String[] args) {



        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);
        List<Integer> finalOutput = list.stream()
                .filter(number -> firstNumberCheck(number) != 1)
                .toList();
        System.out.println(finalOutput);
    }

    public static int firstNumberCheck(int number){
        while ( number >=10){
            number /=10;
        }
        return number;
    }
}
