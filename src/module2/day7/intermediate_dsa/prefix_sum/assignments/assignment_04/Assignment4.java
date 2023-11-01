package module2.day7.intermediate_dsa.prefix_sum.assignments.assignment_04;

import module2.day7.intermediate_dsa.prefix_sum.assignments.assignment_03.Assignment3;

/*
Problem Description : Given an array A of N integers. Construct prefix sum of the array in the given array itself.

Problem Constraints
    1 <= N <= 10^5
    1 <= A[i] <= 10^3

Input Format : Only argument A is an array of integers.

Output Format : Return an array of integers denoting the prefix sum of the given array.
*/

public class Assignment4 {
    public static void main(String[] args) {
        Assignment4 obj = new Assignment4();
        int[] arr= new int[]{1, 2, 3, 4, 5};

        arr= obj.convertPrefixSumArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    int[] convertPrefixSumArray(int[] A) {
        for(int i=0;i<A.length;i++) {
            if(i==0) {
                A[i] = A[i];
            }else {
                A[i] = A[i-1] + A[i];
            }
        }
        return A;
    }
}
