import java.util.*;

public class SwappingNumber {

    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int[] result = swap(a, b);

        System.out.println("After Swapping:");
        System.out.println("a = " + result[0]);
        System.out.println("b = " + result[1]);

        sc.close();
    }
}
