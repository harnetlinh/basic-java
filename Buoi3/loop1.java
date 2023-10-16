import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao gia tri n = ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int tongSoLe = 0;
        int tongSoChan = 0;
        for (int i = 0; i <= n; i++) 
        {
            if (i % 2 == 0) {
                System.out.println("So chan = " + i);
                tongSoChan += i;
            } else {
                System.out.println("So le = " + i);
                tongSoLe += i;
            }
        }
        System.out.println("Tong so chan = " + tongSoChan);
        System.out.println("Tong so le = " + tongSoLe);
    }
}
