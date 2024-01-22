package com.raja.maang.findCommonElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RepeatingElement {
    public static void main(String[] args) {

       int[] A = {10, 5, 3, 4, 3, 5, 6}
        int n=A.length;
        HashSet<Integer> set = new HashSet<>();
        int count=-1;
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
            if(set.contains(A[i])){
                count=i;
            }else{
                set.add(A[i]);

            }
        }


        if (count != -1)
            System.out.println("The first repeating element is " + A[count]);
        else
            System.out.println("There are no repeating elements");
    }
}
