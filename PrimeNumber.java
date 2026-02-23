import java.util.*;

public class PrimeNumber {

    public static boolean isPrime(int n) {

        // Condition 1: Prime numbers are greater than 1
        if (n <= 1) {
            return false;
        }

        // Condition 2: Check till √n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;  // Not prime
            }
        }

        return true;  // Prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}