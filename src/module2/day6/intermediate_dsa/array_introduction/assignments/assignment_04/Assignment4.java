package module2.day6.intermediate_dsa.array_introduction.assignments.assignment_04;
/*
    Problem Description : You are given a constant array A.
    You are required to return another array which is the reversed form of the input array.

    Problem Constraints :
        1 <= A.size() <= 10000
        1 <= A[i] <= 10000

    Input Format : First argument is a constant array A.

    Output Format : Return an integer array.
*/
public class Assignment4 {
    public static void main(String[] args) {
        Assignment4 obj= new Assignment4();
        int arr[] = new int[] {1,1,10};
        int[] resultArray= new int[arr.length];
        resultArray= obj.solve(arr);
        for (int i = 0; i<resultArray.length ; i++) {
            System.out.println(resultArray[i]);
        }
    }
    public int[] solve(final int[] A) {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        int arrLength= A.length;
        int[] reversedArray= new int[arrLength];
        for(int k=0; k<arrLength;k++) {
            reversedArray[k]= A[arrLength-k-1];
        }

        return reversedArray;
    }
}
