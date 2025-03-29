package Asik1;

public class ex1 {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] array = {10, 1, 32, 3, 45};
        System.out.println(findMin(array));
    }
}
