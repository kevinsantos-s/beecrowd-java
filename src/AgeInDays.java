import java.util.Scanner;

public class AgeInDays {

        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);

            int age = scanner.nextInt();

            int anos = age / 365;

            int resto = age % 365;

            int meses = resto / 30;
            int dias = resto % 30;

            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
    }
