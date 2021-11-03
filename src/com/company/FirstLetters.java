package com.company;

import java.util.ArrayList;
import java.util.List;

public class FirstLetters {
    public static void firstLetter() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        String firstchar = "";
        for (String j : arr) {
            firstchar += j.charAt(0);
        }
        System.out.println(firstchar);
    }

}
