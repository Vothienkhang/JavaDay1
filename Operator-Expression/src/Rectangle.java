import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();// Nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat();// Nhap chieu cao

        float area = width * height;
        System.out.println("The area of the rectangle is: " + area);
    }
}
