import java.util.*;

public class P4_Divisors {
    public static int[] divisors(int n) {
        int divisors[] = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index++] = i;
            }
        }

        return divisors;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.print("Divisors are : [ ");
        for (int divisors : divisors(num)) {
            System.out.print(divisors + ", ");
        }
        System.out.print("]");
    }
}