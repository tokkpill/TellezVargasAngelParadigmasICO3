import java.util.Scanner;

public class TestFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.print("Ingrese los lados del triángulo (lado1 lado2 lado3): ");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double h = sc.nextDouble();
        Triangulo triangulo = new Triangulo(l1, l2, l3, h);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        System.out.print("Ingrese el radio del círculo: ");
        double r = sc.nextDouble();
        Circulo circulo = new Circulo(r);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        sc.close();
    }
}
