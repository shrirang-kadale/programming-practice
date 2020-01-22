package com.stack.overflow;



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SelectionSort
{

    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(5);
        num.add(6);
        num.add(3);
        num.add(2);
        num.add(1);
        num.add(10);

        selectionSort(num);
        System.out.println(num);
    }

    static void selectionSort(ArrayList<Integer> num){
        int n = num.size();

        for(int i = 0; i < n-1; i++ ){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(num.get(j) < num.get(min)){
                    min = j;
                }
            }

            int temp = num.get(min);
            num.set(min, num.get(i));
            num.set(i, temp);
        }
    }

}
