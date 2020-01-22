package com.java.interview.preperation.kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int step = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'U') {
                if(step == 0) {
                    count1++;
                }
                step++;
            }else {
                if(step == 0) {
                    count2++;
                }
                step--;
            }
        }
        return count1 > count2 ? count2 : count1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
        
        scanner.close();
    }
}
