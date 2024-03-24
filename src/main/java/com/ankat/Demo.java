package com.ankat;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        // create a calendar
        Calendar cal = Calendar.getInstance();

        // print current first day of the week
        int day = cal.getFirstDayOfWeek();
        System.out.println("Current first day of the week:" + cal.get(Calendar.DAY_OF_WEEK));

        // set first day of the week as something else
        cal.setFirstDayOfWeek(Calendar.WEDNESDAY);

        // print altered first day of the week
        day = cal.getFirstDayOfWeek();;
        System.out.println("Altered first day of the week:" + cal.get(Calendar.DAY_OF_WEEK));
    }
}