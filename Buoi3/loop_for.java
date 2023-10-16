import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) {
        // nhập vào số nguyên n
        System.out.println("Nhap vao so nguyen n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Khai báo giá trị ban đầu của tổng S
        int S = 0;
        // vòng lặp sử dụng for
        for (int i = 0; i <= n; i++) {
            // In ra giá trị của i biến thiên từ 0 đến n
            System.out.println("Gia tri cua i = " + i);
            // Cộng dần tổng S với giá trị của i
            S += i;
            System.out.println("Gia tri cua S = " + S);
        }
        // In ra tổng S
        System.out.println("Kqua Tong S = " + S);
    }
}
