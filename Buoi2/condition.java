package Buoi2;
import java.io.Console;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println("Nhap vao gia tri A = ");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Nhap vao gia tri B = ");
        int b;
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("If condition is true (A is equal B)"); // nếu điều kiện đúng thì sẽ vào block if
        } else {
            System.out.println("If condition is false (A is  different from B)"); // nếu điều kiện sai thì sẽ vào block else
        } 

        System.out.println("---------------------");
        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is less than B");
            // có thể có nhiều else if
        } else {
            System.out.println("A is equal B");
        }

    
    }
}