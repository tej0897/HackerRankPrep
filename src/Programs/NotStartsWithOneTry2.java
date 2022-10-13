//package Programs;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class NotStartsWithOneTry2 {
//    public static void main(String[] args) {
//
//        Consumer<Integer> consumer = (number) -> {
//            while(number>=10){
//                number /=10;
//            }
//            return number;
//        };
//
//        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);
//        List<Integer> finalOutput = list.stream()
//                .filter(number -> consumer!=1)
//                .toList();
//    }
//}
