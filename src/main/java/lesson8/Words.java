package lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class Words {
    public static void main(String[] args) {
        String[] words = {"apple","nike","microsoft","puma","apple","iphone","airpods","ipad","puma","adidas" };


        Set<String> uniqueWords = new HashSet<>();
        for (String w : words) {
            uniqueWords.add(w);
        }

        for (String word :  uniqueWords) {
            System.out.println(word);
        }

        Map <String,Integer> wordCounts = new HashMap<>();
        for (String word :words) {
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                Integer put = wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            System.out.println("repeated word: " + word + " - " + count + " time");
        }
    }
}






