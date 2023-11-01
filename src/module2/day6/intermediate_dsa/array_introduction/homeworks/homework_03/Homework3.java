package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_03;
/*
Problem Description
    You are given an integer array A. You have to find the second largest element/value in the array or report that
    no such element exists.

Problem Constraints
1 <= |A| <= 10^5
0 <= A[i] <= 10^9

Input Format : The first argument is an integer array A.
Output Format : Return the second largest element. If no such element exist then return -1.
*/
public class Homework3 {
    public static void main(String[] args) {
        Homework3 obj= new Homework3();
        int arr[] = new int[] {10, 10, 9, 8, 1};
        int result= obj.solve(arr);
        System.out.println("result is : " + result);
    }

    public int solve(int[] A) {
        int max = A[0];
        int secondMax= A[0];
        for (int i = 0; i <A.length ; i++) {

            if((A[i] > secondMax) || (secondMax == max)) {
                secondMax= A[i];
            }
            if(secondMax > max) {
                int temp= max;
                max= secondMax;
                secondMax= temp;
            }
        }
        System.out.println("max is : " +  max);
        System.out.println("secondMax is : " +  secondMax);
        if(secondMax != max) {
            return secondMax;
        }

        return -1;
    }
}
