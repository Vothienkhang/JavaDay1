import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Khai báo biến tỉ giá
        System.out.println("Nhap tỉ giá USD --> VND:  ");
        double money = input.nextDouble();

            // Khai báo số tiền nhập vào
            System.out.print("Enter an amount to exchange: ");
            double amount = input.nextDouble();

            // Tiên số tiền chuyên đôi sang VND
            double VND = money * amount;
        System.out.printf("Số tiê quy đổi là %,.0f VND\n: ", VND);

    }
}
