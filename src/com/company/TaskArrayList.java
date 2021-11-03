package com.company;

import java.util.ArrayList;
import java.util.List;

public class TaskArrayList {
    public static void arrayList() {
        String[] sound = {"moo", "bark", "meow", "rawr", "screech", "chirp", "growl", "buzz", "quack"};
        List<String> arr = new ArrayList<>();
        for (String i : sound) {
            arr.add(i);
        }
        System.out.println(arr);
    }

}
