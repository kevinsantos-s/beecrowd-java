import java.util.Scanner;

public class SimpleCalculate {

        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);

            int cod1 = scanner.nextInt();
            int quant1 = scanner.nextInt();
            double preco1 = scanner.nextDouble();

            int cod2 = scanner.nextInt();
            int quant2 = scanner.nextInt();
            double preco2 = scanner.nextDouble();

            double total = (quant1 * preco1) + (quant2 * preco2);

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        }
    }
