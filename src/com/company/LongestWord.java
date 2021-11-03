package com.company;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {
    public static void longestWord() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        String longest = " ";
        for (String i : arr) {
            if (i.length() >= longest.length()) {
                longest = i;
            }
        }
        System.out.println(longest);
    }

}
