package com.raja.maang.CountPairs;

import java.util.Arrays;

public class CountPairs {


    public static void main(String[] args) {
        String a = "ABCGAG";
        char ch[] = a.toCharArray();
        System.out.println("Char Array==>"+Arrays.toString(ch));
        int n = ch.length;
        int ps[] = new int[n];
//        if (ch[0] == 'G') {
//            ps[0] = 1;
//        } else {
//
//        }
        ps[0] = 0;
        int count_g=0;
        int answer=0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'G') {
                count_g++;

            } else {

            }
        }

        for(int i = 0; i < n; i++){
            if(ch[i]=='A'){
                answer+=count_g;
            }

            if(ch[i]=='G'){
                count_g--;
            }
        }
        System.out.println("Prefix Sum Array"+Arrays.toString(ps));
        System.out.println("Print count Pairs==>"+answer);
    }

}
