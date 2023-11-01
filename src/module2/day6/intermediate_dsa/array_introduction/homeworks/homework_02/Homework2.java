package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_02;

/*
Problem Description: Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000
*/
public class Homework2 {
    public static void main(String[] args) {
        int arr[] = new int[] {2, 4, 1, 3, 2};
        Homework2 obj= new Homework2();
        int result= obj.solve(arr);
        System.out.println("result is : " + result);
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
    public int solve(int[] A) {
        Homework2 obj= new Homework2();
        int maxEle = obj.getMaxMin(A, "max");
        System.out.println("max ele is : " + maxEle);
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] != maxEle) {
                int diff = maxEle- A[i];
                sum= sum + diff;
            }
        }
        return sum;
    }
}
