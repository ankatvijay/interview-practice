package com.ankat;

import java.util.Map;
import java.util.stream.Collectors;

interface Sum<R>{
    R add(R x, R y);
}


public class Interview {

    public static void main(String[] args) {
        Sum<Integer> ans = Integer::sum;
        System.out.println(ans.add(10,20));

        String str ="my name is vijay rajan ankat";

        Map<Character,Long> map = str.chars().filter(value -> value != ' ').mapToObj(o -> (char)o).collect(Collectors.groupingBy(character -> character,Collectors.counting()));
        System.out.println(map);

    }
}
