package com.ankat;


import java.util.*;
import java.util.function.BiFunction;


public class HSBCInterview {
    // ,"RPKIVJAY" ,"Vijay" // tue

    boolean checkNames(String srcouce, String target){
        Boolean flag = false;

        StringBuffer sb = new StringBuffer();
        target.chars().forEach(value -> {
            if(srcouce.contains(""+value)){
                //flag = true;
            }else{
                //flag = false;
                //break;
            }

        });


        BiFunction<String, String, Boolean> biFunction = (x,y) -> x == y;

        return biFunction.apply("RPKIVJAY","Vijay");
    }

    public static void main(String[] args) {

        // Map Object with below combination
        // {"a", ["a","b","c"], "b",["c","d","e"]}

        // Output should be
        // {"a", ["a","b"], "b",["d","e"]}



        Map<String, List<String>> map = new HashMap<>();
        map.put("a", Arrays.asList("a","b","c")); // a,b,c
        map.put("b", Arrays.asList("c","d","e")); // d,e


        Set<String> set = new HashSet<>();


        //Collection<List<String>> list = map.values().stream().filter(strings -> );




        map.forEach((s, strings) -> {
            strings.forEach(s1 -> {
                if(set.contains(s1)){
                    set.add(s1);
                    strings.remove(s1);
                }
            });
        });


    }
}
