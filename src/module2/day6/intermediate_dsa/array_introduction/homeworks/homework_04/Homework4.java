package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_04;

public class Homework4 {
    public static void main(String[] args) {
        Homework4 obj= new Homework4();
        int[] arr= new int[]{1, 2, 2};
        int B=2;
        int result= obj.solve(arr, B);
        System.out.println("result is : " + result);

    }
    public int solve(int[] A, int B) {
        int result=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == B) {
                result++;
            }
        }
        return result;
    }
}
