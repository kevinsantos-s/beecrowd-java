import java.util.Scanner;

public class SalaryBonus {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String seller = scanner.nextLine();
            double salary = scanner.nextDouble();
            double sales = scanner.nextDouble();

            double bonus = sales * 0.15;
            double total = salary + bonus;

            System.out.printf("TOTAL = R$ %.2f%n", total);
        }
    }
