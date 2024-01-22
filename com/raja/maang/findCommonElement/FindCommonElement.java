package com.raja.maang.findCommonElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindCommonElement {

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 10};
        int[] B = {3, 6, 2, 10, 10};
        int[] D= solve(A, B);

        System.out.println("Common Array "+ Arrays.toString(D));

//        Map<Integer, Integer> map1= new HashMap<>();
//        Map<Integer, Integer> map2= new HashMap<>();
//
//        int nA=A.length;
//        int nB=B.length;
//        for(int i=0;i<nA;i++){
//            if(map1.containsKey(A[i])){
//                map1.put(A[i],map1.get(A[i])+1);
//            }else{
//                map1.put(A[i],1);
//            }
//        }
//        System.out.println("map1 :: "+map1);
//
//        for(int i=0;i<nB;i++){
//            if(map2.containsKey(B[i])){
//                map2.put(B[i],map2.get(B[i])+1);
//            }else{
//                map2.put(B[i],1);
//            }
//        }
//
//        System.out.println("map2 :: "+map2);
//
//
//        int common[] = new int[nA];
////       Map< Map<Integer, Integer> ,Map<Integer, Integer> > commonMap= new HashMap<>();
////        commonMap.put(map1,map2);
//
//        for(Map.Entry<Integer, Integer> comA : map1.entrySet()){
//            System.out.println("comA Key :"+ comA.getKey());
//
//            for(Map.Entry<Integer, Integer> comB : map2.entrySet()){
//                System.out.println("comB Key :"+ comB.getKey());
//                if(comA.getKey().equals(comB.getKey())){
//                    System.out.println("comA value :"+ comA.getValue());
//                    System.out.println("comB value :"+ comB.getValue());
//                    break;
//                }else{
//                    break;
//                }
//
//            }
//        }

    }


    public static int[] solve(int[] A, int[] B) {

        int nA=A.length;
        int nB=B.length;

        int count=0;

        for(int i=0;i<nA;i++){
            for(int j=i+1;j<nB;j++){
                if(A[i]==B[j]){
                    count++;
                }
            }
        }
        //System.out.println(count);
        int[] C=new int[count];
        for(int i=0;i<nA;i++){
            for(int j=i+1;j<nB;j++){
                if(A[i]==B[j]){
                    System.out.println("A[i] :: "+A[i]);

                    C[i]=A[i];
                    break;
                }
            }
        }
        return C;
    }
    
}
