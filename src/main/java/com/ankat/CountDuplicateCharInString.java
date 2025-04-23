package com.ankat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateCharInString {
    public static void main(String[] args) {
        String str = "Mumbai";
        Map<Character, Long> map = str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((c, l) -> System.out.println(c + " : " + l));
        System.out.println();

        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else
                charsCount.put(c, 1);
        }
        charsCount.forEach((c, l) -> System.out.println(c + " : " + l));
    }
}
