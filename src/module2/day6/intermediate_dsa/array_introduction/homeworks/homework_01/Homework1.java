package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_01;
/*
Problem Description:
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

Problem Constraints
1 <= N <= 10^5
-10^9 <= A[i] <= 10^9


Input Format : First argument A is an integer array.

Output Format : Return the sum of maximum and minimum element of the array
 */

public class Homework1 {
    public static void main(String[] args) {
        int arr[] = new int[] {-2, 1, -4, 5, 3};
        Homework1 obj= new Homework1();
        int result= obj.solve(arr);
        System.out.println("result is : " + result);
    }
    public int solve(int[] A) {
        Homework1 obj= new Homework1();
        int maxEle= obj.getMaxMin(A, "max");
        System.out.println("max ele is : " + maxEle);

        int minEle= obj.getMaxMin(A, "min");
        System.out.println("min ele is : " + minEle);
        return (maxEle + minEle);
    }

    public int getMaxMin(int[] arr, String maxOrMin) {
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        int result= arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(maxOrMin.equals("max")){
                if(arr[i] > result) {
                    result= arr[i];
                }
            } else if(maxOrMin.equals("min")) {
                if(arr[i] < result) {
                    result= arr[i];
                }
            }
        }
        return result;
    }
}
