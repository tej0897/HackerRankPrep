package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {

//        Consumer<Integer> consumer = number -> {
//            if (number % 2 ==0){
//                System.out.println(number);
//            }
//        };
        List<Integer> list = Arrays.asList(10, 22, 7, 39, 45, 88, 100, 211);
        List<Integer> evenNumbers = list.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println(evenNumbers);


    }


}
