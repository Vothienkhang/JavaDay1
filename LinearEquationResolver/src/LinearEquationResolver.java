import  java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as 'a * x  + b = c, please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhap a: ");
        double a = scanner.nextDouble();

        System.out.println(" Nhap b: ");
        double b = scanner.nextDouble();

        System.out.println(" Nhap c: ");
        double c = scanner.nextDouble();

        if (a!= 0) {
            double answer = (c - b) / a;
            System.out.printf("The equation is: %f\n", answer);
        }  else {
            if (b == c) {
                System.out.println("The equation is all x");
            }  else {
                System.out.println("No solution possible");
            }
        }
    }
}
