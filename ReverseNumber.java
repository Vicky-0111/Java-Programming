import java.util.*;
public class ReverseNumber {

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;

            // Precise overflow check
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            rev = rev * 10 + lastDigit;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");   
        int n = sc.nextInt();

        int result = reverse(n);
        System.out.print(result);

       // System.out.println(reverse(1534236469)); // 0 (overflow case)
    }
}