import java.util.Scanner;

public class Q1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int m = a, n = b;
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        //数值过大导致需要用long
        System.out.println(1L * m * n / a);
    }
}
