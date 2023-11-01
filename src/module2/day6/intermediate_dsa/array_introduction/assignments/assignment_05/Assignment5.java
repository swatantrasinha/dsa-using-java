package module2.day6.intermediate_dsa.array_introduction.assignments.assignment_05;
/*
Problem Description : Given an integer array A of size N and an integer B,
                      you have to return the same array after rotating it B times towards the right.

Problem Constraints :
1 <= N <= 10^5
1 <= A[i] <= 10^9
1 <= B <= 10^9

Input Format : The first argument given is the integer array A. The second argument given is the integer B.

Output Format: Return the array A after rotating it B times to the right
*/

public class Assignment5 {
    public static void main(String[] args) {
        Assignment5 obj= new Assignment5();
        int arr[] = new int[] {1,2, 3, 4};
        int B = 2;
        int[] resultArray= new int[arr.length];
        resultArray= obj.solve(arr, B);
        for (int i = 0; i<resultArray.length ; i++) {
            System.out.println(resultArray[i]);
        }
    }

    public int[] getReversedArray(final int[] A) {
        int arrLength= A.length;
        int[] reversedArray= new int[arrLength];
        for(int k=0; k<arrLength;k++) {
            reversedArray[k]= A[arrLength-k-1];
        }
        return reversedArray;
    }
    public int[] getArrayReversedWithinRange(int[] A, int B, int C) {
        int arrLength= A.length;
        int[] arrayRangeReversed= new int[arrLength];
        for(int k=0; k<arrLength;k++) {
            if((B<=k) && (k<=C)) {
                int reqIndex= C-(k-B);
                arrayRangeReversed[k]= A[reqIndex];
            } else {
                arrayRangeReversed[k]= A[k];
            }

        }
        return arrayRangeReversed;
    }


    public int[] solve(int[] A, int B) {
        int arrLength= A.length;
        int[] arrReversed= new int[arrLength];
        Assignment5 obj = new Assignment5();
        arrReversed= obj.getReversedArray(A);

        int k = B%arrLength;
        int[] arrayReversedPart1= new int[arrLength];
        arrayReversedPart1= obj.getArrayReversedWithinRange(arrReversed,0,k-1);

        int[] arrayReversedPart2= new int[arrLength];
        arrayReversedPart2= obj.getArrayReversedWithinRange(arrayReversedPart1,k,arrLength-1);

        return arrayReversedPart2;
    }
}
