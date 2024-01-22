package com.raja.maang.Strings;

public class AlphaAndNumeric {

    public static void main(String[] args) {
       // int a[]= {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};

        int a[]={'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};

        int n= a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if((a[i] >=65 && a[i]<=90) || (a[i] >=97 && a[i]<=122) || (a[i] >=48 && a[i]<=57)) {

            }else{
                count=1;
            }
        }

        System.out.println("count :: "+count);
    }
}

