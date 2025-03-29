package Asik1;

public class ex3 {
    public static String isPrime(int n) {
        if (n < 2){
            return "Composite";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return "Composite";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
