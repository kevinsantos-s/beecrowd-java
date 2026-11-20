import java.util.Scanner;

public class Area {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double pi = 3.14159;

            double triangulo = (a * c) / 2.0; // area = (base x altura) / 2;
            double circulo = pi * (c * c);  // area = pi * (raio * raio);  (raio ao quadrado)
            double trapezio = ((a + b) * c) / 2; // area = ((base maior + base menor) * altura) / 2;
            double quadrado = b * b; // area = lado * lado; (lado ao quadrado)
            double retangulo = a * b; // area = lado1 * lado2;

            System.out.printf("TRIANGULO: %.3f%n", triangulo);
            System.out.printf("CIRCULO: %.3f%n", circulo);
            System.out.printf("TRAPEZIO: %.3f%n", trapezio);
            System.out.printf("QUADRADO: %.3f%n", quadrado);
            System.out.printf("RETANGULO: %.3f%n", retangulo);
        }
    }
