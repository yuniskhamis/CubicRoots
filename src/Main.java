import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A");
        double A = scanner.nextDouble();
        System.out.println("Enter B");
        double B = scanner.nextDouble();
        System.out.println("Enter C");
        double C = scanner.nextDouble();
        System.out.println("Enter D");
        double D = scanner.nextDouble();
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);


        double a = B / A;
        double b = C / A;
        double c = D / A;

        double p = b - (Math.pow(a, 2) / 3);
        double q = ((2 * (Math.pow(a, 3))) / 27) - (a * b / 3) + c;
        double discriminant = ((Math.pow(q, 2)) / 4) + ((Math.pow(p, 3)) / 27);
        if (A != 0) {
            if (discriminant > 0) {
                double x1 = Math.pow(((-q / 2) + (Math.sqrt(discriminant))), (1.0 / 3)) + Math.pow(((-q / 2) - (Math.sqrt(discriminant))), (1.0 / 3)) - (a / 3);
                System.out.println("x1 = " + x1);
            } else if (discriminant == 0) {
                double x1 = (-2 * (Math.pow((q / 2), (1.0 / 3))) - (a / 3));
                final double v = 1 * (Math.pow((q / 2), (1.0 / 3))) - (a / 3);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + v);
                System.out.println("x3 = " + v);
            } else if (discriminant < 0) {
                double v = (1.0 / 3) * Math.asin((3 * (Math.sqrt(3) * q)) / (2 * (Math.pow(Math.sqrt(-p), 3))));
                double x1 = (2 / Math.sqrt(3)) * (Math.sqrt(-p)) * (Math.sin(v)) - (a / 3);
                double x2 = ((-2 / Math.sqrt(3)) * (Math.sqrt(-p)) * (Math.sin((v + (Math.PI / 3))))) - (a / 3);
                double x3 = ((2 / Math.sqrt(3)) * (Math.sqrt(-p)) * (Math.cos((v + (Math.PI / 6))))) - (a / 3);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
                System.out.println("x3 = " + x3);

            }
        } else {
            System.out.println("Enter a value that is greater than 0 for A otherwise you will be getting a quadratic.");


        }
    }
}