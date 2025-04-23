package com.ankat;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

class Message {
    public String customerId = null;
    public String loginId = null;


}

public class NordeaTest {

    public static void main(String[] args) {
        Predicate<String> p1 = (s)-> s.length() == 0;

        //System.out.println(p1.test("Vijay"));

        Function<String,Boolean> f1 = (s) -> s.length() == 0;
        Function<String,Boolean> f2 = (s) -> {
            return true;
        };

        //System.out.println(f2.apply("SE_web"));

        BiFunction<String, String, Boolean> b1 = (s1,s2)-> s1.equals(s2);
        //System.out.println(b1.apply("Java8","Java8"));

        Objects.nonNull("asdfafsd");

        Message message1 = new Message();
        message1.customerId = "customerId";

        Message message2 = new Message();
        message2.loginId = "loginId";


        Function<String,String> customerIdFun = (str) -> Objects.nonNull(str)?str:"";
        Function<String,String> loginIdFun = (str) -> Objects.nonNull(str)?str:"";

        BiFunction<Function<String,String>,Function<String,String>,Function<String,String>> predicate = (function1,function2) ->  function1;

        //System.out.println("Fun1: "+fun1.apply("Vijay"));
        //System.out.println("Fun2: "+fun2.apply("Vijay"));
        System.out.println("andThenFun: "+customerIdFun.apply("Vijaya"));
        System.out.println("---");
        System.out.println("composeFun: "+loginIdFun.apply("Vijaya"));

        System.out.println("//---//");
        System.out.println("andThenFun: "+customerIdFun.apply("Ajay"));
        System.out.println("---");
        System.out.println("composeFun: "+loginIdFun.apply("Ajay"));
        //functions();
    }
}
