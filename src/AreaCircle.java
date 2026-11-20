import java.io.IOException;
import java.util.Scanner;

public class AreaCircle {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            double raio = scanner.nextDouble();
            double pi = 3.14159;

            double area = pi * (raio * raio);

            System.out.printf("A=%.4f%n", area);
            // enunciado pedia exatamente 4 casas decimais
        }
    }
