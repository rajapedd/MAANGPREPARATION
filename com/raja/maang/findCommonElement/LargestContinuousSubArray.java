package com.raja.maang.findCommonElement;

public class LargestContinuousSubArray {
    public static void main(String[] args) {
        int[] A = {1,2,-2,4,-4};
        int size = A.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + A[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        System.out.println(max_so_far);
    }
}
