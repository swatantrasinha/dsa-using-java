package module2.day6.intermediate_dsa.array_introduction.assignments.assignment_02;

/*
Problem Description :
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.

Problem Constraints:
1 <= A.size() <= 10^4
1 <= A[i] <= 10^9
1 <= B <= 10^9

Input Format : First argument is an integer array A. Second argument is an integer B.
Output Format : Return 1 if good pair exist otherwise return 0.
*/
public class Assignment2 {
    public static void main(String[] args) {
        Assignment2 obj= new Assignment2();
        int arr[] = new int[] {1, 2, 3, 4};
        int B= 7;
        int result= obj.solve(arr, B);
        System.out.println("result is : " + result);
    }


        public int solve(int[] A, int B) {
            int flag= 0;
            for(int i=0;i<A.length;i++) {
                for(int j=0;j<A.length;j++) {
                    if((i!=j) && (A[i]+A[j] == B)) {
                        flag= 1;
                        break;
                    }
                }
                if(flag== 1) {
                    break;
                }
            }
            return flag;
        }
    }

