package module2.day7.intermediate_dsa.prefix_sum.assignments.assignment_03;
/*
Problem Description :
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
    1 <= N, M <= 105
    1 <= A[i] <= 109
    0 <= L <= R < N

Input Format : The first argument is the integer array A. The second argument is the 2D integer array B.

Output Format : Return an integer array of length M where ith element is the answer for ith query in B.
*/

public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 obj = new Assignment3();
        int[] arr= new int[]{1, 2, 3, 4, 5};
        int[][] rangeArray= new int[][]{ {0,3}, {1,2}};
        long[] responseArray= new long[arr.length];
        responseArray= obj.rangeSum2(arr, rangeArray);
        for (int i = 0; i < responseArray.length; i++) {
            System.out.println(responseArray[i]);
        }
    }

    /* this rangeSum1 will work but its nested loop.
     since   1 <= A[i] <= 10^9
     so with nesting , time-complexity will be too much
     instead we will use prefixArray in method rangeSum2 */

    public long[] rangeSum1(int[] A, int[][] B) {
        long[] resultArray= new long[B.length];
        for (int i = 0; i < B.length; i++) {
            int start= B[i][0];
            int end= B[i][1];
            long sum=0;
            for (int j = start; j <= end; j++) {
                sum= sum + A[j];
            }
            resultArray[i]= sum;
        }
        return resultArray;
    }

    public long[] rangeSum2(int[] A, int[][] B) {
        int len= A.length;
        //System.out.println( "input array length :  " + len);

        long[] prefixedArray= new long[len];

        for(int i=0;i<A.length;i++) {
            if(i==0) {
                prefixedArray[i] = A[i];
            }else {
                prefixedArray[i] = prefixedArray[i-1] + A[i];
            }
        }

        int arrLength= B.length;
        // System.out.println("arrLength : " + arrLength);
        long[] targetArray= new long[arrLength];

        for(int i=0;i<B.length;i++) {
            int start= B[i][0];
            int end= B[i][1];

            if(start == 0) {
                targetArray[i] = prefixedArray[end];
            } else {
                targetArray[i] = prefixedArray[end] - prefixedArray[start-1];
            }
        }
        return targetArray;
    }
}
