package com.ankat.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchExamples {
    public static void main(String[] args) {
        TryCatchExamples te = new TryCatchExamples();
        te.printThreeStatements("Before Try Block", 1);
        try {
            te.printThreeStatements("In try catch Block", 0);
        } catch (Throwable t) {
            t.printStackTrace(System.out);
            printErrorStructure(t);
        }
         try {
            FileInputStream f =
                    new FileInputStream("ApplicationProperties.txt");
        }
        catch (IOException ie) {
            System.out.println("Maybe I want to do something specifically, like" +
                    " populate data as a default if file was properties file "+
                    (5/0));
        }
        catch (Throwable t) {
            t.printStackTrace(System.out);
            printErrorStructure(t);
        }
        te.printThreeStatements("After Try/Catch", 0);
    }
    // This method will just print the hierarchy of the exception
    public static void printErrorStructure(Object o) {
        Class parent = o.getClass();
        String prefix = "";
        System.out.println("Error caught was: ");
        do {
            System.out.println(prefix + " " + parent.getName());
            prefix += "--";
            parent = parent.getSuperclass();
            if (parent == null) break;

        }
        while (parent.getSuperclass() != null);
    }

    private void printThreeStatements(String section, int divisor) {
        System.out.println(section + ": Statement 1 is just fine");
        System.out.println(section + ": Statement 2 will cause the error " +
                (2 / divisor));
        System.out.println(section + ": Statement 3 is just fine");
    }

}
