package com.lti.operator;

public class LogicalOperator {

    public static void main(String[] args) {

        int e = 0, f = 0;
        if ((e++ <= f) | (++e < f)) {
            System.out.println("Evaluation [(e++ <= f) | (++e <f)] meet");
        }
        System.out.println("Logical | (or) will evaluate both expressions e: " + e + " f:" + f);

        e = 0; f = 0;
        if ((e++ <= f) || (++e < f)) {
            System.out.println("Evaluation [(e++ <= f) || (++e <f)] meet");
        }
        System.out.println("Logical || (or) will evaluate both expressions e: " + e + " f:" + f);
    }
}
