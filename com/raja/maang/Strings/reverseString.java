package com.raja.maang.Strings;

public class reverseString {
    public static void main(String[] args) {
        //String A="raja";
        String A="hv xdq op qoddptokkz vemmoxrgf ombt gg crulgzfkif";
        int n=A.length();
        StringBuffer strreverse= new StringBuffer();
        String words[]=A.split(" ");
        int m=words.length;
        // System.out.println("lengthe M :: "+m);
        if( m ==1 || m==0){
            for(int i=n-1;i>=0;i--){
                strreverse.append(A.charAt(i));
            }

        }else {
            for (int i = m - 1; i >= 0; i--) {
                strreverse.append(words[i]);
                // System.out.println("lengthe M :: "+i);
                if(i !=0){
                    strreverse.append(" ");
                }
            }
        }
        System.out.println(strreverse.toString());
       // return strreverse;
    }

    }

