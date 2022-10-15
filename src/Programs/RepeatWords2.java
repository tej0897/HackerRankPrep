package Programs;

import java.util.*;

public class RepeatWords2 {
    public static void main(String[] args) {


        String input = " a long long time ago, in a galaxy far far away";
        String[] words = input.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);

        }
    }
}
