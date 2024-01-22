package com.raja.maang.EquilibriumIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquilibriumIndex {
    public static void main(String[] args) {
        //System.out.println("Test");
        int a[] ={1, 2, 3, 7, 1, 2, 3};
        int index= bruteFullApproach(a);
        System.out.println("Equilibrium Index with BF Solution==> "+index);

        int index2=optimizedApproach(a);
        System.out.println("Equilibrium Index with Optimized Solution==> "+index2);
    }

    static int bruteFullApproach(int[] a){
        int n=a.length;
        int[] ps= new int[n];
        ps[0]=a[0];
        for(int i=0;i<n;i++){
            int sl=0;
            for(int j=i-1;j>=0;j--){
                sl+=a[i];
            }
            int sr=0;
            for(int j=i+1;j<n;j++){
                sr+=a[i];
            }

            if(sl==sr){
                System.out.println("index::"+i);
                return i;
            }

        }
        return 0;
    }

    static int optimizedApproach(int[] a){
        System.out.println("Array A==> "+Arrays.toString(a));
        int n=a.length;
        int[] ps= new int[n];
        ps[0]=a[0];
        for(int i=1;i<n;i++) {
              ps[i]= ps[i-1]+a[i];
        }
        System.out.println("Prefix Sum Array==> "+Arrays.toString(ps));

        for(int i=0;i<n;i++){
            int sl=0;
            if(i!=0){
                sl=ps[i-1];
            }
            int sr= ps[n-1] -ps[i];
            if(sl==sr){
                return i;
            }
        }
        return 0;
    }

}
