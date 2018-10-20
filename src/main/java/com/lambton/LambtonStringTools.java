package com.lambton;


public class LambtonStringTools {


    String reversestring(String s) {
        String string = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            string = string + s.charAt(i);

        }

        System.out.println("Original input is:" + s);

        System.out.println("After Execution Output is: " + string);
        return s;
    }


    int binarytodecimal(int s) {

        int d = 0;
        int n = 0;

        int a = s % 10;
        d = a * 2;
        int i = s / 10;

        System.out.println(d);
        return d;

    }

    String replacesubstring(String s1, String s2, String s3) {

        s1 = "the dog jumbed over the fence";
        s2 = "that";
      s3

        return s1;

    }



}