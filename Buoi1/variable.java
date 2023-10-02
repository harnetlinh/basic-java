// import thư viện để sử dụng Scanner
import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int a; // khai báo biến a kiểu số nguyên 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 22, 100
        double b; // khai báo biến b kiểu số thực 1.2, 5.78, 9.0, 10.5
        float e; // khai báo biến e kiểu số thực nhưng ít chính xác hơn double
        char c; // khai báo biến c kiểu ký tự ('a', 'b', 'c', '1', '2', '@')
        boolean d; // khai báo biến đúng sai (0 và 1 - false và true)

        a = 5; // gán giá trị 5 cho biến a (dấu  = ở đây là dấu gán giá trị)
        System.out.println(a); // in ra màn hình giá trị của biến a

        String str = "Hello World"; // khai báo biến str kiểu chuỗi

        System.out.println(str + " Linh"); // in ra màn hình giá trị của biến str

        // Các phép toán cơ bản
        int x = 5;
        int y = 10;
        int z = x + y; // cộng
        int t = x - y; // trừ
        System.out.println("x + y = " + z);
        System.out.println("x - y = " + t);
        System.out.println("x * y = " + x * y); // nhân
        System.out.println("y / x = " + y / x); // chia
        int k = x % y; // chia lấy dư
        System.out.println("x % y = " + k);
        System.out.println("y % x = " + y % x);

        int i = 1;
        i++; // tăng i lên 1 đơn vị
        System.out.println("i++ = " + i);
        i--; // giảm i xuống 1 đơn vị
        System.out.println("i-- = " + i);
        i+=5; // tăng i lên 5 đơn vị
        System.out.println("i+=5 = " + i);
        i-=5; // giảm i xuống 5 đơn vị
        System.out.println("i-=5 = " + i);
        i*=5; // nhân i với 5
        System.out.println("i*=5 = " + i);
        i/=5; // chia i cho 5
        System.out.println("i/=5 = " + i);

        int j;
        // nhập giá trị j từ bàn phím

         System.out.println("Nhập giá trị j: ");

        /**
         * Cú pháp nhập giá trị từ bàn phím
         * Trước khi sử dụng phải import thư viện Scanner ở trên cùng của file code
         * import java.util.Scanner;
         */
        Scanner scanner = new Scanner(System.in);      
        j = scanner.nextInt();
        System.out.println("Giá trị j vừa nhập là: " + j);

    }
}
