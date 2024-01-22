package com.raja.maang.Strings;

public class LongestSubStringPalindrome {

    public static void main(String[] args) {
        String A="aaabaaa";

        int n=A.length();

        if(n%2 ==0){
            System.out.println("In EVEN");
            for(int i=0;i<n-1;i++){
                int count=0;
                int l=i;
                int r=i+1;
                while(l>=0 && r<n){
                    if(A.charAt(l)==A.charAt(r)){
                        count+=2;
                    }else{
                        break;
                    }
                    l--;
                    r++;
                }
                System.out.println(count);
            }


        }else{
            System.out.println("In ODD");
            for(int i=0;i<n;i++){
                int count=1;
                int l=i-1;
                int r=i+1;
                while(l>=0 && r<n){
                    if(A.charAt(l)==A.charAt(r)){
                        count+=2;
                    }else{
                        break;
                    }
                    l--;
                    r++;
                }
                System.out.println(count);

            }
        }








    }
}
