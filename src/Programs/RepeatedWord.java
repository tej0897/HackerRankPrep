package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepeatedWord {
    public static void main(String[] args) {
        String input = "long long time ago, in a galaxy far far away";
        input = input.toLowerCase();
        String[] strArray = input.split(" ");

        List<String> listOfWords = Arrays.asList(strArray);

        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
        for(String word : uniqueWords)
        {
            if(Collections.frequency(listOfWords,word) > 1)
            {
                System.out.print(" "+ word+" ");
            }


        }
    }

}
