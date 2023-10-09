package Buoi2;
import java.util.Scanner;
public class bai1 {
    public static void main (String[] args) {
        System.out.println("Nhap a,b,c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Boolean isTriangle = (a + b > c && a + c > b && b + c > a); 
        // bản chất của >, < , == ,... là phép tính, và kết quả trả về là Boolean
        if (isTriangle) { // Là 3 cạnh của tam giác
            System.out.println("Day la 3 canh cua tam giac");
            Boolean isRightTriangle = (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
            if (isRightTriangle) { // là tam giác vuông
                System.out.println("Day la 3 canh cua tam giac vuong");
            } else {
                System.out.println("Day khong phai la 3 canh cua tam giac vuong");
            }

        } else {
            System.out.println("Day khong phai la 3 canh cua tam giac");
        }
    }
}
