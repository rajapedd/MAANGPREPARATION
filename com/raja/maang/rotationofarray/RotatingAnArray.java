package com.raja.maang.rotationofarray;

import java.util.Arrays;

public class RotatingAnArray {
    public static void main(String[] args) {
        int[] ar= {-5,1,2,7,8,5,6,4,3};
        int n=ar.length;
int[] newArray= new int[ar.length];
       // int k=5;  //o/p: -  [8, 5, 6, 4, 3, -5, 1, 2, 7]
        int k=3;  //o/p: -  [6, 4, 3, -5, 1, 2, 7, 8, 5]
        for(int i=0;i<n;i++){
                newArray[(i+k)%n]=ar[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
