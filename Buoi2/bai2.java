package Buoi2;
import java.util.Scanner;
public class bai2 {
    public static void main (String[] args) {
        System.out.println("Nhap a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = (a / 100) % 10;
        System.out.println("Hang tram cua so " + a + " la " + x);
    }
}