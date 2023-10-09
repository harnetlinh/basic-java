package Buoi2;
import java.util.Scanner;

public class exerciseB2 {
    public static void main(String[] args) {
        //Nhập vào 1 số nguyên, kiểm tra số đó là số chẵn hay số lẻ
        int a;
        System.out.println("Nhap vao so nguyen a = ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int x = a % 2;
        if (x == 0) {
            System.out.println("So " + a + " la so chan");
        } else {
            System.out.println("So " + a + " la so le");
        }

        /**
         * 1. Nhập vào 3 số bất kỳ, kiểm tra xem 3 số đó có phải là 3 cạnh của 1 tam giác hay không
         * 2. Nhập vào 3 số bất kỳ, kiểm tra xem 3 số đó có phải là 3 cạnh của 1 tam giác vuông hay không
         * 3. Nhập vào 1 số bất kỳ từ 1 đến 7, in ra thứ tương ứng (thứ 2, thứ 3, ..., thứ 7, chủ nhật)
         * 4. Nhập vào 1 năm bất kỳ, kiểm tra xem năm đó có phải là năm nhuận hay không
         * 5. Nhập vào 2 giá trị a và b, tính phương trình bậc 1: ax + b = 0
         * 6. (*) Nhập vào 1 số nguyên bất kỳ, in ra màn hình giá trị hàng trăm của số đó (nếu có)
         * (ví dụ số 652 thì in ra 6, số 123 thì in ra 1, số 4 thì in ra 0)
         * 7. (*) Nhập vào 3 sô nguyên a, b, c. Tìm giá trị lớn nhất của 3 số đó
         * 8. (*) Nhập cào 1 số nguyên bất kỳ, kiểm tra xem số đó có phải là số chính phương hay không
         * 9. (*)
         * Viết chương trình nhập vào 3 số nguyên là ngày tháng năm. Hãy xác định ngày tháng năm có (YES) hợp lệ hay không (NO)?
            Lưu ý:
            Ngày phải tương ứng với tháng
            Tháng phải từ 1 đến 12
            Năm phải từ 1900 trở đi
            Năm nhuận là năm chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100
         * 
         * 10 . (*)
         * Viết chương trình nhập vào tọa độ (xC, yC) là tâm của một đường tròn, 
         * và R là bán kính của đường tròn đó. Nhập vào tọa độ (xM, yM) của điểm M. 
         * Xác định điểm M nằm trong, nằm trên hay nằm ngoài đường tròn.
         */
    }
}
