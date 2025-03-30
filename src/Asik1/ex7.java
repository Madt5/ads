package Asik1;
import java.util.Scanner;

public class ex7 {
    public static void reversePrint(Scanner scanner, int n) {
        if (n == 0) return;
        int num = scanner.nextInt();
        reversePrint(scanner, n - 1);
        System.out.print(num + " ");
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reversePrint(scanner, n);
    }
}
