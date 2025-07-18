import java.util.*;

public class P5_Prime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        System.out.println("Is Prime? " + isPrime(num));
    }
}