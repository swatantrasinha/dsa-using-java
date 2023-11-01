package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_05;

public class Homework5 {
    public static void main(String[] args) {
        Homework5 obj= new Homework5();
        int[] arr= new int[]{1, 2, 3, 4, 5};
        int[][] rangeArr= new int[][]{ {0,3}, {1, 2}};
        int[] finalResponseArray= new int[arr.length];
        finalResponseArray= obj.solve(arr,rangeArr);
        for (int i = 0; i < finalResponseArray.length; i++) {
            System.out.println(finalResponseArray[i]);
        }
    }
    public int[] solve(int[] A, int[][] B) {
        int[] resultArr= new int[B.length];
        for (int i = 0; i <B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            int sum=0;
            for (int j = start; j <=end ; j++) {
                sum = sum + A[j];
            }
            resultArr[i] = sum;
        }
        return  resultArr;
    }
}

