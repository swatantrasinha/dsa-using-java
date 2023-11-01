package module2.day6.intermediate_dsa.array_introduction.homeworks.homework_06;

public class Homework6 {
    static void fun(int[]arr) {
        arr[3] = 98;
        return;
    }
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        fun(arr);
        System.out.println(arr[3]);
    }
}
