import java.util.Scanner;

public class Consumption {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int km = scanner.nextInt();
            double fuel = scanner.nextDouble();

            double kmpl = km / fuel;

            System.out.printf("%.3f km/l%n", kmpl);
        }
    }
