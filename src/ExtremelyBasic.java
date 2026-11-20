import java.io.IOException;
import java.util.Scanner;

public class ExtremelyBasic {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1 + num2;

            System.out.println("X = " + result);
        }
    }
