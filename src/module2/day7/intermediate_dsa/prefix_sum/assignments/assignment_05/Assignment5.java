package module2.day7.intermediate_dsa.prefix_sum.assignments.assignment_05;

/*
Problem Description :
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal
to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements
is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5

Input Format : First arugment is an array A .

Output Format : Return the equilibrium index of the given array. If no such index is found then return -1.
*/
public class Assignment5 {
    public static void main(String[] args) {
        Assignment5 obj= new Assignment5();
        int[] arr= new int[]{-7, 1, 5, 2, -4, 3, 0};
        int result= obj.solve(arr);
        System.out.println("result is : " + result);
    }

    public int solve(int[] A) {
        int response= -1;
        for(int i=0;i<A.length;i++) {
            int position = i;
            int sumLeft= 0;
            int sumRight=0;

            for(int j=0;j<=position-1;j++) {
                sumLeft = sumLeft + A[j];

            }

            for(int k=position+1;k<A.length;k++) {
                sumRight = sumRight + A[k];
            }

            if(sumLeft == sumRight) {
                response= position;
                return response;
            }
        }
        return response;
    }
}
