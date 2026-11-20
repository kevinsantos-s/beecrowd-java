import java.util.Scanner;

public class DistanceBetweenTwoPoints {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            double calcX = Math.pow(x2 - x1, 2);
            double calcY = Math.pow(y2 - y1, 2);

            double distance = Math.sqrt(calcX + calcY);

            System.out.printf("%.4f%n", distance);
        }
    }
