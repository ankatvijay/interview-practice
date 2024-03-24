package com.lti.decisions;

public class SwitchStatement {
    public static void main(String[] args) {
        String[] str = {"A","B","C","D"};

        int iteration = 0;
        for(String s: str){
            System.out.println("--- Iteration: "+(++iteration)+", s: "+s);
            switch (s){
                case "A":
                    System.out.println("print A");
                default:
                    System.out.println("print default");
                case "B":
                    System.out.println("print B");
                case "C":
                    System.out.println("print C");
            }
        }
    }
}
