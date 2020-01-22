package com.java.interview.preperation.kit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int allSocks = 0;
        Set<Integer> s = new HashSet<>();
        
        for(int a : ar) {
            s.add(a);
        }

        for(int i : s) {
            int count = 0;
            for(int j = 0; j < n-1; j++) {
                if(ar[j] == i)
                    count++; 
            }
            allSocks += count/2;
        }

        return allSocks;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        
        System.out.println(result);

        scanner.close();
    }
}

