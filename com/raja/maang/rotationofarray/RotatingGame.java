package com.raja.maang.rotationofarray;

import java.util.Scanner;
import java.lang.*;
import java.util.*;

public class RotatingGame {
    public static void main(String[] args) {


                // YOUR CODE GOES HERE
                // Please take input and print output to standard input/output (stdin/stdout)
                // DO NOT USE ARGUMENTS FOR INPUTS
                // E.g. 'Scanner' for input & 'System.out' for output
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int[] a= new int[n];
                // for(int i=1;i<=n-1;i++){
                //         a[i]=i;
                // }
                int s=1;
                int j=0;
                while(s<=n && j<=n){
                    a[j]=s;
                    j++;
                    s++;
                }

       // System.out.println(Arrays.toString(a));
                int b=sc.nextInt();
                int[] newArray= new int[a.length];
                for(int i=0;i<n;i++){
                    newArray[(i+b)%n]=a[i];
                }
                System.out.println(Arrays.toString(newArray));
    }
}
