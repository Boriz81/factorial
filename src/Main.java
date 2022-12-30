import java.util.Scanner;

public class Main {
    public static long factorial(int a) {

        long c = 1;
        for (int i = 1; i <= a; i++) {
            c *= i;
        }
        return c;
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}