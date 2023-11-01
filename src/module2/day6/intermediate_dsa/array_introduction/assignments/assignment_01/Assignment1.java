package module2.day6.intermediate_dsa.array_introduction.assignments.assignment_01;
/*
Problem Description : Given an array A of N integers. Count the number of elements that have at least 1 elements
greater than itself.

Problem Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^9

Input Format : First and only argument is an array of integers A.

Output Format : Return the count of elements.
*/
public class Assignment1 {
    public static void main(String[] args) {
        Assignment1 obj= new Assignment1();
        int arr[] = new int[] {3, 1, 2};
        int result= obj.solve(arr);
        System.out.println("result is : " + result);
    }
    public int solve(int[] A) {
        int count=0;
        for(int i=0;i<A.length;i++) {
            int item= A[i];
            for(int j=0;j<A.length;j++) {

                if(i!=j && (item<A[j])) {
                    count++;
                    break;
                }
            }
        }

        return count;

    }
}
