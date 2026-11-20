import java.util.Scanner;

public class Salary {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            int hours = scanner.nextInt();
            double valuehour = scanner.nextDouble();

            double salary = (hours * valuehour);

            System.out.println("NUMBER = " + number);
            System.out.printf("SALARY = U$ %.2f%n", salary);
        }
    }
