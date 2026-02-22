import java.util.Scanner;

public class EvenOddSum {

    public static int[] calculateSum(int number) {
        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number /= 10;
        }

        return new int[]{evenSum, oddSum};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        int[] result = calculateSum(number);

        System.out.println("Sum of Even digits: " + result[0]);
        System.out.println("Sum of Odd digits: " + result[1]);

        sc.close();
    }
}