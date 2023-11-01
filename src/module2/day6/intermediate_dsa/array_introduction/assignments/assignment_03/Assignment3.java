package module2.day6.intermediate_dsa.array_introduction.assignments.assignment_03;
/*
Problem Description : Given an array A of N integers and also given two integers B and C.
Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints :
1 <= N <= 10^5
1 <= A[i] <= 10^9
0 <= B <= C <= N - 1


Input Format : The first argument A is an array of integer. The second and third arguments are integers B and C

Output Format : Return the array A after reversing in the given range.
*/
public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 obj= new Assignment3();
        int arr[] = new int[] {1, 2, 3, 4};
        int B=2;
        int C=3;
        int arrLength= arr.length;
        int[] resultArray = new int[arrLength];
        resultArray= obj.solve(arr, B, C);
        for (int i = 0; i<arrLength ; i++) {
            System.out.println(resultArray[i]);
        }
    }
    public int[] solve(int[] A, int B, int C) {
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
}
