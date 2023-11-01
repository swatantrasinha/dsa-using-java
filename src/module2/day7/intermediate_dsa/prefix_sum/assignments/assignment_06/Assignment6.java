package module2.day7.intermediate_dsa.prefix_sum.assignments.assignment_06;

/*
Problem Description:
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

Problem Constraints
    1 <= N <= 10^5
    1 <= Q <= 10^5
    1 <= A[i] <= 10^9
    0 <= B[i][0] <= B[i][1] < N

Input Format: First argument A is an array of integers. Second argument B is a 2D array of integers.

Output Format : Return an array of integers.

*/
public class Assignment6 {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3, 4, 5};
        int[][] rangeArray= new int[][]{{0,2}, {2,4}, {1,4}};
        int[] resultArray= new int[rangeArray.length];
        Assignment6 obj= new Assignment6();
        resultArray= obj.solve2(arr, rangeArray);
        System.out.println("result array is : ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
    /* this solve1 will work but its nested loop.
     since   1 <= A[i] <= 10^9
     so with nesting , time-complexity will be too much
     instead we will use prefixArray in method solve2 */
    public int[] solve1(int[] A, int[][] B) {
        int[] responseArray= new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int evenNumberCount=0;
            int start= B[i][0];
            int end= B[i][1];
            for (int j = start; j <= end; j++) {
                if(A[j] %2 == 0) {
                    evenNumberCount++;
                }
            }
        responseArray[i]= evenNumberCount;
        }
        return responseArray;
    }

    public int[] solve2(int[] A, int[][] B) {
        int arrLength= A.length;
        for(int i=0; i<arrLength; i++) {
            if(A[i] % 2 == 0) {
                A[i]= 1;
            } else {
                A[i]= 0;
            }
        }
        //  for(int i=0; i<arrLength; i++) {
        //   System.out.println("element @ index " + i + " is  : " + A[i]);
        //  }

        // create prefix array

        int[] prefixedArray= new int[arrLength];
        for(int i=0;i<arrLength;i++) {
            if(i==0) {
                prefixedArray[i] = A[i];
            }else {
                prefixedArray[i] = prefixedArray[i-1] + A[i];
            }
        }
        // System.out.println("Prefixed Array is : ");

        //  for(int j=0;j<prefixedArray.length;j++) {
        //   System.out.println(prefixedArray[j]);
        //  }
        int queryArrayLength= B.length;
        int[] targetArray= new int[queryArrayLength];

        for(int i=0;i<B.length;i++) {
            int start= B[i][0];
            int end= B[i][1];
            //  System.out.println("start " + start);
            //  System.out.println("end " + end);
            if(start == 0) {
                targetArray[i]= prefixedArray[end];
            } else {
                targetArray[i]= prefixedArray[end] - prefixedArray[start-1];
            }

            // System.out.println("targetArray @ " + i + " is : " + targetArray[i]);
        }

        return targetArray;
    }

}
