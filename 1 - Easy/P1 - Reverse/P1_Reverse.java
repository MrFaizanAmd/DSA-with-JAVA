import java.util.*;

public class P1_Reverse {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        System.out.println("Reversed : " + reverse(num));
    }
}