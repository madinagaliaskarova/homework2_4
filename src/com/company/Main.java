package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<>();
        states.put("slovo1", "Sinonim1");
        states.put("slovo2", "Sinonim2");
        states.put("slovo3", "Sinonim3");
        states.put("slovo4", "Sinonim4");
        System.out.println(Collections.singletonList(states));
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String> item : states.entrySet()) {
            if (scanner.nextLine().equals(item.getKey())) {
                System.out.println(item.getValue());
            }
            if (scanner.nextLine().equals(item.getValue())) {
                System.out.println(item.getKey());
            }
        }
        HashMap<String, String> statesTwo = new HashMap<>();
        for (Map.Entry<String, String> item : states.entrySet()) {
            statesTwo.put(item.getValue(), item.getKey());
        }
        System.out.println(Collections.singletonList(statesTwo));
    }
}
