package com.lti.map;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // personCollection


        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, Arrays.asList("a","b","c"));
        map.put(2,Arrays.asList("c","d","e"));
        //map.entrySet().stream().
        //        filter(removeDuplicate(map.values())).
        //        forEach(System.out::println);


        //map.entrySet().stream().flatMap(integerListEntry -> integerListEntry.getValue().stream()).distinct().collect();
        //map.forEach((integer, strings) -> System.out.println(integer + " "+strings));

        /*
        Map<Integer,Person> personMap01 = new HashMap<>();
        personMap01.put(1,new Person(101,"Ram","Kumar"));
        personMap01.put(2,new Person(103,"Raj","Kumar"));
        personMap01.put(3,new Person(101,"Ravi","Ram"));
        personMap01.put(4,new Person(105,"Gopi","Nath"));
        personMap01.put(5,new Person(104,"Yogesh","Waran"));
        personMap01.entrySet().stream().
                filter(removeDuplicate(personMap01.values())).
                forEach(System.out::println);

        public static Predicate<Map.Entry<Integer,Person>>
        removeDuplicate(Collection<Person> personCollection){
            return e->Collections.frequency(personCollection,e.getValue())==1;
        }
        */
    }

    public static Predicate<Map.Entry<Integer,List<String>>> removeDuplicate(Collection<List<String>> lists){
        return integerListEntry -> Collections.frequency(lists,integerListEntry.getValue()) == 1;
    }

}
