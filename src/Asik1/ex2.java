package Asik1;

public class ex2 {
    public static float AvgNum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (float) sum / arr.length;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(AvgNum(arr));
    }
}
