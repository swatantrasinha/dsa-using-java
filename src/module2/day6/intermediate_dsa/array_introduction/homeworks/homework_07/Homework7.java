package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_07;

public class Homework7 {
    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3, 4, 5};
        int[] responseArray= new int[arr.length];
        Homework7 obj= new Homework7();
        responseArray= obj.solve(arr);
        for (int i = 0; i <responseArray.length ; i++) {
            System.out.println(responseArray[i]);
        }
    }

    public int[] solve(int[] A) {
        int[] resultArray= new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int sum=1;
            for (int j = 0; j <A.length ; j++) {
                if(i!=j) {
                    sum= sum* A[j];
                }
            }
            resultArray[i]= sum;
        }
        return  resultArray;
    }
}
