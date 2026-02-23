import java.util.*;

public class Factorial {

    public static long printFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        long result = printFactorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}