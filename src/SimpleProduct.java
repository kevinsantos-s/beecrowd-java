import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = scanner.nextInt();
        System.out.println("digite o primeiro número");

        int num2 = scanner.nextInt();
        System.out.println("digite o segundo numero");

        int result = num1 * num2;

        System.out.println("PROD = " + result);
    }
}