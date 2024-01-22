package com.raja.maang.minmaxarrayValues;

import java.util.Arrays;

public class MinMaxArrayValues {
    public static void main(String[] args) {
        int[] ar={2,5,1,3,7,5,8,3};
        int small=-1;
        int n=ar.length;
        for(int i=0;i<ar.length;i++){
small=i;
            for(int j=i;j<ar.length;j++){
                if(ar[small]>ar[j]){
                    small=j;
                }

            }
            int temp=ar[i];
            ar[i]=ar[small];
            ar[small]=temp;

        }
        System.out.println(Arrays.toString(ar));
        int maxValue=ar[n-1];
        int minValue=ar[0];
        System.out.println("Max Value=>"+ar[n-1]);
        System.out.println("Second highest Value=>"+ar[n-2]);
        System.out.println("Min Value==>"+ar[0]);

    }

}
