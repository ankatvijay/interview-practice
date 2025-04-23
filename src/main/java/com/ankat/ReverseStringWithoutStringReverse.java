package com.ankat;

public class ReverseStringWithoutStringReverse {
    public static void main(String[] args) {
        String str = "Mumbai";
        char[] chars = str.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i=chars.length;i>0;i--){
            reverse.append(chars[i - 1]);
        }
        System.out.println(reverse);

    }
}