import java.util.Scanner;

public class bai3_flag {
    public static void main(String[] args) {
        System.out.println("Nhap vao gia tri n = ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // Khai báo cờ cho thuật toán cắm cờ
        Boolean flag = false;

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                flag = true;
                break; // thoát khỏi vòng lặp gần nhất
            }
        }
        if (flag) {
            System.out.println("n khong phai la so nguyen to");
        } else {
            System.out.println("n la so nguyen to");
        }
    }
}
