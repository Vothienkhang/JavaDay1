import java.util.Scanner;

public class BodyMassIndex  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter weight in kilograms: ");
        weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.println("You are underweight");
        }   else if (bmi < 25) {
                System.out.println("You are normal");
            }
            else if (bmi < 30) {
                System.out.println("You are overweight");
            }
            else {
                System.out.println("You are obese");
            }
        }
    }
