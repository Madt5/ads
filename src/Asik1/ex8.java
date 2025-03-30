package Asik1;

public class ex8 {
    public static String isAllDigits(String s, int index) {
        if (index == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(index))) return "No";
        return isAllDigits(s, index + 1);
    }


    public static void main(String[] args) {
        System.out.println(isAllDigits("123456", 0));
        System.out.println(isAllDigits("123a12", 0));
    }
}
